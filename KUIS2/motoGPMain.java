package PraktikumAlgoritmaStrukturData.KUIS2;

import java.util.Scanner;


public class motoGPMain {
    public static void main(String[] args) {
        final int numberOfRaces = 14;
        motoGP dataTeam = new motoGP(numberOfRaces);
        motoGP sortedList = new motoGP(numberOfRaces);
        Scanner scanner = new Scanner(System.in);

        dataTeam.addTeam("Team Suzuki MotoGP            ");
        dataTeam.addTeam("SIC Racing Team               ");
        dataTeam.addTeam("Red Bull KTM Factory Racing   ");
        dataTeam.addTeam("Ducati Team                   ");
        dataTeam.addTeam("Pramac Racing                 ");
        dataTeam.addTeam("Yamaha Factory Racing         ");
        dataTeam.addTeam("Tech 3                        ");
        dataTeam.addTeam("LCR Honda                     ");
        dataTeam.addTeam("Repsol Honda Team             ");
        dataTeam.addTeam("Avintia Raing                 ");
        dataTeam.addTeam("Aprilia Racing Team           ");

        Node current = dataTeam.head;
        while (current != null) {
            sortedList.addTeam(current.team);
            current = current.next;
        }

        for (int race = 0; race < numberOfRaces; race++) {
            System.out.println("Pertandingan Ke-" + (race + 1) + ":");
            current = dataTeam.head;
            while (current != null) {
                System.out.print(current.team + ": ");
                int score = scanner.nextInt();
                sortedList.updateScore(current.team, race, score);
                current = current.next;
            }

            sortedList.sortDescending();
            System.out.println("\n## KLASEMEN " + (race + 1) + " - MOTOGP ##");
            sortedList.print();
            System.out.println();
        }

        scanner.close();
    }
}
