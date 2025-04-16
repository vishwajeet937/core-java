package com.app.defaultProgram;
class Emp {
	private String name;
	  private int age;
	  private int id;
	 
	public void setName(String name) {
	    this.name = name;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	public void setId(int id) {
	    this.id = id;
	}
	@Override
	public String toString(){
	      return this.name+" "+age+" "+id;  
	     }  
}
public class Demo11 extends Emp{
	private String name="dgdege";
	public static void main(String[] args) {
		Emp obj = new Emp();
		Demo11 d11=new Demo11();
		obj.setName("kalyan");
		obj.setId(46);
		obj.setAge(24);
		System.out.println(d11);//obj==null:"null"?obj.toString();
	}
}

