package study.konditer.forumcontract.viewmodel;

import java.util.List;

public record UserQuestionsPageViewModel(
    BaseViewModel base,
    List<QuestionViewModel> questions
) {}
