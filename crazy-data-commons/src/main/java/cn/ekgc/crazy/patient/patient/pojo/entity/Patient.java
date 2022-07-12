package cn.ekgc.crazy.patient.patient.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <b>疯狂智慧医疗系统-病人实体类</b>
 *
 * @author ASUS
 * @data 2022/7/12
 */
@TableName("pa_patient")
public class Patient extends BaseEntity {
    private String id;                           //主键
    private String emrNo;                       //病历号
    private String name;                        //姓名
    private String cellphone;                   //手机号码
    private String cerCat;                      //证件类型
    private String cerNo;                       //证件号码
    private Date cerEffDate;                    //证件生效日期
    private Date cerExpDate;                    //证件失效日期
    private String cerOfferOrg;                 //证件提供机构
    private String aboBloodType;                //ABO血型
    private String rhBloodType;                 //RH血型
    private String gender;                      //性别
    private String nationality;                 //国籍
    private String ethnic;                      //民族
    private String marital;                     //婚姻状况
    private String education;                   //文化程度
    private String birthday;                    //出生日期
    private String birthplace;                  //出生地
}
