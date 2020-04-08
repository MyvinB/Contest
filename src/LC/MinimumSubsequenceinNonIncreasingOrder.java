package LC;

/*
 @author Myvin Barboza
 05/04/20 8:04 AM
 link:https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
 */

import java.util.*;

public class MinimumSubsequenceinNonIncreasingOrder {
  public static void main(String[] args) {
    int a[]={6};
    int sum=0;
    for (int i = 0; i <a.length ; i++) {
      sum+=a[i];
    }
  Arrays.sort(a);
    List<Integer> list=new ArrayList<>();
    int inclSum=0;
    for (int i = a.length-1; i >=0 ; i--) {
      sum=sum-a[i];
      inclSum+=a[i];
      list.add(a[i]);
      if(inclSum>sum)break;
    }
    System.out.println(list);
  }

}
