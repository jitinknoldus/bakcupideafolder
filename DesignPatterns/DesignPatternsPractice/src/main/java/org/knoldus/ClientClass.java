package org.knoldus;

public class ClientClass {
    public static void main(String[] args) {
//        SingletonClassExample obj1 = SingletonClassExample.getSingletonObject();
        SingletonClassLazy obj2 = SingletonClassLazy.returnObject();
        SingletonClassLazy obj3 = SingletonClassLazy.returnObject();

        if(obj2.equals(obj3)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
