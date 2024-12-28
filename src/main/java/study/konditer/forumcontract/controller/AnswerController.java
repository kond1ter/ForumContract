package study.konditer.forumcontract.controller;

import java.security.Principal;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;
import study.konditer.forumcontract.input.AnswerCreateInputModel;

@RequestMapping("/answers")
public interface AnswerController {

    @PostMapping("/create")
    String registerAnswer(
        @Valid AnswerCreateInputModel answerModel,
        BindingResult bindingResult,
        Principal principal,
        RedirectAttributes redirectAttributes
    );
}

