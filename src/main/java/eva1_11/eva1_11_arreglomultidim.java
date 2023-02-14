/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11;

/**
 *
 * @author ganda
 */
public class eva1_11_arreglomultidim {
    public static void main(String[] args) {
        int arregloMultidim [][][][] = new int [3][3][3][3];
        // arregloMultidim [2][2][2][2] = 100;
        for (int i = 0; i < arregloMultidim.length; i++) {
            for (int j = 0; j < arregloMultidim[i].length; j++) {
                for (int k = 0; k < arregloMultidim[i][j].length; k++) {
                    for (int l = 0; l < arregloMultidim[i][j][k].length; l++) {
                       arregloMultidim[i][j][k][l] = (int) (Math.random()*100); 
                    }
                    
                }
                
            }
            
        }
        for (int i = 0; i < arregloMultidim.length; i++) {
            for (int j = 0; j < arregloMultidim[i].length; j++) {
                for (int k = 0; k < arregloMultidim[i][j].length; k++) {
                    for (int l = 0; l < arregloMultidim[i][j][k].length; l++) {
                       System.out.println("[" + arregloMultidim [i][j][k][l]+ "]"); 
                    }
                    
                }
                
            }
            
        }
}
}

