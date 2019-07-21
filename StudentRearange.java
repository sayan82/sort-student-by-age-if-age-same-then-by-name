import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Student 
{ 
    int Age; 
    String name; 
    public Student(String name, int Age) 
    { 
        this.Age = Age; 
        this.name = name;
    } 
    public String toString() 
    { 
        return this.name + " " + this.Age; 
    }
public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
} 

  
class Sortbyroll implements Comparator<Student> 
{
	public int compare(Student b, Student a) 
	{ 
		int s1Age=a.getAge();
		int s2Age=b.getAge();
		if (s1Age != s2Age) 
		{
		return a.Age - b.Age;
		} else if (s1Age == s2Age) {
		return b.name.compareTo(a.name);
		} 
		else 
		{
		return 0;
		}
	}
} 
  

class StudentRearange 
{ 
    public static void main (String[] args) 
    { 
	int nos,a;
	String n;
	ArrayList<Student> ar = new ArrayList<Student>(); 

	Scanner s = new Scanner(System. in);
	nos=s.nextInt();
	for(int i=1;i<=nos;i++)
	{
		n=s.next();
		a=s.nextInt();
		ar.add(new Student(n,a)); 
	}
  
        Collections.sort(ar, new Sortbyroll()); 
		System.out.println("\n\n");
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 
} 