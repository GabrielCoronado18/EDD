package eva1_10;
public class eva1_10_arreglobidimen {
    public static void main(String[] args) {
        int arreglobidi[][]= new int [2][2];
        for (int i = 0; i < arreglobidi.length; i++) {
            for (int j = 0; j < arreglobidi[i].length; j++) {
                arreglobidi[i][j] = (int) (Math.random()*100);
            }
        }
        for (int i = 0; i < arreglobidi.length; i++) {
            for (int j = 0; j < arreglobidi[i].length; j++) {
                System.out.println("["+arreglobidi[i][j]+"]");
    }
        }
    }
}
