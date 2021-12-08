package Cryptography.julio;

public class Cryptography {


  public static String Encrypting(String text) throws IllegalAccessException {
    if (text.equals("")) throw new IllegalAccessException("Error");
    String formatText = text.toLowerCase();
    char[] letters = formatText.toCharArray();

    String encryptedText = "";

    for (char letter :  letters) {
      if (letter != ' ' && !Character.isDigit(letter)) {
        int characterASCII = letter + 3;
        encryptedText += (char)characterASCII;
      } else {
        encryptedText += letter;
      }
    }
    return encryptedText;
  }

  public static String Decrypt(String text) throws IllegalAccessException {
    if (text.equals("")) throw new IllegalAccessException("Error");
    String formatText = text.toLowerCase();
    char[] letters = formatText.toCharArray();

   String decryptText = "";

    for (char letter :  letters) {
      if (letter != ' ' && !Character.isDigit(letter)) {
        int characterASCII = letter - 3;
        decryptText += (char)characterASCII;
      } else {
        decryptText += letter;
      }

    }
    return decryptText;
  }
}
