package com.lld.document.editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
	private List<String> documentElement;
	private String renderDocument;
	public DocumentEditor() {
		documentElement = new ArrayList<String>();
		renderDocument = " ";
	}
	public void addText(String Text) {
		documentElement.add(Text);
	}
	public void addImage(String imagePath) {
		documentElement.add(imagePath);
	}
	public String renderDocument() {
		if(renderDocument.isEmpty()) {
			StringBuilder result = new StringBuilder();
			for(String elements : documentElement) {
				if(elements.length() > 4 && (elements.endsWith(".jpg") || elements.endsWith(".png"))) {
					result.append("Image:").append(elements).append("]\n");
				} else {
					result.append(elements).append("\n");
				}
			}
			renderDocument = result.toString();
			
		}
		return renderDocument;
	}
	public void saveToFile() {
		try {
			FileWriter writer = new FileWriter("Document.Txt");
			writer.write(renderDocument());
			writer.close();
			System.out.println("Document saved to Document.Txt");
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("Error while opening");
			
		}
	}
}
 class DocumentClient{
	 public static void main(String args[]) {
		 DocumentEditor doc = new DocumentEditor();
		 doc.addImage("picture.jpg");
		 doc.addText("hello_world");
		 doc.addText("finally added");
		 System.out.println(doc.renderDocument());
		 doc.saveToFile();
	 }
	
}
