package corejava;
class Batsman
{
	public String name;
	public int runScored;
	public int centuries;
	public int halCenturies;
	public int balsFaced;
	public int fours;
	public int sixes;
	public void setdata(String name, int runScored, int centuries,
			int halCenturies, int balsFaced, int fours, int sixes) 
	{
		this.name = name;
		this.runScored = runScored;
		this.centuries = centuries;
		this.halCenturies = halCenturies;
		this.balsFaced = balsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}
}
public class Tester {
	public static void main(String[] args) {
		Batsman bats = new Batsman();
		bats.setdata("vinod", 250,2, 4, 152, 25, 9);
		System.out.println(bats.name);
		System.out.println(bats.balsFaced);
	}
}
