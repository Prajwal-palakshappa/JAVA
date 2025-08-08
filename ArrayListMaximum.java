import java.util.*;
public class ArrayListMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        //System.out.println(list);
        int n=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(n<list.get(i)){
                n=list.get(i);
            }
        }
        System.out.println(" max element in ArrayList is: "+n);
    }
    
}
