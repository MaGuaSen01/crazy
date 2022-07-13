package cn.ekgc.crazy.emr.sum.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>病历概要数据疾病（外伤）史详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@Data
@TableName("clinic_sum_trauma")
public class Trauma extends BaseEntity {
    private Long id;                                // 主键
    private String clinicSum;                       // 所属病历概要数据
    private String history;                         // 既往疾病史
    private String psyDiaName;                      // 既往精神类疾病诊断名称
    private String name;                            // 既往疾病名称
    private String code;                            // 既往疾病代码
    private String diaOrg;                          // 既往疾病诊断机构
    private String gradeCode;                       // 既往疾病诊断机构级别代码
    private Date diaTime;                           // 既往疾病诊断时间
    private Date illStatus;                         // 疾病当前状态代码
}
