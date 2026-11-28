package com.adapter.design.pattern.p3;

import com.builder.design.pattern.p3.main;
// target
interface IReports{
	String getJsonData(String rawdata);
}
// adaptee
class XMLProvider{
	//Alice:24
	String getXmlData(String data) {
		int sep = data.indexOf(":");
		String name = data.substring(0, sep);
		String id = data.substring( sep + 1);
		
		return "<user>" +
		        "<name>" + name + "</name>"+
		         "<id> " + id + "</id>" +
		        "</user>";
	}
}
// adapter
class XMLProviderAdapter implements IReports{
	private XMLProvider xmlprov;

	public XMLProviderAdapter(XMLProvider xmlprov) {
		super();
		this.xmlprov = xmlprov;
	}

	@Override
	public String getJsonData(String rawdata) {
		// TODO Auto-generated method stub
		String xml = xmlprov.getXmlData(rawdata);
		
		int firstname = xml.indexOf("<name>") + 6;
		int lastname = xml.indexOf("</name>");
		String fullname = xml.substring(firstname, lastname);
		
		int firstId = xml.indexOf("<id>") + 4;
		int lastId = xml.indexOf("</id>");
		String fullId = xml.substring(firstId, lastId);
		
		return "name : " + fullname + "id : " + fullId ;
		
	}
	
}
// client
class client{
	
	void getFullFurnishedJsonData(IReports reports, String rawdata) {
		System.out.println("complete json data : " + reports.getJsonData(rawdata));
	}
	
}
public class Main1 {
	
	public static void main(String[] args) {
		 XMLProvider x1 = new XMLProvider();
		 
		 client c1 = new client();
		     
		 String data = "Alice:24";
		 
		 XMLProviderAdapter xmlA = new XMLProviderAdapter(x1);
		 
		 c1.getFullFurnishedJsonData(xmlA, data);
		 
		 
		
		
	}

}
