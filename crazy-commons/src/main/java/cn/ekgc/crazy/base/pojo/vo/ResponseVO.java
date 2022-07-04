package cn.ekgc.crazy.base.pojo.vo;

import cn.ekgc.crazy.base.pojo.enums.ResponseEnum;
import lombok.Data;

import java.util.List;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
@Data
public class ResponseVO<E> {
    private Integer code;
    private String message;
    private E data;

    public ResponseVO() {
    }

    public ResponseVO(ResponseEnum responseEnum, String message, E data) {
        this.code = responseEnum.getCode();
        this.message = message;
        this.data = data;
    }

    /**
     * <b>获得系统业务处理完毕响应成功视图信息</b>
     * @param message
     * @return
     */
    public static ResponseVO successResponseVO(String message) {
        return new  ResponseVO(ResponseEnum.RESPONSE_CODE_SUCCESS, message, "");
    }

    /**
     * <b>获得系统业务处理完毕响应成功视图信息</b>
     * @param message
     * @param data
     * @return
     */
    public static ResponseVO successResponseVO(String message, Object data) {
        return new  ResponseVO(ResponseEnum.RESPONSE_CODE_SUCCESS, message, data);
    }

    /**
     * <b>获得系统业务处理完毕响应成功视图信息</b>
     * @return
     */
    public static ResponseVO unauthResponseVO() {
        return new  ResponseVO(ResponseEnum.RESPONSE_CODE_UNAUTH, ResponseEnum.RESPONSE_CODE_UNAUTH.getRemark(), "");
    }

    /**
     * <b>获得系统业务处理完毕响应失败视图信息</b>
     * @param message
     * @return
     */
    public static ResponseVO faileResponseVO(String errorMessage) {
        return new  ResponseVO(ResponseEnum.RESPONSE_CODE_FAILE, errorMessage, "");
    }

    /**
     * <b>获得系统业务处理异常视图信息</b>
     * @param exception
     * @return
     */
    public static ResponseVO exceptionResponseVO(Exception exception) {
        return new  ResponseVO(ResponseEnum.RESPONSE_CODE_FAILE, ResponseEnum.RESPONSE_CODE_EXCEPTION.getRemark(), exception);
    }
}
