package LC;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/*
 @author Myvin Barboza
 10/04/20 2:55 PM 
 */


    class MinStack {

            int min=Integer.MAX_VALUE;
           Stack<Integer> stack=new Stack<>();



            /** initialize your data structure here. */
            public MinStack() {


            }

            public void push(int x) {
                if(x<=min){
                    stack.push(min);
                    min=x;
                }
                stack.push(x);
            }

            public void pop() {
                if(stack.pop()==min) min=stack.pop();

            }

            public int top() {
                return stack.peek();

            }

            public int getMin() {
                System.out.println(stack);
                return min;
            }
/*["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
*/
    public static void main(String[] args) {
    MinStack l=new MinStack();
    l.push(-2);
    l.push(0);
    l.push(-3);
    System.out.println(l.getMin());
    l.pop();
        System.out.println(l.top());
        System.out.println(l.getMin());

    }
}