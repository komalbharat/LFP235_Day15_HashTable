public class UC2_Create_BST {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert( TreeNode root, int value){
        if (root == null || root.data == value){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void inOrder() {
        if (root == null) {
            return;
        }
    }
    public static void main(String[] args) {
        UC2_Create_BST tree = new UC2_Create_BST();
        tree.insert(3);
        tree.insert(11);
        tree.insert(16);
        tree.insert(22);
        tree.insert(50);
        tree.insert(70);
        tree.insert(60);
        tree.insert(63);
        tree.insert(67);

        tree.inOrder(tree.root);

    }
}
