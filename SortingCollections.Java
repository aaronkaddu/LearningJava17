import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public static void main(String[ ] args) {
       
       ArrayList<String> students = new ArrayList<String>();
       
       students.add("Joel");
       students.add("Moses");
       students.add("Bright");
       students.add("Aaron");
       students.add("Mirembe");
       students.add("Grace");
       students.add("Netopher");
       
       Collections.sort(students);
       Collections.reverse(students);
       
       System.out.println(students);
    }
}
