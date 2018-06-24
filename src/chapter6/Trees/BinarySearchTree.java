package chapter6.Trees;

public class BinarySearchTree {

    BinarySearchTreeNode find(BinarySearchTreeNode root, Integer data) {
        if (root == null) {
            return null;
        }

        if (data < root.getData()) {
            return find(root.getLeft(), data);
        } else if (data > root.getData()) {
            return find(root.getRight(), data);
        }

        return root;
    }

    BinarySearchTreeNode findNonRecursive(BinarySearchTreeNode root, Integer data) {
        if (root == null) {
            return null;
        }

        while(root != null) {
            if (data == root.getData()) {
                return root;
            } else if (data > root.getData()) {
                root = root.getRight();
            } else {
                root = root.getLeft();
            }
        }

        return null;
    }

    BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        } else {
            if (root.getLeft() == null) {
                return root;
            } else {
                return findMin(root.getLeft());
            }
        }
    }

    BinarySearchTreeNode findMinNonRecursive(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }

        while(root.getLeft() != null) {
            root = root.getLeft();
        }

        return root;
    }

    BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        } else {
            if (root.getRight() == null) {
                return root;
            } else {
                return findMax(root.getRight());
            }
        }
    }

    BinarySearchTreeNode findMaxNonRecursive(BinarySearchTreeNode root) {
        if (root == null) {
            return null;
        }

        while (root.getRight() != null) {
            root = root.getRight();
        }
        return root;
    }

    BinarySearchTreeNode insert(BinarySearchTreeNode root, Integer data) {
        if (root == null) {
            root = new BinarySearchTreeNode();
            if (root == null) {
                System.out.println("Memory Error");
            } else {
                root.setData(data);
                root.setLeft(null);
                root.setRight(null);
            }
        } else {
            if (data < root.getData()) {
                root.setLeft(insert(root.getLeft(), data));
            } else if (data > root.getData()) {
                root.setRight(insert(root.getRight(), data));
            }
        }

        return root;
    }
}
