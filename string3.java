public class string3 {
    public static void printLetters(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        String name="prajwal palakshappa";
        printLetters(name);
        
    }
    
}
