package study.konditer.forumcontract.viewmodel;

import java.time.LocalDateTime;
import java.util.List;

public record QuestionViewModel(
    Long id,
    String title,
    String text,
    Long authorId,
    String authorName,
    LocalDateTime date,
    LocalDateTime pinnedTo,
    List<TagViewModel> tags,
    Boolean closed
) {}
