class Animal{
    Animal(){
        System.out.println("Dog");
    }
}
class Dog extends Animal{
    public Dog(){
        super();
    }
     void Sound(){
        System.out.println("boww boww");
     }
    
    }

class Code5{
     public static void main(String[] args) {
        Dog dg =new Dog();
        dg.Sound();
    }
}
