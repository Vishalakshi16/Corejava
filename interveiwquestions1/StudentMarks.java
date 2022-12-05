class StudentMarks{
 public static void main(String args[]){
 int n=2,total=0,percentage;
 int marks[]= {28,56};
 for(int i=0; i<n; i++){
  total=total+marks[i];
 }
 percentage=total/n;
 System.out.println("sum:"+total);
 System.out.println("percentage:"+percentage);
 
 }

}
