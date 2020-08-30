
public class EqualsMethod {
	public static void main(String[] args) {
		
	
	
	String s = "vinod";
	String s1 = "vinod";
	String s2 = new String("vinod");
	 System.out.println(s==s2);//false
	 System.out.println(s.equals(s2));//true 

	boolean a = vinod.m1();

}
	 static class vinod {
		static boolean m1(){
		EqualsMethod e = new EqualsMethod();
		EqualsMethod e1 = new EqualsMethod();
		//Sysytem.out.println(jhbj);
		e=e1;
		System.out.println(e.equals(e1));
		return false;
		}
		
	}
}