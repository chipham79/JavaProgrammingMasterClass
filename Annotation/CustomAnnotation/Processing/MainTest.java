package Annotation.CustomAnnotation.Processing;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class MainTest {
	
	public static void main(String[] args) {
		Class<SetCustomAnnotation> c = SetCustomAnnotation.class;
		readAnnotation(c);
	}
	
	private static void readAnnotation( AnnotatedElement element ) {
		try {
			System.out.println("Annotation element values: \n");
			if(element.isAnnotationPresent(TypeHeader.class)) {
				// getAnnotation returns Annotation type
				Annotation singleAnnotation = (Annotation) element.getAnnotation(TypeHeader.class);
				TypeHeader header = (TypeHeader) singleAnnotation;
				System.out.println("Developer: " + header.developer());
                System.out.println("Last Modified: " + header.lastModified());
                
                // teamMembers returned as String []
                System.out.print("Team members: ");
                for (String member : header.teamMembers()) {
                	System.out.print(member + ", " );
                }
                
                System.out.println("\nMeaning of Life: "+ header.meaningOfLife());
                    
			}
		}
		catch (Exception exception) {
            exception.printStackTrace();
		}
	}
}
	

