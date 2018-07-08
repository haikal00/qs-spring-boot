package web.haikal.starter.bean;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PantunRepo {

    private static final List<String> pantunList = new ArrayList<String>();
    private static Random rand = new Random();
    static{
        pantunList.add(String.join("\n",
        "Ayam bulu balik,",
        "Telur atas para;",
        "Abang baru balik,",
        "Tidak ada bawa apa."));

        pantunList.add(String.join("\n",
        "Cik Dayang berkain batik,",
        "Memakai tudung sutera Cina;",
        "Semakin kupandang bertambah cantik,",
        "Makan tak kenyang tidur tak lena."));

        pantunList.add(String.join("\n",
        "Ikan kering ikan siakap,",
        "Mari dijemur di atas atap;",
        "Bila nasihat tak dengar cakap,",
        "Bila lagi nak berubah sikap?"));

        pantunList.add(String.join("\n",
        "Ada ubi ada batas,",
        "Ada hari boleh balas."));

        pantunList.add(String.join("\n",
        "Banyak udang banyak garam,",
        "Banyak orang banyak ragam."));
    }

    public static String getText(){
        int randomIdx = rand.nextInt(pantunList.size());
        return pantunList.get(randomIdx);
    }

}