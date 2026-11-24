package com.Adapter;

interface IReports{
	String getJsonData(String data);
}
class XMLProvider{
	public String getXMLDATA(String rawdata) {
	int sep = rawdata.indexOf(':');
	String firstname = rawdata.substring(0, sep);
	String Id = rawdata.substring(sep +1);
	 return "<user>"
     + "<name>" + firstname + "</name>"
     + "<id>"   + Id   + "</id>"
     + "</user>";
	}
}
class XMLProviderAdapter implements IReports{
	private XMLProvider xml;

	public XMLProviderAdapter(XMLProvider xml) {
		super();
		this.xml = xml;
	}

	@Override
	public String getJsonData(String data) {
	  String x1 = xml.getXMLDATA(data);
	  int firstName = x1.indexOf("<name>") + 6;
	  int lastName = x1.indexOf("</name>");
	  String fullname = x1.substring(firstName, lastName);
	  
	  int firstId = x1.indexOf("<id>") + 4;
	  int lastId = x1.indexOf("</id>");
	  String fullId = x1.substring(firstId, lastId);
	  return "{\"name\":\"" + fullname + "\", \"id\":" + fullId + "}";
	}	
}
class Client {
	public void getReports(IReports report, String data) {
		System.out.println("operation successfull : " + report.getJsonData(data));
	}
}
public class Driver1 {

}
