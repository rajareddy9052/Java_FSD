package com.simplilearn.projects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Filehandling {
	private static final String MAIN_MENU_PROMPT ="\nMAIN MENU - Select any one of the following: \n"+ 
			"1 -> create a file\n"+ 
            "2 -> read the data\n"+ 
			"3 -> write data to the file\n"+
            "4 -> Append data to the file\n"+
            "5 -> Exit Program"; 
	void showPrimaryMenu() { 
        System.out.println(MAIN_MENU_PROMPT);  	       
        try(Scanner scanner = new Scanner(System.in)){ 
        	int option = scanner.nextInt();  	           
        	switch (option){  	                
        	case 1 : {  
        		FileOutputStream out=new FileOutputStream("D:\\raja\\newfile.txt");
        		String data="Welcome to Java FSD\n";
        		out.write(data.getBytes());
        		out.close();
        		System.out.println("file created");
        		showPrimaryMenu();
        		break;
        		
                }  	                
        	case 2 : { 
        		File file = new File("D:\\raja\\newfile.txt");
        	        @SuppressWarnings("resource")
					BufferedReader br = new BufferedReader(new FileReader(file));
        	        String st;
        	        while ((st = br.readLine()) != null)
        	            System.out.println(st);
        	        showPrimaryMenu();
        	        break;
                }  	                
        	case 3 : { 
        		String text= "Welcome to the world of JAVA File handling\n";
        		Path fileName = Path.of("D:\\raja\\newfile.txt");
        		Files.writeString(fileName, text);
        		String file_content = Files.readString(fileName);
        		System.out.println(file_content);
        		System.out.println("data added to the file");
        		showPrimaryMenu();
        		break;
                } 
        	case 4 : {  	                    
        		String filename= "D:\\raja\\newfile.txt";
        	    FileWriter fw = new FileWriter(filename,true); 
        	    fw.write("Append text to an existing file\n");
        	    fw.close();
        	    System.out.println("data is added");
        	    showPrimaryMenu();
        	    break;
            	}  
        	case 5 : { 
        		System.out.println("exit"); 
                System.exit(0);
                
            }  	  
        	
                default: showPrimaryMenu(); 
            } 
        } 
        catch (Exception e){ 
            showPrimaryMenu(); 
        } 
    } 
	 public static void main(String[] args) {  	        
	     //System.out.println(MAIN_MENU_PROMPT);   	       
		 Filehandling menu = new  Filehandling();  	        
	    	menu.showPrimaryMenu(); 
	    } 

}
