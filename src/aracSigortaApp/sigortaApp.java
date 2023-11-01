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


import java.util.Scanner;

public class sigortaApp{
        public static void main(String[] args) {
            
            start();
        }
        public static void start(){
            
            Scanner scan = new Scanner(System.in);

            boolean isAgain;
            do {
                System.out.println("---ARAÇ SİGORTA PRİM HESAPLAMA----");
                System.out.println("Tarife Dönemi Seçiniz");
                System.out.println("1.Donem  Haziran 2023");
                System.out.println("2.Donem  Aralık 2023");
                
                int donem = scan.nextInt();

                int kullanıcıSecimi ;
                
                String donemAdi=donem==1 ? "Haziran 2023 " : "Aralık 2023" ;
                
                if (donem==1 || donem==2){
                    
                    Araba arac = new Araba();
                    System.out.println("Araç tipini seçiniz");
                    System.out.println(" otomobil || kamyon || otobüs || motosiklet");
                    
                    arac.type=scan.next();
                    arac.primHesaplama(donem);
                    
                    
                    if (arac.prim>0){
                        System.out.println("----------");
                        System.out.println("Araç tipi : " +arac.type);
                        System.out.println("Araç dönemi : " +donemAdi);
                        System.out.println("Aracınızın primi : " +arac.prim);
                        System.out.println("--------------");

                        System.out.println("Yeni işlem 1 || çıkıs 0 yazınız");
                        kullanıcıSecimi=scan.nextInt();
                        isAgain=kullanıcıSecimi==1 ? true : false ;
                        
                    }else{
                        System.out.println("Hatali giriş yaptınız hesaplama başarısız");
                        kullanıcıSecimi=scan.nextInt();
                        isAgain=kullanıcıSecimi==1 ? true : false ;

                    }

                }else {
                    System.out.println("Hatali giriş yaptınız hesaplama başarısız");

                    isAgain = true;
                }
                

                
            }while(isAgain);
            System.out.println("iyi günler dileriz.");

            
        }   
    }




































