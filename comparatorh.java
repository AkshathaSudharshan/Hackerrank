import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
class Sort implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        int cgpacompare = Double.compare(s1.getCgpa(), s2.getCgpa());
        int namecompare = s1.getFname().compareTo(s2.getFname());
        int idcompare = s2.getId()-s1.getId();
        if(s1.getCgpa()==s2.getCgpa())
        {
            if (s1.getFname().equals(s2.getFname()))
            {
                return idcompare;
            }
            return namecompare;
        }

        else
            return cgpacompare;
    }

}
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList,Collections.reverseOrder(new Sort()));
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



