import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CourseLoaderTester {
    @Test
    public void testCorrectness() {
        CourseLoader loader = new CourseLoader("Preregistration-Part1-starter/data/course_shortRequests.csv");

        List<Course> courseList = loader.getCourses();
        Course course = courseList.get(0);
        assertEquals(101, courseList.size());
        assertEquals("AMST", course.dept);
        assertEquals(51, course.section);
        assertEquals("Visual Art and Storytelling", course.title);
        assertEquals(1, course.credits);
        assertEquals(17, course.maxEnrollment);
        assertEquals("WF", course.daysOfTheWeek);
        assertEquals(630, course.startTime);
        assertEquals(705, course.endTime);
        assertEquals(75, course.duration);
        assertEquals("1030AM-1145AM", course.timeString);
        assertEquals("1030AM-1145AM", course.timeString);
        assertEquals("T 328", course.loc);
        assertEquals("Collins Lisa", course.instructor);
    }

    @Test
    //testing for incorrect file input
    public void testIncorrectness(){
        CourseLoader loader = new CourseLoader("Preregistration-Part1-starter/data/shortRequests.csv");
        List<Course> courseList = loader.getCourses();
        assertEquals(0, courseList.size());
    }
}
