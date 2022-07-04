package cn.ekgc.crazy.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
@Component("redisUtil")
public class RedisUtil {
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * <b>根据所给定的key，将对应的value保存到Redis</b>
     * @param key
     * @param value
     * @param expireSec
     * @return
     */
    public boolean saveToRedis(String key, Object value, Integer expireSec) throws Exception {
        JsonMapper jsonMapper = new JsonMapper();
        String jsonValue = jsonMapper.writeValueAsString(value);
        redisTemplate.opsForValue().set(key, jsonValue);
        if (expireSec != null && expireSec > 0) {
            redisTemplate.expire(key, expireSec, TimeUnit.SECONDS);
        }
        return true;
    }

    public Object getFromRedis(String key, Class valueType) throws Exception {
        String jsonValue = redisTemplate.opsForValue().get(key);
        if (jsonValue != null && jsonValue.trim().length() > 0) {
            return new JsonMapper().readValue(jsonValue, valueType);
        }
        return null;
    }

    public boolean deleteFromRedis(String key) throws Exception {
        return redisTemplate.delete(key);
    }
}
