package perbankan;
//nama : Gilang Windu Asmara (672018200);
//       Gabriel Militia M (672018256);
//       Fanny Natacia (672018603);
public class testTabungan {
    public static void main(String[] args) {
        boolean status;
        Tabungan nabung = new Tabungan(5000);
        System.out.println("Saldo awal = "+nabung.getSaldo());
        nabung.simpanUang(3000);
        System.out.println("simpan uang = 3000");
        status= nabung.ambilUang(6000);
        System.out.print("ambil uang = 6000 ");
        if(status)
            System.out.println("      ok");
        else
            System.out.println("        gagal");
        
        status=nabung.ambilUang(1000);
        System.out.print("ambil uang=1000 ");
        if(status)
            System.out.println("        ok");
        else
            System.out.println("        gagal");
        
        status=nabung.ambilUang(7000);
        System.out.print("ambil uang=7000 ");
        if(status)
            System.out.println("        ok");
        else
            System.out.println("        gagal");
        System.out.println("saldo sekarang= "+nabung.getSaldo());
    }
    
}
