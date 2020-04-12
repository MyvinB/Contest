package LC;

import java.util.PriorityQueue;

/*
 @author Myvin Barboza
 12/04/20 5:14 PM 
 */public class LastStoneWeight {

    static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((pq1,pq2)->(pq2-pq1));

        for (int i = 0; i <stones.length ; i++) {
        pq.add(stones[i]);
        }
        while(pq.size()>1){
            int res=pq.poll()-pq.poll();
            pq.add(res);
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int a[]={2,7,4,1,8,1};
        System.out.println(lastStoneWeight(a));
    }
}