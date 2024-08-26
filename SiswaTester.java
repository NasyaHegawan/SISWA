import java.util.Scanner;

//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //Urutannya adalah String - int - double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("ID : ");
        int id = input.nextInt();
        System.out.println("IPK :");
        double IPK = input.nextDouble();
        input.close();

        Siswa Dimas = new Siswa(id, nama, IPK);
        Dimas.print();
        
        //membuat Object
        //namaClass namaObject = new Constructor ();
        Siswa nasya = new Siswa();
        Siswa zahra = new Siswa();
        Siswa cinta = new Siswa();
        Siswa grace = new Siswa();
        Siswa lia = new Siswa();
        Siswa shabrina = new Siswa(32, "Shabrina", 89);

        nasya.id = 26;
        nasya.nama = "Nasya";
        nasya.ipk = 99.8;
        zahra.id = 35;
        zahra.nama = "Zahra";
        zahra.ipk = 90.3;
        cinta.id = 28;
        cinta.nama = "Cinta";
        cinta.ipk = 91.9;
        grace.id = 12;
        grace.nama = "Grace";
        grace.ipk = 90.3;
        lia.id = 6;
        lia.nama = "Aprillia";
        lia.ipk = 92.2;

        nasya.print();
        zahra.print();
        cinta.print();
        grace.print();
        lia.print();
        shabrina.print();
    }
}
