class Shape {
    void message() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Dog");
    }
}

public class Code7 {
    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.draw();
        cl.message();
    }
}
