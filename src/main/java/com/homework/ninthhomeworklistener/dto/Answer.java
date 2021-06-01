package com.homework.ninthhomeworklistener.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Answer implements Serializable {
    private Integer id;
    private State state;
    private LocalDateTime time;
    private String message;

    Answer(Integer id, State state, LocalDateTime time, String message) {
        this.id = id;
        this.state = state;
        this.time = time;
        this.message = message;
    }

    public static Answer getAnswer(Request req) {
        return new Answer(req.getId(), State.VALID, LocalDateTime.now(), "Должник");
    }
}