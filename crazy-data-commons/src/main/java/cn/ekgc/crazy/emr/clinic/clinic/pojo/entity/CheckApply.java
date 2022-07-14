package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * 门（急）诊病历检查申请详情表
 */
@Data
@TableName("emr_clinic_check_apply")
public class CheckApply extends BaseEntity {
	private Long id;                             //主键
	private String emrClinic;                    //所属门（急）诊病历
	private String checkOrg;                     //检查申请单—机构（科室）
	private String checkNo;                      //检查申请单—编号
	private String checkReason;                  //检查申请检查原因
	private Date applyDate;                      //检查申请日期
	private String attention;                    //检查申请注意事项

}
