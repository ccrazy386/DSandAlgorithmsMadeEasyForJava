package chapter6.Trees;

public class BSTtest {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        BinarySearchTreeNode root = bst.insert(null, 10);

        bst.insert(root, 6);
        bst.insert(root, 16);
        bst.insert(root, 4);
        bst.insert(root, 9);
        bst.insert(root, 7);
        bst.insert(root, 13);

        System.out.println(bst.findMax(root).getData());
        System.out.println(bst.findMaxNonRecursive(root).getData());
        System.out.println(bst.findMin(root).getData());
        System.out.println(bst.findMinNonRecursive(root).getData());
        System.out.println(bst.find(root, 10).getData());
    }
}
