interface payment{
    void pay();

}
class Upi implements payment{
    public  void pay(){
        System.out.println("paying");

    }
}
class Code8{
    public static void main(String[]args){
        Upi Gpay = new Upi();
        Gpay.pay();
    }
}