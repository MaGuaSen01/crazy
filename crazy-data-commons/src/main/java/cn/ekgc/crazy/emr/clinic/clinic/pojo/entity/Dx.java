package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * 门（急）诊病历诊断详情表
 */
@Data
@TableName("emr_clinic_dx")
public class Dx extends BaseEntity {
	private Long id;                              //主键
	private String emrClinic;                     //所属门（急）诊病历
	private String dxOrgName;                     //诊断机构名称
	private Date dxDate;                          //诊断日期
	private String dxCat;                         //诊断类别
	private String dxCatCode;                     //诊断类别代码
	private String dxCisCode;                     //诊断顺位（从属关系）代码
	private String disease;                       //疾病名称
	private String diseaseCode;                   //疾病代码
	private String dxAccording;                   //诊断依据
	private String dxAccordingCode;               //诊断依据代码

}
