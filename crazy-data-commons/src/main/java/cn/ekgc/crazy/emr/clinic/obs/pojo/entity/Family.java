package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_obs_family")
public class Family extends BaseEntity {
	private Long id;                                 //主键
	private String emrClinicObs;                     //所属急诊留观病历
	private String familyPhysCheckItem;              //家族史观察项目类目名称
	private String familyPhysCheckItemRes;           //家族史观察结果

}
