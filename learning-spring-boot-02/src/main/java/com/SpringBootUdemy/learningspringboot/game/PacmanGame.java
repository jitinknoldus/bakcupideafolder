package com.SpringBootUdemy.learningspringboot.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("Pac Up");
    }

    public void down(){
        System.out.println("Pac Down");
    }

    public void left(){
        System.out.println("Pac Left");
    }

    public void right(){
        System.out.println("Pac Right");
    }
}
