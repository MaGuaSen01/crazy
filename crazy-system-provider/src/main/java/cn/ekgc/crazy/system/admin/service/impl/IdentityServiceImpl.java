package cn.ekgc.crazy.system.admin.service.impl;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.system.admin.dao.IdentityDao;
import cn.ekgc.crazy.system.admin.pojo.entity.Identity;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.crazy.system.admin.service.IdentityService;
import cn.ekgc.crazy.system.admin.util.IdentityPojoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/14
 */
@Service("identityService")
@Transactional
public class IdentityServiceImpl implements IdentityService {
    @Autowired
    private IdentityDao identityDao;

    @Override
    public PageVO<IdentityVO> getPage(IdentityVO queryVO, PageVO<IdentityVO> pageVO) throws Exception {
        Identity query = IdentityPojoMapper.INSTANCE.parseToEntity(queryVO);
        PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
        List<Identity> entityList = identityDao.selectList(new QueryWrapper<Identity>(query));
        PageInfo pageInfo = new PageInfo(entityList);
        pageVO.setTotalPage(pageInfo.getPages());
        pageVO.setList(pageInfo.getList());
        pageVO.setTotalCount(pageInfo.getTotal());
        return pageVO;
    }
}
