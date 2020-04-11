package LC;

import java.util.Stack;

/*
 @author Myvin Barboza
 09/04/20 2:23 PM 
 */public class BackspaceStringCompare {


     static boolean compare(String a,String b) {
        Stack<Character> stack=new Stack<>();
         Stack<Character> stack1=new Stack<>();
         for (int i = 0; i <a.length() ; i++) {
             if(!stack.isEmpty() &&a.charAt(i)=='#')stack.pop();
             else if(a.charAt(i)!='#')stack.push(a.charAt(i));
         }
         for (int i = 0; i <b.length() ; i++) {
             if(!stack1.isEmpty() &&b.charAt(i)=='#')stack1.pop();
             else if(b.charAt(i)!='#')stack1.push(b.charAt(i));
         }

         if(stack.equals(stack1)) return true;
         else return false;

     }

     public static void main(String[] args) {
         System.out.println(compare("a#c","b"));


    }
}