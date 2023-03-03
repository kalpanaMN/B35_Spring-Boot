package cgdiav;
//2.Dependency in terms of Objects
//StudentNew class is dependent on MathCheat class

public class StudentNew {
MathCheat math;
	
	
	public void cheating()
	{
		math.mathCheat();
	}

	//DI using Setters

	public void setMath(MathCheat math) {
		this.math = math;
	}

	



}
