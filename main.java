
public class main {

    public static void main(String[] args) {
        Member r = new MemberReguler();
        Member s = new MemberSilver();
        Member g = new MemberGold();
        Member p = new MemberPlatinum();

         // Penggunaan method Poin
         r.hitungTotalBayar(500000);
         System.out.println("Poin Reguler: " + r.getPoin());
 
         s.hitungTotalBayar(850000);
         System.out.println("Poin Silver: " + s.getPoin());

         g.hitungTotalBayar(1000000);
         System.out.println("Poin Gold: " + g.getPoin());

         p.hitungTotalBayar(1500000);
         System.out.println("Poin Platinum:" + p.getPoin());
 
         // Penggunaan method Diskon
         double totalBayarReguler = r.hitungTotalBayar(800000);
         System.out.println("Total Bayar Reguler: " + totalBayarReguler);
 
         double totalBayarSilver = s.hitungTotalBayar(1000000);
         System.out.println("Total Bayar Silver: " + totalBayarSilver);

         double totalBayarGold = g.hitungTotalBayar(1500000);
         System.out.println("Total Bayar Gold: " + totalBayarGold);

         double totalBayarPlatinum = p.hitungTotalBayar(2000000);
         System.out.println("Total Bayar Platinum: " + totalBayarPlatinum);


     }
 }
