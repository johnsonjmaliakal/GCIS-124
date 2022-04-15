public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final String email;
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        if(this.id == other.id && this.name.equals(other.name))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int result = (int) Math.pow(name.hashCode(), id);
        return result;
    }
}
