package study.konditer.forumcontract.viewmodel;

import java.util.List;

public record ReportsPageViewModel(
    BaseViewModel base,
    List<ReportViewModel> reports,
    Integer totalPages
) {}
