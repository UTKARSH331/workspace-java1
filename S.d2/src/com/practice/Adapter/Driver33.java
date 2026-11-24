package com.practice.Adapter;

interface IReports{
	String getJson(String data);
}

class ApateeReceiverandCinvertor implements IReports{

	private XMLDataProvider xmldataprovider;
	
	
	public ApateeReceiverandCinvertor(XMLDataProvider xmldataprovider) {
		super();
		this.xmldataprovider = xmldataprovider;
	}

	@Override
	public String getJson(String data) {
		// TODO Auto-generated method stub
		String xml = xmldataprovider.getXmldat(data);
		
		 int startName = xml.indexOf("<name>") + 6;
	        int endName   = xml.indexOf("</name>");
	        String name = xml.substring(startName, endName);
	        int startId = xml.indexOf("<id>") + 4;
	        int endId   = xml.indexOf("</id>");
	        String id    = xml.substring(startId, endId);
	        return "{\"name\":\"" + name + "\", \"id\":" + id + "}";
	}
	
}

class XMLDataProvider{
	// string data = Alice:42
	String getXmldat(String data) {
		int sep = data.indexOf(':');
		String name = data.substring(0, sep);
		String Id = data.substring(sep +1);
		
		return "<user>"
        + "<name>" + name + "</name>"
        + "<id>"   + Id   + "</id>"
        + "</user>";
	}
			
}
class Client {
    public void getReport(IReports report, String rawData) {
        System.out.println("Processed JSON: "
            + report.getJson(rawData));
    }
}

public class Driver33 {
	public static void main(String[] args) {
		String data = "Alice:42";
		XMLDataProvider x11 = new XMLDataProvider();
		//String datainxml = x11.getXmldat("Alice:42");
		IReports aa1 = new ApateeReceiverandCinvertor(x11);
		//System.out.println(aa1.getJson(datainxml));
	//	aa1.getJson(datainxml);
		Client c11 = new Client();
		c11.getReport(aa1, data);
		
	}

}
