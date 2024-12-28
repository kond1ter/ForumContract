package study.konditer.forumcontract.viewmodel;

import java.util.List;

public record QuestionPageViewModel(
    BaseViewModel base,
    QuestionViewModel question,
    List<AnswerViewModel> answers,
    String pinRequestStatus
) {}
