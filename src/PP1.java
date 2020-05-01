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
//                PriorityQueue<Integer> pqElements = new PriorityQueue<>((c,d)->d-c);
//                PriorityQueue<Integer> pqIndex =  new PriorityQueue<>((c,d)->d-c);
//                HashMap<Integer,Integer> hm = new HashMap<>();
//                System.out.println(Arrays.toString(b));
//                for (int i = 0; i <b.length ; i++) {
//                    pqElements.add(a[i]);
//                    pqIndex.add(b[i]);
//                    hm.put(i,b[i]);
//                }
//                int c[] = new int[n];
//                for (int i = 0; i <c.length ; i++) {
//                    c[i]=
//                }
                TreeMap<Integer,Integer> map=new TreeMap<>();
                TreeSet<Integer> set=new TreeSet<>();
                System.out.println(Arrays.toString(b));
                for (int i =0; i <b.length ; i++) {
                    set.add(b[i]);
                }
                System.out.println(set);
                set= (TreeSet<Integer>) set.descendingSet();
                System.out.println(set);
                Iterator<Integer> integerIterator = set.iterator();

                int i=0;
                while(integerIterator.hasNext()){
                    map.put(integerIterator.next(),i++);

                }
                System.out.println(map);
                Arrays.sort(a,Comparator.reverseOrder());
                for (int j = 0; j <b.length ; j++) {
                    b[j]=a[map.get(b[j])];
                }
                System.out.println(Arrays.toString(b));
                System.out.println(aliceSum);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}