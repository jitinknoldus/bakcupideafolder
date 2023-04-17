package org.knoldus;

public class SingletonClassLazy {
    private static volatile SingletonClassLazy singletonClassLazy;
    private SingletonClassLazy(){};

    public static SingletonClassLazy returnObject(){
        synchronized (SingletonClassLazy.class){
            if(singletonClassLazy==null){
                singletonClassLazy = new SingletonClassLazy();
            }
            return singletonClassLazy;
        }
    }

}
