import java.util.Scanner ;
public class GreengrocerCashregisterProgram {
    public static void main(String[] args) {
     double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11;
     double bananaPrice = 0.95, eggplantPrice = 5.00, sumPrice;
    double pearKg, appleKg, tomatoesKg, bananaKg, eggplantKg;

     Scanner input = new Scanner(System.in);
     System.out.print("Armutun kg miktarını TL cinsinden giriniz : ");
     pearKg = input.nextDouble();
     System.out.print("Elmanın kg miktarını TL cinsinden giriniz : ");
     appleKg = input.nextDouble();
     System.out.print("Domatesin kg miktarını TL cinsinden giriniz : ");
     tomatoesKg = input.nextDouble();
     System.out.print("Muzun kg miktarını TL cinsinden giriniz: ");
     bananaKg=input.nextDouble();
     System.out.print("Patlıcanın kg miktarını TL cinsinden giriniz: ");
     eggplantKg=input.nextDouble();

     sumPrice=(pearPrice*pearKg)+(applePrice*appleKg)+(tomatoesPrice*tomatoesKg)+(bananaPrice*bananaKg)+(eggplantPrice*eggplantKg);

     System.out.println("Ödemeniz Gereken Toplam Tutar: "+ sumPrice);


    }


    }

