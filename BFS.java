import java.util.*;



public class BFS {

    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }

    //iterative approach 
    public static void bfs(Node root){

        //step1: create a queue--using java defined queue
         Queue<Node> qt=new LinkedList<>();    //using Node because we want to access the children of root
         if(root!=null)  qt.add(root);
         while(qt.size()>0){
            Node temp=qt.peek();
            if(temp.left!=null)  qt.add(temp.left);
            if(temp.right!=null)   qt.add(temp.right);
            System.out.print(qt.remove().val+" ");
           
        }
       
    }

    public static void main(String[] args) {
         Node root= new Node(2);
         Node a=new Node(4);
         Node b= new Node(10);
         root.left=a;
         root.right=b;
         Node c=new Node(6);
         Node d= new Node(5);
         Node f= new Node(8);
         Node e=new Node(11);
         a.left=c;
         a.right=d;
         b.right=e;    
         b.left=f;
         bfs(root);
    }
    
}
