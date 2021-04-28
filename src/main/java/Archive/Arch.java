package Archive;

public class Arch {
	public static String ArchString(String s) {
		String archivedString = "";
		char StringArray[] = s.toCharArray();
		for (int i = 0; i < StringArray.length; i++) {
			int simbolCounter = 0;
			if (!String.valueOf(StringArray[i]).matches("\\d+")) {

				for (int j = i; (j < StringArray.length); j++) {
					if (StringArray[j] != StringArray[i])
						break;
					simbolCounter++;
					if (simbolCounter > 8)
						break;
				}
				archivedString += "" + ((simbolCounter > 1) ? simbolCounter : "") + StringArray[i];
				i += ((simbolCounter > 1) ? simbolCounter - 1 : 0);
				;
				simbolCounter = 0;
			} else {
				archivedString += "1" + StringArray[i];
			}

		}
		return archivedString;
	}

	public static String DeArchString(String s) {
		String resultString = "";
		int currentCounter = 1;
		String currentSimbol, nextSimbol;
		while (s.length() >= 2) {
			currentSimbol = s.substring(0, 1);
			nextSimbol = s.substring(1, 2);
			if (currentSimbol.matches("\\d+") && !nextSimbol.matches("\\d+")) {
				currentCounter = Integer.decode(currentSimbol);
				for (int i = 1; i <= currentCounter; i++) {
					resultString += nextSimbol;
				}
				s = s.substring(2);
			} else

			if (currentSimbol.matches("\\d+") && nextSimbol.matches("\\d+")) {
				resultString += nextSimbol;
				s = s.substring(2);

			} else {
				resultString += currentSimbol;
				s = s.substring(1);
			}

		}
		return resultString + s;
	}

	/*public static boolean CheckDeArchString(String s) {
		int i = 0;	
		
		while (s.length() >= 2) {
			String currentSimbol = s.substring(0, 1);
			String nextSimbol = s.substring(1, 2);
			if (s.substring(i, i + 1).matches("\\d+") && s.substring(i + 1, i + 2).matches("\\d+")) {
				s.substring(i, i + 1).equals(  s.substring(i + 1, i + 2))
			}
		}
		return true;
	}*/
	

}
