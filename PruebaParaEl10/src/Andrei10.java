import java.util.Scanner;
package PruebaParaEl10;	
public class Andrei10 {


		/**
		 * 
		 * Array multidimensional
		 * 
		 * @param args: datos
		 * 
		 */
		
		/*
		 *
		 * @param num: tamaño de array
		 * @param array1[][]: array1
		 * @param array2[][]: array2
		 * @param arrayResultante[][]: resultado
		 * 
		 * */

		public static void main(String[] args) {
				        
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Introduce los tamaños de mis japis");
		        int num = sc.nextInt();
		        
		        int array1[][] = new int [num][num];
		        int array2[][] = new int [num][num];
		        int arrayResultante[][] = new int [num][num];
		        
		        for(int i = 0;i < array1.length; i++){
		            for(int j = 0; j < array1[0].length; j++){
		                System.out.println("Escribe el valor paara la fila 22 " + i + " y la columna " + j + " de la mama 1");
		                array1[i][j] = sc.nextInt();
		                System.out.println("Escribe el valor paara la fila " + i + " y la columna " + j + " de la array 2");
		                array2[i][j] = sc.nextInt();
		                
		                arrayResultante[i][j] = array1[i][j] + array2[i][j];
		            }
		        }
		        
		        System.out.println("Array 1");
		        moArray(array1);
		        System.out.println("Array 2");
		        moArray(array2);
		        System.out.println("Japi resultante");
		        moArray(arrayResultante);
		    }
		    

		

		
		    public static void moArray (int array[][]){
		        for(int i = 0;i < array.length; i++){
		            for(int j = 0; j < array[0].length; j++){
		                System.out.print(array[i][j] + " ");
		            }
		            System.out.println("");
			        }
			    }
	}


