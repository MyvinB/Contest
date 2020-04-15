package LC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
 @author Myvin Barboza
 15/04/20 8:12 PM 
 */public class GuessTheData {

     public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String se;
            while((se=br.readLine())!=null){
                PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
                Stack<Integer> s=new Stack();
                Queue<Integer> q=new LinkedList<>();

                    int n=Integer.parseInt(se);
                    boolean cpq=true,cs=true,cq=true;
                    while(n--!=0){

                        String sa[]=br.readLine().split(" ");
                        int op = Integer.parseInt(sa[0]);
                        int val= Integer.parseInt(sa[1]);
                        if(op==1){
                            pq.add(val);
                            s.push(val);
                            q.add(val);
                        }else{
                            if( cpq && !pq.isEmpty()&& pq.peek()==val){
                                pq.poll();
                            }else cpq=false;
                            if( cs &&!s.isEmpty()&& s.peek()==val) {
                                s.pop();
                            }else cs=false;
                            if( cq && !q.isEmpty() &&q.peek()==val){
                                q.poll();
                            }else cq=false;

                        }

                    }
                    if(cs && !cq && !cpq)
                        System.out.println("stack");
                    else if(!cs && cq && !cpq)
                        System.out.println("queue");
                    else if(!cs && !cq && cpq)
                        System.out.println("priority queue");
                    else if(cs ||cq || cpq)
                        System.out.println("not sure");
                    else
                        System.out.println("impossible");




                }
            }

     }
