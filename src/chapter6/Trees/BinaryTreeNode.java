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

    void InOrder (BinaryTreeNode root) {
        if(root != null) {
            InOrder(root.getLeft());
            System.out.println(root.getData());
            InOrder(root.getRight());
        }
    }

    void PostOrder(BinaryTreeNode root) {
        if(root != null) {
            PostOrder(root.getLeft());
            PostOrder(root.getRight());
            System.out.println(root.getData());
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        rootNode.setLeft(node2);
        rootNode.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setRight(node7);

        rootNode.PostOrder(rootNode);
    }
}
