class SoapTester
{
	public  void main(String args[])
	{
	Soap soap=new Soap();
	soap.color="pink";
	soap.shape="round";
	soap.name="mysore sandal";
    soap.price=8;
	Soap.toGetFresh();
    System.out.println(soap.name +" "+ soap.color);
	
	Soap soap1=new Soap();
	soap1.color="white";
	soap1.shape="rectangle";
	soap1.name="santoor";
    soap1.price=8;
	Soap.toGetFresh();
    System.out.println(soap1.name +" "+ soap1.color);
	
	Soap soap2=new Soap();
	soap2.color="cream";
	soap2.shape="diamond";
	soap2.name="No1";
    soap2.price=8;
	Soap.toGetFresh();
    System.out.println(soap2.name +" "+ soap2.color);
	}
}
/*purpose of object is to create a multiple copy of class
 of object is a instance of a class,class logically available in the memory its take less space
 object pysically exist in memory require more space than class.java can understant 2 thing cls object
 to create class class keyword is used and to object nwe keyword.javap classname.evry compiler give default values and compiler will create  constructor
: it is special type of methode where constructor name is sm  as class with no return type
why constructor is require
helps to create object 
wtout constructor no object can be created 
System is class
println is a methode */
 