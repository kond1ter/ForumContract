package study.konditer.forumcontract.input;

import jakarta.validation.constraints.NotBlank;

public record ReportCreateInputModel(
    Long reportedQuestionId,
    Long reportedAnswerId,
    @NotBlank(message = "Report text must be not blank") String reportText
) {}
