package samplearrays;
import java.util.Arrays;
import java.util.Comparator;
import samplearrays.Student;
public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {

        Student oldest=students[0];

        for(Student student:students){
            if(student.getAge()>oldest.getAge())oldest=student;
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count=0;
        for(Student student:students){
            if(student.getAge()>=18)count++;
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int sum=0;
        for(Student student:students) {
        sum+=student.getGrade();
        }
        return (double)sum/(double)Student.getNumStudent();
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student student:students){
            if(student.getName().equals(name))return student;
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students,(s1,s2)->Integer.compare(s2.getGrade(),s1.getGrade()));
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        System.out.println("The names of students whose grade is greater than 15 : ");
        for(Student student:students){
            if (student.getGrade()>=15) System.out.println(student);
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student student:students){
            if(student.getId()==id){
                student.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for(int i=0;i<Student.getNumStudent();i++){
            for(int j=i+1;j<Student.getNumStudent();j++){
                if(students[i].getName().equals(students[j].getName())) return true;
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] expandedStudents=Arrays.copyOf(students,students.length+1);
        expandedStudents[students.length]=newStudent;
        return expandedStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr=new Student[5];
        arr[0]=new Student(1,"nissrine",20,20);
        arr[1]=new Student(2,"mariam",19,17);
        arr[2]=new Student(3,"douaa",21,13);
        arr[3]=new Student(4,"mohamed",19,14);
        arr[4]=new Student(5,"sara",19,18);

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("The oldest : ");
        System.out.println(findOldest(arr));

        // 3) Count adults
        System.out.println("the number of adults : ");
        System.out.println(countAdults(arr));


        // 4) Average grade
        System.out.println("the average grade : ");
        System.out.println(averageGrade(arr));


        // 5) Find by name
        System.out.println("Searching for the student with name 'mohamed': "+findStudentByName(arr,"mohamed"));

        // 6) Sort by grade desc
        sortByGradeDesc(arr);
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        boolean updated=updateGrade(arr,4,12);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));
        // 9) Duplicate names
        System.out.println("It has duplicate names ? :"+ hasDuplicateNames(arr));

        // 10) Append new student
        Student[] updated_arr=appendStudent(arr,new Student(5,"sara",22,14));
        // Print all
        System.out.println("== All Students ==");
        for (Student s : updated_arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());
        System.out.println("It has duplicate names ? :"+ hasDuplicateNames(updated_arr));
    }
}

