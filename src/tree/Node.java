package tree;

public class Node {
	public String name;
	public int EmpNo;
	
	public Node leftChild;
	public Node rightChild;
	
	public void displayNode()
	{
		System.out.println("EmpNo  " +EmpNo+ "Name : " + name);
	
	}
		
}
