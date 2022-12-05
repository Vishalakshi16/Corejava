class LargestElementArray{
public static void main(String args[]){
int []arr=new int[]{25,11,7,75,58};   //initialize array
int max=arr[0];  //initialize max with first element of array
for(int i=0;i<arr.length;i++){ //loop through the array
if(arr[i]>max)  //compare element of array with max
max=arr[i];
}
System.out.println("largest element present in given array" + max);
}
}