import java.util.*;
import java.lang.Double;
public class Student {
    private int id;
    private String name;
    private double cgpa;
    Student(int id , String name,Double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
class Sort implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        int cgpacompare = Double.compare(s1.getCgpa(), s2.getCgpa());
        int namecompare = s1.getName().compareTo(s2.getName());
        int idcompare = s2.getId()-s1.getId();
        if(s1.getCgpa()==s2.getCgpa())
        {
            if (s1.getName().equals(s2.getName()))
            {
                return idcompare;
            }
            return namecompare;
        }

        else
            return cgpacompare;
    }

}
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(3,"John",9.52));
        arr.add(new Student(2,"John",9.52));
        arr.add(new Student(4,"Mary",9.98));
        arr.add(new Student(1,"Naina",8.69));
        Collections.sort(arr,Collections.reverseOrder(new Sort()));
        for (Student s:arr)
        {
            System.out.print(s.getName()+" "+s.getId()+" "+s.getCgpa());
            System.out.println();
        }

    }
}
