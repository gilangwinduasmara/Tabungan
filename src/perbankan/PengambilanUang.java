package perbankan;

public class PengambilanUang extends Tabungan{
    int proteksi;
    
    PengambilanUang(int saldo){
        super(saldo);
    }
    public PengambilanUang(int saldo, int tingkatBunga){
        super(saldo);
        this.proteksi = tingkatBunga;
        super.saldo = saldo-proteksi;
    }
    
    public int getSaldo(){
        return super.saldo+proteksi;
    }
    public boolean ambilUang(int jumlah){
        if(jumlah<saldo){
            saldo-=jumlah;
            return true;
        }else
        return true;
    }
}
