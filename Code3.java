class Animal{
     void Animal(){
        System.out.println(" animals are cat,human,lion");
    
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Dog Barks");
    }
}
class Humans extends Animal{
    void Speak(){
        System.out.println("Humans Speak");
    }
}
class Code3{

      public static void main(String[] args) {
        Dog d1=new Dog();
        Humans h1=new Humans();
        h1.Animal();
        d1.Animal();
        d1.Bark();
        h1.Speak();
}
}