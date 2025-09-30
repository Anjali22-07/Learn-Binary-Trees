import org.w3c.dom.Node;

public class FindingMinAndProduct {
    
     public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
     }

     public static void Display(Node root){
        if(root==null)  return;
        System.out.print(root.val+"-->");
        if(root.left!=null)        System.out.print(root.left.val+",");
        else System.out.print("n,");
        if(root.right!=null)    System.out.print(root.right.val);
        else System.out.print("n");
        System.out.println();
        Display(root.left);
        Display(root.right);
        
     }

     //finding the min value node in Binary tree

     public static int minNode(Node root){

        if(root==null)  return Integer.MAX_VALUE;

        return Math.min(root.val,Math.min(minNode(root.left), minNode(root.right)));

     }

     //finding the product of the nodes

     public static int product(Node root){
        if(root==null)  return 1;

        return root.val*product(root.left)*product(root.right);
     }

    public static void main(String[] args) {
        
        Node root= new Node(2);
         Node a=new Node(4);
         Node b= new Node(6);
         root.left=a;
         root.right=b;
         Node c=new Node(16);
         Node d= new Node(5);
         Node e=new Node(11);
         a.left=c;
         a.right=d;
         b.right=e;    
         Display(root);
         System.out.println("The minimum value in the binary tree is:"+minNode(root));
         System.out.println("The product of the nodes of binary tree is:"+product(root));
    }
}
