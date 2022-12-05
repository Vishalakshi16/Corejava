class FrequencyDigits{
static int FrequencyDigits(int n,int d){
int c=0;
while(n>0){
if(n%10==d){
c++;
n=n/10;
}
}
return c;


}

}