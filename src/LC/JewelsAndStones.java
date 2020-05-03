package LC;

import java.util.Arrays;

/*
 @author Myvin Barboza
 03/05/20 7:39 AM 
 */public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int count=0;
        for (int i = 0; i <S.length() ; i++) {
            if(J.contains((String.valueOf(S.charAt(i))))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}