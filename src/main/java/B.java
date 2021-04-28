public class B extends A {
	String name = "Class B"; 
	// Никогда так не делайте (не переопределяйте поля)!!!
	String getName() {return name;}
}