package Annotation.CustomAnnotation;

@CustomAnnotation(name = "John Adam", age = 24, langauge = {"Java", "Python", "C++"})
public class TestCustomAnnatation {
	
	@CustomAnnotation
	private String name;
	private String langauge;
	private int age;
	
	

	@CustomAnnotation
	public void defaultLanguage() {
		System.out.println(this.langauge);

	}


	public void customeName(@CustomAnnotation String name) {
		
	}
	

}
