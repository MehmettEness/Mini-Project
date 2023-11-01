package aracSigortaApp;
/* Tarife dönemi:Aralık 2023,Haziran 2023
        1.dönem :Haziran 2023               2.dönem:Aralık 2023
        otomobil: 2000                       otomobil: 2500
        kamyon:   3000                       kamyon:   3500
        otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
        motosiklet: 1500                     motosiklet: 1750

 */


import java.util.Scanner;

public class Araba{

    public String type;

    public int prim;

    public void primHesaplama(int donem){


        switch (this.type){

            case "otomobil" :
                this.prim=donem==1 ?  2000 : 2500 ;
                break;

            case "kamyon" :
                this.prim=donem ==1 ? 3000 : 3500 ;
                break;

            case "otobüs" :
                otobusPrim(donem);
                break;

            case "motosiklet" :
                this.prim=donem == 1 ? 1500 : 1750 ;
                break;

            default:
                this.prim=0;
                break;

        }

    }
    public void otobusPrim(int donem){

        Scanner scan = new Scanner(System.in);
        System.out.println("Otobüsünüzün tipini seçiniz");
        System.out.println("1.18-30 arası koltuk seçimi");
        System.out.println("2.31 ve üzeri koltuk seçimi");

        int otobüsTipi = scan.nextInt();

        switch (otobüsTipi){
            case 1:
                this.prim=donem==1 ? 4000 : 4500 ;
                break;

            case 2:
                this.prim=donem==1 ? 4500 : 5500 ;
                break;

            default:
                System.out.println("Hatali giriş yaptınız");
                this.prim=0;
                break;
        }






    }



}

































