package corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEnvelopeExample {
	
       public  List<Envelope> envelopeDetails(){
    	   
    	   Envelope envelope=new Envelope();
    	   envelope.setEnvelopeId(101);
    	   envelope.setEnvelopeName("vasavi");
    	   envelope.setCreatedAt("7-11-2019");
    	   envelope.setModifiedAt("9-11-2019");
    	   
    	   
    	   
    	   Envelope envelope1=new Envelope();
    	   envelope1.setEnvelopeId(102);
    	   envelope1.setEnvelopeName("vinod");
    	   
    	   Envelope envelope3=new Envelope(103,"suguna","7-11-2019","8-11-2019");
    	   Envelope envelope4=new Envelope(103,"suguna","7-11-2019","8-11-2019");


    	   
    	   

    	   List<Envelope> list=new ArrayList<Envelope>();
    	   list.add(envelope);
    	   list.add(envelope1);
    	   list.add(envelope3);
    	   list.add(envelope4);
    	   list.remove(2);
    	   

    	   
    	   Set<Envelope> set=new HashSet<Envelope>();// or  Set<Envelope> set=new HashSet<Envelope>(set);
    	   set.addAll(list);
    	   System.out.println(set);
		return list;
        	 
         }
       public static void main(String[] args) {
    	   ListEnvelopeExample listEnvelopeExample=new ListEnvelopeExample();
    	   List<Envelope> envelopedetails = listEnvelopeExample.envelopeDetails();
    	   System.out.println(envelopedetails.getClass());
    	  // System.out.println(envelopedetails);
    	   
	}

}
