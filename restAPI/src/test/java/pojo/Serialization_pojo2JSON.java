package pojo;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.xml.XmlSerializer;

public class Serialization_pojo2JSON {
	
	//#juneau-marshall API
	
	public static void main(String[] args) {
		



   
   JsonSerializer js =	JsonSerializer.DEFAULT_READABLE;
	String sellerNames[] = {"Neon Enterprise", "ABC Software", "XYZ IT solutions"};
	Product product = new Product("MAcbookPro", 1000, "White", sellerNames);
   
  String json= js.serialize(product);
  
  System.out.println(json);
  
  XmlSerializer xs= XmlSerializer.DEFAULT_NS_SQ_READABLE;
  String xml=xs.serialize(product);
  
  System.out.println(xml);
  
  HtmlSerializer hm = HtmlSerializer.DEFAULT_SQ_READABLE;
  String html=hm.serialize(product);
  
  System.out.println(html);
  
   
	}
   
   
	
	

}
