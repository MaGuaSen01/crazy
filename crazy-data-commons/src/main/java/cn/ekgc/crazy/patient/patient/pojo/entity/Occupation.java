package cn.ekgc.crazy.patient.patient.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>疯狂智慧医疗系统-病人职业详情实体</b>
 *
 * @author ASUS
 * @data 2022/7/12
 */
@TableName("pa_occupation")
@Data
public class Occupation extends BaseEntity {
    private String id;                      //主键
    private String patient;                 //所属病人信息
    private String occupation;              //职业信息
}
