package ABC.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import ABC.Model.Student;

public class StudentDao {
	public Connection getConnection()throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");

	 return con;

	 }

	 public String register(Student e)

	 {
		 

	 int i=0;
	 

	 try {

	  PreparedStatement ps=getConnection().prepareStatement("insert into student values(?,?,?,?,?)");

	  ps.setInt(1, e.getRollno());

	  ps.setString(2,e.getName());
	  ps.setString(3,e.getStandard());
      ps.setString(4,e.getDob());
	  ps.setDouble(4, e.getFees());

	  i=ps.executeUpdate();

	 } catch (Exception e2) {

	  // TODO: handle exception

	 }

	 if(i>0)

	 {

	  return "successfully inserted data";

	 }

	 else

	 {

	  return "fail";

	 }
}
}