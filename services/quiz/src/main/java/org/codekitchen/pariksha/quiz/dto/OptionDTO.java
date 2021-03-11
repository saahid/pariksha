package org.codekitchen.pariksha.quiz.dto;

import lombok.Data;

@Data
public class OptionDTO {
    private String text;
    private OptionType type;
    private String url;
}
