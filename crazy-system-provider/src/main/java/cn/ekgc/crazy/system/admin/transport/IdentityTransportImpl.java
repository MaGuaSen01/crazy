package cn.ekgc.crazy.system.admin.transport;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.crazy.system.admin.service.IdentityService;
import cn.ekgc.crazy.system.transport.IdentityTransport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/14
 */
@RestController
@RequestMapping("/system/admin/identity/trans")
public class IdentityTransportImpl implements IdentityTransport {
    @Resource(name = "identityService")
    private IdentityService identityService;

    @Override
    @PostMapping("/page")
    public PageVO<IdentityVO> getPage(QueryPageVO queryPageVO) throws Exception {
        // 分别获取分页视图和查询视图
        IdentityVO queryVO = (IdentityVO) queryPageVO.getQueryVO();
        PageVO<IdentityVO> pageVO = queryPageVO.getPageVO();
        return identityService.getPage(queryVO, pageVO);
    }
}
