package cn.ekgc.crazy.system.division.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 行政区划表
 */
@Data
@TableName("sys_division")
public class Division extends BaseEntity {
	private Long id;					//主键id
	private String parent;				//上级行政区划编码
	private String name;				//行政区划名称
	private String code;				//行政区划编码
	private String status;				//系统状态
}
