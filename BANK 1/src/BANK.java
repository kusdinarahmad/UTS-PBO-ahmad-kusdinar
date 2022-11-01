
public class BANK {
int Mysaldo;
   int total;
    public BANK(int saldo){
        Mysaldo = saldo;
    }
    void getSaldo(){

        System.out.println("Selamat Datang di Bank A");
        System.out.println("Saldo anda saat ini : Rp." + Mysaldo);
       
    }
    void simpanUang(int Simpan){
         Mysaldo = Simpan + Mysaldo;

        System.out.println("Simpan Uang : "+Simpan);
        System.out.println("Saldo anda saat ini : "+"Rp."+Mysaldo);
    }
    void ambilUang(int ambil){
       if (ambil<Mysaldo){;
        
        System.out.println("Ambil uang: "+ambil);
        System.out.println("Saldo anda saat ini: "+"Rp."+Mysaldo);
   }else{
            System.out.println("Maaf Saldo Anda Kurang");
    }
  }
}
    