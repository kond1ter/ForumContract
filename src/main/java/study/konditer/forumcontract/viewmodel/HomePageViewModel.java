package study.konditer.forumcontract.viewmodel;

import java.util.List;

public record HomePageViewModel(
    BaseViewModel base,
    List<QuestionViewModel> questions,
    List<TagViewModel> availableTags,
    Integer totalPages
) {}
