import Facade.Facade;
import Prototype.Circle;
import Prototype.Rectangle;
import Prototype.Shape;
import Strategy.*;
import org.example.SingletonEager;
import org.example.SingletonLazy;
import org.example.SingletonLazyHolder;

import java.util.ArrayList;
import java.util.List;

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




         //Prototype

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }


    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}