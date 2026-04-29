public class matrix {
    public static void main(String[] args) {
    double[][] A= {{1,0,5},{9,6,4},{2,8,2}};
    double[][] I = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    for (int j=0;j<3;j++){
      A[1][j]=A[1][j]-9*A[0][j]; 
    I[1][j]=I[1][j]-9*I[0][j];}
    
    for (int j=0;j<3;j++){
      A[2][j]=A[2][j]-2*A[0][j]; 
         I[2][j]=I[2][j]-2*I[0][j]; 
        
    }
    for (int j=0;j<3;j++){
      A[1][j]=A[1][j]*1.0/6;  
         I[1][j]=I[1][j]*1.0/6;
      
    } 
    for (int j=0;j<3;j++){
      A[2][j]=A[2][j]-8*A[1][j];  
         I[2][j]=I[2][j]-8*I[1][j];
      
    } 
    for (int j=0;j<3;j++){
      A[2][j]=A[2][j]*(3.0/140);  
          I[2][j]=I[2][j]*(3.0/140);  
  
    }  
    for (int j=0;j<3;j++){
      A[1][j]=A[1][j]+(41.0/6*A[2][j]); 
         I[1][j]=I[1][j]+(41.0/6*I[2][j]); 
      
    }
    for (int j=0;j<3;j++){
      A[0][j]=A[0][j]-5*A[2][j];  
         I[0][j]=I[0][j]-5*I[2][j];  
     
    }
    System.out.println("Final Answer Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              System.out.printf("%.3f ", A[i][j]);
            }
            System.out.println();
          }
          System.out.println();

        // Printing the Inverse Matrix
        System.out.println("Inverse Matrix (Final Answer):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.3f ", I[i][j]);
            }
            System.out.println();

        }
      }}
    
