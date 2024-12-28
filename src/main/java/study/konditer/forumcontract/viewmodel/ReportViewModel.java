package study.konditer.forumcontract.viewmodel;

import java.time.LocalDateTime;

public record ReportViewModel(
    Long id,
    Long questionId,
    String authorName,
    String reportText,
    LocalDateTime date,
    String status
) {}
