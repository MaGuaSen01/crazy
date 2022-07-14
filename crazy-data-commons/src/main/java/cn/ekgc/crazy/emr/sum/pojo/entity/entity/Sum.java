package cn.ekgc.crazy.emr.sum.pojo.entity;

import BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * <b>病历概要数据信息表</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("clinic_sum")
public class Sum extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId
    private Long id;                        // 主键
	@TableField(value = "emrNo")
	private String emrNo;                        // 门诊号
	@TableField(value = "clinicNo")
	private Long clinicNo;                        // 病历号
	@TableField(value = "docName")
	private String docName;                        // 文档标识-名称
	@TableField(value = "docCatCode")
	private String docCatCode;                        // 文档标识-类别代码
	@TableField(value = "docAdminOrgName")
	private String docAdminOrgName;                        // 文档标识-管理机构名称
	@TableField(value = "docAdminOrgCode")
	private String docAdminOrgCode;                        // 文档标识-管理机构组织机构代码（法人代码）
	@TableField(value = "docNo")
	private String docNo;                        // 文档标识-号码
	@TableField(value = "docEffDate")
	private Date docEffDate;                        // 文档标识-生效日期
	@TableField(value = "docExpDate")
	private Date docExpDate;                        // 文档标识-失效日期
	@TableField(value = "markCatCode")
	private String markCatCode;                        // 标识号-类别代码
	@TableField(value = "markNo")
	private String markNo;                        // 标识号-号码
	@TableField(value = "markOrgName")
	private String markOrgName;                        // 标识号-提供标识的机构名称
	@TableField(value = "markObj")
	private String markObj;                        // 姓名-标识对象
	@TableField(value = "markObjCode")
	private String markObjCode;                        // 姓名-标识对象代码
	@TableField(value = "name")
	private String name;                        // 姓名
	@TableField(value = "patientCatCode")
	private String patientCatCode;                        // 病人类型代码
	@TableField(value = "aboBloodType")
	private String aboBloodType;                        // ABO血型
	@TableField(value = "rhBloodType")
	private String rhBloodType;                        // RH血型
	@TableField(value = "gender")
	private String gender;                        // 性别代码
	@TableField(value = "age")
	private String age;                        // 年龄（岁）
	@TableField(value = "nationality")
	private String nationality;                        // 国籍代码
	@TableField(value = "ethnic")
	private String ethnic;                        // 民族代码
	@TableField(value = "marital")
	private String marital;                        // 婚姻状况类别代码
	@TableField(value = "occupation")
	private String occupation;                        // 职业编码系统名称
	@TableField(value = "occCode")
	private String occCode;                        // 职业代码
	@TableField(value = "education")
	private String education;                        // 文化程度代码
	@TableField(value = "birthday")
	private Date birthday;                        // 出生日期
	@TableField(value = "birthplace")
	private String birthplace;                        // 出生地
	@TableField(value = "workplace")
	private String workplace;                        // 工作单位名称
	@TableField(value = "addrCatCode")
	private String addrCatCode;                        // 标识地址类别的代码
	@TableField(value = "province")
	private String province;                        // 地址-省（自治区、直辖市）
	@TableField(value = "city")
	private String city;                        // 地址-市（地区）
	@TableField(value = "county")
	private String county;                        // 地址-县（区）
	@TableField(value = "countryside")
	private String countryside;                        // 地址-乡（镇、街道办事处）
	@TableField(value = "village")
	private String village;                        // 地址-村（街、路、弄等）
	@TableField(value = "doorNo")
	private String doorNo;                        // 地址-门牌号码
	@TableField(value = "zipcode")
	private String zipcode;                        // 邮政编码
	@TableField(value = "divisionCode")
	private String divisionCode;                        // 行政区划代码
	@TableField(value = "medTreatName")
	private String medTreatName;                        // 医疗待遇名称
	@TableField(value = "medTreatCode")
	private String medTreatCode;                        // 医疗待遇代码
	@TableField(value = "eventName")
	private String eventName;                        // 卫生事件(动作)名称
	@TableField(value = "eventCatCode")
	private String eventCatCode;                        // 事件分类代码
	@TableField(value = "eventStartDate")
	private Date eventStartDate;                        // 事件开始时间
	@TableField(value = "eventAddr")
	private String eventAddr;                        // 事件发生地点
	@TableField(value = "eventPart")
	private String eventPart;                        // 事件参与方
	@TableField(value = "eventReason")
	private String eventReason;                        // 事件发生原因
	@TableField(value = "eventRes")
	private String eventRes;                        // 事件结局
	@TableField(value = "mrStatus")
	private String mrStatus;                        // 病历状态
	@TableField(value = "status")
	private String status;                        // 系统状态Y启用N禁用
	@TableField(value = "createdBy")
	private String createdBy;                        // 创建人
	@TableField(value = "createTime")
	private Date createTime;                        // 创建时间
	@TableField(value = "modifiedBy")
	private String modifiedBy;                        // 修改人
	@TableField(value = "modifiedTime")
	private Date modifiedTime;                        // 修改时间
}