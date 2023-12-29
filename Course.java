/**
 * A course object.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course implements Comparable<Course> {
    String dept;
    int courseNum;
    int section;
    String title;
    double credits;
    int maxEnrollment;
    String daysOfTheWeek;
    int startTime;
    int endTime;
    int duration;
    String timeString;
    String loc;
    String instructor;

    /**
     * Constructor takes in all values from the CSV.
     */
    public Course(String dept, int courseNum, int section, String title, double credits, int maxEnrollment, String daysOfTheWeek, int startTime,int endTime,int duration,String timeString, String loc, String instructor){
        //AFRS,100,51,Intro to Africana Studies,1,20,TR,810,885,75,0130PM-0245PM,BH 305,"Harriford, Diane"
        this.dept = dept;
        this.courseNum = courseNum;
        this.section = section;
        this.title = title;
        this.credits = credits;
        this.maxEnrollment = maxEnrollment;
        this.daysOfTheWeek = daysOfTheWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.timeString = timeString;
        this.loc = loc;
        this.instructor = instructor;
    }

    /**
     * Key is a string representation of department-courseNumber-section.
     * Example: CMPU-102-51
     */
    public String getKey(){
        return dept + "-" + courseNum + "-" + section;
    }


    /**
     * Returns true if key is the same.  (Department, Course Number, and Section).
     * 
     */
    @Override
    public boolean equals(Object o){
        //TODO
        if(!(o instanceof Course)){
            return false;
        }
        Course ocourse = (Course) o;
        return this.getKey().equals(ocourse.getKey());
    }

    /**
     * String representation as it might appear on askBanner.
     */
    public String toString(){
        return getKey() + " " + title + "\t" + credits + "\t" + daysOfTheWeek + " " + timeString;
    }

    /**
     * Should sort classes by department, then course number, then section. (just like
     * askBanner)
     */
    public int compareTo(Course o){
        //TODO
        int deptCompare = this.dept.compareTo(o.dept);
        if(deptCompare != 0){
            return deptCompare;
        }
        int courseNumCompare = Integer.compare(this.courseNum, o.courseNum);
        if(courseNumCompare != 0){
            return courseNum;
        }
        return Integer.compare(this.section, o.section);
    }

    /**
     * Useful for cases in which the daysOfTheWeek strings are not identical but there is still overlap(ex. MWF and WF)
     * @return true if ANY days overlap.
     */
    public boolean daysConflict(String days1, String days2){
        char[] days1array = days1.toCharArray();
        for(int i = 0; i < days1array.length; i++){
            char day = days1array[i];
            if((days2.indexOf(day) != -1)){ //checks if the character day is in the days2 string, if it is the method will return true.
                return true;
            }
        }
        return false;
    }

    /**
     * a method that checks times and days to determine whether they overlap.
     */
    public boolean conflictsWith(Course maybe){
        //TODO
        if(!daysConflict(this.daysOfTheWeek, maybe.daysOfTheWeek)){
            return false;
        } else if (this.startTime <= maybe.startTime && this.endTime >= maybe.startTime) {
            return true;
        }
        return false;
    }
}
