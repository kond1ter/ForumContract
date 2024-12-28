package study.konditer.forumcontract.controller;

import java.security.Principal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import study.konditer.forumcontract.input.PinRequestCreateInputModel;

@RequestMapping("/pins")
public interface PinRequestController {

    @GetMapping
    String pinRequestsList(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/create/{questionId}")
    String newPinRequest(
        @PathVariable Long questionId,
        Principal principal,
        Model model,
        RedirectAttributes redirectAttributes
    );

    @PostMapping("/create")
    String registerPinRequest(
        PinRequestCreateInputModel pinRequestModel,
        Principal principal,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/reject/{id}")
    String rejectPinRequest(
        @PathVariable Long id,
        Principal principal,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/approve/{id}")
    String approvePinRequest(
        @PathVariable Long id,
        Principal principal,
        RedirectAttributes redirectAttributes
    );
}
