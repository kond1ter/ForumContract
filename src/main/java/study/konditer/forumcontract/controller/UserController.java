package study.konditer.forumcontract.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import study.konditer.forumcontract.input.UserRegisterInputModel;

@RequestMapping("/users")
public interface UserController {
    
    @GetMapping("/register")
    String registerPage(Model model);

    @PostMapping("/register")
    String register(
        UserRegisterInputModel userRegisterModel, 
        BindingResult bindingResult,
        RedirectAttributes redirectAttributes
    );

    @GetMapping("/login")
    String loginPage();

    @PostMapping("/login-error")
    String loginError(
        String username,
        RedirectAttributes redirectAttributes
    );
}
