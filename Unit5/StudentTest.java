
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args){

        // creat five students
        Student s1 = new Student(1,"John","john@gmail.com");
        Student s2 = new Student(2,"Mike","mike@gmail.com");
        Student s3 = new Student(3,"Jane","jane@gmail.com");
        Student s4 = new Student(4,"Kate","kate@gmail.com");
        Student s5 = new Student(5,"Sara","sara@gmail.com");

        Set<Student> students = new HashSet<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("Testing HashSet");
        for(Student s: students){
            System.out.println(s);
        }

        System.out.println("--------------------------");

        Set<Student> students2 = new TreeSet<Student>();
        students2.add(s1);
        students2.add(s2);
        students2.add(s3);
        students2.add(s4);
        students2.add(s5);

        System.out.println("Testing TreeSet");
        for(Student s: students2){
            System.out.println(s);
        }

        System.out.println("--------------------------");
        Map<String,Student> mp = new HashMap<String,Student>();
        mp.put("John", s1);
        mp.put("Mike", s2);
        mp.put("Jane", s3);
        mp.put("Kate", s4);
        mp.put("Sara", s5);

        System.out.println("Testing HashMap");
        for(String s: mp.keySet()){
            System.out.println("key=" + s + ", value="+ mp.get(s));
        }

        System.out.println("--------------------------");
        Map<String,Student> mp2 = new TreeMap<String,Student>();
        mp2.put("John", s1);
        mp2.put("Mike", s2);
        mp2.put("Jane", s3);
        mp2.put("Kate", s4);
        mp2.put("Sara", s5);

        System.out.println("Testing TreeMap");
        for(String s: mp2.keySet()){
            System.out.println("key=" + s + ", value="+ mp.get(s));
        }
    }
}
