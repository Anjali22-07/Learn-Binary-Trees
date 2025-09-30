public class printNElements {

    public  static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    public static void NthLevel(Node root, int level){
        if(root==null)  return;
        if(level==1)  System.out.print(root.val+" ");
        NthLevel(root.left, level-1);
        NthLevel(root.right, level-1);
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
         NthLevel(root,3);
    }
}
