package org.codekitchen.pariksha.quiz.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDTO {
    private String text;
    private QuestionType type;
    private List<OptionDTO> options;
}
