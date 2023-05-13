// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*crear y cargar una matriz de tamaño n*m y decir o mostrar al usuario si es simetrica o no,
       (una matriz simetrica es simetrica cuando es cuadrada n filas = n columnas, cuando se optiene la misma matriz al cambiar sus filas por columnas)
       *  */

        Scanner lector=new Scanner(System.in);
        boolean simetrico=true;
        int matriz[][];
        int nFilas=Integer.parseInt(JOptionPane.showInputDialog("dijite el Num de filas"));
        int nColumnas=Integer.parseInt(JOptionPane.showInputDialog("dijite el Num de columnas"));
        matriz=new int[nFilas][nColumnas];
        System.out.println("dijite los numeros de la matriz");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("matriz[ "+i+" ] [ "+j+" ]");
                matriz[i][j]=lector.nextInt();
            }
        }

        if(nFilas==nColumnas) {
            int i, j;
            i = 0;
            while(i<nFilas && simetrico==true){
                j=0;
                while(j<i && simetrico==true){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetrico=false;
                    }
                    j++;
                }
                i++;
            }


          if(simetrico==true){
              System.out.println("su matriz es simetrica");
          }else{
              System.out.println("su matrzi es asimetrica");
          }


        }else{
            System.out.println("su matrzi es asimetrica");
        }






    }
}