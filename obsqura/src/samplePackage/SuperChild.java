package samplePackage;

public class SuperChild extends SuperParent {

	
		// TODO Auto-generated method stub
		
		int num = 222;
		void show () {
			System.out.println(num);
			System.out.println(super.num);
			
		}
		public static void main(String[] args) {
			
			SuperChild obj = new SuperChild();
			obj.show();
	}

}
