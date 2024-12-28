package study.konditer.forumcontract.viewmodel;

public record ReportPageViewModel(
    BaseViewModel base,
    ReportViewModel report,
    QuestionViewModel question,
    AnswerViewModel answer
) {}
