package PraktikumAlgoritmaStrukturData.KUIS2;

public class motoGP {
    Node head;
    int jmlMatch;

    motoGP(int jmlMatch) {
        this.jmlMatch = jmlMatch;
    }

    // Method to add a new team to the list
    void addTeam(String team) {
        Node newNode = new Node(team, jmlMatch);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to update the score for a team's race
    void updateScore(String team, int matchIndex, int score) {
        Node current = head;
        while (current != null) {
            if (current.team.equals(team)) {
                current.updateScore(matchIndex, score);
                break;
            }
            current = current.next;
        }
    }

    // Method to sort the list based on total team score in descending order
    void sortDescending() {
        if (head == null || head.next == null) return;

        Node sorted = null;

        while (head != null) {
            Node current = head;
            head = head.next;

            if (sorted == null || current.getskorTotal() > sorted.getskorTotal()) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.next != null && temp.next.getskorTotal() > current.getskorTotal()) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
        }
        head = sorted;
    }

    // Method to get the highest score in the list
    int getHighestScore() {
        if (head == null) return 0;
        return head.getskorTotal();
    }

    // Method to display the team names and skor in a table format
    void print() {
        System.out.println("=========================================================================================================================");
        System.out.println("     |                                |___________________________________MATCH KE-_________________________|            |");
        System.out.println("RANK |              TEAM              | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 | 11 | 12 | 13 | 14 | TOTAL SKOR |");
        System.out.println("=========================================================================================================================");
        int highestScore = getHighestScore();
        Node current = head;

        for (int i = 1; current !=null; i++) {
            System.out.printf("%02d   | "+ current.team, i);
            for (int j = 0; j < jmlMatch; j++) {
                if(current.skor[j] == 0){
                    System.out.print(" |  -" );
                } else if (current.skor[j] < 10 && current.skor[j] != 0) {
                    System.out.print(" |  " + current.skor[j] + "");
                } else {
                    System.out.print(" | " + current.skor[j] + "");
                }
                
            }
            int selisihSkor = highestScore - current.getskorTotal();
            System.out.print("  | " + current.getskorTotal() + " [-" +selisihSkor + "]");
            current = current.next;
            System.out.println();
        }
    }
}
