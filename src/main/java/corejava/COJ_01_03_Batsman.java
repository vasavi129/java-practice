/*package corejava;
import java.text.DecimalFormat;

class Batsmann {
    private int id;
    private static int idGenerator=100000;
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getIdGenerator() {
		return ++idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Batsman.idGenerator = idGenerator;
	}

	public Batsmann() {
		id=++idGenerator;
	}

	public Batsmann(int idGenerator, String name, int runsScored, int centuries,
			int halfCenturies, int ballsFaced, int fours, int sixes) {
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	  this.id = ++idGenerator;
	}

	public float getStrikeRate() {
		return (runsScored * 100) / ballsFaced;
	}

	public int getRunsScoredInBoundaries() {
		return (this.fours * 4) + (this.sixes * 6);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

}

public class COJ_01_03_Batsman {

	public static void main(String[] args) {

		Batsman Batsman11 = new Batsman();
		Batsman11.setId(Batsman11.getIdGenerator());
		Batsman11.setName("Virak Kohli");
		Batsman11.setRunsScored(973);
		Batsman11.setCenturies(4);
		Batsman11.setHalfCenturies(7);
		Batsman11.setBallsFaced(640);
		Batsman11.setFours(83);
		Batsman11.setSixes(38);

		System.out.println("ID : " + Batsman11.getId());
		System.out.println("Name : " + Batsman11.getName());
		System.out.println("Runs Scored : " + Batsman11.getRunsScored());
		System.out.println("Balls Faced : " + Batsman11.getBallsFaced());
		System.out.println("Centuries : " + Batsman11.getCenturies());
		System.out.println("Half Centuries : " + Batsman11.getHalfCenturies());
		System.out.println("Fours : " + Batsman11.getFours());
		System.out.println("Sixes : " + Batsman11.getSixes());
		System.out.println("Strike Rate : " + Batsman11.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : "
				+ Batsman11.getRunsScoredInBoundaries());

		Batsman Batsman12 = new Batsman(Batsman.getIdGenerator(),"AB de Villers", 687, 1, 6, 407, 57, 37);
		System.out.println("ID : " + Batsman12.getId());
		System.out.println("Name : " + Batsman12.getName());
		System.out.println("Runs Scored : " + Batsman12.getRunsScored());
		System.out.println("Balls Faced : " + Batsman12.getBallsFaced());
		System.out.println("Centuries : " + Batsman12.getCenturies());
		System.out.println("Half Centuries : " + Batsman12.getHalfCenturies());
		System.out.println("Fours : " + Batsman12.getFours());
		System.out.println("Sixes : " + Batsman12.getSixes());
		System.out.println("Strike Rate : " + Batsman12.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : "+ Batsman12.getRunsScoredInBoundaries());

	}

}
*/