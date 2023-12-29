import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class StudentTester {
    @Test
    public void testCompareTo(){
        Student student1 = new Student("Hector Tran",999248624,2023,1);
        Student student2 = new Student("Chace Sanford",999248625,2023,2);
        Student student3 = new Student("Aiden Zamora",999250874,2026,1);

        assertEquals(0, student1.compareTo(student1));
        assertEquals(-1, student1.compareTo(student2));
        assertEquals(1, student1.compareTo(student3));
    }
}
