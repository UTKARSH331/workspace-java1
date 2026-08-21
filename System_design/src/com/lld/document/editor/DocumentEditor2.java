package com.lld.document.editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor2 {
	private String renderDocument;
	private List<String> documentEditor;
	public DocumentEditor2() {
		documentEditor = new ArrayList<String>();
		renderDocument = " ";
	}
	public void addText(String txt) {
		documentEditor.add("hellow world");
	}
	public void addImage(String Img) {
		documentEditor.add("picture.jpg");
	} 
	public void saveToFile() {
		try {
			FileWriter writer = new FileWriter("doc1.txt");
			writer.write(renderDocument());
			writer.close();
			System.out.println("it is loaded successfully ");
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("error in file loading");
		}
	}
	public String renderDocument() {
		if(renderDocument.isEmpty()) {
			StringBuilder result = new StringBuilder();
			for(String elements : documentEditor) {
				if(elements.length() > 4 && (elements.endsWith(".jpg")) || (elements.endsWith(".png"))) {
					result.append("Image").append(elements).append(".\n");
				} else {
					result.append(elements).append(".\n");
				}
			}
			renderDocument = result.toString();
		}
		return renderDocument;
	}

}
class renderDocumentClient {
	public static void main (String args[]) {
		DocumentEditor2 e = new DocumentEditor2();
		System.out.println(e.renderDocument());
		e.saveToFile();
		
	}
}
