package cn.ekgc.crazy.system.transport;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/14
 */
@FeignClient("crazy-system-provider")
public interface IdentityTransport {
    @PostMapping("/system/admin/identity/trans/page")
    PageVO<IdentityVO> getPage(QueryPageVO queryPageVO) throws Exception;
}
