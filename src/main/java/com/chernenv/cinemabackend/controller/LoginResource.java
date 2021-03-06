package com.chernenv.cinemabackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Map;

@RestController
public class LoginResource {


    @Autowired
    private FindByIndexNameSessionRepository sessionRepository;

    @RequestMapping("/token")
    public Map<String, String> token(HttpSession session, HttpServletRequest request){
        System.out.println(request.getRemoteHost());

        String remoteHost = request.getRemoteHost();
        int portNumber = request.getRemotePort();

        System.out.println(remoteHost+":"+portNumber);
        System.out.println(request.getRemoteAddr());


        return Collections.singletonMap("token",session.getId());
    }

    @RequestMapping("/checkSession")
    public ResponseEntity<?> checkSession(){
        System.out.println("SESSION IS ACTIVE, wysylam 200");
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/user/logout", method = RequestMethod.POST)
    public ResponseEntity logout(HttpServletRequest request){
        System.out.println("DELETING SESSION");
        SecurityContextHolder.clearContext();
        return new ResponseEntity(HttpStatus.OK);
    }


}
