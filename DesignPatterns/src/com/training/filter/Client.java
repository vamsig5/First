package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
List<Person> list=new ArrayList<Person>();
list.add(new Person("vamsi","male","single"));
list.add(new Person("hanu","male","single"));
list.add(new Person("uma","male","single"));
list.add(new Person("sai","male","married"));
list.add(new Person("kavita","female","single"));
list.add(new Person("rama","female","single"));
list.add(new Person("janu","female","married"));
ICriteria mCriteria=new Male();
	
System.out.println("--------------only male------------");
mCriteria.meetCriteria(list).forEach(System.out::println);
ICriteria mCriteria2=new Female();
System.out.println("--------------only female------------");
mCriteria2.meetCriteria(list).forEach(System.out::println);
ICriteria mCriteria3=new Married();
System.out.println("--------------only married------------");
mCriteria3.meetCriteria(list).forEach(System.out::println);

ICriteria mCriteria4=new AddCriteria(mCriteria, mCriteria3);
System.out.println("----------married and male------");
mCriteria4.meetCriteria(list).forEach(System.out::println);


ICriteria mCriteria5=new OrCriteria(mCriteria, mCriteria3);
System.out.println("----------married or male------");
mCriteria5.meetCriteria(list).forEach(System.out::println);


ICriteria criteria6=new Single();
System.out.println("--------------only single------------");
criteria6.meetCriteria(list).forEach(System.out::println);




	}

}
