import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

abstract class Shape {
    public abstract void draw(int a);

    public void test() {
        System.out.println("test in shape");
    }
}

class Circle extends Shape {
    public void draw(int a) {
        System.out.println("circle: "+a);
    }
}

class Rectangle extends Shape {
    public void draw(int a) {
        System.out.println("rectangle: "+a);
    }
}

class Generics<E> {
    E e;
    public Generics(E e) {
        this.e = e;
    }
    public Generics() {

    }
    public E get() {
        return this.e;
    }
    public void set(E e) {
        this.e = e;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // List<Circle> li = new ArrayList<>();
        // li.add(new Circle());

        // List<Rectangle> li1 = new ArrayList<>();
        // li1.add(new Rectangle());

        // drawAll(li);
        // drawAll(li1);

        // Generics<Shape> g = new Generics<>(new Circle());
        // g.get().draw(1);

        // g.set(new Rectangle());
        // g.get().draw(1);
        // g.get().test();

        // Shape c = new Rectangle();
        // c.draw(2);
        // c.test();


        // List<Number> li = new ArrayList<>(Arrays.asList(2.3, 1.2));
        // li.add(5);

        // System.out.println(li);

        // List<Integer> li1 = new ArrayList(Arrays.asList(1, 2));
        // li1.add(li.get(0));

        List<? extends Number> li = new ArrayList<Double>(Arrays.asList(1.4));
        //li.add(1);

        Number i = li.get(0);

        System.out.println(i);
        
    }
    private static void drawAll(List<? extends Shape> li) {
        for(Shape s : li) {
            s.draw(1);
        }
    }
}