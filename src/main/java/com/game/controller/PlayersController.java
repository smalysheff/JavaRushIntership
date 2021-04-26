package com.game.controller;

import com.game.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayersController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/rest/players")
    public String getUsers(Model model){
        model.addAttribute("players", playerRepository.findAll());
        return "/rest/players";
    }

}
