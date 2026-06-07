package com.xiaocui.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:UserLoginRequest
 * Package:com.xiaocui.usercenter.model.domain.request
 *登录请求
 * @Author 程序员ck
 * @Create 2026/5/25 18:38
 */
@Data
public class UserLoginRequest implements Serializable {
    //保证序列化和反序列化版本一致
    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;
}
