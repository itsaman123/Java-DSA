package BinaryTree;

public class BinarySearchTree {
    private TreeNode1 root;
    public class TreeNode1{
        private int data;
        private TreeNode1 left;
        private TreeNode1 right;
        public TreeNode1(int data){
            this.data=data;
        }
    }
    public void insert(int val){
        root=insert(root,val);
    }
    public TreeNode1 insert(TreeNode1 root,int val){
        if(root==null){
            root=new TreeNode1(val);
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode1 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public TreeNode1 search(int key){
        return search(root,key);
    }
    public TreeNode1 search(TreeNode1 root ,int key){
        if(root==null||  root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    int heightOfTree(TreeNode1 root){
        if(root==null){
            return 0;
        }
        int lHeight=heightOfTree(root.left);
        int rHeight=heightOfTree(root.right);
        if(lHeight>rHeight){
            return lHeight+1;
        }
        else{
            return rHeight+1;
        }
    }
    public static void main(String[] args) {
        BinarySearchTree ob=new BinarySearchTree();

        ob.insert(5);
        ob.insert(3);
        ob.insert(7);
        ob.insert(1);
        ob.inOrder();
        int key=74;
        System.out.println();
        if(null!=ob.search(key)){
            System.out.println("key found!!!");
        }
        else{
            System.out.println("Please enter the valid key!!!");
        }

        System.out.println("the Height is: " +ob.heightOfTree(ob.root));

    }
}
