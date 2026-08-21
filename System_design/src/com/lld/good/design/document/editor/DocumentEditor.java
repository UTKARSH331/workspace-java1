package com.lld.good.design.document.editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface DocumentEditor {
	public abstract String render();
}
class TextElements implements DocumentEditor{
	private String text;
	public TextElements (String text) {
		this.text = text;
	}
	@Override
	public String render() {
		// TODO Auto-generated method stub
		return text;
	}
	
}
class ImageElements implements DocumentEditor{
	private String ImagePath;
	public ImageElements (String imagePath) {
		this.ImagePath = ImagePath;
	}
	@Override
	public String render() {
		return ImagePath;
	}
}
class NewLine implements DocumentEditor{
	public String render() {
		return "\n";
	}
}
class OutLine implements DocumentEditor{

	@Override
	public String render() {
		// TODO Auto-generated method stub
		return "\t";
	}
}
class Document{
	private List<DocumentEditor> documentelements  = new ArrayList<DocumentEditor>();
	public void addElements(DocumentEditor elements) {
		documentelements.add(elements);
	}
	public String render() {
		StringBuilder result= new StringBuilder();
		for(DocumentEditor  ele : documentelements) {
			result.append(ele.render());
		}
		return result.toString();
	}
}
interface persistance{
	void save (String data);
}
class FileToStorage implements persistance{

	@Override
	public void save(String data) {
		try {
			FileWriter writer = new FileWriter("Docs.txt");
			writer.write(data);
			writer.close();
			System.out.println("file is loaded successfully");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("file is not successfully loaded");
		}
		// TODO Auto-generated method stub
	}
}

class DocumentEditor12{
	private Document doc;
	private persistance storage;
	private  String renderDocument = " ";
	public  DocumentEditor12(Document doc, persistance storage) {
		this.doc = doc;
		this.storage = storage;
	}
	public void addText(String text) {
		doc.addElements(new TextElements(text));
	}
	public void addImage(String imagePath) {
		doc.addElements(new ImageElements(imagePath));
	}
	public void addNewLine() {
		doc.addElements(new NewLine());
	}
	public void addOutLine() {
		doc.addElements(new OutLine());
	}
	public String renderDocument() {
		if(renderDocument.isEmpty()) {
			renderDocument = doc.render();
		}
		return renderDocument;
	}
	public void saveDocument() {
		storage.save(renderDocument());
	}
}
class DocumentEditorClient{
	public static void main(String args[]) {
		Document doc1 = new Document();
		persistance persist = new FileToStorage();
		DocumentEditor12 editor = new DocumentEditor12(doc1, persist);
		editor.addText("hello world");
		editor.addNewLine();
		editor.addText("2nd part of hello worl");
		editor.addNewLine();
		editor.addOutLine();
		editor.addText("3rd part of the world");
		editor.addImage("picture.jpg");
		System.out.println(editor.renderDocument());
		editor.saveDocument();
		
		
	}
}

