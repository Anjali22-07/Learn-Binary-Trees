

public class SizeSumHeightMax {

    //this class has the methods to calculate the size of the tree, sum of all the elements of the nodes
    //height of the tree and he max nodes value

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
     if(root.right!=null)   System.out.print(root.right.val);
     else System.out.print("n");
     System.out.println();
     Display(root.left);
     Display(root.right);
    }

    //to determine teh size of the binary tree
    public static int size(Node root){
        if(root==null)  return 0;

        return 1+size(root.left)+size(root.right);
     
    }

    //to determine the sum of all nodes 

    public static int sum(Node root){
        if(root==null)  return 0;

        return root.val+sum(root.left)+sum(root.right);
    }

    //to determine the maxNode of the binary tree

    public static int maxNode(Node root){
        if(root==null)  return Integer.MIN_VALUE;
         
        return Math.max(root.val, Math.max(maxNode(root.left),maxNode(root.right)));
    }

    //to determine the height of the binary tree

    public static int height(Node root){
        if(root==null)   return 0;

        if(root.left==null && root.right==null)  return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        Node root= new Node(2);
         Node a=new Node(4);
         Node b= new Node(10);
         root.left=a;
         root.right=b;
         Node c=new Node(6);
         Node d= new Node(5);
         Node e=new Node(11);
         a.left=c;
         a.right=d;
         b.right=e;    
         Display(root);
         System.out.println("The size of the binary tree is:"+size(root));
         System.out.println("The size of the binary tree is:"+sum(root));
         System.out.println("The maximum node in the binary tree:"+maxNode(root));
          System.out.println("The maximum node in the binary tree:"+height(root));
    }
    
}
