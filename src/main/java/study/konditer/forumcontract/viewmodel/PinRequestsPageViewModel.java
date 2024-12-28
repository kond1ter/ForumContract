package study.konditer.forumcontract.viewmodel;

import java.util.List;

public record PinRequestsPageViewModel(
    BaseViewModel base,
    List<PinRequestViewModel> requests,
    Integer totalPages
) {}
