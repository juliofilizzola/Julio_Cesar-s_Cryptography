package Cryptography.julio;

public class Cryptography {
  public String Encrypting(String text) throws IllegalAccessException {
    if (text.equals("")) throw new IllegalAccessException("Error");
    String formatText = text.toLowerCase();
    char[] latters = formatText.toCharArray();

    String encryptedText = "";

    for (char latter :  latters) {
      if (latter != ' ' && !Character.isDigit(latter)) {
        int characterASCII = latter + 3;
        encryptedText += (char)characterASCII;
      } else {
        encryptedText += latter;
      }
    }
    return encryptedText;
  }
}
