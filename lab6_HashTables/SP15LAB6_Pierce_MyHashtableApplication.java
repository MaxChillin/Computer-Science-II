package lab6_HashTables;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

import lab4_StacksAndQueues.Employee_Pierce;

public class SP15LAB6_Pierce_MyHashtableApplication {
    
    public static void main(String[]args){

    	String filePath = "E:/School/Programming/Lab 6/employeeList.txt";
        
        Hashtable<String, Employee_Pierce> myHashtable = new Hashtable<String, Employee_Pierce>();
        Employee_Pierce employee;
        String selection;
        Scanner input = new Scanner(System.in);
        
        final File file = new File(filePath);
       
        try{Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String temp = scanner.nextLine();
            String[] info = temp.split("-");            
            employee = new Employee_Pierce(info[2],info[1],info[0],info[3],(Double.valueOf(info[4])));
            myHashtable.put(employee.getEmployeeID(), employee);
        }
        } catch(FileNotFoundException fnfe){JOptionPane.showMessageDialog(null, "Text file not found.");}
        
        // This is to show all the elements in the hash table
        Enumeration keys = myHashtable.keys();
        while(keys.hasMoreElements()){
            System.out.println(myHashtable.get(keys.nextElement()));
        }
        
        
        // User Input Section
        do{
        	System.out.println("\n\t***************************************************"+
        					"\n\t1: Create A New Employee"+
        					"\n\t2: Continue");
        	System.out.print("\n\tPlease Make A Selection: ");
        	
        	selection = input.nextLine();
        	switch(selection){
        	case "1":
	        	System.out.print("\n\tPlease Enter Employee's ID: ");
	        	employee = new Employee_Pierce(input.nextLine());
	        	myHashtable.put(employee.getEmployeeID(), employee);
	        	break;
        	case "2":
        	break;
        	default:
        		System.out.println("\n\tInvalid Input");
        	}// End of switch
        }while(!selection.equals("2"));
        	
        
        
        
        // Fetch
        System.out.println(myHashtable.get("0012345"));
        
        // Update
        System.out.print("\n\tPlease Enter the ID of the Employee you would like to update:");
        employee = myHashtable.get(input.nextLine());
        System.out.print("\n\tPlease Enter the name of the new Department:");
        employee.setDepartment(input.nextLine());
        myHashtable.replace(employee.getEmployeeID(), employee);
        
        // Delete
        myHashtable.remove("0097765");
        
        // This is to show all the elements in the hash table
        keys = myHashtable.keys();
        while(keys.hasMoreElements()){
            System.out.println(myHashtable.get(keys.nextElement()));
        }
        
        // Write the info back onto the file        
        PrintWriter printWriter = makePrintWriter(file);
        keys = myHashtable.keys();
        while(keys.hasMoreElements()){
        	printWriter.println(myHashtable.get(keys.nextElement()).toFile());
        	
        }
        
        printWriter.close();
        
    }// End of Main
    
    private static PrintWriter makePrintWriter(File file){
    	PrintWriter printWriter = null;
    	try {
    		 printWriter = new PrintWriter(
    				new BufferedWriter(new FileWriter(file)));
    	} catch (IOException e) {
    		System.out.println("Could Not Write to File");
    		System.exit(0);			
    	}
    	return printWriter;
    }

}// End of class