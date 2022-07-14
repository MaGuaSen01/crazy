package cn.ekgc.crazy.system.admin.util;

import cn.ekgc.crazy.system.admin.pojo.entity.Identity;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-14T13:47:33+0800",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_25 (Oracle Corporation)"
)
public class IdentityPojoMapperImpl implements IdentityPojoMapper {

    @Override
    public IdentityVO parseToEntity(Identity entity) {
        if ( entity == null ) {
            return null;
        }

        IdentityVO identityVO = new IdentityVO();

        identityVO.setStatus( entity.getStatus() );
        identityVO.setCreatedBy( entity.getCreatedBy() );
        identityVO.setCreateTime( entity.getCreateTime() );
        identityVO.setModifiedBy( entity.getModifiedBy() );
        identityVO.setModifiedTime( entity.getModifiedTime() );

        return identityVO;
    }

    @Override
    public Identity parseToEntity(IdentityVO vo) {
        if ( vo == null ) {
            return null;
        }

        Identity identity = new Identity();

        identity.setStatus( vo.getStatus() );
        identity.setCreatedBy( vo.getCreatedBy() );
        identity.setCreateTime( vo.getCreateTime() );
        identity.setModifiedBy( vo.getModifiedBy() );
        identity.setModifiedTime( vo.getModifiedTime() );

        return identity;
    }

    @Override
    public List<IdentityVO> parseToVOList(List<Identity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<IdentityVO> list = new ArrayList<IdentityVO>( entityList.size() );
        for ( Identity identity : entityList ) {
            list.add( parseToEntity( identity ) );
        }

        return list;
    }

    @Override
    public List<Identity> parseToEntityList(List<IdentityVO> voList) {
        if ( voList == null ) {
            return null;
        }

        List<Identity> list = new ArrayList<Identity>( voList.size() );
        for ( IdentityVO identityVO : voList ) {
            list.add( parseToEntity( identityVO ) );
        }

        return list;
    }
}
