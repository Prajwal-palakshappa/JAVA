import  java.util.Scanner;
public class function {
    public static void  printHelloWorld(int a,int b){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
         int sum=a+b;
         System.out.println(sum);
    }
    
    public static void main(String[] args) {
        //function n=new function();
        
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number for calculation:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int sum=a+b;
         System.out.println("the sum is:" +sum); 
         printHelloWorld(a,b);
        
    }
    
}
