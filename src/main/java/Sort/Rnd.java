package Sort;

public class Rnd {
	// Generates random Int value in rang from min to max int value
	public static int rndInt(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

}
