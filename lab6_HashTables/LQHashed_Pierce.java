package lab6_HashTables;

import lab4_StacksAndQueues.Employee_Pierce;

public class LQHashed_Pierce {
	
	int N;
	int n = 0;
	int defaultQuotient = 9967;
	double loadingFactor = .75;
	Employee_Pierce deleted;
	private Employee_Pierce[] data;
	
	public LQHashed_Pierce(int length){
		int pct = (int)((1.0/ loadingFactor - 1) * 100.0);
		N = fourKPlus3(length, pct);
		data = new Employee_Pierce[N];
		deleted = new Employee_Pierce();
		for(int i = 0; i < N; i++)
			data[i] = null;
	}// End of Constructor
	
	public boolean insert(Employee_Pierce employee){
		
		boolean noError;
		boolean hit = false;
		int pass, q, offset, ip;
		int pk = stringToInt(employee.getKey());
		
		if((((double) n) / N) < loadingFactor){
			pass = 0;
			q = pk / N;
			offset = q;
			ip = pk % N;
			
			if(q % N ==0)
				offset = defaultQuotient;
			
			while(pass < N){
				if(data[ip] == null || data[ip] == deleted){
					hit = true;
					break;
				}
				ip = (ip + offset) % N;
				pass++;
			}// End of while loop
			
			if(hit){
				data[ip] = employee.deepCopy();
				n++;
				return noError = true;
			}
			else
				return noError = false;
		}
		else // structure full to loading factor, insert not performed
			return noError = false;
	}// End of insert method
	
	public Employee_Pierce fetch(String targetKey){
		
		boolean noError;
		boolean hit = false;
		int pass, q, offset, ip;
		int pk = stringToInt(targetKey);
		pass = 0;
		q = pk / N;
		offset = q;
		ip = pk % N;
		
		if(q % N ==0)
			offset = defaultQuotient;
		
		while(pass < N){
			if(data[ip] == null)
				break;
			if(data[ip].getKey().equals(targetKey)){
				hit = true;
				break;
			}
			ip = (ip + offset) % N;
			pass++;
		}// End of while loop
		
		if(hit)
			return data[ip].deepCopy();
		else
			return null;
		
	}// End of fetch method
	
	public boolean delete(String targetKey){
		
		boolean noError;
		boolean hit = false;
		int pass, q, offset, ip;
		int pk = stringToInt(targetKey);
		pass = 0;
		q = pk / N;
		offset = q;
		ip = pk % N;
		
		if(q % N ==0)
			offset = defaultQuotient;
		
		while(pass < N){
			if(data[ip] == null)
				break;
			if(data[ip].getKey().equals(targetKey)){
				hit = true;
				break;
			}
			ip = (ip + offset) % N;
			pass++;
		}// End of while loop
		
		if(hit){
			data[ip] = deleted;
			n--;
			return noError = true;			
		}
		else
			return noError = false;
	}// End of delete method
	
	public boolean update(String targetKey, Employee_Pierce employee){
		if(delete(targetKey) == false)
			return false;
		if(insert(employee) == false)
			return false;
		return true;
	}// End of update
	
	public void showAll(){
		for(int i = 0; i < N; i++)
			if(data[i] != null && data[i] != deleted)
				System.out.println(data[i].toString());
	}// End of showAll method
	
	public static int fourKPlus3(int n, int pct){
		
		boolean fkp3 = false;
		boolean aPrime = false;
		int prime, highDivisor, d;
		double pctd = pct;
		prime = (int)(n * (1. + (pctd / 100.)));
		
		if(prime % 2 ==0)
			prime++;
		
		while(!fkp3){
			while(!aPrime){
				highDivisor = (int)(Math.sqrt(prime) + .5);
				for(d = highDivisor; d > 1; d--){
					if(prime % d == 0)
						break;
				}
				if(d != 1)
					prime += 2;
				else
					aPrime = true;
			}// End of aPrime while loop
			
			if((prime - 3) % 4 == 0)
				fkp3 = true;
			else
			{
				prime += 2;
				aPrime = false;
			}
		}// End of fkp3 while loop
		
		return prime;
		
	}// End of fourKPlus3 method
	
	public static int stringToInt(String aKey){
		
		int pseudoKey = 0;
		int n = 1;
		int cn = 0;
		char c[] = aKey.toCharArray();
		int grouping = 0;
		
		while(cn < aKey.length()){
			
			grouping = grouping << 8;
			grouping += c[cn];
			cn++;
			
			if(n == 4 || cn == aKey.length()){
				pseudoKey += grouping;
				n = 0;
				grouping = 0;
			}
			
			n++;
			
		}// End of while loop
		return Math.abs(pseudoKey);
		
	}// End of stringToInt method

}// End of class







































