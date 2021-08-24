package tree;

public class Tree {
	private Node root;
	
	public Tree() {
		root=null;
	}
	
	public void insert(int Eno , String Name) {
       //create a new node
		Node newnode = new Node();
		//assign eno to new node
		newnode.EmpNo = Eno;
		//assign name to new node
		newnode.name = Name;
		
		if(root == null) {
			root= newnode ;
		}
		else {
			Node current = root;
			Node parent;
			
			while(true)//always condition true
			{
				parent = current;
				if(Eno <current.EmpNo) {
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newnode;
						return;
					}
				}else {
					current = current.rightChild;
					if(current == null)
					{
						parent.rightChild = newnode;
						return;
					}
				}
			}
			
		}
	}
	
	private void inOrder(Node localRoot) {
		if(localRoot != null)
		{
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
			
		}
		
		
	}
	public void TraverseinOrder()
	{
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		if(localRoot != null)
		{
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
			
		}
		else {
			System.out.println("The tree is emplty");
		}
		
	}
		public void TraversepreOrder()
		{
			preOrder(root);
		}
		
		private void postOrder(Node localRoot) {
			if(localRoot != null)
			{
				preOrder(localRoot.leftChild);
				preOrder(localRoot.rightChild);
				localRoot.displayNode();
				
			}
			
		}
			public void TraversepostOrder()
			{
				postOrder(root);
			}
	
	//find recursive

	private Node findRecursive(Node localRoot, int emp) {
		//local.null(value not found)
		if(localRoot == null)
		{
			System.out.println("Value is not in a tree");
		}
		else if(localRoot.EmpNo == emp) {
			System.out.println(localRoot.name);
			return localRoot;
		}
		else if(emp < localRoot.EmpNo ) {
			return findRecursive(localRoot.leftChild , emp);
		}
		else
		{
			return findRecursive(localRoot.rightChild , emp);
			
		}
		return localRoot;
	}
	
	public Node callRecursive(int eno) {
		return findRecursive(root, eno);
	}
	
	public Node find(int eno) 
	{
		Node current = root;
		
		while(current.EmpNo != eno) {
			if(eno < current.EmpNo)
			{
				current = current.leftChild;
			}
			else {
				current = current.rightChild;
			}
			if(current == null) 
			{
				System.out.println("Value is not in the tree");
				return null;
			}
		}//found the value
		
		System.out.println(current.name);
		return current;
		
	}

     public void deleteAll() {
    	 root = null;
     }
}
     
     