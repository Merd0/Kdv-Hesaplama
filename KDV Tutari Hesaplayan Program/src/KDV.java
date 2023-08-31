
  import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        // Değişken
        double tutar, kdvOran= 0.18 , kdvTutar, kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz :");
        tutar = inp.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDVsiz Tutar : " + tutar );
        System.out.println("KDV Oranı :" + kdvOran );
        System.out.println("KDV Tutarı :" + kdvTutar );
        System.out.println("KDV'li Tutar :" + kdvliTutar );

    }
}
