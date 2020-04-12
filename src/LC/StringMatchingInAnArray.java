package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 @author Myvin Barboza
 12/04/20 8:13 AM 
 */public class StringMatchingInAnArray {

    static List<String> stringMatching(String[] words) {
        Arrays.sort(words,(arr1,arr2)->(arr2.length()-arr1.length()));
        System.out.println(Arrays.toString(words));
    String temp=words[0];
    List<String> list=new ArrayList<>();
        for (int i = 1; i <words.length ; i++) {
            if(temp.contains(words[i])){
                list.add(words[i]);
            }else{
                temp=temp+words[i];
            }
        }
        return list;
    }


    public static void main(String[] args) {
    String word[]={"mass","as","hero","superhero"};
        System.out.println(stringMatching(word));
    }
}