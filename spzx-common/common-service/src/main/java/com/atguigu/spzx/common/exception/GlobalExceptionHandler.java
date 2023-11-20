package com.atguigu.spzx.common.exception;

import com.atguigu.spzx.model.vo.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GuiguException.class)
    @ResponseBody
    public Result error(GuiguException exception){
        exception.printStackTrace();
        return Result.build(null, exception.getResultCodeEnum());
    }

}