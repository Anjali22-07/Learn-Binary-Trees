public class BasicsOfBinaryTree{

    int count=0;   //  counter variable to calculate the number of elements in the tree 

   public static class Node{
    int val;
    Node left;   //stores the leftnode value initially left node--> null
    Node right;   //stores the right node value initially right node--> null

    Node(int val){
        this.val=val;
    }
   }

   public static void display(Node root){

          //base case

           if(root==null)  return;
        System.out.print(root.val+"-->");
        if(root.left!=null) System.out.print(root.left.val+",");
            else System.out.print("n,");
        if(root.right!=null)  System.out.print(root.right.val);
        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);

   }

   //to find the size of the Binary Trees

   
    public static void main(String[] args){
    
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
         display(root);
   }
}


//Binary Trees are trees which have atmost twi nodes. i.e it can have only 0/1/2 nodes