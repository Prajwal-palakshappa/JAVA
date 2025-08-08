import java.util.*;
public class ArrayListSwap1 {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,(list.get(idx2)));
        list.set(idx2,temp);
    }
    public static void swap1(ArrayList<Integer> list,int idx3,int idx4){
        int temp=list.get(idx3);
        list.set(idx3,(list.get(idx4)));
        list.set(idx4,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        int idx1=0;
        int idx2=1;
        int idx3=2;
        int idx4=3;

        swap(list,idx1,idx2);
        swap1(list,idx3,idx4);
        System.out.println(" this is swapped list: "+list);
    }
    
}
