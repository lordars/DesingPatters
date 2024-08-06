package org.example;
/*
* Singleton "Pregiçoso , e dentro de classe"
*
* @autor Adrián Ricardo
* */
public class SingletonLazyHolder {

    //cria uma classe para instanciar o singleton
   private  static   class InstanceHolder{


    private  static SingletonLazyHolder instancia= new SingletonLazyHolder();
   }


    //cria funcion para ser chamada no static
    private SingletonLazyHolder(){
        super();
    }


    //Deixa de forma publica a instancia e instancia por medio da classe InstanceHolder.
    public  static SingletonLazyHolder getInstance(){

        return  InstanceHolder.instancia;
    }
}
