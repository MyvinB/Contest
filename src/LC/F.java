package LC;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 @author Myvin Barboza
 07/04/20 3:42 PM
 */public class F {



   public static void main(String[] args) {
     int arr[]={1,2,3};
     Set<Integer> set=new HashSet();
     for(int i=0;i<arr.length;i++){
       set.add(arr[i]);
     }
     int count=0;

     for (int i = 0; i <arr.length ; i++) {
       if(set.contains(arr[i]+1))count++;
     }
     System.out.println(count);
  }
}
