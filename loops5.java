//print the reverse of a number 
public class loops5 {
    public static void main(String[] args) {
    // int n =13122003;
    // while(n>0){
    //     int lastDigit=n%10;
    //     n=n/10;
    //     System.out.print(lastDigit+"  ");
    // }
    int n=10899;
    int rev=0;
    while(n>0){
        int lastDigit=n%10;
        n=n/10;
        rev=(rev*10)+lastDigit;
        //System.out.println(rev);
    }
    System.out.println(rev);

    
}
}
 