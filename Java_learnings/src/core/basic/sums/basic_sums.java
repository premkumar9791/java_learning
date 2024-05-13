package core.basic.sums;

import java.lang.StackWalker.StackFrame;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//INHERITANCE CONCEPT: //
class A{
	int a;
	int getch() {
		return a;
	}
}

class B extends A{
	int b;
	int show() {
		return b;
	}
}
//  write a program to implement overriding concept //
class A1{
	void a(){
		System.out.println("A1");
	}
}
class B1 extends A1{
	void a(){
		System.out.println("B1");
	}
}

 // ABSTRACT CONCEPT: //

abstract class abs1{
	abstract void a();
}

class abs2 extends abs1{
	void a(){
		System.out.println("abstract");
	}
}

// PROGRAM BASED ON INTERFACE CONCEPT //

interface I{
	final int b=10;
	void num();
}
class J implements I{
	public void num() {
		System.out.println("implements");
	}
}

// PROGRAM TO EXPLAIN CONCEPT OF DYNAMIC DISPATCHOR RUN TIME POLYMORPHISM: //

class pol1{
	void cat(){
		System.out.print("cat");
	}
}
class pol2 extends pol1{
	void cat(){
		System.out.print("dog");
	}
}

public class basic_sums {

	private static Arrays array;

	public static void main(String[] args) {
         // sum1();
         // sum2();
		 // sum3();
		 // sum4();
		 // sum5();
	     // sum6()
         // sum7();
		 // sum8();
		 // sum9();
		 // sum10();
		 // sum11();
		 // sum12();
		 // sum13();  
		 // sum14();
		 // sum15();
		 // sum16();
		 // sum17();
		 // sum18();
		 // sum19();
		 // sum20();
		 // sum21();
		 // sum22();
		 // sum23();
		 // sum24();
		 // sum25();
		 // sum26();
		 // sum27();
		 // sum28();
		 // sum29();
		 // sum30();
		 // sum31();
	     // sum32();	
		 // sum33();
		 // sum34();
		 // sum35();
		 // sum36();
		 // sum37();
		 // sum38();
		 // sum39();
		 // sum40();
		 // sum41();
		 // sum42();
		 // sum43();
		 // sum44();
		 // sum45();
		 // sum46();
		 // sum47();    
		 // sum48();
		 // sum49();
		 // sum50();
		 // sum51();
		 // sum52();
		 // sum53();
		 // sum54();
		 // sum55();
		 // sum56();
		 // sum57();
		 // sum58();
		 // sum59();
		 // sum60();
		 // sum61();
		 // sum62();
		 // sum63();
		 // sum64();
		 // sum65();
		 // sum66();
		 // sum67();
		 // sum68();
		 // sum69();
		 // sum70();
		 // sum71();
		 // sum72();     
	     // sum73();	
		 // sum74();     
		 // sum75();
		 // sum76();
		 // sum77();
		 // sum78();
		 // sum79();
		 // sum80();
		 // sum81();
		 // sum82();
		 // sum83();
		 // sum84();
		 // sum85();   
		 // sum86();
		
		 // sum95();
		 // sum96();
		 // sum97();
		 // sum99();
		 // sum100();
		 // sum101();
		 // sum104();
		 // sum107();
		 // sum108();
		 // sum113();
		 // sum114();
		 // sum115();
		 // sum116();
		 // sum117();
		 // sum118();
		 // sum119();
		 // sum120();
		 // sum121();
		 // sum122();
		 // sum123();
		 // sum124();
		 // sum127();
		 // sum128();
		 // sum129();
		 // sum130();
		 // sum134();
		 // sum135();
		 // sum138();
		 // sum139();
		 // sum140();
		 // sum141();
		 // sum143();
		 // sum144();
		 // sum145();
		    
	
	}
	
	

	private static void sum145() {
		
//		o   o
//		l   l
//		l   l
//		 ee
//		 H
//		 ee
//		l  l
//		l  l
//		o  o
		
		String s="Hello";
		String s1=new StringBuffer(s).deleteCharAt(0).reverse()+s;
		int n=s1.length();
		int n1=n-1;
		char c[]=s1.toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==j){
					System.out.print(c[i]);
				}
				else if(n1==j) {
					System.out.print(c[n1]);
				}
				else {
              System.out.print(" ");
              }
				
			}
			n1--;
			System.out.println();
		}
		
	}



	private static void sum144() {
//		HELLO
//		H  H
//		E  E
//		L  L
//		L  L
//		 OO
//		 OO
//		L  L
//		L  L
//		E  E
//		H  H
		
		String s="HELLO";
		int n=10;
		String s1=s+new StringBuffer(s).reverse();
		char c[]=s1.toCharArray();
		char c1[][]= {c,c,c,c,c,c,c,c,c,c};

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j)||(i+j==n-1)){
					System.out.print(c1[i][j]);
					System.out.print(" ");
				}
				else {
              System.out.print(" ");
              }
				
			}
			System.out.println();
		}
		
		
	}



	private static void sum143() {
//		1   5
//		2   4
//	      3
//		2   4
//		1   5
		
		
		int n=5;

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==j)||(i+j==n+1)){
					System.out.print(j);
					System.out.print(" ");
				}
				else {
              System.out.print(" ");
              }
				
			}
			System.out.println();
		}
		
	
		
	}



	private static void sum141() {
//		1
//		11
//		121
//		1331
		
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print(fact(i)/(fact(j)*fact(i-j)));
				
			}
			System.out.println();
		}
	}



	private static int fac(int num) {
		int i=1;
		int f=1;
		while(i<=num) {
			f=f*i;
			i++;
		}
		return f;
	}



	private static void sum140() {
		// PRINT THE PATTERN:

		// 333222111
		// 332211
		// 321
		
		int n=3;
		int k=0;
		for(int i=3;i>0;i--) {
			for(int j=3;j>0;j--) {
				k=j;
				
				for(int l=i;l>0;l--) {
				System.out.print(k);
				}
			}
			System.out.println();
		}
		
		

	}



	private static void sum139() {
		// :FIND THE HIGHEST SEQUENCE OF REPEATED ELEMENT:
		
		char array[]={'a','5','c','s','e','9','A','b','a','5','c','s','e'};
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
				System.out.print(i);
				System.out.println("-"+j);
			}	
			}
		}
	}



	private static void sum138() {
		// Programe to arrange the same numbers near by Position.
		
		int a[]={8,7,4,1,0,-2,-1,-4,-6};
		int k=0; 
		for(int i=0;i<a.length;i++) {
			   k=0;
			
			for(int j=i+1;j<a.length;j++) {
			if(a[i]=='*') {
				k++;
				break;
			}
			if(Math.abs(a[i])==Math.abs(a[j])) {
				System.out.print(a[i]+" "+a[j]+" ");
				a[j]='*';
				k++;
			}		
			}
			if(k==0) {
				System.out.print(a[i]+" ");
			}
			
		}
		
		
	}



	private static void sum135() {
		// SHUFFLE THE DIGIT IN THE GIVEN NUMBER AND FIND HIGHEST NUMBER:
		
		int n=123;
		int result=0;
		int mul=1;
		int  c[]=new int[110];
		String b=String.valueOf(n);
		
		for(int i=0;i<b.length();i++) {
			
			c[b.charAt(i)-'0']++;
			
		}

		
		for(int i=0;i<=9;i++){
			while(c[i]>0){
			result=result+(i*mul);
			c[i]--;
			mul=mul*10;
			}

		}
		
		System.out.println(result);
	}



	private static void sum134() {
		// FIND THE HIGHEST PRIME FACT OR GIVEN NUMBER:
	
		
		int n=60;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				n/=i;
				i--;
			}
		}
		
		System.out.println(n);
	}



	private static void sum130() {
		// PRINT THE NUMBER PATTERN:
		// 1
		// 22
		// 333
		// 4444
		// 555
		// 66
		// 7
		
		Scanner o=new Scanner(System.in);
		System.out.println("enter a number");
		int n=o.nextInt();
		int k=1;
	
		for(int i=1;i<=n/2;i++) {
			 for(int j=1;j<i+1;j++) {
				System.out.print(k); 
			 } 
			 System.out.println();
			 k++;
		 }
		
		for(int i=n-n/2;i<=n;i++) {
			 for(int j=i;j<=n;j++) {
				System.out.print(k); 
			 } 
			 System.out.println();
			 k++;
		 }
		
	}



	private static void sum129() {
		// CALCULATE SUM,MAXIMUM,MINIMUM OF ARRAY
		int a[]={3,8,9,1,2,0,4,7};
		int sum=0;
		
		for(int i=0;i<a.length;i++){
		sum=sum+a[i];
		}
		
		System.out.println("sumofArray="+sum);
		float Ave=(sum/a.length);
		
		System.out.println("Avarageofarray="+Ave);
		Arrays.sort(a);
		System.out.println("minofarray="+a[0]);
		System.out.println("maxofarray="+a[(a.length-1)]);
		

	}



	private static void sum128() {
		// CHANGE UPPER CASE TO LOWER CASE AND VICEVERSA

		Scanner sc=new Scanner(System.in);
		String s=null;
		char c[]=null;
		System.out.print("enter  first String:");
		s=sc.nextLine();
		c=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if((c[i]>='A'&&c[i]<='Z')||(c[i]>='a'&&c[i]<='z')) {
                if(c[i]>='A'&&c[i]<='Z') {
                	c[i]=(char)(c[i]+32);
                }    
                else {
                	c[i]=(char)(c[i]-32);
                }
			}			
		}
		System.out.println(Arrays.toString(c));
	}



	private static void sum127() {
		// ARRANGE THE LEFT MOST BIT BY ASCENDING ORDER:
		int[] a={3,52,10,25,456};
		String k[]=new String[a.length];
		
		for(int i=0;i<a.length;i++) {
			k[i]=Integer.toString(a[i]);
		}
		
		Arrays.sort(k);
		
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(k[i]);
		}
		
		System.out.println(Arrays.toString(a));
	}



	private static void sum124() {
		// PRINT THE NUMBER PATTERN:
        //  5
		//  44
		//  333
		//  22
		//  1
		
		Scanner o=new Scanner(System.in);
		System.out.println("enter a number");
		int a=o.nextInt();
		int n=a;
		int k=a;
	
		for(int i=1;i<=n/2;i++) {
			 for(int j=1;j<i+1;j++) {
				System.out.print(k); 
			 } 
			 System.out.println();
			 k--;
		 }
		
		for(int i=n-n/2;i<=n;i++) {
			 for(int j=i;j<=n;j++) {
				System.out.print(k); 
			 } 
			 System.out.println();
			 k--;
		 }
	}



	private static void sum123() {
		// FIRST REPEATING WORD:
		
		 String a="ICECREAM";
		 int k=0;
		 char b[]=new char[5];
		 
		 for(int i=0;i<a.length();i++) {
			 for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					b[k++]=a.charAt(i);
					break;
				}  
			 }  
		 }
		 
		 System.out.print(b[0]);
	}



	private static void sum122() {
		// AIR ROUTES
 
		int a=0;
		int n=4;
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<i+1;j++) {
				a++;
			}
		}
		
		System.out.println(a);
	}



	private static void sum121() {
		//.ADD 1 NUMBER IF GIVEN IS EVEN NUMBER IS EVEN ELSE SUBTRACT 1 FROM THE NUMBER:
		
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0) {
				a[i]+=1;
			}
			else {
				a[i]-=1;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}



	private static void sum120() {
		// EVEN AND ODD IN ASCENDING

		int a[]={2,8,4,9,3,6,1,7};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		if(a[i]%2==0)
		System.out.print(a[i]);
		for(int i=0;i<a.length;i++)
		if(a[i]%2!=0)
		System.out.print(a[i]);
		}


	private static void sum119() {
		// PRINT EVEN NUMBER IN ASCNDING AND ODD NUMBER IN DESCENDING:
		
		int a[]={2,8,4,9,3,6,1,7};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]);
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]);
			}
		}
		
		System.out.println();
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



	private static void sum118() {
		// REPLACE STRING:

		Scanner sc=new Scanner(System.in);
		System.out.println("enterthestring");
		String a=sc.nextLine();
		System.out.println("replaceableword");
		String b=sc.nextLine();
		System.out.println("newword");
		String c=sc.nextLine();
		if(a.contains(b)){
		System.out.println(a.replace(b,c));
		}
		sc.close();

		
	}



	private static void sum117() {
		// CONVERT FARENHEIT TO CELSIUS:
		System.out.print("EntertheFarhenhitvalue=");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double b=(a-32)/1.8;
		System.out.println("Celcius="+b);
	}



	private static void sum116() {
		// PROGRAM FOR Celsius To Farenheit

		System.out.println("Enter the celcius");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=((a*9/5)+32);
		System.out.println(b);
	}



	private static void sum115() {
		// GENERATE 5 DIGIT RANDOM NUMBER:
		
		System.out.println(Math.round(Math.random()*100000));
	}



	private static void sum114() {
		// VALIDATE COMPOUND INTEREST:
	  
		compound(2000,5,0.08,12);

	}
	public static void compound(int p,int t,double r,int n){
		double amount=p*Math.pow(1+(r/n),n*t);
		double cinterest=amount-p;
		System.out.println("compund interst after"+t+"years:"+cinterest);
		System.out.print("Amount after"+t+"years:"+amount);
		}



	private static void sum113() {
		// VALIDATE SIMPLE INTEREST:
		
		float si,p=5000,r=15,t=1;
		//p=principle,r=rate,t=times
		si=(p*r*t)/100;
		System.out.println("Simpleinterestis="+si);
		
	}



	private static void sum108() {
		//FIND GIVEN NUMBER IS ARMSTRONG OR NOT:
	   
		int a=0,b,temp;
		int n=153;
		temp=n;
		while(n>0){
		b=n%10;
		n=n/10;
		a=a+(b*b*b);
		}
		if(temp==a)
		System.out.println(temp+"is armstrong number");
		else
		System.out.println(temp+"is not a armstrong number");
		
		
		
		
		}


	
	



	private static void sum107() {
		// CHECK GIVEN NUMBER IS PERFECT OR NOT:
		
		Scanner n=new Scanner(System.in);
		System.out.println("ENTER TO CHECK GIVEN NUMBER IS PERFECT OR NOT ");
		int a=n.nextInt();
		int sum=0;
		
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		
		if(a==sum) {
			System.out.println("it is  perfect number");
		}
		else {
			System.out.println("it is not a prefect number");
		}
		
	}



	private static void sum104() {
		// MATRIX MULTIPLICATION,ADDITION AND SUBTRACTION:
		
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("ADDITION of matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		     System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("SUBTRACTION of matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		     System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}
				}
		}
		System.out.println("MULTIPLICATION of matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		     System.out.print(c[i][j]);
			}
			System.out.println();
		}

		
	}



	private static void sum101() {
		// TODO Auto-generated method stub
		int n,r;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter value of n;");
		n=scanner.nextInt();
		System.out.print("Enter value of r;");
		r=scanner.nextInt();
		System.out.println("NCR is "+(fact1(n)/(fact1(n-r)*fact1(r))));
		System.out.println("PNR is "+(fact1(n/(fact1(n-r)))));
	}
	public static int fact1(int num){
		int fact=1,i;
		for(i=1;i<=num;i++){
		fact=fact*i;
		}
		return fact;
		}


	private static void sum100() {
		// FIND HCF AND LCM:
		
		int a,b,lcm,hcf=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter first number:");
		a=s.nextInt();
		System.out.print("enter second number:");
		b=s.nextInt();
		for(int i=1;i<=a&&i<=b;i++){
		if(a%i==0&&b%i==0){
		hcf=i;
		}
		}
		System.out.println("Hcf of numbers:"+hcf);
		lcm=(a*b)/hcf;
		System.out.print("Lcm of numbers:"+lcm);

	}



	private static void sum99() {
		// SIMPLE CALCULAT0R
		
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



	private static void sum97() {
		// Consider Two Arrays:
		int bob[]={1,2,3};
		int alice[]={4,2,6};
		
		int bobScore=0;
		int aliceScore=0;

		
		for(int i=0;i<3;i++) {
			if(bob[i]<alice[i]) {
				aliceScore++;
			}
			else if(bob[i]>alice[i]){
				   bobScore++;
			}	
		}
		 System.out.println("bobscore="+bobScore);
		System.out.println("aliceScore="+aliceScore);
	}



	private static void sum96() {
		// Print the Diagonal Numbers in Matrix.
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int j=2;
		for(int i=0;i<3;i++) {
			System.out.print(a[i][i]);
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(a[i][j--]);
		}
	}



	private static void sum95() {
		//*            -1
		//****         -4
		//***          -3
		//********     -8
		//*****        -5
		//************ -12
		//*******      -7
		
		int n=4;
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		  
			for(int k=0;k<4*a;k++) {
				System.out.print("*");
			}
			System.out.println();
			a++;
		}

	}



	private static void sum86() {
		// FIND AGE BY GIVING DATE OF BIRTH:
		
		Scanner n=new Scanner(System.in);
		System.out.println("enter data birth year");
		int year=n.nextInt();
		System.out.println("enter data birth month");
		int month=n.nextInt();
		System.out.println("enter data birth date");
		int date=n.nextInt();
		
		Calendar today=Calendar.getInstance();
		int curyear=today.get(Calendar.YEAR);

		int age=curyear-year;
		
		System.out.println("your DOB ="+year+"-"+month+"-"+date);
		System.out.println("your age ="+age);

		
	}



	private static void sum85() {
		// Unique words
		
	}



	private static void sum84() {
		// Write a program for singleton class.

	}
	private static void sum83() {
		//FIND THE VALUE OF STRING
		//INPUT:JAVA OUTPUT:34
		
		String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String b="JAVA";
		int c=0;
		
		for(int i=0;i<b.length();i++) {
			
			c+=(a.indexOf(b.charAt(i)+1));
		}
		
		System.out.print(c);
		
	}



	private static void sum82() {
		// Count the number of occurrence of each word in a Sentence.
		String s[]={"Learn","something","about","everything","and","everything",
				"about","something"};
		int n;
		
		for(int i=0;i<s.length;i++) {
			if(s[i]=="*")break;
			n=1;
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]) {
					n++;
					s[j]="*";
				}
			}
			System.out.println(s[i]+"-"+n+"times");
			
		}

		
	}



	private static void sum81() {
		// COUNT THE NUMBER OF OCCURENCES OF EACH CHARACTER IN WORD:
		System.out.println("Enter a word");
		Scanner n=new Scanner(System.in);
		String a=n.next();
		int c;
		
		for(char i='A';i<'Z';i++) {
			c=0;
			for(int j=0;j<a.length();j++) {
			if(i==a.charAt(j)) {
				c++;
			}
			}
			if(c>0) {
				System.out.print(i+"-"+c+"times");
				System.out.println();
			}	
			
		}
		
		
		
				}



	private static void sum80() {
		// PROGRAM THAT PRINT THE NUMBER FROM 1-100(FIZZ–BUZZ)
		
		int n=100;
		
		for(int i=1;i<=n;i++) {
			if(i%5==0&i%3==0)
				System.out.print("FizzBuzz"+" ");
				else if(i%5==0)
				System.out.print("Buzz"+" ");
				else if(i%3==0)
				System.out.print("Fizz"+" ");
				else
				System.out.print(i+" ");
		}

		
	}



	private static void sum79() {
		// CONVERT STRING TO INTEGER AND INTEGER TO STRING:
		
		int a=50;
		String b=Integer.toString(a);
		System.out.println(b);
		String d=String.valueOf(a);
		System.out.println(a);
		
		String e="0";
		int f=Integer.parseInt(e);
		System.out.println(e);
		int g=Integer.valueOf(e);
		System.out.println(e);
	}



	



	private static void sum78() {
		// Separate String with out using Split method
		StringTokenizer a=new StringTokenizer("Red;Green;Blue;Black;White",";");
		 
		 while(a.hasMoreTokens()){
			 System.out.println(a.nextToken());
		 }

		
		
	}



	private static void sum77() {
		// no sum
		
	}



	private static void sum76() {
		// REVERSE THE WORDS IN ODD POSITION:
		
		String a="object oriented high level programming language";
		String[] b=a.split(" ");
		
		for(int i=0;i<b.length;i++) {
			if(i%2==0) {
				System.out.print(new StringBuffer(b[i]).reverse()+" ");
			}
			
			else {
				System.out.print(b[i]+" ");
			}
		}
		
	}



	private static void sum75() {
		// Replace with $ for continuous two occurrence of character in a string.
		
		String s="Annual Offer";
		String c=" ";
		int l=s.length();
		
		for(int i=0;i<l-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c=c+"$";
				i++;
			}
			else c=c+s.charAt(i);
		}
		if(s.charAt(l-2)==s.charAt(l-1))c=c+"$";
		else c=c+s.charAt(l-1);
		
		
		System.out.print(c);
	}



	private static void sum74() {
		// I/P:Ka2s^%67$   OUTPUT:15$%^

		
	}



	private static void sum73() {
		// REVERSE THE WORDS OF STATEMENT:
		
		String s1="How are you?";
		String[] s2=s1.split(" ");
		
		System.out.println(s1);
		
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]);
		}

	}



	private static void sum72() {
		// INPUT:MA@$AS23MINDI OUTPUT:MAASMIND@$6

		
	}



	private static void sum71() {
		// Symmetric Matrix
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		System.out.println("given matrix");
        
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(a[i][j]);	
			}
			System.out.println();
		}
		
        System.out.println("Symmetric Matrix");
        
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[j][i]);		
				}
			System.out.println();
		}
		
	}



	private static void sum70() {
		// Write a program for matrix multiplication.

		int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}	
		}
			
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}



	private static void sum69() {
		//PRINT SPIRAL MATRIX:
		int n=4;
		int A[][]=new int[n][n];
		int k=1,c1=0,c2=3,r1=0,r2=3;
		while(k<=n*n)
		{
		for(int i=c1;i<=c2;i++)
		{
		A[c1][i]=k++;
		}
		for(int j=r1+1;j<=r2;j++)
		{
		A[j][r2]=k++;
		}
		for(int i=c2-1;i>=c1;i--)
		{
		A[c2][i]=k++;
		}for(int j=r2-1;j>=r1+1;j--)
		{
		A[j][r1]=k++;
		}
		c1++;
		c2--;
		r1++;
		r2--;
		}
		/*PrintingtheCircularmatrix*/
		System.out.println("The Circular Matrixis:");
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		System.out.print(A[i][j]+"\t");
		}
		System.out.println();
		}
		}



	private static void sum68() {
		// Print the Character pyramid.
		
		int a=4;
		char n='A';
		 
		for(int i=0;i<a;i++) {
			for(int j=1;j<a-i;j++) {
				System.out.print(" ");
			}
				for(int k=0;k<2*i+1;k++) {
						System.out.print(n);
			}
				n++;
				System.out.println(" ");
				}
		
	}



	private static void sum67() {
		//         1
		//      2 15 3
		//    4 5 66 6 7 
		//8 9 10 189 11 12 13
		
		int a=4,n=1,c=2,s=2;
		 
		for(int i=0;i<a;i++) {
			for(int j=1;j<a-i;j++) {
				System.out.print(" ");
			}
				for(int k=0;k<2*i+1;k++) {
					
					
					if(k==i){
						System.out.print(""+n+"");
						n=0;
						c--;
						}
					
					else{
						System.out.print(""+c+"");
						}
					
						n=n+s*3;
						s++;
						c++;
						
						
						}
				System.out.println(" ");
				}
				
			}
		
		
	



	private static void sum66() {
		// ab de gh
		// jk mn pq
		// st vw yz
		
		int n=3;
		char a='a';

		for(int i=1;i<=n;i++) {
	           for(int j=1;j<=8;j++) {
	        	   
	        	   
	        	   if(j%3==0) {
	        	   System.out.print(" ");
	        	    a++;
	        	    }
	        	   else {
	        		   System.out.print(a);
		        	    a++;   
	        	   }
	        	   
	        	   
	        	   }
	    	   System.out.println();
	    	   a++;
	           }
	}



	private static void sum65() {
		//     1
		//   3 2 4
		// 7 6 5 8 9
		
		
		int n=3,m=1;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++){
				if(j==i||j==0){
					if(j==i)
					System.out.print(""+(m-i));
					else {
						System.out.print(""+(m+i));
						}
					}
					else{
					System.out.print(""+m);
					}
					m++;
			}
			System.out.println();
		}
		
	}



	private static void sum64() {
		// ALLAHABAD
		
		char c[]={'A','L','L','A','H','A','B','A','D'};
		
		int n=2,k=0;
        for(int i=0;i<=n;i++) {
		
		for(int j=n-i;j>0;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print(c[k]+" ");
			k++;
		}
		System.out.println();
        }
        
        for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>=0;j--) {
				System.out.print(c[k]+" ");
				k++;
			}
			System.out.println();
            }
	}



	private static void sum63() {
		// Print the* in diamond program
		
		int n=3;
            for(int i=1;i<=n;i++) {
			
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
            }
            
            for(int i=1;i<=n;i++) {
    			
    			for(int j=1;j<=i;j++) {
    				System.out.print(" ");
    			}
    			for(int j=n-i;j>0;j--) {
    				System.out.print("*"+" ");
    			}
    			System.out.println();
                }
	}



	private static void sum62() {
		// PRINT BELOW MATRIX:
		
		int n=5;
		int a=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a);
				a++;
				if(a>3) {
					a=0;
				}
			}
		
			System.out.println(" ");
		}
		
	}



	private static void sum61() {
		// print l paten
		
		int a=9;
		for(int i=1;i<=4;i++) {
           for(int j=0;j<i;j++) {
        	   System.out.print(a);
        	   a--;
        	   }
    	   System.out.println();
           }
	}



	private static void sum60() {
		// PRINT BELOW MATRIX:
        int n=4;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=i-1;j>=-(i-1);j--) {
			
				System.out.print(i-Math.abs(j));
				
				
			}
			System.out.println();
	
		}
		
	}



	private static void sum59() {
		// triangle
		
		int n=6;
		for(int i=0;i<n;i++){
			for(int k=n;k>i;k--){
			System.out.print(" "+" ");
			}
			for(int j=0;j<2*i+1;j++){
			System.out.print("*"+" ");
			}
			System.out.println();
			}
	}



	private static void sum58() {
		// triangle
		
     int n=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}



	private static void sum57() {
		// print L triangle
		
		int n=6;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}



	private static void sum56() {
		// write a program for harshad number or niven number
		
		int a=21;
		int b=0;
		while(a>0) {
			b+=a%10;
			a=a/10;
		}
		System.out.print(b+" ");
		if(a%b==0) {
			System.out.print("is a number of niven");	
		}
		else {
			System.out.print("it is not a niven number");
		}
		
		
	}



	private static void sum55() {
		// PROGRAM TO GENERATE HAILSTONE NUMBER STARTS FROM 7
		
		
          System.out.println("enter a number to generate a hailstone");
		  Scanner s=new Scanner(System.in);
		  int a=s.nextInt();
		  meth1(a);
		
		  
	}
	static void meth1(int a){
		  if(a<=0) {
			  System.out.print("enter valid input");
		  }
		  if(a==1) {
			  return;
		  }
		  if(a%2!=0) {
			 int c=a*3+1;
			 System.out.print(c+" ");
			 meth1(c);
		  }
		  else {
			 int c=a/2;
			 System.out.print(c+" ");
		      meth1(c);
		  }
	}



	private static void meth(int a) {
		// TODO Auto-generated method stub
		
	}



	private static void sum54() {
		// Find Union And InterSection from Two Arrays
		int a[]={1,2,3,4,5,6};
		int b[]={4,5,6,7,8,9};
		int c[]=new int[a.length+b.length];
		
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		
	//	Arrays.sort(c);
		for(int x:c) {
			System.out.print("union="+x);
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			if(a[i]==b[j]) {
				System.out.print("intersection="+a[i]);
			}
		}
			}
		

	}



	private static void sum53() {
		// ANSWER IS PROGRAM NO:46

		
	}



	private static void sum52() {
		// FIND QUOTIENT AND REMAINDER WITHOUT USING MOD OR DIV:
		 
		int a=89,b=4;
		int c=0,d=0;
		for(int i=1;i<a;i++) {
			if(c<a) {
				c=b*i;
				if(c<=a) {
				d++;}
			}
		}
		int k=a-(d*4);
		System.out.println("div="+d);
		System.out.println("mod="+k);
	}



	private static void sum51() {
		// CONVERT DECIMAL TO BINARY USING STACK:
		 
		int a=4;
		int b;
		
		while(a!=0) {
		 b=a%2;
		 System.out.print(b);
		 a=a/2;
		}
	}

	private static void sum50() {
		// FIND THE YEAR IS LEAPYEAR OR NOT:
		
		int a=2020;
		
		if(((a%4==0)&&(a%100!=0))||(a%400==0)) {
			System.out.println(a+"  is leapyear");
		}
		else {	System.out.println(a+"  not a leapyear");}

	}



	private static void sum49() {
		// PROGRAM TO EVALUATE THE GIVEN SERIES:
		// 1/2+2/3+3/4+……+N
		
		int n=3;
		double a=0,b=0,c=0,sum=0;
		for(int i=1;i<=n;i++) {
			a=i;
			b=i+1;
			c+=(a/b);
			
			sum=sum+(i*1.0)/(i+1.0);
			
		}
		System.out.println(c);
		System.out.println(sum);
	}



	private static void sum48() {
		// FIND THE FACTORIAL USING RECURSION:
		
		int n=5,num=1;
        for(int i=1;i<=n;i++) {
        	num*=i;
        }
		System.out.println(num);
		

		fact1(n);
    	System.out.println(fact1(n));
		
	}
	 static  int fact(int n) {
		 if(n==0) {
			 return 1;
		 }
		 else {
	      return n*fact1(n-1);	
		 }
	}



	private static void sum47() {
		// Find out the Maximum Occurring Character in String.
		String s="SimpleString";

	}



	private static void sum46() {
		// FIND LARGEST AND SMALLEST NUMBER IN ARRAY WITH OUT USING SORTING METHOD:
		int a[]={12,1,3,56,23,95};
		
		int small=a[0];
		int larger=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];
			}
			if(a[i]>larger) {
				larger=a[i];
			}
		}
		
		System.out.println("smaller:"+small);
		System.out.println("larger:"+larger);
	}



	private static void sum45() {
		// DECIMAL TO HEXA DECIMAL USING STACK:
		int a=2348;
		char b[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
		Stack <String> r=new Stack<String>();
		int rem=0;
		String n="";
		            // push
		while(a>0) {
			rem=a%16;
			n=b[rem]+n;
			System.out.println("pushelement:");
			System.out.println(r.push(n));
			a=a/16;	
		}
		System.out.println();
		            //pop
		
		while(!(r.isEmpty())) {
			System.out.println("pushelement:");
			System.out.println(r.pop());
		}


	}



	private static void sum44() {
		// FIND THE SUM OF GIVEN SERIES:
		// 1/1!+1/2!+1/3!+1/4!+……….
		
		int val=4;
		double sum=0,f=1;
		
        for(int i=1;i<=val;i++) {
        	f=f*i;
        	sum+=(1/f);
        	
        }
		System.out.print(sum);
	}



	private static void sum43() {
		// REVERSE THE NUMBER USING RECURSION:
		
		int a=1234;
		
		reversemeth(a);
		
	}  
	private static void reversemeth(int a) {
		if(a<10) {
			System.out.print(a);
		}
		else {
			System.out.print(a%10);
			reversemeth(a/10);
		}
	}



	private static void sum42() {
		// Find the common elements in two arrays.
		int a[]={5,10,15,20,25,30};
		int b[]={10,20,30,40,50};
           
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
                if(b[j]==a[i]) {
                	System.out.println(a[i]);
                	
                	
                }

			}
		}
	}



	private static void sum41() {
		// REVERSE THE GIVEN ARRAY:
		
		int a[]= {1,2,3,4,5,6};
		int i=0,temp;
		int j=a.length-1;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j=j-1;
		}
		
		for(int x:a) {
			System.out.print(x);
		}
		
	}



	private static void sum40() {
		// Split The Array into Array
		int a[]={2,4,6,8,10,12,14,16};
		int b[]=new int[4];
		int c[]=new int[4];
		int j=0;
		
		for(int i=0;i<4;i++) {
			b[i]=a[i];
			System.out.print(b[i]);
		}
		for(int i=4;i<8;i++) {
			c[j]=a[i];
			j++;
			System.out.print(c[j]);
		}
		

	}



	private static void sum39() {
		// FIND OUT THE PAIRS IN SUM EQUAL TO 20
		
		int a[]={5,8,3,4,12,17,15,16};
		int num=20;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if ((a[i]+a[j])==num) {
					System.out.println(a[i]+"+"+a[j]+"="+num);
				}
			}
		}
		
	}



	private static void sum38() {
		// PROGRAM FOR ANAGRAM:
		String s1="listen";
		String s2="silent";
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.toString(a).equals(Arrays.toString(b))) {
			System.out.print("yes this is a ANAGRAM");
		}
		else {
			System.out.print("Not a ANAGRAM ");
		}
	}



	private static void sum37() {
		// ROTATE THE GIVEN INTEGER ARRAY:
		int a[]={1,2,3,4,5,6,7};
		int i,k=6;
		for(i=3;i<=k;i++) {
			System.out.print(" "+a[i]);
			if(i==6) {
				i=-1;
				k=2;
			}
		}
		System.out.println();
		int j,l=0;
		for(j=3;j>=l;j--) {
			System.out.print(" "+a[j]);
			if(j==0) {
				j=7;
				l=4;
			}
		}
		
	}



	private static void sum36() {
		// Number of occurrences of the array elements
		int a[]=new int[]{1,2,3,1,1,3,4,6,3,7,9};
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



	private static void sum35() {
		// find the odd one out from the array.
		
		String str[]={"black","white","black","black"};
		
		for(String x:str) {
			if(x.equals("black")) {
				//System.out.println(x);
			}
			else {
				System.out.println(x);
			}
		}
		
	}



	private static void sum34() {
		// given arrays equal are not;
		int a1[]={1,2,3,4};
		int a2[]={1,2,3,4};	
		if(Arrays.equals(a1,a2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}



	private static void sum33() {
		// INPUT:Check Even Or Odd a[]={1,4,6,9,6,1};
		int a[]={1,4,6,9,6,1};
		for(int i=0;i<a.length;i++) {
			if((a[i]%2)==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}

		
	}



	private static void sum32() {
		// IMPLEMENT PRODUCER CONSUMER DESIGN PATTERN IN JAVA USING WAIT,NOTIFY AND NOTIFY ALL
		
	}



	private static void sum31() {
		// PROGRAM TO EXPLAIN CONCEPT OF DYNAMIC DISPATCHOR RUN TIME POLYMORPHISM: 
		
		pol1 a=new pol1();
		pol2 b=new pol2();
		
		pol1 c;
		c=a;
	    c.cat();
	    c=b;
	    c.cat();
	    
	}



	private static void sum30() {
		// PROGRAM BASED ON INTERFACE CONCEPT:
	    
		J a=new J();
		a.num();
		
		// System.out.println(b);
	}



	private static void sum29() {
		// ABSTRACT CONCEPT:
		
		abs2 a=new abs2();
		abs1 b;
		b=a;
		
		a.a();
		
	}



	private static void sum28() {
		// write a program to implement overriding concept

		B1 b=new B1();
		b.a();
	}



	private static void sum27() {
		//INHERITANCE CONCEPT:
		A a=new A();
		B b=new B();
		
		b.a=1;
		b.b=2;
		System.out.println(b.show());
		System.out.println(b.getch());
	}
	private static void sum26() {
		// OVER LOADING CONCEPT:
		n(10);
		n("prem");
	}
	static void n(int a) {
		System.out.println(a);
	}
	static void n(String a) {
		System.out.println(a);
	}
	
	// OVER LOADING CONCEPT: end //
	
	private static void sum25() {
		// SORT ARRAY AND MERGE ARRAY
         int a[]={1,2,5,6,9,7};
         int b[]={3,4,12,10};
         int[] mergearray=new int[a.length+b.length];
         int i=0,j=0,k=0;
         
         while(i<a.length) {
        	 mergearray[k]=a[i];
        	 i++;
        	 k++;
         }
         while(j<b.length) {
        	 mergearray[k]=b[j];
        	 j++;
        	 k++;
         }
         Arrays.sort(mergearray);
         System.out.println(Arrays.toString(mergearray));

		
	}
	private static void sum24() {
		// SORT NUMBER IN ASCENDINGORDER USING SHUTTLESORT ALGORITHAM:
		int a[]={10,21,16,3,1,25,7};
		int temp;
		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
            	temp=a[i];
            	a[i]=a[i-1];
                a[i-1]=temp;
                for(int j=i-1;(j-1)>=0;j--) {
                	if(a[j]>a[j-1]) {
                    	temp=a[j];
                    	a[j]=a[j-1];
                        a[j-1]=temp;
                        }
                	else {
        				break;
                      }
		           }
			}
			
     }  
		System.out.println(Arrays.toString(a));
	}
	private static void sum23() {
		// SORT NUMBER IN ASCENDING ORDER USING BUBBLESORT ALGORITHAM:
		int a[]={12,32,1,322,23,1324};
		int temp=0;
            for(int i=0;i<a.length;i++) {
                for(int j=i+1;j<a.length;j++) {
                	if(a[i]>a[j]) {
                	temp=a[i];
                	a[i]=a[j];
                    a[j]=temp;
                }
                }
            }
           for(int i=0;i<a.length;i++) {
           System.out.print(a[i]+" "); }
	}
	private static void sum22() {
		// Convert Decimal To Binary Format
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int dec=s.nextInt();	
		int array[]=new int[10];
		int index=0;
		while(dec>0) {
			array[index++]=dec%2;
			dec=dec/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		
	}
	private static void sum21() {
		// 3+33+333+3333+33333+....n
		 
		   Scanner s=new Scanner(System.in);
		   System.out.println("enter a number");
           int num=s.nextInt();
		   
		   for(int i=1;i<=num;i++) {
			   for(int j=1;j<=i;j++) {
				  System.out.print(3);  
			   }
			   System.out.print("+");
		   }
		   // other way
		   System.out.println("");
		
           int a=0;
           for(int i=1;i<=num;i++) {
        	   a=(a*10)+3;
        	   System.out.print(a);
        	   System.out.print("+");
           }
  

	}
	private static void sum20() {
		// PRINT NUMBERS IN WORDS:
		   String a[]= {"","one","two","three","four","five","six","seven","Eight","nine","ten","eleven",
			   "twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
			   "eighteen","nineteen"};
		   String b[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"};
		   
		   Scanner s=new Scanner(System.in);
		   System.out.println("enetr a number between 1 to 100");
		   int num=s.nextInt();
		   
		   if((num<-1)||(num>101)) {
			   System.out.println("enter valid number");
		   }
		   else if (num<=19) {
			   System.out.println(a[num]);
		   }
		   else if((num>19)||(num<=100)) {
			   int n1=num/10;
			   int n2=num%10;
			   System.out.println(b[n1]+" "+a[n2]);   
		   }
		   
		   
		   
	}
	private static void sum19() {
		// PALINDROME OR NOT:
		System.out.println("enetr a string to check palindrome or not ");
		Scanner s=new Scanner(System.in);
		String ch=s.next();
		boolean a = false;
		int i=0,j=ch.length()-1;
		while(i<j) {
			if(ch.charAt(i)==ch.charAt(j)) {
				a=true;
			}
			else {
				a=false;
			}
			i++;
			j--;
		}
		
		if(a==true) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
	}
	private static void sum18() {
		// ANSWER IS PROGRAM NO:8
		 System.out.println("ANSWER IS PROGRAM NO: 8");
	}
	private static void sum17() {
		// COMMON ELEMENTS BETWEEN TWO ARRAY:
		
		int a1[]={1,2,5,7,6,9,8};
		int a2[]={1,0,6,4,7,4,9};
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
            if(a1[i]==a2[j]) {
            	System.out.println(a1[i]);
            }
			}
		}
	}
	private static void sum16() {
		// REMOVE DUPLICATE NUMBER IN ARRAY:

		int a[]= {10,20,30,40,10,20,30,60,70} ;
		int j=0,c=a.length;
		int []b=new int[c];
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if (a[i]!=a[i+1]) {
				b[j++]=a[i];
			}
		}
		for(int i=0;i<j;i++) { System.out.print(b[i]+" ");} 	
	

	}

	private static void sum15() {
		//1 to 100 prime numbers and Calculate Average
		int num=100;
		int a=0,sum=0;
        
		for(int i=2;i<num;i++) {
			 boolean n=true;
		    for(int j=2;j<i;j++) {
		    	if(i%j==0) {
		    		n=false;
		    	}
	               }
		     if(n==true){
		    		System.out.print(i+" ");
		    		sum+=i;
		    		a++;
		     }
		    
		}
		System.out.println();
		System.out.println(sum);
         System.out.println(a);
		
	}
	private static void sum14() {
		// write a program to check whether the sort-1 is prime or not. if not prime, print the factors.
		double sq=Math.sqrt(1);
		    System.out.println(sq);   
		if(sq>=1){
			int c=0;
			for(int i=1;i<=sq;i++ ) {
				if((sq%i)==0) {
					System.out.println(i);
					c++;
				}
			
			if (c==2) System.out.println("prime");
			else System.out.println("not a prime");
		}
	}
	}
	private static void sum13() {
		// CALCULATE SUM  OF 1….N NUMBERS:
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=s.nextInt();
		for(int i=0;i<=b;i++) {
			a+=i;
		}
		System.out.println(a);
	}
	private static void sum12() {
		// CALCULATE SUM OF N GIVEN NUMBERS
		int num=100;
		int num2=(num*(num+1))/2;
		int num3=0;
		System.out.println("with formula="+num2);
		for(int i=0;i<=num;i++) {
			 num3+=i;
		}
		System.out.println("without formula="+num3);
	}
	private static void sum11() {
        int array[]= {1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<array.length;i++){
        	sum+=array[i];
        }
		System.out.println(sum);
	}
	private static void sum10() {
		// SUM OF DIGITS USING RECURSIVE FUNCTION
		int sum=sums(2345);
		  System.out.println(sum);	
}
	private static int sums(int i) {
		if(i==0) {
			return 0;
		}
		return i%10+sums(i/10); 
	}
	// RECURSIVE FUNCTION end
	
	
	private static void sum9() {
	//	SUM OF DIGITS OF EVEN NUMBERS:
		int n=23457;
		int last;
		int odd=0;
		int even=0;
		while(n!=0) {
			last=n%10;
			if(last%2==0) {
				even=even+last;	
			}
			else {
				odd=odd+last;
			}
			n=n/10;
		}
		System.out.println(even);
		System.out.println(odd);
		
	}
	private static void sum8() {
		// Second Highest Number in An Integer Array
      int temp;
      int array[]= {20,10,30,80,40,25,60};
      for(int i=0;i<array.length;i++) {
    	  for(int j=i+1;j<array.length;j++) {
        	     if(array[i]>array[j]) {
        	    	 temp=array[i];
        	    	 array[i]=array[j];
        	    	 array[j]=temp;
        	     }
          }
      }
      for(int i=0;i<array.length;i++) {
    	  System.out.print(array[i]+" ");
      }
      System.out.print("second hightest number "+array[array.length-2]);
	}
	private static void sum7() {
		// Write a program to add two number without using addition operator.
		int a=1;
		int b=3;
		int c=a-(-b);
		System.out.println(c);
		
	}
	private static void sum6() {
		// SWAP OF TWO NUMBER WITH OUT USING TEMPORARY VARIABLE
		int a=1;
		int b=2;
		int t;
		System.out.println(a);
		System.out.println(b);
		//without using temporary variables
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	    
		//with using temporary variables
		t=b;
		b=a;
		a=t;
		System.out.println(a);
		System.out.println(b);
	}

	private static void sum5() {
	   //Check Even Or Odd WithOut Using Modulus and Division.
		int a=4;
	    String b=(a&1)==1?"odd":"even";
	    System.out.print(b);
		
	}

	private static void sum4() {
		// FIND GIVEN NUMBER ODD OR EVEN WITH OUT USING CONDITIONSTATEMENT:
		int a=5;
		int b=a%2;
		String c=b==0?"even":"odd";
		System.out.print(c);
	}

	private static void sum3() {
		//FIBONACCI SERIES
		int a=0,b=1,c;
		System.out.print(a);
	    System.out.print(" "+b);
		for(int i=0;i<10;i++) {
		    c=b+a; 
		    System.out.print(" "+c);
		    a=b;
		    b=c;
		   
		}
		
	  
	}

	private static void sum2() {
		// factorial
		int a=4;
		int fact=1;
		for(int i=1;i<=a;i++) {
			
			fact*=i;
			
		}
		System.out.println(fact);
	}

	private static void sum1() {
		
		// even or odd
		 int num;
		 Scanner n=new Scanner(System.in);
		 num=n.nextInt();
		 int num2=num%2;
		 if(num2==0){
			 System.out.println("this is a even number");
		 }
		 else {
			 System.out.println("this is a odd number");
		 }
	}
	

}
