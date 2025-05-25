import java.util.*;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsInJava {
    public static void main(String[] args) {
        int[] arr={1,3,6,2,4,8,7,0,9,5,4,7,3,8};
        arraylist(arr);
        linkedlist(arr);
    }
  public static  void arraylist(int[] arr){
      ArrayList<Integer>list=new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
          list.add(arr[i]);
      }
      ArrayList<Integer>list1=new ArrayList<>();
      list1.addAll(list);
      System.out.println(list1);
  }
  public static void linkedlist(int[]arr){
        LinkedList<Integer> ll=new LinkedList<>();
      for (int i = 0; i < arr.length ; i++) {
   ll.add(arr[i]);
      }
      System.out.println(ll.getFirst()+" "+ll.getLast()+" "+ll.getClass().getSimpleName());
      System.out.println(ll.iterator());
  }
}
