import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.mockito.internal.invocation.MatcherApplicationStrategy;

import corejava.Envelope;

public class EscapeJSON {
	/**
	   * Escape the given string to be used as URL query value.
	   */
	  public String escapeString(String str) {
	    try {
	      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
	    } catch (UnsupportedEncodingException e) {
	      return str;
	    }
	  }
	  public static void main(String[] args) {
		EscapeJSON json = new EscapeJSON();
		Envelope env = new Envelope();
		env.setEnvelopeId(12324);
		env.setEnvelopeName("envName");
		//json.escapeString("");
	}
}
