import java.util.LinkedList;
import java.util.Queue;

public class RevisionOfBinaryTree{

static class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
    }
}

static class BinaryTree{
  Node root;

  //constructor
  BinaryTree(){
    root=null;
  }
  
  //Insertion-- BFS 

  public void insertion(int val){
      Node newNode= new Node(val);
      
      if(root==null){
        root= newNode;
        return;
      }

      Queue<Node> qt= new LinkedList<>();
      qt.add(root);
      while(!qt.isEmpty()){
           Node temp= qt.poll();
         if(temp.left == null){
          temp.left=newNode;
          return;
        }else 
          qt.add(temp.left);

        if(temp.right==null){
          temp.right=newNode;
          return;
        }else 
            qt.add(temp.right);

      }

     
  }


  //preorder Traversal 
    public void Display(Node root){ //[root->left->right]
    if(root==null){
      return;
    }
    System.out.print(root.val+"->");
    Display(root.left);
    Display(root.right); 

  }

  //Inorder Traversal 
  public void inorderDisplay(Node root){ //[left->root->right]
    if(root==null){
      return;
    }

    inorderDisplay(root.left);
    System.out.print(root.val+"->");
    inorderDisplay(root.right);
  }


  //postOrder Traversal

  public void postorderDisplay(Node root){   //[left->right->root]
    if(root==null){
      return;
    }

    postorderDisplay(root.left);
    postorderDisplay(root.right);
    System.out.print(root.val+"->");
  }

  //level order Traversal --  BFS Traversal

  


}




public static void main(String[] args) {
  BinaryTree bt= new BinaryTree();
    bt.insertion(1);
    bt.insertion(4);
    bt.insertion(5);
    bt.insertion(6);

    bt.postorderDisplay(bt.root);
}


}

