package cn.ekgc.crazy.base.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * <b>项目基础实体类</b>
 *
 * @author ASUS
 * @data 2022/7/12
 */
@Data
public class BaseEntity implements Serializable {
    private String status;              //系统状态：Y-启用，N-禁用
    private String createdBy;           //创建者
    private Date createTime;
    private String modifiedBy;          //修改人
    private Date modifiedTime;
}
