package com.springt.basics;

public class DefaultHello implements HelloService {
private String Name;
private String city;


	public DefaultHello() {
	super();
	// TODO Auto-generated constructor stub
}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public DefaultHello(String name, String city) {
		super();
		Name = name;
		this.city = city;
	}


	public String sayHello() {
		
		return sayHello(Name, city)+"  "+getName()+" "+getCity();
	}

	//the value for this is given by configuration file
	public String sayHello(String name, String city) {
		
		String mystr[]={"hello Mr %s","how r u","Mr %s, ur city is beatiful %s"};
		int random=(int)(Math.random()*3);
		System.out.println(random);
		return String.format(mystr[random], name,city);
	}
	public void ginit() {
System.out.println("Global init in Default..");
	}
	public void gdestroy() {
System.out.println("Global destroy in default..");
	}

}
