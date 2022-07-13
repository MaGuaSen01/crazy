package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/13
 */
@Data
@TableName("emr_clinic_obs")
public class Observation extends BaseEntity {
	private Long id;                          //主键
	private String emrNo;                     //病历号
	private String clinicNo;                  //门诊号
	private String docName;                   //文档标识-名称
	private String docCatCode;                //文档标识-类别代码
	private String docAdminOrgName;           //文档标识-管理机构名称
	private String docAdminOrgCode;           //文档标识-管理机构组织机构代码（法人代码）
	private String docNo;                     //文档标识-号码
	private Date docEffDate;                  //文档标识-生效日期
	private Date docExpDate;                  //文档标识-失效日期
	private String markCatCode;               //标识号-类别代码
	private String markNo;                    //标识号-号码
	private Date  markEffDate;               //标识号-生效日期
	private Date  markExpDate;               //标识号-失效日期
	private String markOrgName;               //标识号-提供标识的机构名称
	private String markObj;                   //姓名-标识对象
	private String markObjCode;               //姓名-标识对象代码
	private String name;                      //姓名
	private String patientCatCode;            //病人类型代码
	private String gender;                    //性别代码
	private int age;                          //年龄（岁）
	private String nationality;               //国籍代码
	private String ethnic;                    //民族代码
	private String marital;                   //婚姻状况类别代码
	private String occupation;                //职业编码系统名称
	private String occCode;                   //职业代码
	private String education;                 //文化程度代码
	private Date birthday;                  //出生日期
	private String birthplace;                //出生地
	private String workplace;                 //工作单位名称
	private String addrCatCode;               //标识地址类别的代码
	private String province;                  //地址-省（自治区、直辖市）
	private String city;                      //地址-市（地区）
	private String county;                    //地址-县（区）
	private String countryside;               //地址-乡（镇、街道办事处）
	private String village;                   //地址-村（街、路、弄等）
	private String doorNo;                    //地址-门牌号码
	private String zipcode;                   //邮政编码
	private String divisionCode;              //行政区划代码
	private String orgName;                   //机构名称
	private String orgCode;                   //机构组织机构代码
	private String orgLeader;                 //机构负责人（法人）
	private String orgAddress;                //机构地址
	private String deptName;                  //科室名称
	private String orgRole;                   //机构角色
	private String orgRoleCode;               //机构角色代码
	private String servName;                  //服务者姓名
	private String servRole;                  //服务者职责（角色）
	private String servRoleCode;              //服务者职责（角色）代码
	private String servtechTitle;             //服务者专业技术职务
	private String servEdu;                   //服务者学历
	private String servMajor;                 //服务者所学专业
	private String servTechRank;              //服务者专业技术职务等级
	private String servPost;                  //服务者职务
	private String mainSuit;                  //主诉
	private String symptom;                   //症状代码编码体系名称
	private String sxCode;                    //症状代码
	private Date sxBeginTime;               //症状开始日期时间
	private Date sxEndTime;                 //症状停止日期时间
	private String sxDesc;                    //症状描述
	private String physCheckCat;              //观察-类别
	private String physCheckCatCode;          //观察-类别代码
	private String physCheckItem;             //观察项目名称
	private String physCheckItemCode;         //观察-项目代码
	private String physCheckResultDesc;       //观察-结果描述
	private String physCheckResult;           //观察-结果(数值)
	private String physCheckUnit;             //观察-计量单位
	private String physCheckResultCode;       //观察-结果代码
	private String personRisk;                //个人史危险因素代码
	private String personCheckCatName;        //个人史观察项目类目名称
	private String personCheckResult;         //个人史观察结果
	private String dxOrgName;                 //诊断机构名称
	private Date dxDate;                      //诊断日期
	private String dxCat;                     //诊断类别
	private String dxCatCode;                 //诊断类别代码
	private String dxCisCode;                 //诊断顺位（从属关系）代码
	private String disease;                   //疾病名称
	private String diseaseCode;               //疾病代码
	private String dxAccording;               //诊断依据
	private String dxAccordingCode;           //诊断依据代码
	private String proRecordCat;              //病程记录类别
	private String proRecordDetail;           //病程记录内容
	private String trtCatCode;                //治疗类别代码
	private Date mrStatus;                    //病历状态

}
