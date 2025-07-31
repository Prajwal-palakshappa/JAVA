//display all numbers entered by user except multiples of 10
import java.util.Scanner;
public class loops8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("plz enter the numbers:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("your number was"+n);
        }while(true);
        
    }
    
}
