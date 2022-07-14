package cn.ekgc.crazy.emr.sum.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>病历概要数据用药详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@TableName("clinic_sum_med")
@Data
public class Med extends BaseEntity {
    private Long id;                             //主键
    private String clinicSum;                   //所属病历概要信息
    private String medUseage;                   //药物用法
    private String usageRate;                   //药物使用-频率
    private String medUnit;                     //药物使用-剂量单位
    private String perDosage;                   //药物使用-次剂量
    private String totalDosage;                 //药物使用-总剂量
    private String wayCode;                     //药物使用-途径代码
    private Date medName;                       //药物名称
    private Date dosageForm;                    //药物剂型代码
    private String medCat;                      //药物类型
    private String medNameCode;                 //药物名称代码
}
