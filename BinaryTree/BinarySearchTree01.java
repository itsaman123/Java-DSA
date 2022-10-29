package BinaryTree;

public class BinarySearchTree01 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public  static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val)
            root.left=insert(root.left,val);
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key>root.data){
            return search(root.right,key);
        }
        else{
            return search(root.left,key);
        }
    }

    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
//             case 1: leaf Node
            if(root.left==null && root.right==null){
                return null;
            }
//            case 2:  one child
            if(root.left==null)
                return root.right;
            else if(root.right==null){
                return root.left;
            }
//            case3: two children
            Node IS=inOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
//    print in range gfg
    public static void printInRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            printInRange(root.left,X,Y);
            System.out.println(root.data+" ");
            printInRange(root.right,X,Y);
        }
        else if(root.data>=Y){
            printInRange(root.left,X,Y);
//            System.out.println(root.data);
        }
        else{
            printInRange(root.right,X,Y);
//            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);

        }
        inOrder(root);
        System.out.println();
        if(search(root,11)){
            System.out.println("found");
        }
        else{
            System.out.println("Not fount");
        }
        delete(root,4);
        inOrder(root);
        printInRange(root,3,12);

    }

}
