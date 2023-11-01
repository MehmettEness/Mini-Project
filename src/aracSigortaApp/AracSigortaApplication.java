package aracSigortaApp;

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

import java.sql.SQLOutput;
import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {


    //1.uygulamayı başlatan method yaz
        start();
    }
    public static void start(){


    //2. kullanıcıdan bilgi al
    Scanner scan = new Scanner(System.in);

    //formumun gösterilmesi icin
        boolean isAgain;

    //3.tekrar tekrar menü göstermek icin

    do {

        System.out.println("-----------------ZORUNLU ARAC SİGORTA PRİMİ HESAPLAMA---------------------------------");
        System.out.println("Tarife Dönemi Seçiniz");
        System.out.println("1.Dönem Haziran 2023");
        System.out.println("2.Dönem Aralık 2023");
        //kullanıcı dönem secmesini okumak icin
        int donem =scan.nextInt();
        String donemAdi=donem==1 ? "Haziran 2023" : "Aralık 2023";

        //kullanıcı tarife dönemini yanlış girme ihtimaline karşın uyarı mesajı ver ve form göster

       int kulllaniciSecimi;

        if (donem==1 || donem==2){

            //arac tip prim tutacağımız obje olusturacağız

        //son burası yazıldı arac clasında yer alan arac methodunu cağırmak icin

            Arac arac = new Arac();
            System.out.println("Araç tipini giriniz");
            System.out.println("otomobil | kamyon  | otobüs | motosiklet");

            arac.type = scan.next(); //arac.type arac objemin tip özelliği kullanıcan al demek

            arac.primHesaplama(donem);//aracın primi icin arac clasından objeyi alacağızz

            //prim=0 ise hatali giriş olacak ve yeni bir işlem seceneği secilecek
            //prim>0 ise hesaplama başarılı ve sonuc görünütlemesi yapacagız

            if (arac.prim>0){

                System.out.println("-------------------------------------------------------------");
                System.out.println("Araç tipi : "+arac.type);
                System.out.println("Tarife dönemi : "+donemAdi);
                System.out.println("Aracınızı ilgili dönem sigorta primi :" +arac.prim);
                System.out.println("-------------------------------------------------------------");

                System.out.println("Yeni işlem icin: 1 | Çıkış işlemi için: 0 seciniz");
                kulllaniciSecimi=scan.nextInt();

                isAgain=kulllaniciSecimi==1 ? true : false ;



            }else {
                System.out.println("Hatali giriş yaptınız hesaplama başarısız, tekrar deneyiniz");
                System.out.println("Yeni işlem icin: 1 | Çıkış işlemi için: 0" + "seciniz");
                kulllaniciSecimi=scan.nextInt();

                isAgain=kulllaniciSecimi==1 ? true : false ; //kullanıcı 1 seçerse yukarıdaki int ile alacağıız true olsun döngü devam etsin , false ise çıkış olsun dedik

            }





        }else {//Hatali giriş mesajı
            System.err.println("Hatali giriş yaptınız.Lütfen 1 veya 2 degerini seciniz");

            isAgain=true; //hatalı giriş sonrası form tekrar gösterilecek..

        }



    }while(isAgain);

        System.out.println("İyi günler dileriz");

    }






}
