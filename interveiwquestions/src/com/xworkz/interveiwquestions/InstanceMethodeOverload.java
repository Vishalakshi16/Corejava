package com.xworkz.interveiwquestions;

public class InstanceMethodeOverload {
	
 public  void a() {
	System.out.println("mysore");
}

	
	public  void a(int a) {
		System.out.println("bagalkot");
	}
	public static void main(String[] args) {
		System.out.println("vishu");
		InstanceMethodeOverload io=new InstanceMethodeOverload();
		io.a();
		io.a(60);
	}

}
