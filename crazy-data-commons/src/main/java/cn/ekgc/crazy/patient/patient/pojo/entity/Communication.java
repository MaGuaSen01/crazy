package cn.ekgc.crazy.patient.patient.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>疯狂智慧医疗系统-病人通信实体类</b>
 *
 * @author ASUS
 * @data 2022/7/12
 */
@TableName("pa_communication")
@Data
public class Communication extends BaseEntity {
    private String id;                      //主键
    private String patient;                 //所属病人信息
    private String phoneCat;                //联系电话类别
    private String phoneNo;                 //联系电话号码
    private String email;                   //电子邮件地址
}
