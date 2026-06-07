package com.xiaocui.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:UserRegisterRequest
 * Package:com.xiaocui.usercenter.model.domain.request
 *用户注册请求
 * @Author 程序员ck
 * @Create 2026/5/25 18:39
 */
@Data
public class UserRegisterRequest implements Serializable {
    //信息传输的序列化和反序列化，版本号一致
    private static final long serialVersionUID = 3191241716373120793L;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 校验密码
     */
    private String checkPassword;
    /**
     * 星球编号
     */
    private String planetCode;


}
