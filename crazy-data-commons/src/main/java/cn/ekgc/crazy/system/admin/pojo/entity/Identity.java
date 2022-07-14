package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *人员身份信息表
 */
@Data
@TableName("sys_identity")
public class Identity extends BaseEntity {
	private Long id;					//主键
	private String code;				//身份编码
	private String name;				//身份信息

}
