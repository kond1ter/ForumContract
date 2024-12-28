package study.konditer.forumcontract.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/reactions")
public interface ReactionController {
    
    @GetMapping("/create")
    String registerReaction(
        @RequestParam Long questionId,
        @RequestParam Long answerId,
        @RequestParam Boolean isPositive,
        Principal principal,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/remove")
    String removeReaction(
        @RequestParam Long questionId,
        @RequestParam Long reactionId,
        Principal principal,
        RedirectAttributes redirectAttributes
    );
}
