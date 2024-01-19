package abstraction;
import java.util.Objects;

public class College implements Comparable
{
	String Cname;
	int id;
	
	College(String Cname,int id)
	{
		this.Cname = Cname;
		this.id=id;
	}
	public String toString()
	{
		return Cname+""+id;
	}
	public boolean equals(Object o)
	{
		College c =(College)o;
		return this.Cname.equals(c.Cname);
	}
	public int hashcode()
	{
		return Objects.hash(Cname,id);
	}
	public int compareTo(Object o)
	{
		College c =(College)o;
		return this.Cname.compareTo(c.Cname);
	}
}