package com.xiaocui.usercenter.service.impl;
import com.xiaocui.usercenter.UserCenterApplication;
import com.xiaocui.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;
    /**
     * 测试添加新用户
     */
    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(5l);
        user.setUsername("xaiocui");
        user.setUserAccount("xiaocui123456");
        user.setAvatarUrl("https://picsum.photos/200/200");
        user.setGender(1);
        user.setUserPassword("12345678");
        user.setPhone("123");
        user.setEmail("123.qq.com");
      boolean result= userService.save(user);
        System.out.println(result);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }
    /**
     * 测试注册用户
     */

    @Test
    public void userRegister() {
        User user = new User();
        user.setUsername("dogYupi");
        user.setUserAccount("123");
        user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);

    }
}