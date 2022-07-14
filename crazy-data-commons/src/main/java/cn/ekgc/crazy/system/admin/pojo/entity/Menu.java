package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 系统功能菜单表
 */

@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private Long id;					//主键
	private String parent;				//上级功能
	private String name;				//功能名称
	private String code;				//功能编码
	private String url;					//链接地址
	private String icon;				//图标
	private String order;				//顺序
}
