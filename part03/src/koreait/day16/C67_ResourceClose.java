package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class C67_ResourceClose {
 public static void main(String[] args) {
	 
	// String filename = "C:\\Iclass05\\�ڹ��½�Ʈ.txt";
	// String filename = "C:\\Iclass05\\�ڹ��½�Ʈ.txt2"; file DNE
	// String filename = "C:\\Iclass05\\�ڹ��½�Ʈ.txt";
	// String filename2 = "C:\\Iclass05\\�ڹ��½�Ʈ3.txt";
	 
	 String filenme = fileDiallogOpen();
	 String filenme2 = fileDiallogSave();
	 
		
	 File ifile = new File(filenme);
	 File ofile = new File(filenme2);
	 
	try ( 
		 Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)){

		 while(sc.hasNext()) {
			 String temp = sc.nextLine(); //read one line from file 
			 System.out.println(temp);    //def read(console)
			 pw.println(temp);            //file write 
		 }
		 
	 System.out.println("copy file done");}
	 
	 catch (FileNotFoundException e) {
		System.out.println("user err : " + e.getMessage());
		System.out.println("the file does not exist");
		//e.printStackTrace();
	}catch (Exception e) {
		System.out.println("err aside from FNF : " + e.getMessage());
	}
		
	}
 public static String fileDiallogOpen() {
	// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
	// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
	// Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
			
			JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
			FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
			fdr.setVisible(true);		//���� ��ȭ���� ���̱�
			
			String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
			File file = new File(filename);
			System.out.println("size : " + file.length() + "bite");
			System.out.println("������ ��ο� ���� : " + filename);
			System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
			
			
			FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
			fdw.setVisible(true);
			System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());
			
			return filename;

}
 public static String fileDiallogSave() {
	 JFrame f = new JFrame();
	 FileDialog fdw = new FileDialog(f,"���� ����",FileDialog.LOAD);	
	 fdw.setVisible(true);	
		String filename = fdw.getDirectory() + fdw.getFile(); 	//������ ������ ��ο� ���ϸ� ����
		System.out.println("saved ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());
		return filename;
		
		
		
 }
 }

