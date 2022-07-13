package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_clinic_allergy")
public class Allergy extends BaseEntity {
	private Long id;                              //主键
	private String emrClinic;                     //所属门（急）诊病历
	private String history;                       //过敏史
	private String allergen;                      //过敏原
	private String allSx;                         //过敏症状
	private String allSxCode;                     //过敏症状代码
	private String allergenCode;                  //过敏原代码
	private String medicant;                      //过敏药物名称
	private String statusCode;                    //过敏病情状态代码
	private String markCode;                      //过敏史标识代码

}
