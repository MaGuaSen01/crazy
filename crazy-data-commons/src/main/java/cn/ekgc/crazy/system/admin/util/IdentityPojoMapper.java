package cn.ekgc.crazy.system.admin.util;

import cn.ekgc.crazy.system.admin.pojo.entity.Identity;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/14
 */
@Mapper
public interface IdentityPojoMapper {
    IdentityPojoMapper INSTANCE = Mappers.getMapper(IdentityPojoMapper.class);
    public IdentityVO parseToEntity(Identity entity);
    public Identity parseToEntity(IdentityVO vo);
    public List<IdentityVO> parseToVOList(List<Identity> entityList);
    public List<Identity> parseToEntityList(List<IdentityVO> voList);
}
