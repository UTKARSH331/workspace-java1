package com.adapter.design.pattern.p3;

// target
interface IReports1{
	String getJsonData(String rawData);
}
// adaptee
class XMLDataProvider{
	//get data in "name:id" format (e.g. "Alice:42")
	String getXmlData(String rawdata) {
		int sep = rawdata.indexOf(":");
		String  name = rawdata.substring(0, sep);
		String id = rawdata.substring(sep+1);
		
		return "<user>"
		+ "<name>" + name + "</name>"
		+ "<id>" + id + "</id>"
		+"</name>";
		
	}
	
}
// adapter
class XMLDataProviderAdapter implements IReports1{

	
	private XMLDataProvider  xmlprov;
	
	public XMLDataProviderAdapter(XMLDataProvider xmlprov) {
		super();
		this.xmlprov = xmlprov;
	}

	@Override
	public String getJsonData(String rawData) {
		// TODO Auto-generated method stub
		 String xml = xmlprov.getXmlData(rawData);
		int  firstname = xml.indexOf("<name>") + 6;
		int lastname = xml.indexOf("</name>") ;
		String name = xml.substring(firstname, lastname);
		
		int firstId = xml.indexOf("<id>") + 4;
		int lastId = xml.indexOf("</id>");
		 
		String id = xml.substring(firstId, lastId);
		
		return  "{\"name\":\"" + name + "\", \"id\":" + id + "}";
	}
	
}
// client
class client1{
	public void  getReports(IReports1 reports, String rawdata) 
	{
	      System.out.println("Processed JSON: " + reports.getJsonData(rawdata));	
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		 XMLDataProvider x12 = new  XMLDataProvider();
		 
		 String data = "Alice:21";
		 IReports1 r11 = new XMLDataProviderAdapter(x12);
		 
		 client1 c11 = new client1();
		 
		 c11.getReports(r11, data);
		 
		 
	}

}
