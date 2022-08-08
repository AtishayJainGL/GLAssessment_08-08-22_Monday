package Service;
import ABC.Model.Student;

import ABC.DAO.StudentDao;


public class Studentservice {

	public String register(Student s)

	 {

	 StudentDao edao=new StudentDao();

	 return edao.register(s);

	 }

}
