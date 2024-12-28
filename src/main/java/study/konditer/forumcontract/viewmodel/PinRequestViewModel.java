package study.konditer.forumcontract.viewmodel;

import java.time.LocalDateTime;

public record PinRequestViewModel(
    Long id,
    LocalDateTime date,
    QuestionViewModel question,
    String status,
    Integer days
) {}
