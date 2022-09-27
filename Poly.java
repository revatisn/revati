package in.edu.Shopping;

public class Poly {
 void add(int x, int y)
 {
	 System.out.println("Add is parent"+   (x+y));
	 
 }
 void addition(int x,int y)
 {
	 System.out.println("Addition is child"+  (x+y));
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly object = new Poly();
		object.add(6, 6);
		object.addition(6, 6);
				

	}

}
