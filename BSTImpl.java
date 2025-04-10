import java.io.*;

public class BSTImpl{
	public static void main(String [] args){
		System.out.print("Enter values : ");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String [] values = br.readLine().split(" ");
			int [] arr = new int[values.length];
			BST bst = new BST();
			for(int i=0;i<values.length;i++){
				arr[i] = Integer.parseInt(values[i]);
				bst.insertValue(arr[i]);
			}
			
			System.out.print("\nEnter the value to be found : ");
			
			int target = Integer.parseInt(br.readLine());
			
			bst.preOrderTravesalSearch(bst.root,target);
			bst.inOrderTravesalSearch(bst.root,target);
			bst.postOrderTravesalSearch(bst.root,target);
			
			bst.preOrderTravesal(bst.root);
			bst.inOrderTravesal(bst.root);
			bst.postOrderTravesal(bst.root);
			bst.maxValue(bst.root);
			bst.minValue(bst.root);
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		
		
	}
	
}

class BST{

	Node root;
	
	class Node{
		
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public void insertValue(int value){
		Node node = new Node(value);
		if(root==null){
			root = node;
		}else{
			Node cur = root;
			while(cur!=null){
				if(cur.value>value){
					if(cur.left==null){
						cur.left = node;
						
						break;
					}else{
						cur = cur.left;
					}
				}else{
					if(cur.right==null){
						cur.right = node;
						break;
					}else{
						cur = cur.right;
					}
				}
			}
			System.out.println(value+" inserted ...");
		}
	}
	
	
	public static void preOrderTravesalSearch(Node curr,int target){
		if(curr==null){
			System.out.println("Value not found");
			return;
		}
		if(curr.value==target){
			System.out.println("Value found in preorder travesal "+target);
			return;
		}else{
			preOrderTravesalSearch(curr.left,target);
			preOrderTravesalSearch(curr.right,target);
		}
		
	}
	
	public static void inOrderTravesalSearch(Node curr,int target){
		if(curr==null){
			System.out.println("Value not found");
			return;
		}
		inOrderTravesalSearch(curr.left,target);
		if(curr.value==target){
			System.out.println("Value found in inorder travesal "+target);
			return;
		}else{

			inOrderTravesalSearch(curr.right,target);
		}
		
	}
	
	public static void postOrderTravesalSearch(Node curr,int target){
		if(curr==null){
			System.out.println("Value not found");
			return;
		}
		postOrderTravesalSearch(curr.left,target);
			postOrderTravesalSearch(curr.right,target);
		if(curr.value==target){
			System.out.println("Value found in postorder travesal "+target);
			return;
		}
			
		
		
	}
	
	public static void preOrderTravesal(Node node){
		
		if(node==null){
			return;
		}
		System.out.println("PreOrder Travesal "+node.value);
		preOrderTravesal(node.left);
		preOrderTravesal(node.right);
	}
	
	public static void inOrderTravesal(Node node){
		
		if(node==null){
			return;
		}
		preOrderTravesal(node.left);
		System.out.println("PreOrder Travesal "+node.value);
		preOrderTravesal(node.right);
	}
	
	public static void postOrderTravesal(Node node){
		
		if(node==null){
			return;
		}
		preOrderTravesal(node.left);
		preOrderTravesal(node.right);
		System.out.println("PreOrder Travesal "+node.value);
	}
	
	public static void maxValue(Node node){
		
		if(node==null){
			return;
		}
		if(node.right!=null){
			maxValue(node.right);
		}else{
			System.out.println("Max value is "+node.value);
			return;
		}
	}
	
	public static void minValue(Node node){
	
		if(node==null){
			return;
		}else{
			if(node.left!=null){
				minValue(node.left);
			}else{
				System.out.println("Min value is "+node.value);
				return;
			}
		}
	}
}
