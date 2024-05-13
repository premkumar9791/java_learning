package core.basic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class basic_condition {

	public static void main(String[] args) {
        //  sum1();
        //  sum2();
		//  sum3();
        //  sum4();
		//  sum5();
	    //  sum6();
		//  sum7();
        //  sum8();
	    //  sum9();
		//  sum10();
		//  sum11();
	    //  sum12();
		//  sum13();
	    //  sum14();
		//  sum15();
	    //  sum16();
	    //  sum17();
	    //  sum18();	
		//  sum19();
		//  sum20(); 
		//  sum21();
		//  sum22();
		//  sum23();
		//  sum24(); 
		//  sum25();
		//  sum26();
		//  sum27();
		//  sum28();
		//  sum29();
		//  sum30();
		//  sum31();
		//  sum32();
		//  sum33();
		//  sum34();
		//  sum35();
		//  sum36();
		//  sum37();
		//  sum38();
		//  sum39();
		//  sum40();
		//  sum41();
		//  sum42();
		//  sum43();
		//  sum44();
		//  sum45();
		//  sum46();  
		//  sum47();
		//  sum48();
		//  sum49();
		//  sum50();
		//  sum51();
		//  sum52();
		//  sum53();
		//  sum54();
		//  sum55();
		//  sum56();
		//  sum57();
		//  sum58();
		//  sum59();
		//  sum60();
		//  sum61();
		//  sum62();
		//  sum63();
		//  sum64();
	}

	private static void sum64() {
		// Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.

        //example a[5,1,8,3,10]      result = [8,10,5,1,3]
		
		int a[]= {5,1,8,3,10};
		int temp;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			if(a[i]%2==0) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;	
			}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

	private static void sum63() {
		//  Write a Java program to cyclically rotate a given array clockwise by one.
		int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        rotateArrayClockwise(arr);
        System.out.println("Array after cyclic rotation: " + Arrays.toString(arr));
	}
 

    public static void rotateArrayClockwise(int[] arr) {
        if (arr.length <= 1) {
            return; // No need to rotate if array has 0 or 1 element
        }

        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
    
    
	private static void sum62() {
		// Write a Java program to cyclically rotate a given array clockwise by one.

	    int[] a = {1, 2, 3, 4, 5};
	    int lastElement = a[a.length - 1];
	    for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
	    }
	    a[0] = lastElement;
	    System.out.println(Arrays.toString(a));
	}

	private static void sum61() {
		// .Write a Java program to remove duplicate elements from a given array and return the updated array length.
	//Sample array: [20, 20, 30, 40, 50, 50, 50]
	//After removing the duplicate elements the program should return 4 as the new length of the array.
		
		int array[]= {20, 20, 30, 40, 50, 50, 50};
		int length=duparray(array);
		
		System.out.println(length);
		System.out.println(Arrays.toString(array));
		
	}

	private static int duparray(int[] array) {
		if(array.length==0||array.length==1){		
		return array.length;
		}
		
		
		  Arrays.sort(array);
		  int j=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1])	{
				array[j++]=array[i];
			}		
		}
		 array[j++] = array[array.length -1 ];
		 
		return j;
	}

	private static void sum60() {
		// .Write a Java program to remove duplicate elements from a given array and return the updated array length.
		//Sample array: [20, 20, 30, 40, 50, 50, 50]
		//After removing the duplicate elements the program should return 4 as the new length of the array. 
		 
		int array[]= {20, 20, 30, 40, 50, 50, 50};
		int k=array.length-3;
		int m=0;
		int b[]=new int[k];
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if (array[i]==array[j]) {
					array[i]=0;
					break;
				}
			}
			if(array[i]!=0) {
				b[m++]=array[i];
			}
		}
		
		for(int x:b) {
			System.out.print(x+" ");
		}
		System.out.println("lenght of b="+b.length);
		
		
		
	}

	private static void sum59() {
		// Write a Java program to check if an array of integers is without 0 and -1.
		
		int a[]= {1,2,3,4,8,5,-1};
		boolean k=false;
		for(int i=0;i<a.length;i++) {
			if (a[i]<0) {
                 k=true;
	      	}
			}
		
		if (k) {
            System.out.println("arrays have 0 and -1");
     	}
		else {
			System.out.println("arrays don't have 0 and -1");  
		}
	}

	private static void sum58() {
		//  Write a Java program to find the number of even and odd integers in a given array of integers.
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
                 System.out.println("even "+a[i]);
	      	}
			else {
				System.out.println("odd "+a[i]);  
				}
			}
	}

	private static void sum57() {
		// Two-dimensional Array in Java
		// Write a program that creates a two-dimensional array with dimensions of 10×10 and named matrix. On the diagonal of this matrix, put the numbers from 0 to 9 and the number 0 everywhere else. Additionally, the program should calculate the sum of the elements on the diagonal.
		
		int a[][]=new int[10][10];
		int sum=0;
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
			  if(i==j) {
				  a[i][j]=i;
			  }	
			  else {
				  a[i][j]=0; 
			  }
			}
		}
		
		for(int i=0;i<10;i++) {
			 sum+=a[i][i];
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
			  System.out.print(a[i][j]+" ");
			}
			  System.out.println();
		}
		System.out.print("sum  diagonal of this matrix="+sum);
	}

	private static void sum56() {
		//Java Program to Find the Largest and Smallest Numbers From Random Numbers
		//Write a program that will use the while loop to find the largest and smallest number from the set of 10 randomly drawn integers from 1 to 100. In this task, do not use arrays or other collections.
		 
		int num=50;
        
		Random random=new Random();
		
		int i=0;
		while(i<10) {
			int a=random.nextInt(100);
			if(a<num) {
				System.out.println(a+"small");
			}
			else {
				System.out.println(a+"large");
			}
			i++;
		}
	}

	private static void sum55() {
		//Calculate BMI Using Java
		//The user enters his height (in inches) and weight (in pounds). The variables passed by the user are assigned to the float type. After calculating the BMI value, the value will be assigned to the appropriate range and the correct message will appear on the console. You can use the if-else-if ladder for printing the message on the console.

//		Intervals of BMI index:
//
//		16.00 or less = starvation
//		16.00-16.99 = emaciation
//		17.00-18.49 = underweight
//		18.50-22.99 = normal, low range
//		23.00-24.99 = normal high range
//		25.00-27.49 = overweight low range
//		27.50-29.99 = overweight high range
//		30.00-34.99 = 1st degree obesity
//		35.00-39.99 = 2nd degree obesity
//		40.00 or above = 3rd degree obesity
		
		
		Scanner n=new Scanner(System.in);
		System.out.println("eneter your weight");
		float weight=n.nextFloat();
		System.out.println("eneter your height");
		float height=n.nextFloat();
		
		float bmi=cal(weight,height);
		
		if (bmi < 16.00) {
            System.out.println("Your BMI is " + bmi + "starvation");
        } else if (bmi >= 16.00 && bmi < 16.99) {
            System.out.println("Your BMI is " + bmi + "emaciation");
        } else if (bmi >= 17.00 && bmi < 18.49) {
            System.out.println("Your BMI is " + bmi + "underweight");
        } else if (bmi >= 18.50 && bmi < 22.99) {
            System.out.println("Your BMI is " + bmi + "normal, low range");
        } else if (bmi >= 23.00 && bmi < 24.99) {
            System.out.println("Your BMI is " + bmi + "normal high range");
        }else if (bmi >=25.00 && bmi < 27.49) {
            System.out.println("Your BMI is " + bmi + "overweight low range");
        }else if (bmi >= 27.50 && bmi < 29.99) {
            System.out.println("Your BMI is " + bmi + "overweight high range");
        }else if (bmi >= 30.00 && bmi < 34.99) {
            System.out.println("Your BMI is " + bmi + " 1st degree obesity");
        }else if (bmi >= 35.00 && bmi < 39.99) {
            System.out.println("Your BMI is " + bmi + " 2nd degree obesity");
        }else {
            System.out.println("Your BMI is " + bmi + " 3rd degree obesity");
        }
		
	}

	private static float cal(float weight, float height) {
		float heightInMeters = height * 0.0254f;
		 float weightInKilograms = weight * 0.453592f;
		return weightInKilograms / (heightInMeters * heightInMeters);
	}

	private static void sum54() {
		// Java Program to Calculate Taxes
		//Using the double types, implement the following: Suppose a product costs 9.99 net, calculate its gross value (we assume VAT of 23%). Then multiply it by 10,000 (i.e., we sold 10,000 pcs of this product), and calculate this value excluding VAT.

	//	Implement the above actions using the Big Decimal class. Print on the console all computed values and compare their values. What conclusions do you have?
		
		 BigDecimal net=new BigDecimal("9.99"); 
	    BigDecimal vat=new BigDecimal("0.23");
	   
	    BigDecimal grossValue = net.multiply(BigDecimal.ONE.add(vat));
	    BigDecimal totalGrossValue = grossValue.multiply(new BigDecimal("10000"));
	     BigDecimal netValue = net.multiply(new BigDecimal("10000"));
	     
	     @SuppressWarnings("deprecation")
		BigDecimal totalNetValue = netValue.divide(BigDecimal.ONE.add(vat), 2, BigDecimal.ROUND_HALF_UP);
	     
	        System.out.println("Net Price: " + net);
	        System.out.println("VAT Rate: " + vat);
	        System.out.println("Gross Value (including VAT): " + grossValue);
	        System.out.println("Total Gross Value for 10,000 pieces: " + totalGrossValue);
	        System.out.println("Net Value (excluding VAT) for 10,000 pieces: " + netValue);
	        System.out.println("Total Net Value (excluding VAT) for 10,000 pieces: " + totalNetValue);
	    
	}

	private static void sum53() {
		// .Java Program to Check Whether the Generated Random Number Is Even or Odd
	//	Write a program that generates a random number between 1 and 100 (you can use the Random () method from the Math class.
    
		int ran=number();
    
		if(ran%2==0) {
			System.out.println(ran+" even");
		}
		else {
			System.out.println(ran+" odd");
		}
	}

	private static int number() {
		Random random=new Random();
		return random.nextInt(100);
	}

	private static void sum52() {
		// Java Program to Find Your Weight on Mars
		// Mars’ gravity is about 38% of Earth’s. Write a program that will calculate your weight on Mars.
		
		
	//	Declare all variables at the top of the class.
	//	Initial variables are to be of float type.
	//	After making the calculations, assign the result to a new variable, this time of the double type.
	//	After assigning the assignment, write the variable double to the console, limiting its length to 4 decimal places.
	//	Cast the above variable of double type to a new variable of int type.
	//	Cast the above variable of type int to a new variable of type char.
	//	Do any math operation on this variable char type and assign the value of this activity to the new variable int type.
	//	Each of the above actions should be written to the console, adding some text explaining what has been done.
		
		float garv=75.0f;
	    float   pers=0.38f;
	
	    
	    double mars=garv*pers;
	    System.out.println(" Mars’ gravity with in length to 4 decimal");
	    System.out.printf("%.4f",mars);
	    System.out.println();
	    System.out.println("typecast double type to int type");
	    int n=(int) mars;
	    System.out.println(n);
	    System.out.println("typecast int type to char type");
	    char a=(char) mars;
	    System.out.println(a);
	    System.out.println(" math operation in char variable to assing in int");
	    int b=10+a;
	    System.out.println(b);
	    
		
	}

	private static void sum51() {
		// Java program to implement a calculator to do basic operations
		
		Scanner n=new Scanner(System.in);
		System.out.println("enter frist value");
	    int a=n.nextInt();
	    System.out.println("enter second value");
	    int b=n.nextInt();
	    
	    System.out.println("eneter your opration +,-,*,/ and %");
	    String c=n.next();
	    
	    int d = 0;
	    
	    switch(c) {
	    case "+":d=a+b;
	    break;
	    case "-":d=a-b;
	    break;
	    case "*":d=a*b;
	    break;
	    case "/":d=a/b;
	    break;
	    case "%":d=a%b;
	    break;
	    default:System.out.println("enter a valid opration");
	    return;
	    }
	   
	    System.out.println(d+" is your answer");
	}

	private static void sum50() {
		// Java program to find the Nth term in a Fibonacci series using recursion
		
		int n=10;
		  for(int i=0;i<n;i++) {
			  System.out.print(fabonacci(i)+"");
			  }	
	}

	private static int fabonacci(int i) {
		if (i<=1) {
			return i;
		}
		else {
		return fabonacci(i-1)+fabonacci(i-2);
	}
	}
	private static void sum49() {
		// Java program to check leap year
		
		int year=2024;
		
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println("it is  leapyear");
		}
		else {
			System.out.println("it is not a leapyear");
		}
		
	}

	private static void sum48() {
		// Java program to delete an element from an array by index
		
		int[] a = {5, 2, 9, 1, 7, 4,6};
		  System.out.println("array[] ={5, 2, 9, 1, 7, 4,6}");
			 Scanner n=new Scanner(System.in);
			  System.out.println("witch index you want to delete");
			  int m=n.nextInt();
			  int o=0;	
			  int []b=new int[a.length-1];	  
			  for(int i=0;i<a.length;i++) {
				  if(i==m) {
					  continue;
				  }
				  b[o++]=a[i];
				  
			  }
			  
			  
			  for(int i=0;i<b.length;i++) {
				  System.out.print(b[i]+" ");
			  }
			  }
	

	private static void sum47() {
		// Java program to insert a number to any position in an array
		
		int[] a = {5, 2, 9, 1, 7, 4,6};
		  System.out.println("array[] ={5, 2, 9, 1, 7, 4,6}");
		 Scanner n=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int l=n.nextInt();
		  System.out.println("witch index you want to insert");
		  int m=n.nextInt();
		
		  a[m]=l;
		  
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}

	private static void sum46() {
		// Java program to find the number of odd numbers in an array
		int[] a = {5, 2, 9, 1, 7, 4,6};
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}		
		
		
	}

	private static void sum45() {
		// java program to implement binary search

		int[] a = { 5, 2, 9, 1, 7, 4, 6 };
		int target=19;
		Arrays.sort(a);
		
		int right=0,left=a.length-1;
		boolean n=false;
		
		while(right<=left) {
			int mid=right+(left-right)/2;
			
			if(a[mid]==target) {
				n=true;
				break;
			}
			else if(a[mid]<target) {
                 right++;
			}
			else if(a[mid]>target) {
				right--;			
			}
		}
		
		if(n){
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
	}

	private static void sum44() {
		//Java program to implement linear search
		
		  int[] a = { 2, 5, 8, 10, 13, 18, 23, 27, 31, 36 };
		  Scanner n=new Scanner(System.in);
		  System.out.print("Enter the number");
		  int l=n.nextInt();
		  boolean k=false;
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]==l) {
				   k=true;  
		  }
			  }
		  if(k) {
			   System.out.println("found");
		   }
		   else {
			   System.out.println("not found"); 
		   }
		
	}

	private static void sum43() {
		// Java program to display the sum of n numbers using an array
		
		Scanner n=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int l=n.nextInt();
		int[] a=new int[l];
		int b=0;
		
		 System.out.println("Enter " + l + " numbers:");
		for(int i=0;i<l;i++) {
			a[i]=n.nextInt();
		}
		
		for(int i=0;i<l;i++) {
			 b+=a[i];
		}
		 System.out.println("sum of given numbers in array");
		 System.out.println(b);
		
	}

	private static void sum42() {
		// Java program to find the factorial of a number using recursion
		
		int n=6;
		long a=fact(n);
		System.out.println(a);
		int b=1;
		for(int i=n;i>=1;i--) {
			 b*=i;
		}
		System.out.println(b);
		
	}
	public static  long fact(int fac) {

		if(fac>=1) {
			return fac*=fact(fac-1);
		}
		else {
			return 1;
		}
		
	}

	private static void sum41() {
		// Java program to generate the prime numbers from 1 to N
		
	   int n=50;
	   int i=0;
	   boolean k;
	   while(i<n) {
		   k=false;
		   for(int j=2;j<=Math.sqrt(i);j++) {
			  if(i%j==0) {
				 k = true ;
				 break;
			  }
		   }
		   if(!k) {
			   System.out.print(i+" ");
		   }
		   i++;
	   }
	   
	   
	   }
		
	

	private static void sum40() {
		// Java program to check whether the given integer is a prime number or not
		
		int a=1234;
        boolean r=false;
       for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				r=true;
				break;
			}
       }
        if (r) {  
   	       System.out.println("not a prime");
	      }
	else {
		System.out.println("prime");	
	}
		}

	

	private static void sum39() {
		// Java program to display all integers within the range 100-150 whose sum of digits is an even number
		 int a=0;
		for(int i=100;i<=150;i++) {
			 if(sumofeven(i)) {
			 System.out.println(i);
			 }
			}
		
	
	}

	private static boolean sumofeven(int num) {
		int a=0;
		int b=0;
		while(num>0) {
			a=num%10;
			b+=a;
			num/=10;
		}
		
		return b%2==0;
	}

	private static void sum38() {
		// Java program to display all the multiples of 3 within the range 10 to 50
		
	
		for(int i=10;i<=50;i++) {
		 if(i%3==0) {
			 System.out.println(i); 
		 }
		}
		
	}

	private static void sum37() {
		// Java program to find the sum of the digits of an integer using a while loop
		int a=2345;
		int b,c=0;
		
		
		while(a>0) {
		    b=a%10;
		    c+=b;
		    a=a/10;
		}
		System.out.print(c);
	}

	private static void sum36() {
		// Java program to display the given integer in the reverse order
		
		int a=2345;
		int b,c=0;
		
		
		while(a>0) {
		    b=a%10;
		    c=c*10+b;
		    a=a/10;
		}
		System.out.print(c);
		
	}

	private static void sum35() {
		// Java program to find the average of 5 numbers using a while loop
		
		int a[]= {1,2,3,4,5};
		double b=1.0;
		int i=0;
		while(i<a.length) {
			b+=a[i];
			i++;			
		}
		System.out.println(b/a.length);
		
	}

	private static void sum34() {
		// Java program to check whether a string is a palindrome or not
		
		String a="monm";
		int left=0;
		int right=a.length()-1;
		int n=1;
		
		while(left<right) {
			if(a.charAt(left)!=a.charAt(right)) {
				System.out.println("is not a palindrom");
				n=2;
			}
			left++;
			right--;	
		}
		if (n==1) {
			System.out.println("is a palindrom");
		}
		
		
	}

	private static void sum33() {
		// Java program to check whether the given integer is a multiple of both 5 and 7
		
		int a=35;
		
		if((a%5==0)&&(a%7==0))  System.out.println("yes");
		else System.out.println("no");
	}

	private static void sum32() {
		// java program to find the product of a set of real numbers
		int a[]= {1,2,3,4,5,6};
		double res=1.0;
		for(int i=1;i<a.length;i++) {
			res*=a[i];
		}
		System.out.println(res);
	}

	private static void sum31() {
		// Java program to find out the average of a set of integers
		
		int a[]= {1,2,3,4,5,6};
		double res=0;
		for(int i=1;i<a.length;i++) {
			res+=a[i];
		}
		System.out.println(res/a.length);
		
	}

	private static void sum30() {
		// Java program to check whether the given number is even or odd
		
		
		int n=10;
		if(n%2==0) System.out.println("even");
		else System.out.println("odd"); 
		
	}

	private static void sum29() {
		
		int n,m;
		Scanner r=new Scanner(System.in);
		 System.out.println("Enter the number of rows and columns of matrix");
		n=r.nextInt();
		m=r.nextInt();
		
		int f[][]=new int[n][m];
		int s[][]=new int[n][m];
		int sum[][]=new int[n][m];
		
		 System.out.println("Enter the elements of first matrix");
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				f[i][j]=r.nextInt();	
			}
		}
		System.out.println("Enter the elements of second matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				s[i][j]=r.nextInt();	
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				sum[i][j]=f[i][j]+s[i][j];	
			}
		}
		
		System.out.println("sum of given matrix");
		  for (int i = 0; i < n; i++)
		    {
		      for (int j = 0; j < m; j++)
		        System.out.print(sum[i][j] + "\t");

		      System.out.println();
		    }
		
		
	}

	private static void sum28() {
		// 
		int m, n, c, d;
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter the number of rows and columns of matrix");
	    m = in.nextInt();
	    n = in.nextInt();

	    int first[][] = new int[m][n];
	    int second[][] = new int[m][n];
	    int sum[][] = new int[m][n];

	    System.out.println("Enter the elements of first matrix");

	    for (c = 0; c < m; c++)
	      for (d = 0; d < n; d++)
	        first[c][d] = in.nextInt();

	    System.out.println("Enter the elements of second matrix");

	    for (c = 0 ; c < m; c++)
	      for (d = 0 ; d < n; d++)
	        second[c][d] = in.nextInt();

	    for (c = 0; c < m; c++)
	      for (d = 0; d < n; d++)
	        sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
	    
	    System.out.println("Sum of the matrices:");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(sum[c][d] + "\t");

	      System.out.println();
	    }
	    System.out.println("Sum of the line");
	    
	    int k=0;
	    for(int i=0;i<3;i++) {
	         k+=sum[i][i];
	    }
	    
	    System.out.println(k);
	    
		
	}

	private static void sum27() {
		// Duplicate number
		int a[]=new int[]{1,1,2,3,4,3,6,4};
		
		for(int i=0;i<a.length;i++) {
			int k=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				 k++;
				 a[j]=0;
				}
			}
			if(a[i]!=0) {
			System.out.println(a[i]+"="+k);
			}
		}
		
	}

	private static void sum26() {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,2,8,5,9,3};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		
		}
		System.out.println("sorted array max to min");
		for(int x:a) {
		System.out.print(x);
		}
		System.out.println();
		System.out.println("max num in array="+a[0]);
		System.out.println("min num in array="+a[a.length-1]);
		System.out.println("second max num in array="+a[1]);
		System.out.println(" second min num in array="+a[a.length-2]);
	}

	private static void sum25() {
		// min ,max ,second largest and second min
		
		int a[]= {1,3,5,7,2,8,5,9,3};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		
		}
		System.out.println("sorted array");
		for(int x:a) {
		System.out.print(x);
		}
		System.out.println();
		System.out.println("min num in array="+a[0]);
		System.out.println("max num in array="+a[a.length-1]);
		System.out.println("second min num in array="+a[1]);
		System.out.println("second max num in array="+a[a.length-2]);
		
		
	}

	private static void sum24() {
		// 2D array
		int n=0,o=0,p=0;
		int b[][]= {{1,2,3},
				    {8,5,4},
				    {6,2,7}};
	       for(int i=0;i<3;i++) {
	    		  n+=b[i][i];    
	       }
	       int i=0;
	       for(int j=2;j>=0;j--) {
	    		   o+=b[j][i];
	    		   i++;
	    	   }
	    	   p=n+o;
	       
			System.out.println(p);
		
			
	}

	private static void sum23() {
		// array
		
		int a[]= {1,2,3,4,5,6,7};
		
		
		// for each
//		for(int s:a) {
  //      System.out.print(s);
    //    }
		
		//2D array
		int n=0;
		int b[][]= {{1,2,3},
				    {8,5,4},
				    {6,2,7}};
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<3;j++) {
    		  n+=b[i][j]; 
    	   }
       }
		System.out.println(n);
		
		          
	}

	private static void sum22() {
		// continue
		
		int i=1;
		while(i<=10){
			int j=1;
			while(j<=10){
				if((j==5)||(j==10)||(j==15))
				System.out.print(j+" ");	
				j++;
				continue;
			}
			i++;		
		}
		
	}

	private static void sum21() {
		// break
		int a=5;
		int i=1;
		while(i<=a){
			System.out.println(a);
			i++;
		   break;
		}
		
	
		
	}

	private static void sum20() {
		//   *
	    //  ***
        // *****
		//*******
		int rows = 4,rows2=-1;
		int n=rows-2;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > rows2; i--) {
        	for (int j = 0; j < rows - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i+1; k++) {
                System.out.print("*");
            }
        System.out.println();
        }
	}


	private static void sum19() {
		// #
		// $$
		// ###
		int i=1;
		while(i<=4) {
			if ((i%2)!=0) {
		    int j=1;
			while(j<=i) {
				System.out.print("#");	
				j++;	
			    }
			}
			else {
				int j=1;
				while(j<=i) {
					System.out.print("$");	
					j++;	
				    }
			}
			System.out.println();
			i++;	
		}
	}

	private static void sum18() {
		// *
		// ***
		// *****
		// *******
		
		int i=1;
		while(i<=7) {
			if ((i%2)!=0) {
		    int j=1;
			while(j<=i) {
				System.out.print("*");	
				j++;	
			    }
			System.out.println();
			}
			i++;	
		}
		
	}

	private static void sum17() {
		// A
		// BC
		// DEF
		// GHIJ
		
		int row=5;
		char one='A';
		for(int i=1;i<row;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.print(one);
				one++;
			}
			System.out.println();
		}
		
//		int i=1,k=1;
//		while(i<=4) {
//			int j=1;
//			while(j<=i) {	
//			  if(k==1) {
//				  System.out.print("A");
//			  }
//			  else if(k==2) {
//				  System.out.print("B");  
//			  }
//			  else if(k==3) {
//				  System.out.print("C");  
//			  }
//			  else if(k==4) {
//				  System.out.print("D");  
//			  }
//			  else if(k==5) {
//				  System.out.print("E");  
//			  }
//			  else if(k==6) {
//				  System.out.print("F");  
//			  }
//			  else if(k==7) {
//				  System.out.print("G");  
//			  }
//			  else if(k==8) {
//				  System.out.print("H");  
//			  }
//			  else if(k==9) {
//				  System.out.print("I");  
//			  }
//			  else if(k==10) {
//				  System.out.print("j");  
//			  }
//			  k+=1;
//			j++;
//			}
//			System.out.println();
//			i++;
//		}
	}

	private static void sum16() {
		// A
		// AB
		// ABC
		int i=1;
		while(i<=4) {
			int j=1;
			while(j<=i) {	
			  if(j==1) {
				  System.out.print("A");
			  }
			  else if(j==2) {
				  System.out.print("B");  
			  }
			  else if(j==3) {
				  System.out.print("C");  
			  }
			  else if(j==4) {
				  System.out.print("D");  
			  }
			  else if(j==5) {
				  System.out.print("E");  
			  }
			j++;
			}
			System.out.println();
			i++;
		}
		
	}

	private static void sum15() {
		// 123
		// 12
		// 1
		int i=3;
		while(i>=1) {
			int j=1;
			while(j<=i) {
				
				System.out.print(j);
				j++;
			}
			System.out.println();
			i--;
		}
		
	}

	private static void sum14() {
		// 1
		// 22
		// 333
		int i=1;
		while(i<=4) {
			int j=1;
			while(j<=i) {	
			System.out.print(i);
			j++;
			}
			System.out.println();
			i++;
		}
		
	}

	private static void sum13() {
		// 5
		// 55
		// 555
		int i=1;
		int k=5;
		while(i<=4) {
			int j=1;
			while(j<=i) {	
			System.out.print(k);
			j++;
			}
			System.out.println();
			i++;
		}
	}

	private static void sum12() {
		// 1
		// 23
		// 456
		
		int i=1;
		int k=1;
		while(i<=4) {
			int j=1;
			while(j<=i) {	
			System.out.print(k);
			k+=1;
			j++;
			}
			System.out.println();
			i++;
		}
		
	}

	private static void sum11() {
		// 1
		// 12
		// 123
		// 1234
		// 12345
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

	private static void sum10() {
		// 1!+2!+3!+...n
		
		int n=4;
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum*=i;
		}
		System.out.println(sum); 
		
	}

	private static void sum9() {
		// 5+10+15+...n
		int i=1,n=20,sum=0;
		do {
			if((i%5)==0) {
			    sum+=i;	
			}
			i++;
		}
		while(i<=n);
		
		System.out.println(sum);
	}

	private static void sum8() {
		// 1+3+5+7+...n
		
		int i=1,n=8,sum=0;
		while(i<=n) {
			if((i%2)!=0) {
				sum+=i;
			}
			
			i++;
		}
		System.out.println(sum);
	}

	private static void sum7() {
		// 1^2+2^2+3^2+...+n
		
		int n=4;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(i*i);
		}
		System.out.println(sum);
		
	}

	private static void sum6() {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10)
		{
			System.out.println("loop start");
			i++;
		}
		System.out.println("exit loop");
		
		
		//do while loop
//		int i=1;
//		do {
//			System.out.println("loop start");
//     		i++;
//		}
//		while(i<=10);
//		System.out.println("exit loop");
		
		
		//for loop
		
//		for(int i=1;i<+10;i++) {
//			System.out.println("loop start");
//		}
//		System.out.println("exit loop");
	
	}

	private static void sum5() {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter yout state name TN (or) KL (or) KA (or) others");
		String state=s.next();
		System.out.print("enter gender M (or) F (or) TG ");
		String gender=s.next();
		System.out.print("enter yout age");
		int age=s.nextInt();
		
		if(state.equals("TN")){
			if(gender.equals("M")){
				if(age<=16){
					System.out.println("your scholarship monthly amount 10000");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 20000");
				}
				else{
					System.out.println("your scholarship monthly amount 30000");
				}
			}
			else if(gender.equals("F")){
				if(age<=16){
				System.out.println("your scholarship monthly amount 500");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 200");
				}
				else{
					System.out.println("your scholarship monthly amount 300");
				}	
			}
			else if(gender.equals("TG")){
				if(age<=16){
					System.out.println("your scholarship monthly amount 2000");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 3000");
				}
				else{
					System.out.println("your scholarship monthly amount 4000");
				}
			}
			else {
				System.out.println("enter valid gender");
			}
		}
		

		else if(state.equals("KL")){
			if(gender.equals("M")){
				if(age<=16){
					System.out.println("your scholarship monthly amount 100000");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 200000");
				}
				else{
					System.out.println("your scholarship monthly amount 300000");
				}
			}
			else if(gender.equals("F")){
				if(age<=16){
				System.out.println("your scholarship monthly amount 5000");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 2000");
				}
				else{
					System.out.println("your scholarship monthly amount 3000");
				}	
			}
			else if(gender.equals("TG")){
				if(age<=16){
					System.out.println("your scholarship monthly amount 200");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 300");
				}
				else{
					System.out.println("your scholarship monthly amount 400");
				}
			}
			else {
				System.out.println("enter valid gender");
			}
		}
		
		else if(state.equals("KA")){
			if(gender.equals("M")){
				if(age<=16){
					System.out.println("your scholarship monthly amount 40000");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 30000");
				}
				else{
					System.out.println("your scholarship monthly amount 20000");
				}
			}
			else if(gender.equals("F")){
				if(age<=16){
				System.out.println("your scholarship monthly amount 50");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 100");
				}
				else{
					System.out.println("your scholarship monthly amount 200");
				}	
			}
			else if(gender.equals("TG")){
				if(age<=16){
					System.out.println("your scholarship monthly amount 6000");
				}
				else if(age<=19){
					System.out.println("your scholarship monthly amount 5000");
				}
				else{
					System.out.println("your scholarship monthly amount 3000");
				}
			}
			else {
				System.out.println("enter valid gender");
			}
		}
	
		else {
			System.out.println("your not eligible for this scholarship");
		}
	}

	private static void sum4() {
		// TODO Auto-generated method stub
		
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("enter a number");
		int a;
		int b;
		int c;
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		b=n.nextInt();
		c=n.nextInt();
		
		if(c==1) {
			System.out.println(a+b);
		}
		else if(c==2) {
			System.out.println(a-b);
		}
		else if(c==3) {
			System.out.println(a*b);
		}
		else if(c==4) {
			System.out.println(a/b);
		}
		else {
			System.out.println("enter a number between  1 to 4 in 3rd value");
		}
		
		
		
	}

	private static void sum3() {
		// TODO Auto-generated method stub
		String months;
		Scanner m=new Scanner(System.in);
		
		months=m.next();
		
		if(months.equals("january")) {
			System.out.println(1);
		}
		else if(months.equals("february")) {
			System.out.println(2);
		}
		else if(months.equals("march")) {
			System.out.println(3);
		}
		else if(months.equals("april")) {
			System.out.println(4);
		}
		else if(months.equals("may")) {
			System.out.println(5);
		}
		else if(months.equals("jun")) {
			System.out.println(6);
		}
		else if(months.equals("july")) {
			System.out.println(7);
		}
		else if(months.equals("august")) {
			System.out.println(8);
		}
		else if(months.equals("september")) {
			System.out.println(9);
		}
		else if(months.equals("october")) {
			System.out.println(10);
		}
		else if(months.equals("november")) {
			System.out.println(11);
		}
		else if(months.equals("decmber")) {
			System.out.println(12);
		}
		else {
			System.out.println("entet month name");
		}
			
		
	}

	private static void sum2() {
		
		String month;
		Scanner m=new Scanner(System.in);
		
		month=m.next();
		
		switch(month) {
		case "january ":
			System.out.println(1);
			break;
		case "february":
			System.out.println(2);
			break;
		case "march":
			System.out.println(3);
			break;
		case "april":
			System.out.println(4);
			break;
		case "may":
			System.out.println(5);
			break;
		case "jun":
			System.out.println(6);
			break;
		case "july":
			System.out.println(7);
			break;
		case "august":
			System.out.println(8);
			break;
		case "september":
			System.out.println(9);
			break;
		case "october":
			System.out.println(10);
			break;
		case "november":
			System.out.println(11);
			break;
		case "december":
			System.out.println(12);
			break;
		default:
			System.out.println("eneter  month names");
			break;
		}
		
	}

	private static void sum1() {
		// TODO Auto-generated method stub
	  int a=3;
	  int b=2;
	  int c=4;
	  if(a>b) {
		  b=0;
		  System.out.println(a);
	  }
	  if(b>c) {
		  c=0;
	     System.out.println(b);
	  }
	  if(c>a) {
		  a=0;
		  System.out.println(c); 
	  }
	 
	  
	  
	}

}
