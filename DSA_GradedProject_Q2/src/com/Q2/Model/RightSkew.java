package com.Q2.Model;


public class RightSkew {

    private Node startNode = null;
	private Node prevNode = null;

    private class Node {

		int val;

		Node left;

		Node right;

	}

    private Node createNode(int ele) 
	{

		Node temp = new Node();

	        temp.val = ele;

		return temp;

	}

    private void ascRightSkew(Node root)
	{

		if (root == null) {

			return;

		}

        ascRightSkew(root.left);

		if (startNode == null) {

			startNode = root;

			startNode.left = null;

			prevNode = startNode;

		} else {

			prevNode.right = root;

			prevNode = root;

			prevNode.left = null;

		}

		ascRightSkew(root.right);

	}

    public void showRightTree()
	{
		if (startNode == null) {

			return;

		}
		System.out.print(startNode.val + " ");

		startNode = startNode.right;

		showRightTree();

	}
    public RightSkew()
	{

		Node newNode = createNode(50);

		newNode.left = createNode(30);

		newNode.right = createNode(60);

		newNode.left.left = createNode(10);

		newNode.right.left = createNode(55);

		ascRightSkew(newNode);

	}

}