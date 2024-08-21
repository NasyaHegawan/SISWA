package GURU;

public class TesGuru {
    public static void main(String[] args) {
        Guru Falah = new Guru(1123, "Falah", "Bahasa Indonesia", "Part-Time");
        Guru Pasha = new Guru(2678, "Pasha", "Produktif RPL", "Tetap");
        Guru Guntur = new Guru(3098, "Guntur", "Sejarah", "Full-Time");
        Guru Chusnul = new Guru(5639, "Chusnul", "IPAS", "Tetap");
        Guru Diaur = new Guru(3248, "Diaur", "PJOK", "Part-Time");

        Falah.print();
        Pasha.print();
        Guntur.print();
        Chusnul.print();
        Diaur.print();
    }
}
