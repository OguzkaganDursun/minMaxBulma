import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int girilecekSayi, sayi, min = 0, maks = 0;

        //Kullanicidan veriler alindi.
        //Min ve Max degeleri hesaplanip ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);

        System.out.print("Kac Adet Sayi Gireceksiniz : ");
        girilecekSayi = scan.nextInt();

        for (int i = 1; i <= girilecekSayi; i++)
        {
            System.out.print(i + ". Sayiyi Giriniz : ");
            sayi = scan.nextInt();

            if (i == 1)
            {
                maks = sayi;
                min = sayi;
            }

            if (sayi > maks)
            {
                maks = sayi;
            }
            else if (sayi < min)
            {
                min = sayi;
            }

        }

        System.out.println("En Buyuk Sayi : " + maks);
        System.out.println("En Kucuk Sayi : " + min);

    }
}
