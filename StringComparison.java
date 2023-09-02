public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("str1 comes before str2");
        } else if (result > 0) {
            System.out.println("str2 comes before str1");
        } else {
            System.out.println("str1 and str2 are equal");
        }
    }
}




public class StringEndsWith {
    public static void main(String[] args) {
        String mainString = "The quick brown fox jumps over the lazy dog.";
        String endsWithString = "lazy dog.";
        
        boolean endsWith = mainString.endsWith(endsWithString);
        
        System.out.println("The main string ends with the given string: " + endsWith);
    }
}




import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        
        System.out.println("Current date and time: " + formattedDateTime);
    }
}






public class AlphabetIndex {
    public static void main(String[] args) {
        String alphabet = "The quick brown fox jumps over the lazy dog.";
        alphabet = alphabet.toLowerCase();
        
        for (char c = 'a'; c <= 'z'; c++) {
            int index = alphabet.indexOf(c);
            if (index != -1) {
                System.out.println("Character '" + c + "' found at index " + index);
            }
        }
    }
}






public class StringReplacement {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog.";
        String regexPattern = "fox";
        String replacement = "cat";
        
        String replacedString = inputString.replaceAll(regexPattern, replacement);
        
        System.out.println("Replaced string: " + replacedString);
    }
}







public class SubstringExtraction {
    public static void main(String[] args) {
        String originalString = "The quick brown fox jumps over the lazy dog.";
        int startPos = 10;
        int endPos = 24;
        
        String substring = originalString.substring(startPos, endPos);
        
        System.out.println("Substring between positions " + startPos + " and " + endPos + ": " + substring);
    }
}





public class StringTrimming {
    public static void main(String[] args) {
        String stringWithWhitespace = "    This is a string with whitespace.    ";
        
        String trimmedString = stringWithWhitespace.trim();
        
        System.out.println("Trimmed string: " + trimmedString);
    }
}







public class StringToLowercase {
    public static void main(String[] args) {
        String uppercaseString = "THIS IS AN UPPERCASE STRING";
        
        String lowercaseString = uppercaseString.toLowerCase();
        
        System.out.println("Lowercase string: " + lowercaseString);
    }
}







public class StringLength {
    public static void main(String[] args) {
        String lengthString = "This is a string.";
        
        int length = lengthString.length();
        
        System.out.println("Length of the string: " + length);
    }
}





public class StringDataComparison {
    public static void main(String[] args) {
        String string1 = "The quick brown fox jumps over the lazy dog.";
        String string2 = "The quick brown fox jumps over the lazy dog.";
        
        boolean sameData = string1.equals(string2);
        
        System.out.println("The two strings contain the same data: " + sameData);
    }
}



