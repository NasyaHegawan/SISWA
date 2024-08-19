//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor ();
        Siswa nasya = new Siswa();
        Siswa natanz = new Siswa();

        nasya.id = 26;
        nasya.nama = "Nasya";
        natanz.id = 27;
        natanz.nama = "Natanz";
        nasya.print();
    }
}
