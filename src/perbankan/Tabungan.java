package perbankan;

public class Tabungan {
        protected int saldo;
        public Tabungan(int initSaldo){
            saldo = initSaldo;
        }
        
        //ngambil
        protected int getSaldo(){
            return saldo;
        }
        //tambah
        public void simpanUang(int jumlah){
            saldo+=jumlah;
        }
        //ngurangi
        public boolean ambilUang(int jumlah){
            
            if(saldo-jumlah <0){
                return false;
            }else{
                saldo -= jumlah;
                return true;
            }
        }
}
