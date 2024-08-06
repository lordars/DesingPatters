package org.example;

/*
* Singleton apressado
* @autor Adrián Ricardo
* */


public class SingletonEager {

    //já instancia reapidamente para retornar pronto.
    private  static  SingletonEager instancia= new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
