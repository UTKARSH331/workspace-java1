package com.Adapter;

interface IReports{
	String getJsonData(String Data);
}
class XMLDataProvider {
	public String getXMLData(String Data) {
		int sep = Data.indexOf(':');
		String Name = Data.substring(0,sep);
		String Id = Data.substring(sep + 1);
		
		return "<user >"
				+ "<name >" + Name + "</name>"
				+ "<Id>" + Id + "</Id>"
				+ "</user>";
 	}	
}
class XMLDataProviderAdapter implements IReports{
      private  XMLDataProvider x1;
      
	public XMLDataProviderAdapter(XMLDataProvider xmldata) {
		super();
		this.x1 = xmldata;
	}

	@Override
	public String getJsonData(String Data) {
		// TODO Auto-generated method stub
		String xml = x1.getXMLData(Data);
		int firstname = xml.indexOf("<name>") + 6;
		int lastname = xml.indexOf("</name>");
		String fullname = xml.substring(firstname, lastname);
		
		int firstId = xml.indexOf("<Id>") + 4;
		int lastId = xml.indexOf("</Id>");
		String fullId = xml.substring(lastId, lastId);
		
		return "name " + fullname + "Id" + fullId ;	
	}
}

class Client{
	public void getReport(IReports report, String Data) {
		System.out.println("proseesed json :  " + report.getJsonData(Data));
	}
}
public class Driver {

}
