package study.konditer.forumcontract.viewmodel;

import java.util.List;

public record CreateQuestionPageViewModel(
    BaseViewModel base,
    List<TagViewModel> availableTags
) {}
