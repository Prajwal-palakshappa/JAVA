//keep entering the number untill user enters the multiple of 10
import java.util.Scanner;
public class loops7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("plz enter the numbers:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
    
}
