import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Loads in student objects from a CSV
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentLoader extends DataLoader
{
    private List<Student> students = new ArrayList<>();

    //public Student
    /**
     * Constructor calls the load(file) method in abstract parent class.
     * 
     * @param file: the path to the file.
     */
    public StudentLoader(String file){
        load(file);
    }
    
    /**
     * Parse a single line of CSV in the form:
     * Name, idNum, gradYear, drawNumber
     * Hector Tran,999248624,2023,1
     * <p>
     * Method should create a new Student Object and add it to 
     * the students instance variable.
     * 
     * @param data: a single line from the csv file.
     */
    public void parseAndLoadLine(String data){
        //TODO
        Scanner scanner = new Scanner(data).useDelimiter(",");
        try{
            String name = scanner.next();
            int idNum = scanner.nextInt();
            int gradYear = scanner.nextInt();
            int drawNumber = scanner.nextInt();

            students.add(new Student(name, idNum, gradYear, drawNumber));
        }catch(Exception e){
            System.out.println("Found malformed data: "+ data);
            e.printStackTrace();
        }
    }
    
    /**
     * Easy getter method to return the completed student roster.
     * @return students: the roster in the form of a List<Student>
     */
    public List<Student> getStudents(){
        return students;
    }
    
}
