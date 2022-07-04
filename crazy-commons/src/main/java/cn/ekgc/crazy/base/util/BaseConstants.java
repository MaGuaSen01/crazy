package cn.ekgc.crazy.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b>基础常量类</b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
public class BaseConstants {
    private static Properties props = new Properties();
    private static Logger logger = LoggerFactory.getLogger(BaseConstants.class);
    static {
        try {
            props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
        } catch (IOException e) {
            logger.error(e.getMessage() + ":" + new Date(), e);
            throw new RuntimeException(e);
        }
    }

    /**
     * <b>分页信息: 默认当前页</b>
     */
    public static final Integer BASE_PAGE_NUM = Integer.parseInt(props.getProperty("base.page.num"));

    /**
     * <b>分页信息: 每页显示数量</b>
     */
    public static final Integer BASE_PAGE_SIZE = Integer.parseInt(props.getProperty("base.page.size"));

    public static final String BASE_STATUS_ENABLE = props.getProperty("base.status.enable");

    public static final String BASE_STATUS_DISABLE = props.getProperty("base.status.disable");

    /**
     * <b>系统响应码: 系统业务处理完毕响应成功</b>
     */
    public static final Integer BASE_RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("base.response.success"));

    /**
     * <b>系统响应码: 用户未进行系统认证</b>
     */
    public static final Integer BASE_RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("base.response.unauth"));

    /**
     * <b>系统响应码: 系统业务处理错误</b>
     */
    public static final Integer BASE_RESPONSE_FAILE = Integer.parseInt(props.getProperty("base.response.faile"));

    /**
     * <b>系统响应码: 系统响应异常</b>
     */
    public static final Integer BASE_RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("base.response.exception"));
}
