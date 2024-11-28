public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newstr = "";
		for (int i = 0; i <= str.length()-1; i++) {
			char c = str.charAt(i);
			if ((c >= 65) && (c <= 90)) {
				c += 32;
			} 
			newstr += c;
		}
		return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
		boolean con = false;
        if (str1.length() < str2.length()) {
            return false;
        }
        // I created a substring of str1, that is the length of str2, and checked each time if the substring
        // equals str2 using a function strequals that i created to check if the 2 strings are equal
		for (int i = 0; i <= str1.length()-str2.length(); i++) {
			if (strEquals(str1.substring(i, (i + (str2.length()))), str2) == true) {
				con = true;
			}
		}
		return con;
	}

    // This function checks if 2 strings are equal by comparing the values in their indexes
	public static boolean strEquals(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
    }

    public static int countChar (String str, char c) {
        int count = 0;
		if (c == ' ') {
			return 0;
		}
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
