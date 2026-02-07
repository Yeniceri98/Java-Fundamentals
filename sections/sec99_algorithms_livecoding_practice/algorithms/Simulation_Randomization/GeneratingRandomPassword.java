package sections.sec99_algorithms_livecoding_practice.algorithms.Simulation_Randomization;

import java.security.SecureRandom;

public class GeneratingRandomPassword {
    private static final int PASSWORD_LENGTH = 12;
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        char[] password = generatePassword(PASSWORD_LENGTH);

        System.out.println("Generated Password: " + new String(password));
    }

    private static char[] generatePassword(int passwordLength) {
        SecureRandom random = new SecureRandom();
        char[] password = new char[passwordLength];

        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(CHAR_SET.length());  // Tüm CHAR_SET değerleri arasından random bir index belirlenmiş olacak
            password[i] = CHAR_SET.charAt(index);
        }

        return password;
    }
}
