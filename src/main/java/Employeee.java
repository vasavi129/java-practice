
public class Employeee  implements Comparable<Employeee>	{
	private  int id;
	private String name;

	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int compareTo(Employeee emp) {
		// TODO Auto-generated method stub
		return (this.id-emp.id);
	}


	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + "]";
	}

	

}
