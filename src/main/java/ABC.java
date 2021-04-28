
public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String();
		s = null;
		System.out.println(s instanceof String);

		A a = new A();
		B b = new B();
		A ab = new B();

		System.out.println("a : " + a.name + " " + a.getName());
		System.out.println("b : " + b.name + " " + b.getName());
		System.out.println("ab: " + ab.name + " " + ab.getName());

	}

}
