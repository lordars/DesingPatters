import Facade.Facade;
import Strategy.*;
import org.example.SingletonEager;
import org.example.SingletonLazy;
import org.example.SingletonLazyHolder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Singleton
        SingletonLazy lazy =  SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);


        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder =  SingletonLazyHolder.getInstance();
        System.out.println(holder);


        //Strategy

        Comportamento defensivo= new ComportamentoDefensivo();
        Comportamento normal= new ComportamentoNormal();
        Comportamento agressivo= new ComportamentoAgressivo();

        Robot robot = new Robot();
        robot.setComportamento(normal);
        robot.mover();
        robot.mover();
        robot.setComportamento(defensivo);
        robot.mover();
        robot.mover();
        robot.mover();
        robot.setComportamento(agressivo);
        robot.mover();
        robot.mover();
        robot.mover();
        robot.mover();





        //Facade
         Facade facede = new Facade();

         facede.migrarCLiente("Jose",  "1245678");

    }
}