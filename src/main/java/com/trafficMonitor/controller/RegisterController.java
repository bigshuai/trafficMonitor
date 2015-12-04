package com.trafficMonitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhengdong on 11/20/15.
 * Author: lizhengdong
 * MailBox: 837718866@qq.com
 * Update by lizhengdong on 11/20/15.
 * Description: RegisterController
 */
@Controller
public class RegisterController extends BaseController {
//    @Autowired
//    private RegisterService registerService;

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@RequestParam(value = "usernamesignup", required = true) String username, @RequestParam(value = "emailsignup", required = true) String mailbox, @RequestParam(value = "youpasswd", required = true) String password, @RequestParam(value = "passwordsignup_confirm", required = true) String passwordConfirm) {

       /* if (registerService.alreadyExistUserName(username)) {
            return badResult(6, "该用户名已被注册");
        }
        if (registerService.alreadyExistUserName(mailbox)) {
            return badResult(7, "该邮箱已被注册");
        }
        password = MD5.GetMD5Code(password);//密码设置成MD5
        User user = new User();
        user.setUserName(username);
        user.setPassWord(password);
        user.setMailbox(mailbox);
        if (registerService.registerUser(user)) {
            return succResult("注册成功");
        } else {
            return badResult("注册失败");
        }*/
        return null;
    }
}
