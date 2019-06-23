package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.generated.tables.Cinema;
import com.eoller.cinemadb.cinemadb.repository.CinemaRepository;
import com.eoller.cinemadb.cinemadb.service.EmailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private EmailSendService emailSendService;

    @GetMapping("/cinema")
    public ResponseEntity getAll(){
        return new ResponseEntity(cinemaRepository.getAll(), HttpStatus.OK);
    }

    @GetMapping("/cinema/{cinemaId}")
    public ResponseEntity getById(@PathVariable long cinemaId){
        return new ResponseEntity(cinemaRepository.getById(cinemaId), HttpStatus.OK);
    }

    @GetMapping("/testMail")
    public void Lol(){
        emailSendService.sendEmail("Egorpyp@gmail.com", "qweqw","wqeqwe");
    }

}
