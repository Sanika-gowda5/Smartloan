class Animal{
    void sound(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("hi");
    }
}
class Code4{
     public static void main(String[] args) {
        Dog d1=new Dog();
        Animal a1=new Animal();
        d1.sound();
        a1.sound();
    }
}