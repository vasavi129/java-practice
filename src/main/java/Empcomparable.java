import java.util.Arrays;

public class Empcomparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employeee[] emp=new Employeee[3];

emp[0]=new Employeee(158,"vasavi");
emp[1]=new Employeee(128,"vinod");
emp[2]=new Employeee(198,"reddy");

Arrays.sort(emp);
System.out.println(Arrays.toString(emp));
	}

}
