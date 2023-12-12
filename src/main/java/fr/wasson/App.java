package fr.wasson;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void intro() {
        System.out.println("Bonjour ! Le but du jeu est de trouver le nombre.");
        System.out.println("Ce nombre se situe entre 1 et 100. Tu as autant d'essaies que tu veux pour le trouver.");
        System.out.println("Bonne chance !\n");
    }

    public static void Jeu(Random random, boolean gagner, Scanner scanner) {
        int saisie = 0;
        int minVal = 0;
        int maxVal = 100;
        int nombreATrouver = random.nextInt(100) + 1;
        while (!gagner) {
            System.out.print("Saisie un nombre entre 1 et 100 : ");
            // saisie = scanner.nextInt();
            saisie = random.nextInt(maxVal - minVal) + 1;

            if (nombreATrouver == saisie) {
                System.out.println("Bravo, tu as gagné !");
                gagner = true;
            } else if (saisie > 100) {
                System.out.println("Réessaye, tu ne peux pas entrer des nombres supérieurs à 100.");
            } else if (nombreATrouver < saisie) {
                System.out.println("Dommage, réessaye avec un nombre plus petit.");
            } else {
                System.out.println("Dommage, réessaye avec un nombre plus grand.");
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        boolean gagner = false;
        Scanner scanner = new Scanner(System.in);
        intro();
        Jeu(random, gagner, scanner);
        scanner.close();
    }

}
