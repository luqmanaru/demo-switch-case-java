package com.mycompany.strukturkontrolpemilihan;

/**
 * Demonstrasi Switch Statement
 * @author luqmanaru
 */
public class StrukturKontrolPemilihan {
    public static void main(String[] args) {
        int grade = 85; // Nilai default
        
        switch(grade) {
            case 90:
                System.out.println("Excellent!");
                break;
            case 80:
                System.out.println("Good job!");
                break;
            default:
                System.out.println("Sorry, you failed.");
        }
    }
}
