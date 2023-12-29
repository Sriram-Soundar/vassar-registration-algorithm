import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    public class RequestLoaderTester {
        @Test
        public void testCorrectness(){
            CourseLoader cloader = new CourseLoader("Preregistration-Part1-starter/data/course_shortRequests.csv");
            StudentLoader sloader = new StudentLoader("Preregistration-Part1-starter/data/shortRoster.csv");
            RequestLoader rloader = new RequestLoader("Preregistration-Part1-starter/data/shortRequests.csv", sloader.getStudents(), cloader.getCourses());

            List<Student> studentRequests = rloader.mapStudentRequests();
            Student student = rloader.mapStudents.get(999248624);//first student on the file
            assertEquals(7, student.requests.size());
            //assertEquals(true, student.requests.contains(new Course("CMPU",145,51,"Foundations/Computer Science",1,24,"TRF",720,795,75,"1200PM-0115PM","SP 309","Gomerschdat Anna")));
        }
}
