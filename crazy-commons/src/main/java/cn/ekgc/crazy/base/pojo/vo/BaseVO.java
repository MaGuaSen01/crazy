package cn.ekgc.crazy.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
@Data
public class BaseVO implements Serializable {
    private String status;              //系统状态：Y-启用，N-禁用
    private String createdBy;           //创建者
    private Date createTime;
    private String modifiedBy;          //修改人
    private Date modifiedTime;
}
