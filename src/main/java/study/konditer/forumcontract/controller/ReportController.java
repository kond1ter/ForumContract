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

import study.konditer.forumcontract.input.ReportCreateInputModel;

@RequestMapping("/reports")
public interface ReportController {

    @GetMapping
    String reportsList(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/{id}")
    String report(
        @PathVariable Long id,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/create")
    String newReport(
        @RequestParam(defaultValue = "") Long questionId,
        @RequestParam(defaultValue = "") Long answerId,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );
    
    @PostMapping("/create")
    String registerReport(
        ReportCreateInputModel reportModel,
        BindingResult bindingResult,
        Principal principal,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/reject/{id}")
    String rejectReport(
        @PathVariable Long id,
        Principal principal,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/approve/{id}")
    String approveReport(
        @PathVariable Long id,
        @RequestParam Boolean ban,
        Principal principal,
        RedirectAttributes redirectAttributes
    );
}
