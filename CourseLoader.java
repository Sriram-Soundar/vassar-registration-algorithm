import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads in a csv file from askbanner of courses and turns them into a List of Course objects. *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CourseLoader extends DataLoader
{
    private List<Course> courses = new ArrayList<Course>();

    /**
     * Constructor calls the load(file) method in abstract parent class.
     * 
     * @param file: the path to the file.
     */
    CourseLoader(String file){
        load(file);
    }

    /**
     * Parse a single line of CSV in the form:
     * dept, courseNum, section, name, credits, maxEnrol, days, startTime, EndTime, Duration, String time, room, professor
     * CMPU,145,51,Foundations/Computer Science,1,24,TRF,720,795,75,1200PM-0115PM,SP 309,Gomerschdat Anna
     * <p>
     * Method should create a new Course Object and add it to 
     * the students instance variable.
     * 
     * @param data: a single line from the csv file.
     */
    public void parseAndLoadLine(String data){
        //TODO
        Scanner scanner = new Scanner(data).useDelimiter(",");
        try{
            String dept = scanner.next();
            int courseNum = scanner.nextInt();
            int section = scanner.nextInt();
            String title = scanner.next();
            double credits = scanner.nextDouble();
            int maxEnrol = scanner.nextInt();
            String days = scanner.next();
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            int duration = scanner.nextInt();
            String time = scanner.next();
            String room = scanner.next();
            String professor = scanner.next();

            courses.add(new Course(dept, courseNum, section, title, credits, maxEnrol, days, startTime, endTime, duration, time, room, professor));

        }catch(Exception e){
            System.out.println("Found malformed data: "+ data);
            e.printStackTrace();
        }
    }

    /**
     * Easy getter method to return the completed student roster.
     * @return students: the roster in the form of a List<Course>
     */
    public List<Course> getCourses(){
        return courses;
    }
}
