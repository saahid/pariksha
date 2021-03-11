package org.codekitchen.pariksha.quiz.controller;

import org.codekitchen.pariksha.quiz.dto.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @GetMapping("")
    public Mono<Session> generateSession() {
        Session session = new Session();
        session.setId(String.valueOf(System.currentTimeMillis()));
        session.setUuid(UUID.randomUUID());
        return Mono.just(session);
    }
}
