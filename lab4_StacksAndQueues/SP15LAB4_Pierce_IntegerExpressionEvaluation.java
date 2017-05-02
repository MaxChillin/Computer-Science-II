package lab4_StacksAndQueues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SP15LAB4_Pierce_IntegerExpressionEvaluation {


	public static void main(String[] args){

		GenericStack_Pierce<Integer> intStack = new GenericStack_Pierce<Integer>();
		GenericStack_Pierce<Character> operatorStack = new GenericStack_Pierce<Character>();

		Scanner input;		

		int selection;
		int parenthesisOperationCounter = 0;
		String equation = "";
		String filePath = "";
		String tempIntString = "";
		String lastItemPushed = "";
		boolean parenthesis = false;

		//           4(3+2*1)+3(5-9/3)      3 - ( 3 - 1 + 15 ) * 1 + 2 

		while(true){
			input = new Scanner(System.in);	

			System.out.print("\n\tWhere Would You Like To Read From: " +
					"\n\t1: Keyboard" +
					"\n\t2: File" +
					"\n\t3: Exit" +
					"\n\tPlease Select An Input Option:  ");
			selection = input.nextInt();
			input.nextLine();


			if(selection == 1){
				System.out.print("\n\tPlease Enter a Math Equation:  ");			
				equation = input.nextLine();
				
				
			}

			if(selection == 2){
				System.out.print("\n\tPlease Enter the File Path:  ");//    C:\\Users\\Jeremy\\Desktop\\math.txt
				filePath = input.nextLine();
				File file = new File(filePath);
				try {
					input = new Scanner(file);
					while(input.hasNextLine()){
						equation = input.nextLine();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				input.close();
			}
			

			System.out.println("\tEntering char for loop");	
			for(char c : equation.toCharArray()){
				if(c == ' ') continue;				

				System.out.println("\tC = " + c);				

				if((c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')') && tempIntString != ""){
					intStack.push(Integer.parseInt(tempIntString));//***************************************************************
					lastItemPushed = tempIntString;
					System.out.println("\tThe value " + tempIntString + " was push onto the intStack");
					tempIntString = "";
				}

				switch(c){
				case '(':					
					if((operatorStack.isEmpty() && intStack.isEmpty()) || (lastItemPushed.equals("*") || lastItemPushed.equals("/") || lastItemPushed.equals("+") || lastItemPushed.equals("-"))){
						operatorStack.push(c);
						lastItemPushed = String.valueOf(c);
						parenthesis = true;					
						System.out.println("\t( was push onto the operatorStack");
						break;
					}					
					
					operatorStack.push('*');//***************************************************************
					System.out.println("\t* was push onto the operatorStack");					
					operatorStack.push(c);
					lastItemPushed = String.valueOf(c);
					parenthesis = true;					
					System.out.println("\t( was push onto the operatorStack");
					break;
									
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '0':					

					tempIntString += String.valueOf(c);
					break;

				case '+':
				case '-':
					if(intStack.isEmpty() && operatorStack.isEmpty()){
						intStack.push(0);// example of -3*8 and zero is pushed to create 0-3 for the -3
						operatorStack.push(c);//***************************************************************
						lastItemPushed = String.valueOf(c);
						System.out.println("\tThe value " + c + " was push onto the operatorStack");					
						break;
					}
					
					
					if(lastItemPushed.equals("*") || lastItemPushed.equals("/") || lastItemPushed.equals("(")){
						intStack.push(0);// example of 8*-3 and zero is pushed to create 0-3 for the -3
						operatorStack.push(c);//***************************************************************
						if(parenthesis) parenthesisOperationCounter++;
						lastItemPushed = String.valueOf(c);
						System.out.println("\tThe value " + c + " was push onto the operatorStack");					
						break;
					}
					
					
					if(!intStack.isEmpty() && !operatorStack.isEmpty()){
						if(!parenthesis) oneOperatorProcess(intStack, operatorStack);//Not in parenthesis
						
						
						if(parenthesis && parenthesisOperationCounter > 0){ // inside of parenthesis
							while(operatorStack.peek() != '('){
								oneOperatorProcess(intStack, operatorStack);
								parenthesisOperationCounter--;
							}
						}
					}

					if(parenthesis) parenthesisOperationCounter++;
					operatorStack.push(c);//***************************************************************
					lastItemPushed = String.valueOf(c);
					System.out.println("\tThe value " + c + " was push onto the operatorStack");					
					break;
					
				case '*':
				case '/':
					if(operatorStack.isEmpty()){						

					}
					else{
						if(operatorStack.peek() == '*' || operatorStack.peek() == '/'){
							if(!parenthesis) oneOperatorProcess(intStack, operatorStack);
							
							if(parenthesis && parenthesisOperationCounter > 0){ 
								oneOperatorProcess(intStack, operatorStack);
								parenthesisOperationCounter--;
							}
						}
					}
					
					if(parenthesis) parenthesisOperationCounter++;
					operatorStack.push(c);//***************************************************************
					lastItemPushed = String.valueOf(c);
					System.out.println("\tThe value " + c + " was push onto the operatorStack");
					break;

				case ')':
					while(operatorStack.peek() != null && intStack.peek() != null){
						if(operatorStack.peek() == '(') operatorStack.pop();

						oneOperatorProcess(intStack, operatorStack);
						parenthesisOperationCounter--;
					}					
					parenthesis = false;					
					break;

				}// End of switch

			}// End of for loop
			System.out.println("\tExiting the char for loop");

			if(tempIntString != ""){
				intStack.push(Integer.parseInt(tempIntString));//***************************************************************
				lastItemPushed = tempIntString;
				System.out.println("\tThe value " + tempIntString + " was push onto the intStack");
				tempIntString = "";
			}

			while(operatorStack.peek() != null){

				oneOperatorProcess(intStack, operatorStack);

			}// End of last while loop

			System.out.println("\tYour Total = " + intStack.pop());			

		}// End of while loop

	}// End of Main


	public static void oneOperatorProcess(GenericStack_Pierce intStack, GenericStack_Pierce charStack){
		int firstNum, secondNum;
		char mathOperator;
		int sum = 0;

		if(intStack.peek() != null && charStack.peek() != null){
			System.out.print("\tThe value stored in secondNum is: ");
			System.out.println(secondNum = (int) intStack.pop());
			System.out.print("\tThe value stored in firstNum is: ");
			System.out.println(firstNum = (int) intStack.pop());
			System.out.print("\tThe value stored in mathOperator is: ");
			System.out.println(mathOperator = (char) charStack.pop());

			switch(mathOperator){
			case '+':
				sum = firstNum + secondNum;
				break;
			case '-':
				sum = firstNum - secondNum;
				break;
			case '*':
				sum = firstNum * secondNum;
				break;
			case '/':
				sum = firstNum / secondNum;
				break;
			}// End of switch
			System.out.print("\tThe value push back onto the intStack is: ");
			System.out.println(sum);
			intStack.push(sum);

		}// End of if statement

	}// End of oneOperatorProcess method

}// End of class
