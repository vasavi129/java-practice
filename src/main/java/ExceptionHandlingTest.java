import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingTest {
	public static void main(String[] args) throws MyCustomException {
		File file = new File("file.text");
		try {
			FileReader fileRe = new FileReader(file);
			//database connection
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				throw new MyCustomException("file not exist in specified location");
		}
		catch (Exception e) {
			throw new MyCustomException("could not establish the database connection");
			
		}
		
	}
}
