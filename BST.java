//package com.dsa;
//import com.dsa.example_dsa.Node;
public class BST {
	static class Node{
		 int data;
		 Node left;
		 Node right;
		 
		 Node(int data){
			 this.data=data;
		 }
	}
	
// inseart Node in BST*********************
	public static Node insert(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(root.data>key) {
			//left data
			root.left=insert(root.left,key);
		}
		else {
			//right data
			root.right=insert(root.right,key);
		}
		return root;
		
	}
	public static void inorder(Node root) {
		
		if(root==null) {
			return;
		}
		inorder(root.left);  // in the inorder  first left,root,right put the value
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	//search element in BST*************
	
	public static boolean search(Node root,int key) {
		 if(root==null) {
			 return false;
		 }
		
		if(root.data>key) {   //left subtree
			return search(root.left,key);
		}else if(root.data==key) {
			return true;
		}else{   //right subtree
			return search(root.right,key);
		}
	}
	
	// delete node in BST ********************
	public static Node delete(Node root,int val) {
		if(root.data>val) {
			root.left=delete(root.left,val);
		}
		else if(root.data<val) {
			root.right=delete(root.right,val);
		}
		else {  //root.data==val
			//case 1
			if((root.left==null && root.right==null)) {
				return null;
			}
			//case 2
			if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
			
			//case 3
			Node is=inordersuccer(root.right);
			root.data=is.data;
			root.right= delete(root.right,is.data);
			
		}
		return root;
	}
	
	public static Node inordersuccer(Node root) {
		while(root.left !=null) {
			root=root.left;
			
		}
		return root;
		
	}
	
	
//	print in range*************
	public static void print(Node root,int x,int y) {
		
		if(root==null) {
			return;
		}
		if(root.data>=x && root.data<=y) {
			
			print(root.left,x,y);
			System.out.print(root.data +" ");
			print(root.right,x,y);
		}
		else if(root.data>=y) {
			print(root.left,x,y);
		}
		else {
			print(root.right,x,y);
		}
	}
	
	
	

	public static void main(String[] args) {
		int value[]= {5,1,3,4,2,7};
		Node root=null;
		for(int i=0;i<value.length;i++) {
			root=insert(root,value[i]);
		}
		 inorder(root);
		 System.out.println();
		  
		
		if (search(root,1)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		 delete(root,4);
		 inorder(root);
		 
		 print(root,6,10);
	

	}

}
