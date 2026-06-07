package com.xiaocui.usercenter.exception;

import com.xiaocui.usercenter.common.BaseResponse;
import com.xiaocui.usercenter.common.ErrorCode;
import com.xiaocui.usercenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName:GlobalExceptionHandler
 * Package:com.xiaocui.usercenter.exception
 *全局异常处理器
 * @Author 程序员ck
 * @Create 2026/5/25 21:11
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
   @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
       return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
   }

   @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
       log.error("runtimeException", e);
       return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
   }
}
