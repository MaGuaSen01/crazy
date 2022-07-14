package cn.ekgc.crazy.base.exception;

import cn.ekgc.crazy.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * <b>项目基础框架-项目全局异常处理类</b>
 *
 * @author ASUS
 * @data 2022/7/4
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    public ResponseVO globalExceptionHandler(Exception exception) {
        logger.error(exception.getMessage() + ":" + new Date(), exception);
        return ResponseVO.exceptionResponseVO(exception);
    }
}
