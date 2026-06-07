package com.xiaocui.usercenter.service.impl;

import com.xiaocui.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ck
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2026-05-22 18:28:53
 */

public interface UserService extends IService<User> {
    /**
     * 注册功能
     *
     * @param userAccount 注册账号
     * @param userPassword 注册密码
     * @param checkPassword 确认密码
     * @param planetCode 星球编号
     * @return 新用户的id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 登录功能
     *
     * @param userAccount 账号
     * @param userPassword 密码
     * @param request 前端的登录请求
     * @return  脱敏后的用户信息
     */
    User login(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser User对象
     * @return 安全的用户信息
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request 前端的注销请求
     * @return
     */
    int  userLogout(HttpServletRequest request);
}
