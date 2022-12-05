class CountVowelConsonant{
 public static void main (String args[]){ 
  int vCount=0,cCount=0;    //counter variable to store the count of vowels and consonants
  String str="this is a really simple sentence"; //declare a string
  str=str.toLowerCase(); //converting entire string to lowercase to reduce the coparision
  for(int i=0; i<str.length(); i++){  //checks whether a character is a vowels
   if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
    vCount++; //increment the vowel counter
   }	
else if(str.charAt(i)>='a' && str.charAt(i)<='z'){ //chechk the character is consonants
cCount++; //increment the consonant counter
}

}
System.out.println("number of vowels:" +vCount);
System.out.println("number of consonants:" +cCount);
 }
 
}