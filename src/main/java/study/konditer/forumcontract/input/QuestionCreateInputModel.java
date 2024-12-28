package study.konditer.forumcontract.input;

import jakarta.validation.constraints.NotBlank;

public record QuestionCreateInputModel(
    @NotBlank(message = "Question title must be not blank") String title,
    @NotBlank(message = "Question text must be not blank") String text,
    String tagsIds
) {}
