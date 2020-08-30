package corejava;

public class DupAndUniqueValues {
	public static void main(String[] args) {

		String str = "hi my name is vinod kumaar reddy";
		String strng = str.replace( " ", "");
		System.out.println(strng);
		StringBuffer str1 = new StringBuffer("");
		//str1.append("");
		StringBuffer str2 = new StringBuffer("");
		//str2.append("");
		//int n = str.length() - 1;
		char[] chars = strng.toCharArray();
		for (int j = 0; j < chars.length; j++) {
			int count = 0;
			char c = chars[j];
			//String s=strng.charAt(j);
			//String s = Character.toString(c);
			String s = String.valueOf(c);
			//if (str1.indexOf(c+"") == -1 && (str2.indexOf(c+"") == -1)) {
			if (str1.indexOf(s) == -1 && (str2.indexOf(s) == -1)) {
				for (int k = 0; k < chars.length; k++) {
					// System.out.println(chars[j]);
					if (c == chars[k]) {
						count++;
						//break;
					}
				}
				// System.out.println(count);
				if (count == 1) {
					str1.append(s);
					// System.out.println(chars[j]);
				} else
					str2.append(s);
			}
		}
		System.out.println("duplicates are -->" + "  " + str2.toString() + "  ");
		System.out.println("unique are--> " + str1.toString());
		System.out.println(str1);
		String s = str1.toString();
		System.out.println(s.toUpperCase());
		str1.delete(0, str1.length());
		for(char c ='A'; c<='z';c++){
			String ss = String.valueOf(c);
			if(s.contains(ss)){
			str1.append(ss);}
			
		}System.out.println(str1);
	}
}
