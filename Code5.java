class Animal{
    Animal(){
        System.out.println("cat");
    }
}
class Cat extends Animal{
    public Cat(){
        super();
    }
     void Sound(){
        System.out.println("meow meow");
     }
    
    }

class Code5{
     public static void main(String[] args) {
        Cat ca=new Cat();
        ca.Sound();
    }
}