package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * <b>门（急）诊病历既往史详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@TableName("emr_clinic_past")
@Data
public class Past extends BaseEntity {
    private Long id;                                // 主键
    private String emrClinic;                       // 所属门（急）诊病历
    private Date itemName;                          // 既往观察-项目名称
    private Date itemCatCode;                       // 既往观察-项目分类代码
    private Date itemCodeName;                      // 既往观察-项目代码名称
    private String itemCode;                        // 既往观察-项目代码
    private Date methodCode;                        // 既往观察-方法代码
    private String result;                          // 既往观察-结果
    private String pastTypeName;                    // 既往史观察项目类目名称
    private String pastResult;                      // 既往史观察结果
}
