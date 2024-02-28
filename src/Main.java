//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**public abstract double getPerimeter()

 деген абстракт методун  Shape деген класска кошунуз.

 Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.**/
        Shape shape1 = new Triangle(10);
        Shape shape2 = new Circle(7);
        Shape shape3 = new Hexagon(7);
        Shape shape4 = new Square(5);
        Shape shape5 = new Rectangle(5);
        System.out.println("P = "+shape1.getPerimeter());
        System.out.println("P = "+shape2.getPerimeter());
        System.out.println("P = "+shape3.getPerimeter());
        System.out.println("P = "+shape4.getPerimeter());
        System.out.println("P = "+shape5.getPerimeter());


        Shape[]shapes = {shape1,shape2,shape3,shape4,shape5};
        for (Shape shape:shapes){
            System.out.println(shape);
        }

    }


}