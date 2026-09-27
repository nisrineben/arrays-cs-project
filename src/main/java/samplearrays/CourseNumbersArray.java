package samplearrays;
import java.util.Arrays;
public class CourseNumbersArray {
    public static int[] addCourse(int[] array,int course) {
        int[] updatedCourses = Arrays.copyOf(array,array.length+1);
        updatedCourses[array.length]=course;
        return updatedCourses;
    }
    public static void printCourses(int[] courses){
        System.out.println("The courses : ");
        for(int course : courses) {
            System.out.println(course);
         }
    }
    public static String checkACourse(int[] courses,int SpecialCourse){
        for(int course : courses) {
            if (course==SpecialCourse)return "The course "+SpecialCourse+" exist";
        }
        return "This course "+SpecialCourse+" don't exist";
    }

    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int[] updatedCourse=addCourse(registeredCourses,2222);
        printCourses(updatedCourse);
        System.out.println(checkACourse(updatedCourse,2222));
        System.out.println(checkACourse(updatedCourse,3000));
    }
}
