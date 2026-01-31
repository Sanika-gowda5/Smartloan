import java.util.Scanner;

class Code16{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     System.out.println("enter an elements:");
     int n = sc.nextInt();
     int sum=0;
     int a[]  = new int[n];
     for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        sum+= a[i];
     }
      System.out.println(sum);
    }
}