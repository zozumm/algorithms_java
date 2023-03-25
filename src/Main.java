import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
      //  System.out.println("kelime=");
      //  String girdi= scanner.nextLine();
      //  System.out.println(HarfDonustur(girdi));  //harf donusturme ekran cıktısı
     // Armstrong(); //Armstrong sayilarini yazdir
      //  Ascii();  //ascii tablo elemanlarını yazdir
        //  MukemmelSayi();
        //System.out.println(usAlma(5, 2));  //us alma birinci
        //System.out.println(Us(4, 2)); //recursive us2
        //System.out.println(DecimaltoBinary(52)); // decimal binary cevirme
    }
    public static String HarfDonustur(String girdi){ //Buyuk kucuk harf donusturme
        String sonuc="";
        int fark= (int)'a'-(int)'A';
        for (int i=0;i<girdi.length();i++){
            int karakter=(int) girdi.charAt(i);
            if(karakter>=(int)'a' && karakter<= (int)'z'){
                sonuc=sonuc + (char) (karakter-fark);
            }
            else if(karakter>=(int)'A' && karakter<= (int)'Z'){
                sonuc= sonuc + (char) (karakter+fark);
            }
            else{
                sonuc= sonuc+(char)karakter;
            }
        }
        return sonuc;
    }

    public static void Armstrong(){
        for(int i=1; i<1000;i++){
            int basamak_sayisi=0,rakam;
            double toplam=0;
            int sayi=i;
            int gecici=i;
            int gecici2=i;
            while(gecici>0){
            gecici=gecici/10;
            basamak_sayisi ++;
            }
            while(gecici2>0){
            rakam=gecici2%10;
            toplam=toplam+Math.pow(rakam,basamak_sayisi);
            gecici2/=10;
            }
        if (toplam==sayi){
            System.out.println(sayi+"bir armstrong sayisi");
        }
        else{
            System.out.println(sayi+"armstrong sayisi degil");
        }
        }
    }
    public static void Ascii(){
        for(int i=0;i<256;i++){
            char c =(char)i;
            System.out.println(i+".eleman"+c);
        }
    }
    public static void MukemmelSayi(){
        for(int i=0;i<=1000;i++){
            int toplam=0;
            for(int j=1;j<i;j++){
                if (i%j==0){
                    toplam=toplam+j;
                }
            }
            if(toplam==1){
                System.out.println(i+"sayisi mukemmel");
            }
        }
    }

    public static int usAlma(int taban,int us){
        if(us==0){
            return 1;
        }
        else if(us==1){
            return taban;
        }
        else{
            return taban * usAlma(taban,us-1);
        }
    }
    public static double Us(int alt, int ust){
        if(ust <= 1){
            return alt;
        }
        else {
            if (ust % 2 == 0) {
                double sonuc = Us(alt, ust / 2);
                return sonuc * sonuc;
            } else {
                double sonuc = Us(alt, (ust - 1) / 2);
                return alt * sonuc * sonuc;
            }
        }
    }

    public static String DecimaltoBinary(int decimal){
        String sonuc = "";
        if(decimal <= 1) {
            return Integer.toString(decimal);
        }
        else{
            return DecimaltoBinary(decimal/2) + Integer.toString(decimal % 2) ;
        }
    }
}
