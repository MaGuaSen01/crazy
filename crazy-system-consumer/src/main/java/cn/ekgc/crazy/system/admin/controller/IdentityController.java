package cn.ekgc.crazy.system.admin.controller;

import cn.ekgc.crazy.base.controller.BaseController;
import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.base.pojo.vo.ResponseVO;
import cn.ekgc.crazy.base.util.BaseConstants;
import cn.ekgc.crazy.base.util.TokenUtil;
import cn.ekgc.crazy.system.admin.pojo.vo.AdminVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.crazy.system.transport.IdentityTransport;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/14
 */
@RestController
@RequestMapping("/system/admin/identity")
public class IdentityController extends BaseController {
    @Autowired
    private IdentityTransport identityTransport;
    @PostMapping("/page/{pageNum}/{pageSize}")
    public ResponseVO queryPage(@PathVariable("pageNum") Integer pageNum,@PathVariable("pageSize") Integer pageSize,
                                IdentityVO queryVO) throws Exception {
        AdminVO adminVO = (AdminVO) TokenUtil.validateToken(request.getHeader(BaseConstants.BASE_TOKEN_HEADER));
        if (adminVO != null) {
            QueryPageVO queryPageVO = new QueryPageVO<>(queryVO, pageNum, pageSize);
            PageVO<IdentityVO> pageVO = identityTransport.getPage(queryPageVO);
            return ResponseVO.successResponseVO("查询成功", pageVO);
        } else {
            return ResponseVO.unauthResponseVO();
        }
    }
}
