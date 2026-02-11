class Box<T>{
    T value;
    void set(T value){

        this.value=value;
    }
    T get(){
        return value;

    }
}
class Code4{
    public static void main(String[]args){
        Box<Integer>intBox=new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());

        Box<String>strBox=new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());
    }
}