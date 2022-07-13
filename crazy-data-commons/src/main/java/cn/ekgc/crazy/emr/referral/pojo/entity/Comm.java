package cn.ekgc.crazy.emr.referral.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>转诊（院）记录通信详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@Data
@TableName("emr_referral_comm")
public class Comm extends BaseEntity {
	private Long id;						//主键
	private String emrReferral;				//所属转诊（院）记录
	private String phoneCat;				//联系电话-类别
	private String phoneCatCode;			//联系电话-类别代码
	private String phoneNo;					//联系电话-号码
	private String email;					//电子邮件地址
}
