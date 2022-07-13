package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * <b>门（急）诊病历现病史详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@TableName("emr_clinic_present")
@Data
public class Present extends BaseEntity {
    private Long id;                                 // 主键
    private String emrClinic;                        // 所属门（急）诊病历
    private Date onsetDate;                          // 起病时间
    private Date onsetDesc;                          // 起病情况描述
    private Date sxOnsetReason;                      // 症状开始原因/诱因
    private String sxCh;                             // 症状特点
    private Date sxAcc;                              // 伴随症状
    private String pastTrt;                          // 本疾病既往诊疗经过
    private String baseTrt;                          // 基础疾病诊疗情况
}
