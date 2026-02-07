package sections.sec68_enrcypt_decrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class SymmetricEncryption {
    public static void main(String[] args) throws Exception {
        // Anahtar oluşturma
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // 128 bit anahtar
        SecretKey secretKey = keyGen.generateKey();

        // Şifreleme
        Cipher encryptCipher = Cipher.getInstance("AES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String plaintext = "Hello, World!";
        byte[] encryptedBytes = encryptCipher.doFinal(plaintext.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Encrypted: " + encryptedText);

        // Deşifreleme
        Cipher decryptCipher = Cipher.getInstance("AES");
        decryptCipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes);
        System.out.println("Decrypted: " + decryptedText);
    }
}

/*
    - Simetrik şifreleme, aynı anahtarın hem şifreleme hem de deşifreleme işlemlerinde kullanıldığı bir şifreleme türüdür
    - Bu yöntem hızlı ve etkilidir, ancak anahtarın güvenli bir şekilde paylaşılması ve saklanması önemli bir zorluk oluşturur
    - Aynı anahtar kullanılır
    - Genellikle daha hızlıdır
    - Anahtar paylaşımı ve yönetimi zorludur

    Örnek Algoritmalar:
    - AES (Advanced Encryption Standard)
    - DES (Data Encryption Standard)
    - 3DES (Triple DES)
*/
