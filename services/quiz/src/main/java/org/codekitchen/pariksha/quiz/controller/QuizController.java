package org.codekitchen.pariksha.quiz.controller;

import lombok.extern.slf4j.Slf4j;
import org.codekitchen.pariksha.quiz.dto.QuizDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class QuizController {

    @PostMapping("/quizs")
    public Mono<QuizDTO> addQuestions(@RequestBody QuizDTO quiz) {
        log.info(quiz.toString());
        return Mono.just(quiz);
    }
}
