package cn.ekgc.crazy.system.dictionary.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 数据字典信息表
 */
@Data
@TableName("sys_data_dictionary")
public class Dictionary extends BaseEntity {
	private Long id;						//主键id
	private String parent;					//上级字典
	private String name;					//字典名称
	private String code;					//字典编码
	private String status;					//字典编码
}
