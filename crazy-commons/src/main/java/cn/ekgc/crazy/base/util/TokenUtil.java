package cn.ekgc.crazy.base.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
public class TokenUtil implements Serializable  {
    static final String PAYLOAD_KEY = "payload";

    /**
     * <b>根据所给定的信息生成touken</b>
     * @param vlue
     * @param expireSec
     * @return
     * @throws Exception
     */
    public static String createToken(Object value, Integer expireSec) throws Exception {
        //创建有效载荷 map集合
        Map<String, Object> paylodMap = new HashMap<String, Object>();
        paylodMap.put(PAYLOAD_KEY, value);
        //设置生成 Token的有效时长
        //根据所存储的时长，获得对应过期的Date类型
        //获取当前时间毫秒，加上有效期的毫秒时长
        Long expireMillis = System.currentTimeMillis() + expireSec * 1000;
        Date expireDate = new Date(expireMillis);
        paylodMap.put(JWT.EXPIRES_AT, expireDate);

        //生成对应的Token
        return JWTUtil.createToken(paylodMap, BaseConstants.BASE_TOKEN_SECRET.getBytes());
    }

    /**
     * <b>校验Token 并获得有效载荷信息</b>
     * @param token
     * @return
     */
    public static Object validateToken(String token) {
        if(StrUtil.isNotBlank(token) && JWTUtil.verify(token, BaseConstants.BASE_TOKEN_SECRET.getBytes())){
            //此时token存在，并且校验有效，解析token获得对应的信息
            return JWTUtil.parseToken(token).getPayload(PAYLOAD_KEY);
        }
        return null;
    }
}
