package PraktikumAlgoritmaStrukturData.KUIS2;

public class Node {
    String team;
    int[] skor; // Skor untuk setiap balapan
    int skorTotal;
    Node next;

    Node(String team, int jmlMatch) {
        this.team = team;
        this.skor = new int[jmlMatch];
        this.skorTotal = 0;
        this.next = null;
    }

    void updateScore(int matchIndex, int score) {
        this.skor[matchIndex] += score;
        this.skorTotal += score;
    }

    int getskorTotal() {
        return skorTotal;
    }
}
