package edu.lab4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    CBusRoute bus = new CBusRoute(129);
        CBusRoute tram = new CBusRoute(4);

        tram.addBusStop("Pentla", 750, 3.5f);
        tram.addBusStop("Wiadukt");
        tram.addBusStop("Rondo",1200, 6.0f, "Nowa Huta", "Kroworza", "Kleparz");
        tram.addBusStop("Politechnika", 500 , 5.0F);
        tram.addBusStop("Zajezdnia","Bronowice", "Centrum");

        bus.addBusStop("Dworzec Głowny", 500, 2.5f);
        bus.addBusStop("Galeria Centrum", 600, 3.0F);
        bus.addBusStop("Politechnika",1200, 6.0f, "AGH", "UJ", "Akademia Rolnicza");
        bus.addBusStop("Cmentarz Rakowicki", 400 , 2.0F);
        bus.addBusStop("Wilenska", 400, 2.0F,"Kurdwanow", "Prokocim");
        bus.addBusStop("Zajezdnia");

        System.out.println(tram);
        System.out.println(bus);

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n Podaj numer pojazdu: ");
        int number = Integer.parseInt(scan.nextLine());
        CBusRoute tram1 = new CBusRoute(number);

        System.out.println("\n Podaj ilość przystanków: ");
        int przystanki = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < przystanki; i++){
            System.out.println("\n Podaj nazwe przystanku: ");
            String name = scan.nextLine();

            System.out.println("\n Podaj odległość od kolejnego przystanku: ");
            int nextMeters = Integer.parseInt(scan.nextLine());

            System.out.println("\n Podaj minuty od kolejnego przystanku: ");
            float nextMinutes = Float.parseFloat(scan.nextLine());

            System.out.println("\n Podaj liczbe przesiadek: ");
            int przesiadki = Integer.parseInt(scan.nextLine());

            String[] changes = new String[przesiadki];
            for(int j = 0; j< przesiadki;j++){
                System.out.println("\n Podaj przesiadke nr "+(++j));
                j--;
                changes[j] = scan.nextLine();
            }


            tram1.addBusStop(name,nextMeters,nextMinutes,changes);
        }
        System.out.println(tram1);
    }
}
