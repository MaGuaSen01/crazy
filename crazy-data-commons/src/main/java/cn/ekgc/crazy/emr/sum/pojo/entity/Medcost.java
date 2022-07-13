package cn.ekgc.crazy.emr.sum.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>病历概要数据医疗费用详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@TableName("clinic_sum_medcost")
@Data
public class Medcost extends BaseEntity {
    private Long id;                                    //主键
    private String clinicSum;                           //所属病历概要数据
    private String clinicCostCat;                       //门诊费用-分类
    private String clinicCostCatCode;                   //门诊费用-分类代码
    private String clinicCostMoney;                     //门诊费用-金额（元/人民币）
    private String payMethod;                           //门诊费用-支付方式代码
    private String hosCostCat;                          //住院费用-分类
    private String hosCostCatCode;                     //住院费用-分类代码
    private Date hosCostMoney;                         //住院费用-金额（元/人民币）
    private Date perCost;                              //个人承担费用（元）
}
