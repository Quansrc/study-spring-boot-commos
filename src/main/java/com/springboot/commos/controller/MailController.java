package com.springboot.commos.controller;

import com.springboot.commos.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * @author : xiaoquan
 * create at:  2020/4/13  3:17 下午
 * @description: mail
 */

@RestController
public class MailController {
    @Autowired
    MailService mailService;

    @GetMapping("/hello")
    public String mail(){
        mailService.helloworld();
        return "success";
    }

    @GetMapping("/send")
    public String sendMail(){
        mailService.sendEmail();
        return "success";
    }

    @GetMapping("/send2")
    public String sendMail2() throws MessagingException {
        mailService.sendEmail2();
        return "success";
    }
}