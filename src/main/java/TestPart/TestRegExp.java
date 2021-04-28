package TestPart;

public class TestRegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ; // = "-27.1234567899999";
		s = "-3*9/11.0-8.0*3";	
		System.out.println (s.length() );
		System.out.println (s.split("(\\-\\B|\\+|\\-|\\/|\\*)").length ) ; 
		for (int i=0; i<s.split("(\\-\\B|\\+|\\/|\\-|\\*)").length ;i++) {
			System.out.println (s.split("(\\-\\B|\\+|\\/|\\-|\\*)")[i]);
		}
		
		System.out.println (s.substring(1) ); 
	}

}
