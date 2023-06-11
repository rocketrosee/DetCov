/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.detcov;
import java.util.Scanner;

/**
 *
 * @author Alcatraz Team
 */
public class DetCov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KUESIONER DETEKSI COVID-19 ===");
        System.out.println("Jawablah pertanyaan-pertanyaan berikut ini. \n");

        // Skor awal
        int skor = 0;

        // Pertanyaan 1
        System.out.println("1. Apakah Anda mengalami demam (suhu tubuh di atas 37.5 derajat Celsius) dalam 14 hari terakhir? (ya/tidak)");
        String jawaban1 = scanner.nextLine();
        if (jawaban1.equalsIgnoreCase("ya")){
            skor++;
        }

        // Pertanyaan 2
        System.out.println("2. Apakah Anda mengalami batuk dalam 14 hari terakhir? (ya/tidak)");
        String jawaban2 = scanner.nextLine();
        if (jawaban2.equalsIgnoreCase("ya")) {
            skor++;
        }

        // Pertanyaan 3
        System.out.println("3. Apakah Anda mengalami pilek dalam 14 hari terakhir? (ya/tidak)");
        String jawaban3 = scanner.nextLine();
        if (jawaban3.equalsIgnoreCase("ya")) {
            skor++;
        }

        // Pertanyaan 4
        System.out.println("4. Apakah Anda mengalami sakit tenggorokan dalam 14 hari terakhir? (ya/tidak)");
        String jawaban4 = scanner.nextLine();
        if (jawaban4.equalsIgnoreCase("ya")) {
            skor++;
        }

        // Pertanyaan 5
        System.out.println("5. Apakah Anda mengalami sesak napas dalam 14 hari terakhir? (ya/tidak)");
        String jawaban5 = scanner.nextLine();
        if (jawaban5.equalsIgnoreCase("ya")) {
            skor++;
        }

        // Pertanyaan 6
        System.out.println("6. Apakah Anda mengalami mual/muntah dalam 14 hari terakhir? (ya/tidak)");
        String jawaban6 = scanner.nextLine();
        if (jawaban6.equalsIgnoreCase("ya")) {
            skor++;
        }

        // Pertanyaan 7
        System.out.println("7. Apakah Anda memiliki riwayat kontak dengan pasien COVID-19 dalam 14 hari terakhir? (ya/tidak)");
        String jawaban7 = scanner.nextLine();
        if (jawaban7.equalsIgnoreCase("ya")) {
            skor++;
        }

        // Evaluasi hasil kuesioner
        System.out.println("\n=== HASIL KUESIONER ===");
        System.out.println("Skor Anda: " + skor);

        if (skor >= 4) {
            System.out.println("Anda memiliki kemungkinan terinfeksi COVID-19. Silahkan hubungi nomor ini 085276945631, atau ke fasilitas kesehatan terdekat.");
        } else {
            System.out.println("Anda kemungkinan tidak terinfeksi COVID-19. Tetap jaga kesehatan dan patuhi protokol pencegahan.\nJika ada keluhan tambahan silahkan ke rumah sakit terdekat atau hubungi nomor 085276945631.");
        }

        scanner.close();
    }
}

