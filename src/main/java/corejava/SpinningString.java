package corejava;
public class SpinningString {

	public static void  main(String[] arg) {
		System.out.println(SpinningString.rotate("talent", 1));
		System.out.println(SpinningString.rotate("talent", 2));
		System.out.println(SpinningString.rotate("talent", 3));
		System.out.println(SpinningString.rotate("abc", 1));
		System.out.println(SpinningString.rotate("abc", 2));
		System.out.println(SpinningString.rotate("abc", 3));
	}

	public static String rotate(String str, int no_of_positions) {
		if(str==null){
			return null;
		}if("".equals(str)){
			return null;
		}
		else{
		char[] oldChar = str.toCharArray();
		 
		 String s="";
		    char[] newChar = new char[oldChar.length];
		    newChar[0] = oldChar[oldChar.length-1];
		    for(int i = no_of_positions; i < oldChar.length; i++){
		        newChar[i] = oldChar[i-no_of_positions];
		    }
		    s = String.valueOf(newChar);
		return s;
		}
		
	}
}