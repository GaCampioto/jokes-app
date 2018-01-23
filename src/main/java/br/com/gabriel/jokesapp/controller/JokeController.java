package br.com.gabriel.jokesapp.controller;

import br.com.gabriel.jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String randomChuckQuote(Model model) {
        model.addAttribute("joke", jokeService.getChuckNorrisQuote());

        return "chucknorris";
    }
}
