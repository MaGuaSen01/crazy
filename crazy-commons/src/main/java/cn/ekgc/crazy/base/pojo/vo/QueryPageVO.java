package cn.ekgc.crazy.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * <b>查询分页视图信息</b>
 *
 * @author ASUS
 * @data 2022/7/14
 */
@Data
public class QueryPageVO<E> implements Serializable {
    private static final long serialVersionUID = 1654891149153435185L;
    private E queryVO;
    private PageVO pageVO;

    public QueryPageVO() {}

    public QueryPageVO(E queryVO, Integer pageNum, Integer pageSize) {
        this.queryVO = queryVO;
        this.pageVO = new PageVO(pageNum, pageSize);
    }
}
