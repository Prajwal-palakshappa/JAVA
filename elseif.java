import java.util.Scanner;
public class elseif {
    public static void main(String[] args ){
        int age;
        System.out.println("plz enter your age here");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>60){
            System.out.println("you are experienced");
        }
        else if(age>45){
            System.out.println("you are semi experienced");

        }
        else{
            System.out.println("you are not experiened");
        }
    } 
    
    
}
