package com.SpringBootUdemy.learningspringboot;

import com.SpringBootUdemy.learningspringboot.game.GameRunner;
import com.SpringBootUdemy.learningspringboot.game.PacmanGame;

public class App01GamingBasic {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame(); //object

        var gameRunner = new GameRunner(game);
        //object creation + wiring of dependencies
        //Game is a dependency of GameRunner

//        gameRunner.run();
    }
}
