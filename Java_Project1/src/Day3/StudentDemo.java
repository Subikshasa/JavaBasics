package Day3;

public class StudentDemo {

	public static void main(String[] args) {
	  Student s1=new Student();	 
	  s1.setSid(102);
	  s1.setSname("sub");
	  s1.setCity("py");
/*	  System.out.println("Student id:"+s1.getSid());
	  System.out.println("Student name:"+s1.getSname());
	  System.out.println("Student city:"+s1.getCity());*/
	  
	  System.out.println(s1);
	  
	  Student s2=new Student();
	  s2.setSid(103);
	  s2.setSname("nes");
	  s2.setCity("cdm");
	  
	  /* System.out.println("Student id:"+s2.getSid());
	  System.out.println("Student name:"+s2.getSname());
	  System.out.println("Student city:"+s2.getCity());*/
	  
	  System.out.println(s2);
	  
	  Student s3=new Student();
	  s3.setSid(104);
	  s3.setSname("pads");
	  s3.setCity("che");
	  
	  /* System.out.println("Student id:"+s3.getSid());
	  System.out.println("Student name:"+s3.getSname());
	  System.out.println("Student city:"+s3.getCity());*/
	  
	  System.out.println(s3);
	}

}
