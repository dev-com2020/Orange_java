package piatek;

public class Multi {
    public static void main(String[] args) {
        int[] longTab = new int[1000];
        longTab[99] = 100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab = new int[3][];
        hugeTab[0] = longTab;
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;

        System.out.println("Długości tablic: ");
        System.out.println(hugeTab[0].length + " ; " + hugeTab[1].length + " ; " + hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy: " + hugeTab[0][99]);

        int[][][] trzyW = new int[3][3][3];
    }
}