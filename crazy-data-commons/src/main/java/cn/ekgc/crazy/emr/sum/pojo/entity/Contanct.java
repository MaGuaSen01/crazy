package cn.ekgc.crazy.emr.sum.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>病历概要数据联系人详情表</b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@Data
@TableName("clinic_sum_contact")
public class Contanct extends BaseEntity {
    private Long id;                         //主键
    private String clinicSum;                //所属病历概要数据
    private String markCatCode;              //标识号-类别代码
    private String markNo;                   //标识号-号码
    private String markEffDate;              //标识号-生效日期
    private String markObj;                  //姓名-标识对象
    private String markObjCode;              //姓名-标识对象代码
    private String name;                     //姓名
}
