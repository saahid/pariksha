package org.codekitchen.pariksha.quiz.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuizDTO {
    private String id;
    List<QuestionDTO> questions;
}
