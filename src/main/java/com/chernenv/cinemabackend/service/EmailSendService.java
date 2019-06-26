package com.chernenv.cinemabackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@Service
public class EmailSendService {

  @Autowired
  private JavaMailSender javaMailSender;

  public void sendEmail(List<String> addresses, String title, String text){
    addresses.parallelStream().forEach(addr -> sendEmail(addr,title,text));
  }

  public void sendEmail(String address, String title, String text){
    SimpleMailMessage msg = new SimpleMailMessage();

    msg.setTo(address);
    msg.setSubject(title);
    if(text == null) msg.setText("Cryptospot price alert!");
    else msg.setText(text);

    javaMailSender.send(msg);
  }

  public void sendMailWithAttachament(String address, String title, String text, String resourceLocation) throws MessagingException {

    MimeMessage message = javaMailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message, true);

    helper.setSubject(title);
    helper.setText(text);
    helper.setTo(address);

    helper.addAttachment("attachment-document-name.jpg", new ClassPathResource(resourceLocation));

    javaMailSender.send(message);

  }



}
