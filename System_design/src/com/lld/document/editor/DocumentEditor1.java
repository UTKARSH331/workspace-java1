package com.lld.document.editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor1 {
	private String renderDocument;
	private List<String> documentElement;
    
	public DocumentEditor1() {
		renderDocument = " ";
		documentElement = new ArrayList<String>();
	}
	public void addText(String text) {
		documentElement.add(text);
	}
	public void addImage(String ImagePath) {
		documentElement.add(ImagePath);
	}
	public String renderDocument() {
		if(renderDocument.isEmpty()) {
			StringBuilder result = new StringBuilder();
			for(String ele : documentElement) {
				if(ele.length() > 4 && (ele.endsWith(".jpg")) || (ele.endsWith(".png"))) {
					result.append(".jpg").append(ele).append("\n");
				} else {
					result.append(ele).append(".\n");
				}
			}
			renderDocument = result.toString();
		}
		return renderDocument;
	}
	public void saveToFile() {
		try {
			FileWriter writer = new FileWriter("doc.txt");
			writer.write(renderDocument());
			writer.close();
			System.out.println("file is loaded successfully");
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("error in loading files");
		}
	}
}
class DocumentEditorClient{
	public static void main (String args[]) {
		DocumentEditor1 editor = new DocumentEditor1();
		editor.addImage("picture.jpg");
		editor.addText("hellow world");
		System.out.println(editor.renderDocument());
		editor.saveToFile();
		System.out.println();
		editor.addImage(null);
		editor.addText(null);
	}
}
