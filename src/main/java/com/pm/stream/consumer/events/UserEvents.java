package com.pm.stream.consumer.events;

import com.pm.stream.consumer.model.User;
import java.util.logging.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@EnableBinding(Sink.class)
public class UserEvents {

    Logger logger = Logger.getLogger(UserEvents.class.getName());

    @StreamListener("input")
    public void consumeMessage(@Payload  User user){
        logger.info("message received : "+user);
    }
}
