package com.Adapter;

interface IReports1{
	String getJsonData(String data);
}

class XMLDataProvider1{
	public String getXmldata(String data) {
		int sep = data.indexOf(':');
		String name = data.substring(0, sep);
		String Id = data.substring(sep + 1);
		return "<user>"
				+ name +"</name>"
				+ "<ID>" + Id + "</Id>" ;
	}
}
class XMLDataProviderAdapter1 implements IReports1{

	private XMLDataProvider1 xml;
	public XMLDataProviderAdapter1(XMLDataProvider1 xml) {
		super();
		this.xml = xml;
	}
	@Override
	public String getJsonData(String data) {
	       
	String x1 =	xml.getXmldata(data);
	int no = x1.indexOf("<user>") + 6;
	String firstname = x1.substring(no);
	String fullname = firstname;
	
	int firstId = x1.indexOf("<Id>") + 4;
	int lastId = x1.indexOf("</Id>");
	String fullId = x1.substring(firstId + lastId);
		
	return "{\"name\":\"" + fullname + "\", \"id\":" + fullId + "}"; 
	}
	
}
class Clients{

	public void getReports(IReports1 reports, String data) {
		System.out.println("data is processing in json : " + reports.getJsonData(data));
	}
	
}

public class Driver22 {

}
