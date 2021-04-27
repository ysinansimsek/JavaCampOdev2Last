
public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course(1,"C# Dersleri","Yazilimci Gelistirme Kampi");
		Course course2= new Course(1,"Java Dersleri","Yazilimci Gelistirme Kampi");
		Course course3= new Course(1,"Angular Dersleri","Yazilimci Gelistirme Kampi");
		Course [] courses = {course1,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		 for(Course course:courses) {
			 courseManager.addCourse(course); 
			
		 }
		 for(int i=0; i<courses.length;i++) {
			 courseManager.listCoursesName(courses);
		 }
	}
}
