package com.mycompany.projetfichiertexte.Projetfichiertexte;

import java.io.*;

public class FichierDemo {

    public static void main(String[] args) {
        String fichier = "monfichier.txt";

        try {
            // 1️⃣ Lecture du fichier
            System.out.println("=== 1. Lecture du fichier ===");
            lireFichier(fichier);

            // 2️⃣ Écriture en ajout
            System.out.println("\n=== 2. Écriture en mode AJOUT ===");
            ecrireFichier(fichier, "Ligne ajoutée au fichier.\n", true);
            lireFichier(fichier);

            // 3️⃣ Écriture en écrasement
            System.out.println("\n=== 3. Écriture en mode ÉCRASEMENT ===");
            ecrireFichier(fichier, "Nouveau contenu — ancien effacé.\n", false);
            lireFichier(fichier);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 Lecture du fichier
    public static void lireFichier(String nomFichier) throws IOException {
        File file = new File(nomFichier);

        if (!file.exists()) {
            System.out.println("(Fichier inexistant, création automatique.)");
            file.createNewFile();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String ligne;

        if (file.length() == 0) {
            System.out.println("(Fichier vide)");
        }

        while ((ligne = br.readLine()) != null) {
            System.out.println(ligne);
        }

        br.close();
    }

    // 🔹 Écriture dans un fichier
    public static void ecrireFichier(String nomFichier, String texte, boolean append) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichier, append));
        bw.write(texte);
        bw.close();

        if (append) {
            System.out.println("Texte ajouté au fichier.");
        } else {
            System.out.println("Fichier écrasé et nouveau texte écrit.");
        }
    }
}
