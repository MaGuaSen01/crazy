package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_clinic_comm")
public class Comm extends BaseEntity {
	private Long id;                             //主键
	private String emrClinic;                    //所属门（急）诊病历
	private String phoneCat;                     //联系电话-类别
	private String phoneCatCode;                 //联系电话-类别代码
	private String phoneNo;                      //联系电话-号码
	private String email;                        //电子邮件地址

}
