package corejava;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public  class Functions
{

	public static String hitUrl(String urlToHit, String param)
    	{
        	try
        	{
                URL url = new URL(urlToHit);
                HttpURLConnection http = (HttpURLConnection)url.openConnection();
                http.setDoOutput(true);
                http.setDoInput(true);
                http.setRequestMethod("POST");

                DataOutputStream wr = new DataOutputStream(http.getOutputStream());
                wr.writeBytes(param);
                // use wr.write(param.getBytes("UTF-8")); for unicode message's instead of wr.writeBytes(param);

                wr.flush();
                wr.close();
                http.disconnect();


                BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
                String inputLine;
                if ((inputLine = in.readLine()) != null)
                {
                        in.close();
                        return inputLine;
                }
                else
                {
                        in.close();
                        return "-1";
                }

            }
            catch(Exception e)
            {
                System.out.println("Exception Caught..!!!");
                e.printStackTrace();
                return "-2";
            }
        }
}