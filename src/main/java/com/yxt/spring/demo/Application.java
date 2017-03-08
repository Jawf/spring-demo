package com.yxt.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.yxt.spring.demo.service.MessageService;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "Hello Spring!";
            }
        };
    }

  public static void main(String[] args) {
	  //initial Spring IoC container
      ApplicationContext context = 
          new AnnotationConfigApplicationContext(Application.class);
      
      //Get Bean from Spring IoC container
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
  }
}