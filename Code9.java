abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("Hello");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Code9 {
    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.draw();
        cl.message();
    }
}