package org.codekitchen.pariksha.quiz.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class Session {
    private String id;
    private UUID uuid;
}
