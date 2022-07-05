package cn.ekgc.crazy.patient.patient.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b>疯狂智慧医疗系统-病人联系地址实体类</b>
 *
 * @author ASUS
 * @data 2022/7/12
 */
@TableName("pa_address")
@Data
public class Address extends BaseEntity {
    private String id;                      //主键
    private String patient;                 //所属病人信息
    private String type;                    //地址类别
    private String province;                //所在省
    private String city;                    //所在市
    private String county;                  //所在区县
    private String countryside;             //所在乡镇
    private String village;                 //所在村街道
    private String doorNo;                  //门牌号码
    private String zipCode;                 //邮政编码
}
