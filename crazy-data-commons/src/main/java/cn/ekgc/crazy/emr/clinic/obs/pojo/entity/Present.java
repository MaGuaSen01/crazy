package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
@Data
@TableName("emr_obs_present")
public class Present extends BaseEntity {
	private String id;                     //主键
	private String emrClinicObs;           //所属急诊留观病历
	private Date onsetDate;                //起病时间
	private String onsetDesc;              //起病情况描述
	private String sxOnsetReason;          //症状开始原因/诱因
	private String sxCh;                   //症状特点
	private String sxAcc;                  //伴随症状
	private String pastTrt;                //本疾病既往诊疗经过
	private String baseTrt;                //基础疾病诊疗情况

}
