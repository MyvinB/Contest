package LC;

import java.util.Arrays;

/*
 @author Myvin Barboza
 12/04/20 8:34 AM 
 */
public class QueriesOnAPermutationWithKey {

    static int[] processQueries(int[] queries, int m) {

        int a[]=new int[m];
        for (int i = 0; i <a.length ; i++) {
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <queries.length ; i++) {
            int find=queries[i];
            for (int j = 0; j <a.length ; j++) {
                if(find==a[j]){
                    int temp=a[j];
                    queries[i]=j;
                    while(j>0){
                        a[j]=a[j-1];
                        j--;
                    }
                    a[0]=temp;

                    break;
                }
            }
        }
        return queries;
    }



    public static void main(String[] args) {
        int q[]={7,5,5,8,3};
        int m=8;
        System.out.println(Arrays.toString(processQueries(q,m)));
    }
}