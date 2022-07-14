package cn.ekgc.crazy.base.pojo.enums;

import cn.ekgc.crazy.base.util.BaseConstants;

/**
 * <b>系统响应枚举信息</b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
public enum ResponseEnum {
    RESPONSE_CODE_SUCCESS(BaseConstants.BASE_RESPONSE_SUCCESS, "系统业务处理完毕响应成功"),
    RESPONSE_CODE_FAILE(BaseConstants.BASE_RESPONSE_FAILE, "系统业务处理错误"),
    RESPONSE_CODE_UNAUTH(BaseConstants.BASE_RESPONSE_UNAUTH, "用户未进行系统认证"),
    RESPONSE_CODE_EXCEPTION(BaseConstants.BASE_RESPONSE_EXCEPTION, "系统响应异常");
    private Integer code;
    private String remark;

    private ResponseEnum() {}
    private ResponseEnum(Integer code, String remark) {
        this.code = code;
        this.remark = remark;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
