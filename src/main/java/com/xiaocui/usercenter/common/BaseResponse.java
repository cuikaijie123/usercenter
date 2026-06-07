package com.xiaocui.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:BaseResponse
 * Package:com.xiaocui.usercenter.common
 * 返回通用类
 * @Author 程序员ck
 * @Create 2026/5/25 16:51
 */
@Data
public class BaseResponse<T> implements Serializable {
    /**
     * 状态码
     */
    private int code;
    /**
     * 数据
     */
    private T data;
    /**
     * 消息
     */
    private String message;
    /**
     * 描述
     */
    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
