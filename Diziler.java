package Maraton1;

public class Diziler {

    public String[] elemanEk (String[] eskidizi, String eleman){
        int eskiDiziUzunluk =eskidizi.length;
        String[] yeniDizi = new String[eskiDiziUzunluk+1];
        for (int i=0;i<eskiDiziUzunluk;i++){
            yeniDizi[i]=eskidizi[i];
        }
        yeniDizi[eskiDiziUzunluk] = eleman;
        return yeniDizi;
    }

    public void Sil( int[] eskidizi,int index){
        int[]yeniDizi = new int[eskidizi.length-1];
        for(int i =0; i<yeniDizi.length;i++){
            if (i>=index)
            yeniDizi[i]=eskidizi[i+1];
            else {
                yeniDizi[i] = eskidizi[i];

            }

        }
        for(int i : yeniDizi){
            System.out.println(i);
        }


    }

    public void  AraEkle(int eskiDizi [], int index, int sayi) {
        int[] yeniDizi = new int[eskiDizi.length + 1];
        for (int i = 0; i < yeniDizi.length; i++) {
            if (i == index)
                yeniDizi[i] = sayi;

            else if (i > index) {
                yeniDizi[i] = eskiDizi[i - 1];
            } else
                yeniDizi[i] = eskiDizi[i];
        }

        if (index < eskiDizi.length) {

            yeniDizi[yeniDizi.length - 1] = eskiDizi[eskiDizi.length - 1];
        } else yeniDizi[yeniDizi.length - 1] = sayi;

        for(int i : yeniDizi) {
            System.out.println(i);
        }
    }

    public void Liste(int[] dizi) {
        for (int i : dizi) {
            System.out.println(i);
        }
    }

}
