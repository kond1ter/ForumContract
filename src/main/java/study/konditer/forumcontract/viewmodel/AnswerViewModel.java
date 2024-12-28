package study.konditer.forumcontract.viewmodel;

import java.time.LocalDateTime;

public record AnswerViewModel(
    Long id,
    String text,
    Long authorId,
    String authorName,
    LocalDateTime date,
    Integer reactionsCounter,
    Boolean currUserReaction,
    Long currUserReactionId
) {}
