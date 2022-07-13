package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * 门（急）诊病历检查报告详情表
 */
@Data
@TableName("emr_clinic_check_report")
public class CheckReport extends BaseEntity {
	private Long id;                             //主键
	private String emrClinic;                    //所属门（急）诊病历
	private String checkOrg;                     //检查申请单—机构（科室）
	private String checkNo;                      //检查申请单—编号
	private String objResult;                    //检查报告结果-客观所见
	private String subResult;                    //检查报告结果-主观提示
	private Date checkDate;                      //检查日期
	private Date reportDate;                     //检查报告日期
	private String remark;                       //检查报告备注
}
