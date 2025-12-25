package tree;

public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root;

    public boolean search(E element) {
        TreeNode<E> current = root;

        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            }
            else if (element.compareTo(current.element) > 0) {
                current = current.right;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
