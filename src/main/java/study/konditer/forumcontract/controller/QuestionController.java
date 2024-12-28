package study.konditer.forumcontract.controller;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import study.konditer.forumcontract.input.QuestionCreateInputModel;

@RequestMapping("/questions")
public interface QuestionController {
    
    @GetMapping
    String questionsList(
        @RequestParam(defaultValue = "") Long tag,
        @RequestParam(defaultValue = "false") Boolean personal,
        @RequestParam(defaultValue = "0") int page, 
        @RequestParam(defaultValue = "10") int size,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/{id}")
    String question(
        @PathVariable Long id,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/create")
    String newQuestion(
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @PostMapping("/create")
    String registerQuestion(
        QuestionCreateInputModel questionModel,
        BindingResult bindingResult,
        Principal principal,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/close/{id}")
    String closeQuestion(
        @PathVariable Long id,
        Principal principal,
        RedirectAttributes redirectAttributes
    );
}
