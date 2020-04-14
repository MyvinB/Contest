package LC;

/*
 @author Myvin Barboza
 14/04/20 1:54 PM 
 */
public class StringShiftsLC {

    static String rightShift(char[] a,int count){

        while(count>0){
            char temp=a[a.length-1];
            for(int i=a.length-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=temp;
            count--;
        }
        return String.valueOf(a);
    }


    static String leftShift(char[] a,int count){

        count=-count;
        while(count>0){
            char temp=a[0];
            for (int i = 0; i <a.length-1 ; i++) {
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
            count--;
        }
        return String.valueOf(a);
    }



    static String stringShift(String s, int[][] shift) {
        int left=0;
        int right=0;
        for (int i = 0; i <shift.length ; i++) {
            if(shift[i][0]==0){
                left+=shift[i][1];
            }
            else right+=shift[i][1];

        }

        int count=right-left;
        char a[]=s.toCharArray();
        if(count>0) return rightShift(a,count);
        else return leftShift(a,count);

    }



    public static void main(String[] args) {
        int [][]shifts={{0,7},{1,7},{0,2},{1,3}};

        System.out.println(stringShift("abcdefg",shifts));
    }
}