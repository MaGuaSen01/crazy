package cn.ekgc.crazy.emr.sum.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>病历概要数据通信详情表实体类</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@Data
@TableName("clinic_sum_comm")
public class Comm extends BaseEntity {
    private Long id;                        //主键
    private String clinicSum;               //所属病历概要数据
    private String phoneCat;                //联系电话-类别
    private String phoneCatCode;            //联系电话-类别代码
    private String phoneNo;                 //联系电话-号码
    private String email;                   //电子邮件地址
}
