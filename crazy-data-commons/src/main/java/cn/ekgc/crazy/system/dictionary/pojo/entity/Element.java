package cn.ekgc.crazy.system.dictionary.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_data_element")
public class Element extends BaseEntity {
	private Long id;						//主键id
	private String parent;					//所属数据元
	private String name;					//数据元值
	private String code;					//值域说明
	private String status;					//系统状态
}
