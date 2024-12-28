package study.konditer.forumcontract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/answers")
public interface ErrorController {
    
    @GetMapping
    String error();
}
