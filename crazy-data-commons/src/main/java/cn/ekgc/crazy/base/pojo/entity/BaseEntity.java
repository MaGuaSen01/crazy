package cn.ekgc.crazy.base.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    private String status;              //系统状态：Y-启用，N-禁用
    private String createdBy;           //创建者
    private Date createTime;
    private String modifiedBy;          //修改人
    private Date modifiedTime;
}
