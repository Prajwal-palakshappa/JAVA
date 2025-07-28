import java.util.*;
import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        // int i=1;
        // while(i<=1000){
        //     System.out.print(i+" ");
        //     i++;
        // }
        // print numbers 1 to n
        System.out.println("plz enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int counter=1;
        int range=sc.nextInt();
        while(counter<=range){
            System.out.print(counter+" ");
            counter++;
        }
        //System.out.println();
    }
    
}

