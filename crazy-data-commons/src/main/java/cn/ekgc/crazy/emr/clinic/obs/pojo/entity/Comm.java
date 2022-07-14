package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;


import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_obs_comm")
public class Comm extends BaseEntity {
	private String id;                             //主键
	private String emrClinicObs;                    //所属急诊留观病历
	private String phoneCat;                     //联系电话-类别
	private String phoneCatCode;                 //联系电话-类别代码
	private String phoneNo;                      //联系电话-号码
	private String email;                        //电子邮件地址
}
