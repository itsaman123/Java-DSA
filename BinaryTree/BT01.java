package BinaryTree;
import com.sun.source.tree.Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TREE TRAVERSAL
public class BT01 {
    private TreeNode root;
    class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;//generic type

        public TreeNode(int data) {
            this.data = data;
        }
    }
    public void createBinaryTree() {
        TreeNode first = new TreeNode(5);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(23);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(12);
        TreeNode sixth = new TreeNode(1);
        TreeNode seventh = new TreeNode(14);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
    }
//    PRE-ORDER

//    RECURSIVE METHOD-->>

//    public void preorder1(TreeNode root){
//        if(root==null){
//            return;
//        }
//
//        System.out.print(root.data+" ");
//        preorder1(root.left);
//        preorder1(root.right);
//    }
//
////    ITERATIVE METHOD -->>
//
//    public void preorder2(TreeNode root){
//        if(root==null){
//            return;
//        }
//        Stack<TreeNode> stack=new Stack<>();
//        stack.push(root);
//        while(!stack.isEmpty()){
//            TreeNode temp=stack.pop();
//            System.out.print(temp.data+" ");
//            if(temp.right!=null){
//                stack.push(temp.right);
//            }
//            if(temp.left!=null){
//                stack.push(temp.left);
//            }
//        }
//    }

//    PORT-ORDER
//    RECURSIVE METHOD

//    public void inOrder (TreeNode root){
//        if(root==null){
//            return;
//        }
//        inOrder(root.left);
//        System.out.println(root.data+" ");
//        inOrder(root.right);
//    }

//    Iterative Method
//    public void inOrder(TreeNode root){
//        if(root==null){
//            return;
//        }
//        Stack<TreeNode>stack=new Stack<>();
//        TreeNode temp=root;
//        while(!stack.isEmpty() || temp!=null){
//            if(temp!=null){
//                stack.push(temp);
//                temp=temp.left;
//            }
//            else{
//                temp=stack.pop();
//                System.out.println(temp.data+" ");
//                temp=temp.right;
//            }
//        }
//    }

//    POST-ORDER TRAVERSAL
//    RECURSIVE METHOD

//    public void postOrder(TreeNode root){
//        if(root==null){
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data+" ");
//    }

    //    ITERATIVE METHOD
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current!=null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.println(temp.data+" ");
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.println(temp.data+" ");
                    }
                }else{
                    current=temp;
                }
            }
        }
    }

//    LEVEL ORDER OR BREATH FIRST
      public void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.println(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
      }
//    find maximum value
      public int findMax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findMax(root.left);
        int right=findMax(root.right);
        if(result<left)
            result=left;
        if(result<right)
            result=right;
        return result;
      }

    public static void main(String[] args) {
        BT01 ob = new BT01();
        ob.createBinaryTree();
//        ob.preorder1(ob.root);
//        ob.preorder2(ob.root);
//        ob.inOrder(ob.root);
//        ob.postOrder(ob.root);
        ob.levelOrder(ob.root);
        System.out.println("Maximum value: "+ob.findMax(ob.root));
    }
}