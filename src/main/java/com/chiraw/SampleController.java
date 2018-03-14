package com.chiraw;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.ArrayList;

import com.chiraw.model.Game;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hola, asdfsad" + ((UserDetails)principal).getUsername();
    }

    @RequestMapping(value="/games", method = RequestMethod.GET)
	public ModelAndView ShowGames(){
		ModelAndView modelAndView = new ModelAndView();
        Game gaem = new Game();
        Game gaem2 = new Game();
        gaem.setId(23);
        gaem.setName("Max Payne");
        gaem2.setId(47);
        gaem2.setName("Hitman 2 - Silent Assassin");

        List<Game> games = new ArrayList<Game>();
        games.add(gaem);
        games.add(gaem2);
        
        modelAndView.addObject("games", games);
		modelAndView.setViewName("games");
		return modelAndView;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
