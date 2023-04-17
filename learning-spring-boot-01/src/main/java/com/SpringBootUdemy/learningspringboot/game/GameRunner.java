package com.SpringBootUdemy.learningspringboot.game;

public class GameRunner {
//    MarioGame game;
//    SuperContraGame game;

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    //    public GameRunner(MarioGame game) {
//        this.game = game;
//    }




    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
