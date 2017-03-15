package model;

import java.util.LinkedHashMap;
import java.util.Map;

/*This class is not in the UML diagramm since it is a kind of helper class*/
public class CourseCatalog {
	
	private Map<Integer, Object>catalog;
	//necessary for lambda expression sorting
	private Map<Integer, Object>buffer;
	public CourseCatalog(){
		catalog=new LinkedHashMap<>();
	}
	//add Courses with terms to courseCatalog
	public void addCourseWithTerms(int CourseName, Object courseShortNameWithTerms ){
		this.catalog.put(CourseName, courseShortNameWithTerms);
	}
	//print out courses with terms
	public void printAllEntries(){
		sort();
		for (Map.Entry<Integer, Object> entry : catalog.entrySet())
		{
			System.out.println(entry);
		}
	}
	//lambda expression to sort course catalg according to courseId
	public void sort(){
		buffer=new LinkedHashMap<>();
		this.catalog.entrySet().stream()
		.sorted(Map.Entry.<Integer, Object>comparingByKey())
		.forEach(x->buffer.put(x.getKey(), x.getValue()));
		catalog=buffer;
	}
	public void printNumCourses(){
		
		System.out.println(catalog.size());
	}
}
