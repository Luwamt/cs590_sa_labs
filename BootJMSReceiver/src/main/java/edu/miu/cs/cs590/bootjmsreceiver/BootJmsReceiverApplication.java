package edu.miu.cs.cs590.bootjmsreceiver;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class BootJmsReceiverApplication  {

//    @Autowired
//    JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BootJmsReceiverApplication.class, args);
        System.out.println("Hello message sender");


    }

//    @Override
//    public void run(String... args) throws Exception {
//        Book book= new Book("213-56986","John Smith","Introduction Java",20.99);
//        //convert to JSON String
//        ObjectMapper objectMapper= new ObjectMapper();
//        String bookAsString =objectMapper.writeValueAsString(book);
//
//        System.out.println("Sending JMS Message to: "+ bookAsString);
//        jmsTemplate.convertAndSend("testQueue, ", bookAsString);
//
//    }
    }

