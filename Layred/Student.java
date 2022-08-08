package ABC.Model;
import java.util.Date;
public class Student {
private int rollno;
private String name;
private String standard;
private  String  dob;
private double fees;
public Student(int rollno, String studentName, String standard, String dob2, Double fees) {
	super();
	this.rollno = rollno;
	this.name=studentName;
	this.standard = standard;
	this.dob=dob2;
	this.fees=fees;
	
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}


}
