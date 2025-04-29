public class UretimAnaliz {

    public static int toplamEnDusukSureHesapla(int[][] Zaman, int[][] Maliyeti) {
        int isSayisi = Zaman.length;
        int makineSayisi = Zaman[0].length;

        int[][] enDusukMaliyetler = new int[isSayisi][makineSayisi];

        for (int j = 0; j < makineSayisi; j++) {
            enDusukMaliyetler[0][j] = Zaman[0][j];
        }


        for (int i = 1; i < isSayisi; i++) {
            for (int j = 0; j < makineSayisi; j++) {
                int oncekiEnDusukMaliyet = Integer.MAX_VALUE;
                for (int k = 0; k < makineSayisi; k++) {
                    int maliyet = enDusukMaliyetler[i - 1][k] + Maliyeti[k][j];
                    oncekiEnDusukMaliyet = Math.min(oncekiEnDusukMaliyet, maliyet);
                }
                enDusukMaliyetler[i][j] = oncekiEnDusukMaliyet + Zaman[i][j];
            }
        }

        int enDusukToplam = Integer.MAX_VALUE;
        for (int j = 0; j < makineSayisi; j++) {
            enDusukToplam = Math.min(enDusukToplam, enDusukMaliyetler[isSayisi - 1][j]);
        }

        return enDusukToplam;
    }

    public static void main(String[] args) {

        int[][] Zaman = {
                {8, 2, 10},
                {6, 7, 3},
                {1, 5, 6},
                {7, 4, 9}
        };

        int[][] Maliyeti = {
                {0, 4, 5},
                {2, 3, 1},
                {5, 1, 0}
        };

        System.out.println("Minimum Toplam Süre: " + toplamEnDusukSureHesapla(Zaman, Maliyeti)+" zaman birim sürmektedir.");
    }
}