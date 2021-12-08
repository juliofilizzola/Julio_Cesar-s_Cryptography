import Cryptography.julio.Cryptography;

public class Principal {
  public static void main(String[] args) throws IllegalAccessException {
    String Response = Cryptography.Encrypting("A vida é muito curta para tudo");
    System.out.println(Response);
    String ResponseCrypt = Cryptography.Decrypt(Response);
    System.out.println(ResponseCrypt);
  }
}
