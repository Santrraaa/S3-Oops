import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int i,j,k;
		System.out.println("enter the no.of rows for 1st matrix:");
		int rows_1=sc.nextInt();
		System.out.println("enter the no.of columns for 1st matrix:");
		int cols_1=sc.nextInt();
		int matrix_1[][]= new int[rows_1][cols_1];
		System.out.println("enter the no.of rows for 2st matrix:");
		int rows_2=sc.nextInt();
		System.out.println("enter the no.of columns for 2st matrix:");
		int cols_2=sc.nextInt();
		int matrix_2[][]= new int[rows_2][cols_2];
		int matrix_3[][]= new int[rows_1][cols_1];
		if(rows_1!=rows_2 && cols_1!=cols_2){
			System.out.println("matrix sum is not possible");
		}
		else{
			System.out.println("enter elements of 1st matrix");
			for(i=0;i<rows_1;i++){
				for(j=0;j<cols_1;j++){
					matrix_1[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter elements of 2nd matrix");
			for(i=0;i<rows_2;i++){
				for(j=0;j<cols_2;j++){
					matrix_2[i][j]=sc.nextInt();
			    }
			}
			System.out.println("1st matrix is");
			for(i=0;i<rows_1;i++){
				for(j=0;j<cols_1;j++){
					System.out.print(matrix_1[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println("2nd matrix is");
			for(i=0;i<rows_2;i++){
				for(j=0;j<cols_2;j++){
					System.out.print(matrix_2[i][j]+"  ");
				}
				System.out.println();
			}
			for (i=0;i<rows_1;i++){
				for(j=0;j<cols_1;j++){
					matrix_3[i][j]= matrix_1[i][j]+matrix_2[i][j];
				}
			}
			System.out.println("Array sum is");
			for (i=0;i<rows_1;i++){
				for(j=0;j<cols_1;j++){
					System.out.print(matrix_3[i][j]+"  ");
				}
			System.out.println();
			}
		}
	}
 }