package edu.miu.cs.cs590.bootjmsreceiver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class BookMessageListener {

    @JmsListener(destination = "testQueue")
    public void receiveMessage(final String bookAsString){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Book book = objectMapper.readValue(bookAsString,Book.class);
            System.out.println("JMS receiver message: "+"\n"+
                    "Book ISBN:"+ book.getIsbn()
                    +"\nBook Title: "+book.getTitle()
                     +"\nBook Author: "+book.getAuthor()
                      +"\nBook Price: "+book.getPrice());
        } catch (IOException e) {
            System.out.println("JMS receiver: Cannot convert: "+
                    bookAsString+" to a book");;
        }
    }
}
