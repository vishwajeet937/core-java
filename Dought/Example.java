class Example
 {
	 String name;
	 int emp_id;
	 float marks;
	 Example(String name,int emp_id,float marks)
	 {
		 this.name=name;
		 this.emp_id=emp_id;
		 this.marks=marks;
	 }
	 public static void main(String arg[])
	 {
	Example m1=new Example("sonu",101,500);
	Example m2=new Example( "monu",102,502);
	 System.out.println(m1.name+" "+m1.emp_id+" "+m1.marks);
	 System.out.println("--------------------");
	 System.out.println(m2.name+" "+m2.emp_id+" "+m2.marks);
 }
 }