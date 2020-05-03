import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
 @author Myvin Barboza
 01/05/20 1:27 PM 
 */public class PP1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String s[] = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                String s1[] = br.readLine().split(" ");
                Integer a[] = new Integer[n];
                for (int i = 0; i <n ; i++) {
                    a[i] = Integer.parseInt(s1[i]);
                }
                int aliceSum=0;
                int b[] = new int[n];
                for (int i = 0; i <k ; i++) {
                    String s2[] = br.readLine().split(" ");
                    int x = Integer.parseInt(s2[0]);
                    x=x-1;
                    int y = Integer.parseInt(s2[1]);
                    y=y-1;
                    while(x<=y){
                        aliceSum+=a[x];
                        b[x]++;
                        x++;
                    }

                }
                //
              //  System.out.println(Arrays.toString(b));
                //System.out.println(a);
             PriorityQueue<Integer> pq=new PriorityQueue<>((c,d)->(d-c));
                PriorityQueue<Integer> we=new PriorityQueue<>((c,d)->(d-c));
                for (int i = 0; i <a.length ; i++) {
                    pq.add(a[i]);
                    we.add(b[i]);
                }
             //  System.out.println(pq+" "+we);
                int sum=0;
                while(!pq.isEmpty()){
                    sum=sum+pq.poll()*we.poll();
                }
               // System.out.println(sum);

               // System.out.println(Arrays.toString(b));
                System.out.println(aliceSum);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}