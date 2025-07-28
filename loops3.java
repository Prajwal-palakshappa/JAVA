import java.util.*;
import java.util.Scanner;
public class loops3 {
    public static void main(String[] args) {
        System.out.println("plz enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        int sum=0; 
        int i=0;
        while(i<=n){
            sum=sum+i;
            
            i++;
           System.out.println("sum is:"+sum);
        }
        //System.out.println( sum);
        
    }
    
}
