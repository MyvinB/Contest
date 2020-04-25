package LC;

/*
 @author Myvin Barboza
 20/04/20 5:35 PM 
 */public class LC1008 {

    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        int a[] = {8,5,1,7,10,12};
        Node n = construct(a, Integer.MAX_VALUE);

    }
    static int index=0;
    static Node construct(int a[],int limit){
        if (a.length == index || a[index] > limit) {
            return null;
        }
        Node root=new Node(a[index++]);
        root.left=construct(a,root.data);
        root.right=construct(a,limit);
        return root;
    }

}