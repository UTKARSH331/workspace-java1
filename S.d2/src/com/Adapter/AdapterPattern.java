package com.Adapter;

interface IReports{
	String getJsonData (String Data);
}

class XMLDataProvider{
	String getXMLData(String data) {
		int sep = data.indexOf(':');
	    String name = data.substring(0,sep);
	    String id = data.substring(sep + 1);
	    return "<user>"
	    		+ "<name>" + name + "</name>"
	    		+ "<id>"   + id   + "</id>"
	    		+"</user>";
	}
}

class XMLDataProviderAdapter implements IReports{
	private XMLDataProvider provider;
	public XMLDataProviderAdapter(XMLDataProvider provider) {
		this.provider = provider;
	}
	@Override
	public String getJsonData(String Data) {
		// TODO Auto-generated method stub
		String xml = provider.getXMLData(Data);
		int startName = xml.indexOf("<name>") + 6;
		int endName = xml.indexOf("</name>");
		String name = xml.substring(startName, endName);
		
		int startId = xml.indexOf("<id>") + 4;
		int endId = xml.indexOf("</id>");
		String Id = xml.substring(startId, endId);
		return "{\"name\":\"" + name + "\", \"id\":" + Id + "}";
	}
}
class Client{
	public void getReports (IReports report, String Data){
		System.out.println("Processed JSON: " + report.getJsonData(Data));
	}
}

public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
