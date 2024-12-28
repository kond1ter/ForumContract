package study.konditer.forumcontract.input;

import jakarta.validation.constraints.NotBlank;

public record AnswerCreateInputModel(
    Long questionId,
    @NotBlank(message = "Answer text must be not blank") String text
) {}
