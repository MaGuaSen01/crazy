package cn.ekgc.crazy.patient.patient.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>疯狂智慧医疗系统-病人联系人实体类</b>
 *
 * @author ASUS
 * @data 2022/7/12
 */
@Data
@TableName("pa_contact")
public class Contact extends BaseEntity {
    private String id;                      //主键
    private String patient;                 //所属病人信息
    private String cerCat;                  //联系人证件类型
    private String cerNo;                   //联系人类型
    private String type;                    //联系人类型
    private String name;                    //姓名
    private String cellphone;               //联系电话
}
