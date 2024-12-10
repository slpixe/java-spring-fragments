package com.example.springfragmets.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        // Add attributes to the model if needed
        model.addAttribute("username", "JohnDoe"); // Mock username
        return "home";  // This corresponds to src/main/resources/templates/home.html
    }

    @GetMapping("/about")
    public String about(Model model) {
        // Add attributes to the model if needed
        model.addAttribute("username", "JohnDoe"); // Mock username
        return "about";  // This corresponds to src/main/resources/templates/about.html
    }

    @GetMapping("/meow")
    public String meow(Model model) {
        // Add attributes to the model if needed
        model.addAttribute("username", "JohnDoe"); // Mock username
        return "meow";  // This corresponds to src/main/resources/templates/meow.html
    }
}
