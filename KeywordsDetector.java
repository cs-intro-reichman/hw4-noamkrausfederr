public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (contains(sentences[i], keywords[j]) == true) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
        }
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
        String str3 = lowerCase(str1);
        String str4 = lowerCase(str2);
		boolean con = false;
        if (str3.length() < str4.length()) {
            return false;
        }
        // I created a substring of str1, that is the length of str2, and checked each time if the substring
        // equals str2 using a function strequals that i created to check if the 2 strings are equal
		for (int i = 0; i <= str3.length()-str4.length(); i++) {
			if (strEquals(str3.substring(i, (i + (str4.length()))), str4) == true) {
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
}
