/*
1. Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).

Key- Country Value - Capital

India Delhi

Japan Tokyo

2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.

3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.

4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.

Key – Capital Value – Country

Delhi India

Tokyo Japan

5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.

NOTE: You can test the methods using a main method.

*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class country{
	private HashMap<String, String>M1 = new HashMap<String,String>();
	//method saveCountryCapital
	public HashMap<String,String> saveCountryCapital(String CountryName,String capital){
		M1.put(CountryName,capital);
		return M1;
	}
	// getCapital(String CountryName) method
	public String  getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	//getCountryMethod 
	public String getCountry(String capitalName) {
		Set<Entry<String,String>>  set = M1.entrySet();
		Iterator<Entry<String,String>> i =set.iterator();
		while(i.hasNext()) {
			Map.Entry<String,String> m=i.next();
			if(m.getValue().contentEquals(capitalName)) {
				return m.getKey();
			}
			
		}
		return null;
		
	}
	//method develop
	public HashMap<String,String> develop(){
		HashMap<String,String> M2= new HashMap<String,String>();
		Set<Entry<String,String>>s= M1.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String,String> m=i.next();
			M2.put(m.getValue(),m.getKey());
		}
		return M2;
	}
	//toArraylist method 
	public ArrayList<String>toArrayList(){
		ArrayList<String>ls=new ArrayList<>();
		Set<Entry<String,String>>s=M1.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String,String>m=i.next();
			ls.add(m.getKey());
		}
		return ls;
				
	}
}
//Main method
public class GLAssessment_08_08_2022 {

	public static void main(String[] args) {
		
country c= new country();
c.saveCountryCapital("India","Delhi");
c.saveCountryCapital("USA","Washington");
c.saveCountryCapital("Japan","Tokyo");
System.out.println(c.getCapital("India"));
System.out.println(c.getCountry("Tokyo"));
System.out.println(c.toArrayList());
HashMap<String,String> M2=c.develop();
System.out.println(M2);

	}

}


















**********************************This is a Tortoise Git .txt file*********************************