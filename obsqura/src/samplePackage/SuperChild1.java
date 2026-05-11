package samplePackage;

public class SuperChild1 extends SuperParent1 {

	void display() {
		System.out.println("Child Method");
	}

	void show() {
		display();
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChild1 obj = new SuperChild1();
		obj.show();

	}

}
