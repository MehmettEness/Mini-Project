package aracSigortaApp;

import java.util.Scanner;

/*
Proje: Araç Sigorta Prim Hesaplama
        Araç tipleri:otomobil, kamyon, otobüs, motosiklet
        -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

        Tarife dönemi:Aralık 2023,Haziran 2023
        1.dönem :Haziran 2023               2.dönem:Aralık 2023
        otomobil: 2000                       otomobil: 2500
        kamyon:   3000                       kamyon:   3500
        otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
        motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
        */
public class Arac {

    public String type;
    public int prim ;


    //prim hesaplama

    public void primHesaplama( int donem ){

        //tipe göre hesaplama yapmak için

        switch (this.type){

            case "otomobil":
                this.prim=donem==1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim=donem==1 ? 3000 : 3500;
                break;
            case "otobüs":
            otobusPrim(donem); //(donemim benim bu classta yer alan donemden secmesi icin bu sekilde yazdık)

            case "motosiklet":
                this.prim=donem==1 ? 1500 : 1750;
                break;

            default: //bu degerlerden birini girmemişsse
                System.out.println("Hatalı giriş yaptınız ");
                this.prim=0;
                break;


        }
    }
    //otobüs tipine göre prim hesaplama

    public void otobusPrim(int donem){

        Scanner scan = new Scanner(System.in);
        System.out.println("Otobüs tipini seçiniz");
        System.out.println("1.18-30 Koltuk arası");
        System.out.println("2.31 Koltuk ve üzeri");

        int otobusTipi = scan.nextInt();
        switch (otobusTipi){
            case 1:
               this.prim=donem==1 ? 4000 : 4500;
               break;
            case 2:
                this.prim=donem==1 ? 5000 : 5500;
               break;

            default:
                System.out.println("Hatali giriş yaptınız");
                this.prim=0;
                break;

        }


    }



}
