package com.SpringBootUdemy.learningspringboot;

import com.SpringBootUdemy.learningspringboot.game.GameRunner;
import com.SpringBootUdemy.learningspringboot.game.GamingConsole;
import com.SpringBootUdemy.learningspringboot.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasic {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }


    }
}
