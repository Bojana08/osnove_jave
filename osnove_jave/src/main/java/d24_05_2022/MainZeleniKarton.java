package d24_05_2022;

import java.util.ArrayList;

public class MainZeleniKarton {
    public static void main(String[] args) {

//U glavnoj klasi:
//●	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//●	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//○	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ZeleniKarton zKJedan = new ZeleniKarton(
                "Petar Petrovic",
                "11113",
                "Matematika",
                "Jovan Nikolic",
                7);
        ispiti.add(zKJedan);
        ZeleniKarton zKDva = new ZeleniKarton(
                "Milos Petrovic",
                "11115",
                "Matematika",
                "Jovan Nikolic",
                8);
        ispiti.add(zKDva);
        ZeleniKarton zKTri = new ZeleniKarton(
                "Ana Mladenovic",
                "11121",
                "Engleski",
                "Ljiljana Petrovic",
                5);
        ispiti.add(zKTri);
        ZeleniKarton zKCetiri = new ZeleniKarton(
                "Ana Kostic",
                "11128",
                "Engleski",
                "Ljiljana Petrovic",
                10);
        ispiti.add(zKCetiri);
        ZeleniKarton zKPet = new ZeleniKarton(
                "Milena Jovanovic",
                "11110",
                "Engleski",
                "Ljiljana Petrovic",
                5);
        ispiti.add(zKPet);
        ZeleniKarton zKSest = new ZeleniKarton(
                "Ana Mladenovic",
                "11121",
                "Engleski",
                "Ljiljana Petrovic",
                9);
        ispiti.add(zKSest);
        ZeleniKarton zKSedam = new ZeleniKarton(
                "Ilija Stankovic",
                "11144",
                "Matematika",
                "Jovan Nikolic",
                6);
        ispiti.add(zKSedam);
        ZeleniKarton zKOsam = new ZeleniKarton(
                "Milos Nikolic",
                "11187",
                "Engleski",
                "Ljiljana Petrovic",
                5);
        ispiti.add(zKOsam);
        ZeleniKarton zKDevet = new ZeleniKarton(
                "Ana Milojkovic",
                "11170",
                "Matematika",
                "Jovan Nikolic",
                10);
        ispiti.add(zKDevet);
        ZeleniKarton zKDeset = new ZeleniKarton(
                "Ana Mladenovic",
                "11165",
                "Engleski",
                "Ljiljana Petrovic",
                5);
        ispiti.add(zKDeset);

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
            System.out.println();
        }

        double avgOcena = 0;
        int zbirOcena = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            zbirOcena = zbirOcena + ispiti.get(i).getOcena();
            avgOcena = zbirOcena * 1.0 / ispiti.size();
        }
        System.out.println("Prosecna osecna za sve ispite je: " + avgOcena);

        int brojac = 0;
        double avgOcenaNovo = 0;
        int zbirOcenaNovo = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).ispitPolozen()) {
                brojac++;
                zbirOcenaNovo = zbirOcenaNovo + ispiti.get(i).getOcena();
                avgOcenaNovo = zbirOcenaNovo * 1.0 / brojac;
            }
        }
        System.out.println("Prosecna ocena za polozene ispite je: " + avgOcenaNovo);
    }
}
