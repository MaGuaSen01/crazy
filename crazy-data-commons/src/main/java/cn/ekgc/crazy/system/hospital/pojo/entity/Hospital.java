package cn.ekgc.crazy.system.hospital.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 医院信息表
 */
@Data
@TableName("sys_hospital")
public class Hospital extends BaseEntity {
	private Long id;						//主键
	private String name;					//名称
	private String orgCode;					//组织机构代码
	private String leaderName;				//负责人姓名
	private String province;				//所在省份
	private String city;					//所在城市
	private String county;					//所在区县
	private String address;					//详细地址
	private String cellphone;				//联系电话
	private String status;					//系统状态Y启用N禁用
}
