import java.util.Scanner;
public class function2 {
    public static void calculateSum(int a,int b){//parameter in methods are called parameters or formal parameter
        int sum=a+b;
        System.out.println("the sum is"+sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculateSum(a, b);//this are called actual parameter or arguments
        
    }
    
}
