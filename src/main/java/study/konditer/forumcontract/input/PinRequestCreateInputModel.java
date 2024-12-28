package study.konditer.forumcontract.input;

import jakarta.validation.constraints.Min;

public record PinRequestCreateInputModel(
    Long questionId,
    @Min(value = 1, message = "Pin days must be greater than 0") Integer days
) {}
