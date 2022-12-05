class DuplicateElements{
public static void mian(String args[]){
int[] array = new int[]{2,3,7,2,11,5,7,14};
for(int i=0;i<array.length;i++){
for(int j=i+1; j<array.length;j++){
if(i!=j && array[i]==array[j]){
System.out.println("Duplicate element found:" + array[i]);
}
}
}
}
}
