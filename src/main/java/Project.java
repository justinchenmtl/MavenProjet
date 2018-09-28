
import java.io.FileReader;
import java.io.IOException;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;


/**
 *
 * @author justi
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String JsonStudent = FileReader.loadFileIntoString("student.json", "UTF-8");
        JSONObject student = JSONObject.fromObject(JsonStudent);
        int id= student.getInt("student_id");
        String fName=student.getString("first_name");
        String dob=student.getString("date_birth");
        boolean active=student.getBoolean("active");
        double gpa=student.getDouble("GPA");
        System.out.println(id + " - " + fName + " - "
                          + lName+ " - " +dob+ " - " +gpa);
        JSONArray listCourses=student.getJSONArray("results");
        JSONObject singleCourse;
        String title, cid;
        double mark;
            for (int i = 0; i < listCourses.size(); i++) {
                 singleCourse = listCourses.getJSONObject(i);
                 cid=singleCourse.getString("course_id");
                 title=singleCourse.getString("course_title");
                 mark=singleCourse.getDouble("mark");
                 System.out.println("\t" + cid + ", " + title + ", " + mark + ".");
            }

    }
    
}

