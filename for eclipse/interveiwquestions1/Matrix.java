class Matrix{
private static void displayMatrix(int n){
int[][]matrix=new int[n][n];
int count=0;
for(int i=0;i<10;i++){
for(int j=0;j<10;j++){

System.out.println("[" +matrix[i][j]+"]");
count++;
if(count%n==0){

System.out.println();
}
}
}
}
}
