package unsw.calculator.model.tree;

import unsw.calculator.model.Visitor;

/*
 * Tree node that contains two children
 */
public abstract class BinaryOperatorNode implements TreeNode {

    private TreeNode left, right;

    public BinaryOperatorNode() {
        this.left = null;
        this.right = null;
    }

    public BinaryOperatorNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void acceptLeft(Visitor visitor) {
        this.left.accept(visitor);
    }

    public void acceptRight(Visitor visitor) {
        this.right.accept(visitor);
    }

    public void accept(Visitor visitor) {
        visitor.visitBinaryOperatorNode(this);
    }


    /**
     * Apply this operator (+,-,*,/ etc.) to the given operands
     */
    public abstract int compute(int a, int b);

    /**
     * Returns a textual representation of the node.
     */
    public abstract String getLabel();

}
