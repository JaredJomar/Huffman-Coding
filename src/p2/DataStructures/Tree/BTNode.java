package p2.DataStructures.Tree;

import p2.Utils.BinaryTreePrinter.PrintableNode;

/**
 * Binary Tree Node Class
 * 
 * This class represents a binary tree node with key, value, left child, right
 * child, and parent.
 * 
 * @author Juan O. Lopez & Fernando Bermudez
 *
 * @param <K> Generic type for the key of the values to be stored in the nodes
 * @param <V> Generic type for the values to be stored in the nodes
 */
public class BTNode<K extends Comparable<? super K>, V extends Comparable<? super V>>
		implements Comparable<BTNode<K, V>>, PrintableNode {

	private K key;
	private V value;
	private BTNode<K, V> leftChild, rightChild, parent;

	public BTNode(K key, V value, BTNode<K, V> parent) {
		this.key = key;
		this.value = value;
		this.parent = parent;
		this.leftChild = this.rightChild = null;
	}

	public BTNode(K key, V value) {
		this(key, value, null);
	}

	public BTNode() {
		this(null, null, null);
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public BTNode<K, V> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BTNode<K, V> leftChild) {
		this.leftChild = leftChild;
	}

	public BTNode<K, V> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BTNode<K, V> rightChild) {
		this.rightChild = rightChild;
	}

	public BTNode<K, V> getParent() {
		return parent;
	}

	public void setParent(BTNode<K, V> newParent) {
		parent = newParent;
	}

	public void clear() {
		key = null;
		value = null;
		leftChild = rightChild = parent = null;
	}

	/**
	 * The methods below are merely to comply with the PrintableNode interface, used
	 * by the BinaryTreePrinter class to nicely display a binary tree. Could have
	 * renamed the methods, but just didn't feel like it.
	 */

	@Override
	public PrintableNode getLeft() {
		return getLeftChild();
	}

	@Override
	public PrintableNode getRight() {
		return getRightChild();
	}

	@Override
	public String getText() {
		return key.toString() + ":" + value.toString();
	}

	/**
	 * Compare the keys of the two nodes. If they are equal, compare their values.
	 * If the values are also equal, return 0, indicating that the nodes are the
	 * same.
	 * If the value of this node is less than the other's, return -1, indicating
	 * that
	 * this node is less than the other. If the value of this node is greater than
	 * the other's, return 1, indicating that this node is greater than the other.
	 */

	@Override
	public int compareTo(BTNode<K, V> other) {
		// TODO Auto-generated method 
		if (this.key.compareTo(other.getKey()) == 0) {
			if (this.value.compareTo(other.getValue()) == 0) {
				return 0;
			} else if (this.value.compareTo(other.getValue()) < 0) {
				return -1;
			} else {
				return 1;
			}
		}
		// If the keys are not equal, compare them returning -1 or 1 accordingly
		if (this.key.compareTo(other.getKey()) < 0) {
			return -1;
		} else {
			return 1;
		}
	}
}