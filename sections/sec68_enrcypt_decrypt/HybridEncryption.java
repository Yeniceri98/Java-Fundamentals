package sections.sec68_enrcypt_decrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class HybridEncryption {
    public static void main(String[] args) throws Exception {
        // Simetrik anahtar oluşturma (AES)
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();

        // Simetrik anahtarı şifreleme (RSA)
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // AES anahtarını RSA ile şifreleme
        Cipher rsaCipher = Cipher.getInstance("RSA");
        rsaCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedSecretKey = rsaCipher.doFinal(secretKey.getEncoded());
        String encryptedSecretKeyStr = Base64.getEncoder().encodeToString(encryptedSecretKey);
        System.out.println("Encrypted Secret Key: " + encryptedSecretKeyStr);

        // Veri şifreleme (AES)
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String plaintext = "Hello, World!";
        byte[] encryptedData = aesCipher.doFinal(plaintext.getBytes());
        String encryptedDataStr = Base64.getEncoder().encodeToString(encryptedData);
        System.out.println("Encrypted Data: " + encryptedDataStr);

        // AES anahtarını RSA ile deşifreleme
        rsaCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedSecretKey = rsaCipher.doFinal(Base64.getDecoder().decode(encryptedSecretKeyStr));
        SecretKey originalSecretKey = new SecretKeySpec(decryptedSecretKey, "AES");

        // Veriyi AES ile deşifreleme
        aesCipher.init(Cipher.DECRYPT_MODE, originalSecretKey);
        byte[] decryptedData = aesCipher.doFinal(Base64.getDecoder().decode(encryptedDataStr));
        String decryptedText = new String(decryptedData);
        System.out.println("Decrypted Data: " + decryptedText);
    }

}

/*
    Gerçek dünya uygulamaları genellikle hibrit şifreleme yöntemlerini kullanır
    Çünkü bu yöntemler simetrik ve asimetrik şifrelemenin avantajlarını birleştirir

    1) HTTPS (HyperText Transfer Protocol Secure):
    Amaç: Web siteleri ve kullanıcılar arasındaki iletişimi güvence altına almak.
    Kullanım: Tarayıcı ve sunucu arasında güvenli bağlantılar.
    Örnek: HTTPS, oturum anahtarını (simetrik anahtar) paylaşmak için asimetrik şifreleme (RSA) kullanır, ardından veri aktarımını şifrelemek için simetrik şifreleme (AES) kullanır

    2) Dosya Şifreleme ve Paylaşımı:
    Amaç: Dosyaların güvenli bir şekilde şifrelenmesi ve paylaşılması
    Kullanım: Dosya paylaşım servisleri, bulut depolama
    Örnek: Bir dosya simetrik şifreleme ile şifrelenir, anahtar ise dosyayı paylaşmak için asimetrik şifreleme kullanılarak gönderilir
*/
