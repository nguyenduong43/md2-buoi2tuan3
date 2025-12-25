package tree;

public class TestTree {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.root = new TreeNode<>(60);
        tree.root.left = new TreeNode<>(55);
        tree.root.right = new TreeNode<>(100);
        System.out.println(tree.search(55));   // true
        System.out.println(tree.search(70));   // false
    }
}
