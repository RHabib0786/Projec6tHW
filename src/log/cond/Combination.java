package log.cond;

public class Combination {

	public static void main(String[] args) {
		
		//Even or Odd
		
		int num = 50;
		
		if (num % 2 == 0) {
			System.out.println("num:" + num + " is even");
		}else {
			System.out.println("num:" + num + " is odd");
		}
		
		int num1 = 301;
		int num2 = 100;
		int num3= 5020;
		int num4= 3030;
		int num5= 4040;
		int num6= 5020;
	
	    if (num3>num4) {
	    	System.out.println ("num3 " +  num3  + " is bigger than num6 " + num6);
	    	
	    }else if(num4<num3){
	    	System.out.println("num 4"+ num4 + " is bigger than num3" + num3);
	    	
	    }else if(num3 ==num6){
	    	System.out.println("num 3"+ num3 + " and num6" + num6 +"are equal.");
	    	}
	
		if (num1>num2 && num1 % 2==0) {
	    	System.out.println ( num1  + " is bigger than num2 " + num2 + "And num1 is equal");
	    
		}else if (num1<num2 && num1 % 2 ==0) {
	    	System.out.println("num2: " + num2 + " is bigger than num1 " + num1 + " And num1 is even");
	    
		}else {if (num1<num2 && num1 % 2!=0) {
	    	System.out.println (num1  + " is bigger than" + num2 + "And" + num1 + "is odd");
	    }
		
		if (num1>num2 || num1 % 2==0) {
	    	System.out.println ("num1 "+ num1+ " is bigger than num2 " + num2 + " And " + num1+ " is either  even or odd.");
		}
		}
	}
}

