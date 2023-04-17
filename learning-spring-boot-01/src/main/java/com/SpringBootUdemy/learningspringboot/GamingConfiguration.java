package com.SpringBootUdemy.learningspringboot;

import com.SpringBootUdemy.learningspringboot.game.GameRunner;
import com.SpringBootUdemy.learningspringboot.game.GamingConsole;
import com.SpringBootUdemy.learningspringboot.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
