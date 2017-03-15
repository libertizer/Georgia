package model;

public class Term {
	
	private int courseId;
	private TermEnum term;
	
	public Term(int CourseId, TermEnum Term) {
		this.courseId=CourseId;
		this.term=Term;
	}
	public int getCourseId(){
		return this.courseId;		
	}
	public void setCourseId(int CourseId){
		this.courseId=CourseId;		
	}
	public TermEnum getTerms(){
		return this.term;		
	}
	public void setTerms(TermEnum TermToSet){
		this.term=TermToSet;		
	}
}

