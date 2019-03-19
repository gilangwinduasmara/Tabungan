package nina;
import perbankan.*;
public class Test1{
    public static void main(String[] args) {
        PengambilanUang tabungan = new PengambilanUang(5000, 1000);
        System.out.println("uang yang ditabung : 5000");
        System.out.println("uang yang diproteksi : 1000");
        System.out.println("---------------------------");
        System.out.println("uang yang diambil : 4500 "+tabungan.ambilUang(4500));
        System.out.println("saldo sekarang : "+tabungan.getSaldo());
        System.out.println("---------------------------");
        System.out.println("uang yang diambil : 2500 "+tabungan.ambilUang(2500));
        System.out.println("saldo sekarang : "+tabungan.getSaldo());
    }
}
