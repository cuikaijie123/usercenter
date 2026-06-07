package com.xiaocui.usercenter.exception;
import com.xiaocui.usercenter.common.ErrorCode;
/**
 * ClassName:BusinessException
 * Package:com.xiaocui.usercenter.exception
 *自定义异常类
 * @Author 程序员ck
 * @Create 2026/5/25 20:09
 */
public class BusinessException extends RuntimeException {
        /**
         * 异常码
         */
        private final int code;
     /**
     * 描述
     */
     private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
}
