package edu.miu.cs.cs590.lab2.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs.cs590.lab2.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsSender {
    /**
     * Message Sender
     */
    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(Book book){
        try{
            //Convert Book To JSON String
            ObjectMapper objectMapper= new ObjectMapper();
            String bookAsString =objectMapper.writeValueAsString(book);

            System.out.println("Sending JMS Message to: "+ bookAsString);
            jmsTemplate.convertAndSend("testQueue", bookAsString);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

    }
}
