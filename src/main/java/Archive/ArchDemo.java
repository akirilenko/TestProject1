package Archive;

public class ArchDemo {

	public static void main(String[] args) {
		String s = "31258786";
		System.out.println(s);
		System.out.println("------------");
		s = Arch.ArchString(s);
		System.out.println(s);

		System.out.println("------------");
		System.out.println(Arch.DeArchString(s));
	}

}
