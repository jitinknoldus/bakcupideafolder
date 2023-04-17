package org.knoldus;

public class SingletonClassExample {

    private static SingletonClassExample singletonObject = new SingletonClassExample();
    private SingletonClassExample(){}

    public static SingletonClassExample getSingletonObject(){
        return singletonObject;
    }
}