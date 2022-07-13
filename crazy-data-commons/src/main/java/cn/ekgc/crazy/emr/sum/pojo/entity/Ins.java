package cn.ekgc.crazy.emr.sum.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>病历概要数据医保详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@TableName("clinic_sum_ins")
@Data
public class Ins extends BaseEntity {
    private Long id;                        //主键
    private String clinicSum;               //所属病历概要信息
    private String insCat;                //医疗保险-类别
    private String insCatCode;            //医疗保险-类别代码
}
