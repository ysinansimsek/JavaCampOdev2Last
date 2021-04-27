
public class CourseManager { //Bussines Nesnesi
	

public void addCourse(Course course) {
	System.out.println(course.name +"  isimli kurs basariyla eklendi.");
	
}
public void deleteCourse(Course course) {
	System.out.println(course.name + "  isimli kurs silindi.");
}

public void listCoursesName(Course[] courses) {
	
	System.out.println("Kurs Isimlerini Listele");
}
}
