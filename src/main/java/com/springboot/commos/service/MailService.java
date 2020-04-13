package com.springboot.commos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author : xiaoquan
 * create at:  2020/4/13  3:16 下午
 * @description: mail
 */
@Service
public class MailService {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Async
    public void helloworld(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }


    //@Scheduled(cron = "0 * * * * *")
    public void sad(){
        System.out.println("哎，我太难了。。。。。。");
    }


    public void sendEmail(){
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("java邮件测试");
        message.setText("test");
        message.setTo("xxx");
        message.setFrom("xxx");
       javaMailSender.send(message);

        System.out.println("发送成功");
    }

    @Async
    public void sendEmail2() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        //邮件设置
        //设置邮件标题
        helper.setSubject("快点开看看");
        //设置邮件主体内容
        helper.setText("<b style='color:red'>你被骗了，😄哈</b>",true);
        //设置要发送的邮箱
        helper.setTo("xxx");
        //使用哪个邮箱发送
        helper.setFrom("xxx");
        javaMailSender.send(mimeMessage);
        System.out.println("发送成功");
    }

}