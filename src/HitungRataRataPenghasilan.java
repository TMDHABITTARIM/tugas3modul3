/**
 * @author ${T. M. DHABIT TARIM}
 */
public class HitungRataRataPenghasilan {
   private static int totalPenghasilan = 0;

    /**
     * ini adalah method/fungsi untuk menghitung rata rata
     * @param argPenghasilan
     * @return hasil rata rata
     */
    public static double prosesHitung(int argPenghasilan[]){
        for (int i = 0; i < argPenghasilan.length; i++) {
             totalPenghasilan += argPenghasilan[i];
        }
        //proses hitung untuk menghitung hasil akhir rata rata penghasilan
        return (double) totalPenghasilan / argPenghasilan.length;
    }
    /**method ini berfungsi untuk menjalankan program
     * @param args
     */

    public static void main(String[] args) {
        int[] penghasilan = {1000, 1500, 2000, 2500, 3000};
        //memanggil method proses hitung
        System.out.println("Rata-rata penghasilan: " + prosesHitung(penghasilan));
}
}
