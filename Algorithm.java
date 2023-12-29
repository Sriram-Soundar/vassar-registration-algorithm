import java.util.*;

/**
 * This will hold all the logic for our preregistration algorithm.  To be done in Part 2.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithm
{
    

    public Algorithm(List<Student> mapStudents,  HashMap<Course,Integer> enrollment){

    }


    public void run(){
        // TODO
        // You may use whatever helper methods and data structures you think would be
        // appropriate.
        
        /* Description of the algorithm from the Registrar's website:
         * 
         * Entry into a section is determined by the combination of your class year, the priority you give each section, and your draw number.
         * Seniors� requests are processed first followed sequentially by juniors�, sophomores�, and first-years requests.
         * Your requests are considered in the order that you list them on the registration screen, with the first item having the highest priority. If one of your requests cannot be filled, then the next item in your list will be considered instead.
         * For your class year, your draw number determines when one of your requests is considered. Your top request is considered immediately after the top requests of all of the students in your class with lower draw numbers. As mentioned above, if your top request cannot be granted you will be enrolled in the first request on your list that can be.
         * 
         * In a second pass through the requests from your class, your top request among your remaining requests will be considered immediately before all of the students in your class with lower draw numbers. That is, the draw numbers work in reverse compared to the first pass. The remaining passes through the requests from your class continue the pattern of the first two passes, switching direction through the draw numbers on each pass.
         * You may list multiple sections of the same course among your requests but you will be enrolled only in the first one on your list that is available. You will not be enrolled in multiple sections of the same course.
         * You may also list sections of different courses that meet at the same time but you will be enrolled only in the first one on your list that is available. You will not be enrolled in sections with time conflicts.
         * 
         */

    }

   
    public void printEnrollment(){
        //TODO
        //Print the toString of the student, followed by their schedule (using course toString).
        /*
         * Hector Tran 2023 1
         * CMPU-145-51 Foundations/Computer Science	1.0	TRF 1200PM-0115PM
         * EDUC-361-51 Sem: Math/Science/Elem Classrm	1.0	R 0310PM-0610PM
         * ECON-235-51 Sports Economics	1.0	TR 1030AM-1145AM
         * PHED-105-51 Foundations of Wellness	0.5	TR 0900AM-1015AM
         * --------------------
         * Chace Sanford 2023 2
         * GNCS-355-51 Childhood/Childrn 19C Britain	1.0	R 0310PM-0510PM
         * ART-318-51 Building the Museum	1.0	T 0100PM-0300PM
         * CHEM-352-51 Phys Chem-Molec Structr	1.0	MW 1030AM-1145AM
         * INTL-109-51 A Lexicon of Forced Migration	1.0	TR 1030AM-1145AM
         * --------------------
         * etc...
         */
    }
}
