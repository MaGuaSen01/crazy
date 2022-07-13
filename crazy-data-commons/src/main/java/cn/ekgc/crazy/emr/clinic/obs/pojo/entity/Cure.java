package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("emr_obs_cure")
public class Cure extends BaseEntity {
	private String id;                             //主键
	private String ermClinicObs;                   //所属急诊留观病历
	private String examine;                        //拟做的检查
	private String theSche;                        //今后治疗方案
	private String followUpFlag;                   //随访标志
	private String followUpInterval;               //随访间隔（随诊期限）
	private String advice;                         //医嘱
	private String specialRemarks;                 //特别注意事项

}
