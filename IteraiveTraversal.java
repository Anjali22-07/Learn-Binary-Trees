//this file covers Inorder, preorder, postorder Traversal using stack

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IteraiveTraversal {
    
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

        BinaryTree(){
            root=null;
        }

        public void Insertion(int val){
            Node newNode= new Node(val);

            if(root==null){
                root=newNode;
                return;
            }

            Queue<Node> qt= new LinkedList<>();
            qt.add(root);
            while(!qt.isEmpty()){
                Node temp= qt.poll();
                if(temp.left==null){
                    temp.left=newNode;
                    return;
                }else qt.add(temp.left);
                if(temp.right==null){
                    temp.right=newNode;
                    return;
                }else qt.add(temp.right);
            }

        }

        //Iterative Traversal 

        public void inorderStack(Node root){
            if(root==null){
                return;
            }
            Stack<Node> st= new Stack<>();
            Node curr=root;
            while(curr!=null || !st.isEmpty()){
               
                while(curr!=null){
                    st.push(curr);
                    curr=curr.left;
                }

                curr=st.pop();
                System.out.println(curr.val+"->");
                curr=curr.right;

            }
            
        }

        public void preorder(Node root){
            if(root==null){
                return;
            }
            Stack<Node> st= new Stack<>();
            st.push(root);
            while(!st.isEmpty()){
                Node temp= st.pop();
                System.out.println(temp.val+" ");
                if(temp.right!=null)  st.push(temp.right);
                if(temp.left!=null)  st.push(temp.left);
               
 } 
}
        public void postorder(Node root){

            if(root==null){
                return;
            }
            Stack<Node> st1= new Stack<>();
            Stack<Node> st2= new Stack<>();
            st1.push(root);
            while(!st1.isEmpty()){
                Node temp= st1.peek();
                st2.push(st1.pop());
                if(temp.left!=null) st1.push(temp.left);
                if(temp.right!=null) st1.push(temp.right);
            }

            while(!st2.isEmpty()){
                System.out.println(st2.pop().val);
            }
        }
        


    }
    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
            bt.Insertion(1);
            bt.Insertion(4);
            bt.Insertion(5);
            bt.Insertion(6);

            bt.postorder(bt.root);

    }
}
