package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("emr_obs_past")
public class Past extends BaseEntity {
	private Long id;                          //主键
	private String emrClinicObs;              //所属急诊留观病历
	private String itemName;                  //既往观察-项目名称
	private String itemCatCode;               //既往观察-项目分类代码
	private String itemCodeName;              //既往观察-项目代码名称
	private String itemCode;                  //既往观察-项目代码
	private String methodCode;                //既往观察-方法代码
	private String result;                    //既往观察-结果
	private Date pastTypeName;                //既往史观察项目类目名称
	private Date pastResult;                  //既往史观察结果

}
