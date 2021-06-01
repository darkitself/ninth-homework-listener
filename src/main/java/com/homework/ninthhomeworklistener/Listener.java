package com.homework.ninthhomeworklistener;

import com.homework.ninthhomeworklistener.dto.Answer;
import com.homework.ninthhomeworklistener.dto.Request;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
public class Listener {
    @RabbitListener(queues = "queue")
    public Answer process(Request req) {
        return Answer.getAnswer(req);
    }
}