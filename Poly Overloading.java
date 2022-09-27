package in.edu.Shopping;

public class Poly {
 void add(int x, int y)
 {
	 System.out.println("Add is parent"+   (x+y));
	 
 }
 public class add extends Poly
 {
 void add(int x,int y,int z)
 {
	 System.out.println("Add is child"+  (x+y));
	 
 }
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly object = new Poly();
		object.add(6, 6);
		object.add(6, 6);
 }
 
	 void add(int x,int y,int z,int a)
	 {
		 System.out.println("Add is child "  +(x+y+z));
	 }
 
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Poly object = new Poly();
	object.add(6, 6);
	object.add(6, 6);
}
}
	


