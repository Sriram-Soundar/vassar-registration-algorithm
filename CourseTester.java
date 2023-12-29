import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class CourseTester {

    Course course1 = new Course("AMST", 160, 51, "Visual Art and Storytelling", 1, 17, "WF", 630, 705, 75, "1030AM-1145AM", "T 328", "Collins Lisa");
    Course course2 = new Course("CMPU", 145, 52, "Foundations/Computer Science", 1, 24, "TRF", 810, 885, 75, "0130PM-0245PM", "SP 309", "Hunsberger Luke");
    Course course3 = new Course("CMPU", 145, 51, "Foundations/Computer Science", 1, 24, "TRF", 720, 795, 75, "1200PM-0115PM", "SP 309", "Gomerschdat Anna");
    Course course4 = new Course("MATH", 127, 52, "Calculus IIB:Sequences &Series", 0.5, 35, "MWF", 630, 680, 50, "1030AM-1120AM", "RH 203", "Zhu Qiaofeng");
    Student student1 = new Student("Hector Tran",999248624,2023,1);

    @Test
    public void testCompareTo() {
        assertEquals(0, course1.compareTo(course1));
        assertEquals(1, course2.compareTo(course3));
        assertEquals(-1, course3.compareTo(course2));
    }

    @Test
    public void testConflictsWith() {
        assertEquals(true, course1.conflictsWith(course4));
        assertEquals(false, course3.conflictsWith(course4));
    }

    @Test
    public void testEquals(){
        assertEquals(true, course1.equals(course1));
        assertEquals(false, course1.equals(course2));
        assertEquals(false, course1.equals(student1));
    }
}
