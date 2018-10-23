package service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Person;

@Service

public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService() {
		Person p = new Person();
		p.setFirstName("Vinay");
		p.setLastName("Jadhav");
		p.setAge(23);
		p.setId("1");
		persons.put("1", p);
		
		p = new Person();
		p.setFirstName("Vinay");
		p.setLastName("Jadhav");
		p.setAge(23);
		p.setId("2");
		persons.put("2", p);
	}
	
	public Person getPerson(String id) {
		if(persons.containsKey(1)) {
			return persons.get(id);
		}else {
			return null;
		}
	} 
	
	public  Hashtable<String, Person> getAll() {
		return persons;
	}
}
