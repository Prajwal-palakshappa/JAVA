public class string4 {
    //substring
    //consider string prajwal where "raj is a substring where "ajl" is subsequence
    public static String substring(String str,int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr=subStr+str.charAt(i);
        }
        return subStr;


    }

        

    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(str.substring (1,5));
        // String s1="prajwal";
        // String s2="prajwal";
        // String s3=new String("prajwal");

        // if(s1==s2){
        //     System.out.println("the both strings are equal");

        // }else{
        //     System.out.println("this strings are not equal");
        // }

        // if(s1==s3){
        //     System.out.println("this strings are equal");
        // }else{
        //     System.out.println("this strings are not equal ");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("this string  is equal ");
        // }else{
        //     System.out.println("this string is not equal ");
        // }


       //substring
        //consider string prajwal where "raj is a substring where "ajl" is subsequence
        



    }
    
}
 