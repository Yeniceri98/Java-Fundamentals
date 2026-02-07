package sections.sec68_enrcypt_decrypt;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class AsymmetricEncryption {
    public static void main(String[] args) throws Exception {
        // Anahtar çifti oluşturma
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Şifreleme
        Cipher encryptCipher = Cipher.getInstance("RSA");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        String plaintext = "Hello, World!";
        byte[] encryptedBytes = encryptCipher.doFinal(plaintext.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Encrypted: " + encryptedText);

        // Deşifreleme
        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes);
        System.out.println("Decrypted: " + decryptedText);
    }
}

/*
    - Asimetrik şifreleme, bir çift anahtar kullanır: Bir public key ve bir private key
    - Public key şifreleme için kullanılırken, private key deşifreleme için kullanılır
    - Bu yöntem, güvenli anahtar dağıtımı sorununu çözer, ancak simetrik şifrelemeye göre daha yavaştır
    - Genellikle daha yavaştır
    - Anahtar dağıtımı daha güvenlidir

    Örnek Algoritmalar:
    - RSA (Rivest-Shamir-Adleman)
    - ECC (Elliptic Curve Cryptography)
*/