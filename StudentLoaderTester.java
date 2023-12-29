import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//Are these tests right?, File not found error 
public class StudentLoaderTester {

    @Test
    public void testCorrectness() {
        StudentLoader loader = new StudentLoader("Preregistration-Part1-starter/data/shortRoster.csv");

        List<Student> studentList = loader.getStudents();
        assertEquals(12, studentList.size());

        Student student = studentList.get(0);
        assertEquals("Hector Tran", student.name);
        assertEquals(999248624, student.idNum);
        assertEquals(2023, student.gradYear);
        assertEquals(1, student.drawNumber);
    }

    @Test
    //testing for incorrect file input
    public void testIncorrectness(){
        StudentLoader loader = new StudentLoader("Preregistration-Part1-starter/data/shortRequests.csv");
        List<Student> studentList = loader.getStudents();
        assertEquals(0, studentList.size());
    }
}
