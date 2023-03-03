package comcgdi;

public class Student {
	

	//1.Dependency in terms of literals
	
		
		//variable
		private String StudentName;
		private int rollno;

		//DI using constructor
		//constructor-arg name should pass in beans.xml
		public Student(String studentName, int rollno) {
			super();
			StudentName = studentName;
			this.rollno = rollno;
		}

		
		/*//DI using setters method
		
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}*/
		//userDefined method
		public void display()
		{
			System.out.println("StudentName is :"+StudentName+" "+"and Roll No is: "+rollno);
		}

		
		
		

	}

