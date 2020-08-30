
public class Context {

	public String getmyname(String myname) throws InvalidInputException {
		if( myname == null || "".equalsIgnoreCase(myname.trim())){
			throw new InvalidInputException("provide proper input Details");
		}
		else if("vinod".equalsIgnoreCase(myname) || "anji".equalsIgnoreCase(myname)){
			return myname;
		}
		else{
			throw new InvalidInputException("provide proper input Details");
		}
		
	}

}
