import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double money , kdvvalue = 0,kdv ;
        System.out.print("Ücret tutarınızı giriniz: ");
        money= input.nextInt();
        if (money>0 & money<1000) {
            kdvvalue = money*0.18;
            System.out.println("KDV değeri: %18");
        }
        else if (money>=1000) {
            kdvvalue = money * 0.08;
            System.out.println("KVD değeri: %8");
        }
        kdv =  money + kdvvalue;
        System.out.println("KDV tutarı: " + kdvvalue + " TL");
        System.out.println("KDV'siz fiyat: " + money + " TL");
        System.out.println("KDV'li fiyat: " + kdv + " TL");

    }
}
