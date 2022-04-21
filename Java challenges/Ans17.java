//a java program to print all the leaf nodes of the binary tree
public class Ans17 {
    static class Node{
        public char data;
        public Node left,right;
    }
    static void printLeafNodes(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            System.out.print(root.data+" ");
        }
        if(root.left!=null){
            printLeafNodes((root.left));
        }
        if(root.right!=null){
            printLeafNodes((root.right));
        }
    }
    static Node createnewnode(char data){
        Node temp=new Node();
        temp.data=data;
        temp.left=null;
        temp.right=null;
        return temp;
    }
    public static void main(String args[]){
        Node root=createnewnode('A');
        root.left=createnewnode('B');
        root.left.left=createnewnode('C');
        root.left.left.left=createnewnode('D');
        root.left.right=createnewnode('E');
        root.right=createnewnode('F');
        root.right.left=createnewnode('G');
        root.right.right=createnewnode('H');
        root.right.right.right=createnewnode('K');
        printLeafNodes(root);
    }
}
