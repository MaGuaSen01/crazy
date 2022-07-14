package cn.ekgc.crazy.base.pojo.vo;

import cn.ekgc.crazy.base.util.BaseConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <b></b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
@Data
public class PageVO<E extends BaseVO> implements Serializable {
    private Integer pageNum;
    private Integer pageSize;
    private List<E> list;
    private Long totalCount;
    private Integer totalPage;
    public PageVO() {}

    public PageVO(Integer pageNum, Integer pageSize) {
        if (pageNum != null && pageNum > 0) {
            this.pageNum = pageNum;
        } else  {
            this.pageNum = BaseConstants.BASE_PAGE_NUM;
        }
        if (pageSize != null && pageSize > 0) {
            this.pageSize = pageSize;
        } else {
            this.pageSize = BaseConstants.BASE_PAGE_SIZE;
        }
    }
}
