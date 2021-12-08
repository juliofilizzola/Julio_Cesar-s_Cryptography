package Cryptography.julio;

public class Cryptography {
  public String Cryptography(String text) throws IllegalAccessException {
    if (text.equals("")) throw new IllegalAccessException("Error");
    String formatText = text.toLowerCase();
    char[] latters = formatText.toCharArray();

    String encryptedText = "";
  }
}
