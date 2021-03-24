package kr.hs.study.main;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.Person;

public class MainClass {

	public static void main(String[] args) {
		//HelloWorldEn hello=new HelloWorldEn();
		Hello hello = new HelloWorldKo();
		hello.sayHello();
		
		/*Person p1=new Person();
		p1.setName("kim");
		p1.setAge(30);
		System.out.println("이름: "+p1.getName());
		System.out.println("나이: "+p1.getAge());*/
		/*
		Person p1=new Person("lee",25);
		System.out.println("이름: "+p1.getName());
		System.out.println("나이: "+p1.getAge());
		*/
	}

}
