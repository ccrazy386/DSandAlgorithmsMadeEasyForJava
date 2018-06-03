package chapter6.Trees;

import chapter4.Stack.LLStack;

public class BinaryTreeNode {

    public Integer data;
    public BinaryTreeNode left, right;

    public BinaryTreeNode(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    void PreOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            PreOrder(root.getLeft());
            PreOrder(root.getRight());
        }
    }

    void PreOrderNonRecursive(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        LLStack S = new LLStack();

        while(true) {
            while(root != null) {
                System.out.println(root.getData());
                S.push(root);
                root = root.getLeft();
            }
            if (S.isEmpty()) {
                break;
            }
            root = (BinaryTreeNode) S.pop();
            root = root.getRight();
        }
        return;
    }
}
