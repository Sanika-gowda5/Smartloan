class Code1{
    void Sound(){
        System.out.println("hello");

    }
}
class Dog extends Code1{
    void Bark(){
        System.out.println("Hii");

    }
}
class Main{
    public static void main(String[]args){
        Dog dg = new Dog();
        dg.Bark();
        dg.Sound();
    }
}