import java.util.Scanner;
public class  array {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int r1=0;
        int c1=0;
        int r2=0;
        int c2=0;
        System.out.println("Enter the number of rows and columns for the first matrix:");
        r1=input.nextInt();
        c1=input.nextInt();
        System.out.println("Enter the number of rows and columns for the second matrix:");
        r2=input.nextInt();
        c2=input.nextInt();
        if(c1!=r2){
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        else{
            int[][] matrix1=new int[r1][c1];
            int[][] matrix2=new int[r2][c2];
            int[][] result=new int[r1][c2];
            System.out.println("Enter the elements of the first matrix:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    matrix1[i][j]=input.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix:");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    matrix2[i][j]=input.nextInt();
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        result[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            System.out.println("The result of matrix multiplication is:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
        input.close();
            }
        }}}
