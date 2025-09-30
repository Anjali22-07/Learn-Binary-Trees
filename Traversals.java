public class Traversals {
    
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }

    public static void preOrder(Node root){

        //preOrder is root left right
          if(root==null)  return;
          System.out.print(root.val+" ");
          preOrder(root.left);
          preOrder(root.right);   
    }

    //Inorder Traversal

    public static void inOrder(Node root){

        //InOrder is left root right
        if(root==null)  return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

      //PostOrder

    public static void postOrder(Node root){

        //postoder is left right root
        if(root==null)  return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
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
         preOrder(root);
         System.out.println(" InOrder traversal");
         inOrder(root);
         System.out.println();
         System.out.println("preOrder Traversal");
         postOrder(root);
        
    }
}
