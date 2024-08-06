package org.example;
/*
* Singleton "Pregiçoso"
* @autor Adrián Ricardo
* */
public class SingletonLazy {


    //es una instancia da clase.
    private  static  SingletonLazy instancia;


    //cria funcion para ser chamada no static
    private  SingletonLazy(){
        super();
    }


    //Deixa de forma publica a instancia
    public  static SingletonLazy getInstance(){

        if(instancia == null ){
            instancia = new SingletonLazy();
        }
        return  instancia;
    }
}
