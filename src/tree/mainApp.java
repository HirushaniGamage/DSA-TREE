package tree;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree T1 = new Tree();
		T1.insert(140, "Anusha");
		T1.insert(150, "Amaha");
		T1.insert(160, "usha");
		T1.insert(170, "wniusha");
		T1.insert(180, "Ausha");
		T1.insert(190, "Anuilaa");
		T1.insert(145, "Ankoglha");
		T1.insert(143, "An mcha");
		
		//System.out.println("inOrder (left,root,right)");
		//T1.TraverseinOrder();
		
		System.out.println("preOrder (root,left,,right)");
		T1.TraversepreOrder();
		
		//System.out.println("postOrder (left,,right,root,)");
		//T1.TraversepostOrder();
		
		System.out.println("input the value : ");
		Scanner sc = new Scanner(System.in);
		
		int val;
		val = sc.nextInt();
		
		T1.find(val);
		
		T1.deleteAll();
		
		T1.TraversepostOrder();//no output
		
	}

}
