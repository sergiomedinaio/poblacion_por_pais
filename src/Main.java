public class Main {

    public static int[][] ordenarUsandoBurbujaDesc(int[][] array) {
        int i;
        int pais; //0
        int poblacion; //1
        int goles;

        boolean bandera = true;
        //elegir columna -> 0
        while (bandera) {
            bandera = false;
            // 56 19 5 -> chile
            // 54 47 7-> argentina
            // 593 18 10-> ecuador
            // 598 3  1 -> uruguay

            for (i = 0; i < array.length - 1; i++) {
                if (array[i][2] < array[i + 1][2]) {
                    pais = array[i][0]; //me guardo el pais
                    poblacion = array[i][1]; //me guardo la poblacion
                    goles = array[i][2]; //me guardo la poblacion
                    array[i][0] = array[i + 1][0]; //reubico el pais
                    array[i][1] = array[i + 1][1]; //reubico poblacion
                    array[i][2] = array[i + 1][2]; //reubico goles
                    array[i + 1][0] = pais; //actualizo pais
                    array[i + 1][1] = poblacion; //actualizo poblacion
                    array[i + 1][2] = goles; //actualizo goles
                    bandera = true;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {

        // 54 47 -> argentina
        // 56 19 -> chile
        // 593 18 -> ecuador
        // 598 3 -> uruguay

        int[][] poblacionPorPais = new int[4][3];
        //chile
        poblacionPorPais[0][0] = 56; //cod pais
        poblacionPorPais[0][1] = 19; //poblacion
        poblacionPorPais[0][2] = 0; //gles
        //argentina
        poblacionPorPais[1][0] = 54;
        poblacionPorPais[1][1] = 47;
        poblacionPorPais[1][2] = 12;
        //ecuador
        poblacionPorPais[2][0] = 593;
        poblacionPorPais[2][1] = 18;
        poblacionPorPais[2][2] = 1;
        //uruguay
        poblacionPorPais[3][0] = 598;
        poblacionPorPais[3][1] = 3;
        poblacionPorPais[3][2] = 10;

        ordenarUsandoBurbujaDesc(poblacionPorPais);

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(poblacionPorPais[i][j]);
                if(j<2) {
                    System.out.print(" | ");
                }
            }
            //acá ya terminó de recorrer columnas
            if(i < 3) {
                System.out.println("\n----------");
            }
        }

    }
}