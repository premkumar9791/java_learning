package interview_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import javax.swing.text.Keymap;

public class code_io_100_problems {
       
	public static void main(String[] args) {
		
		//problem1();
		//problem2();
		//problem3();
		//problem4();
	    //problem5();
		// problem6(); 
		// problem7();
		// problem8();
		// problem9();
		// problem10();
		// problem11();
		// problem12();
		// problem13();
		// problem14();
		// problem15();
		// problem15_1();
		// problem16();
		// problem17();
		// problem18();
		// problem19();   //pending
		// problem20();
		// problem21();
		// problem22();
		// problem23();
		// problem24();
		// problem25();
		// problem26();
		// problem27();
		// problem28();
		// problem29();
		// problem30();
		// problem31();
	    // problem32();
		// program34();
		// program35();
		// problem36();
		// problem37();
		// problem38();
		// problem39();
		// problem40();
		// problem41();
		// problem42();
		// problem43();
		// problem44();
		// problem45();
		// problem46();
		// problem47();
		// problem48();
		// problem49();
		   problem50();
	}
	
	private static void problem50() {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3};
		
		HashSet<Integer> n=new HashSet<Integer>();
		
		for(int x:a) {
			n.add(x);
		}
		for(int x:b) {
			n.add(x);
		}
		
		System.out.println(n.size());
	}

	private static void problem49() {
	    // find the missing element
		int a[]= {1,2,3,4};
		int n=5;
		int k=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(k-sum);
	}

	private static void problem48() {
		
		String a="A#$X@";
		StringBuffer b=new StringBuffer(a);
		
		int i=0;
		int j=a.length()-1;
		while(i<j) {
			if(!Character.isLetter(a.charAt(i))) {
			
				i++;
			}
			if(!Character.isLetter(a.charAt(j))) {
			
				j--;
			}
			else {
				b.setCharAt(i,a.charAt(j));
				b.setCharAt(j,a.charAt(i));
				i++;
				j--;
						
			     
			}
		}
		
		System.out.println(b);
	}

	private static void problem47() {
		
		int a[]= {1,1,1,1,2,2,4,5,5,5,5,5,6,6};
		
		
		System.out.print(a[0]);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.print(a[i+1]);
			}
		}

		
		}

	
	

	private static void problem46() {
		
		String input = "geeks for geeks";
        String output = removeDuplicates(input);
        System.out.println(output);

		
	}

	private static String removeDuplicates(String input) {
		
		   StringBuffer a=new StringBuffer(input);	
		   for(int i=0;i<input.length();i++) {
			   a.insert(0,input.charAt(i));
		   }
		   
		   String b=String.valueOf(a);
		   
		   LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
		   
		   for(char x:b.toCharArray()) {
			   if(x !=' ') {
			   uniqueChars.add(x);
		   }
			   }
		
		   StringBuilder result = new StringBuilder();
	        for (char c : uniqueChars) {
	            result.append(c);
	        }
	        
	        return result.toString();
	}

	private static void problem45() {
		
		//machine is isograme or not
		
		String a="machine";
		boolean ans=iso(a);
		System.out.println(ans);
		
	}

	private static boolean iso(String a) {
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char x:a.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1 );
		}
		
		 for (int count : map.values()) {
	            if (count > 1) {
	                return false;
	            }
	        }
		
		return true;
	}

	private static void problem44() {
		
		String a="RGRGR";
		
		int red=0;
		int green=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='R') {
				red++;
			}
			else {
				green++;
			}
		}
		
		System.out.println(Math.min(red,green));
	}

	private static void problem43() {
		// output n ="zy X";
		
		String a="xy Z";
		StringBuffer n=new StringBuffer(a);
		
		for(int i=0;i<a.length();i++) {
			if( ('a'<= a.charAt(i)) && (a.charAt(i)<= 'z')) {
						int s='a'- a.charAt(i);
						int k=s+'z';
						char l=(char)k;
					    n.setCharAt(i, l);
			}
			else if(( 'A' <= a.charAt(i)) && (a.charAt(i) <= 'Z')) {
				int s='A'- a.charAt(i);
				int k=s+'Z';
				char l=(char)k;
			    n.setCharAt(i, l);
			}
	}
		
		
		System.out.println(n);
		
	
	}

	private static void problem42() {
		// max cut of cake 2,4,7,11,16
		
		int n=4;
		int ans2=(2+n*n+n)/2;
        
		int ans=1;
		 for(int i=1;i<=n;i++) {
			 ans=ans+i;
		 }
		  System.out.println(ans2);
		  System.out.println(ans);
	
		
	}

	private static void problem41() {
		// v=200
		// w=540
		// x+y=v
		// 2x-4y=w
		// y=v-x
		// 2x-4(v-x)=w
		// 2x-4v-4x=w
		// 2x-2v=w
		//  x=(4*v-w)/2
		
		int v=200;
		int w=540;
		
		int x=(4*v-w)/2;
		int y=x-v;
		System.out.println(x);
		System.out.println(y);
	}

	private static void problem40() {
		// TODO Auto-generated method stub
		
		int a[]= {1,1,2,3,5,5};
		 int cuttinglen=a[0];
		 for(int i=0;i<a.length;i++) {
			 if(a[i]-cuttinglen >0) {
				 System.out.println(a.length-i);
				 cuttinglen=a[i];
			 }
		 }
	}

	private static void problem39() {
		
		String a="hhello";
		char b=rep(a);
		
		if(b !='\0') {
			System.out.println("given "+ a + " first repeating character is ="+ b);
		}
		else {
			System.out.println( " There is no repeating character in given input "+ a);
		}

		
		
		
	}

	private static char rep(String a) {
		
		Map <Character,Integer> map=new HashMap<>(); 
		
		for(char x:a.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1 );
		}
		
		for(char x:a.toCharArray()) {
			if(map.get(x)==1) {
				return x;
			}
		}
		
		return '\0';
	}

	private static void problem38() {
		
		int n=2;
		int a[]= {2,2};
		missrepeat(a,n);
		
	}

	private static void missrepeat(int[] a, int n) {
		
		int b[]=new int[n];
		int repcount=0;
		
		for(int i=0;i<n;i++) {
			if(b[a[i]-1]==1){
               repcount=a[i];
			}
			else {
				b[a[i]-1]=1;
			}
		}
		
		
		for(int i=0;i<n;i++) {
			if(b[i]==0) {
				System.out.println("missing num ="+(i+1));
			}
		}
		
		System.out.print("repeated num ="+repcount);
		
	}

	private static void problem37() {
		
		 Map<Integer, Integer> map = new HashMap<>();
	
	   int a[]= {1,2,2,1,1,3,3};
	   
	for(int num:a) {
		
		map.put(num, map.getOrDefault(num,0)+1);
	} 
	
	int pairs=0;
	
	//System.out.print(map);
     for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
		
    	 pairs=pairs+entry.getValue()/2;
		
	}
	
     System.out.println(pairs);
		
	}

	private static void problem36() {
		//A = &&
		//B = ||
		//C= ^
		
		String a="1C0C1C1A0B1";
	   boolean ans=a.charAt(0)=='1';
		
		for(int i=1;i<a.length();i=i+2) {
			if(a.charAt(i)== 'A') {
				ans=ans && (a.charAt(i+1)=='1');
			}
			else if(a.charAt(i)== 'B') {
				ans=ans || (a.charAt(i+1)=='1');
			}
			else if(a.charAt(i)== 'C') {
				ans=ans ^ (a.charAt(i+1)=='1');
			}
		}
		
		if(ans) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
		
	}

	private static void program35() {
		// 67542 -/+-
		
		String a="67542-/+-";
		
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			int n=(int) a.charAt(i);
			if(Character.isDigit(n)) {
				count++;
			}
		}
		

        int ans = Character.getNumericValue(a.charAt(0));
        int l = count;
        
		for(int i=1;i<count;i++) {
			 char op = a.charAt(l++);
	            int num = Character.getNumericValue(a.charAt(i));
	            if (op == '-')
	                ans -= num;
	            else if (op == '+')
	                ans += num;
	            else if (op == '/')
	                ans /= num;
	            else if (op == '*')
	                ans *= num;
			
			
		}
		
		System.out.println(ans);
		
	}

	private static void program34() {
	
		   int a[]= {1,2,3,4,5};
		   int b[]= {1,2,2,5};
		   
		   int count =0;
		   Set<Integer> set1= new HashSet<>();
		   
		   for(int num:a) {
               set1.add(num);
		   }
		   
		   Set<Integer> set2= new HashSet<>();
		   
		   for(int num:b) {
			   
			   if(set1.contains(num) && !set2.contains(num)) {
				   count++;
				   set2.add(num);
			   }
		   }
		   
		   System.out.println(count);
		   
	}

	private static void problem32() {
		// anagrames
		
		String a="act";
		String b="cat";
		
		char k[]=a.toCharArray();
		char k2[]=b.toCharArray();
		
		Arrays.sort(k2);
		Arrays.sort(k);
		
		String n=Arrays.toString(k2);
		String n1=Arrays.toString(k);
		
		if(n.equals(n1)) {
			System.out.println("it is a anagram");
		}
		else {
			System.out.println("it is not a anagrame");
		}
		
	}

	private static void problem31() {
		// squear - logn
		
	   int n=88;
	   int ans=pro31(n);
	   System.out.println(ans);
	   
	 
		
	}

	private static int pro31(int n) {
		  int beg=1;
		   int end=n;
		   int mid;
		   int ans = 0;
		   
		   while(beg<=end) {
			   
			    mid=(beg+end)/2;
			   
			    if(mid*mid == n) {	
			    	return mid;
			    }
			    else if (mid <= n/mid) {
			    	beg=mid+1;
			    	ans=mid;
			    }
			    else {
			    	end=mid-1;
			    }
		   }
		   
		return ans;
	}

	private static void problem30() {
		String a="abbacc";
		 
		int count=1;

		for(int i=1;i<a.length();i++) {
			
			if(a.charAt(i-1)!=a.charAt(i)) {
				String n=String.valueOf(a.charAt(i-1));
				System.out.print(n+count);
				count=1;
			}
			else{
				count++;
			}
			
		}
		String n=String.valueOf(a.charAt(a.length()-1));
		System.out.print(n+count);
	
	}

	private static void problem29() {
		
		String a="add";
		String b="egg";
		
		boolean ans=sum29(a,b);
		System.out.println(ans);
		
	}

	private static boolean sum29(String a, String b) {
		

        // Map<char,char> map=new HashMap<>();
         
         
		return true;
	}

	private static void problem28() {
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int gap=3;
//		output sum1=12,sum2=15,sum3=18
		
		
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int gap=3;
		
		for(int i=0;i<gap;i++) {
			int sum=0;
			for(int j=i;j<n;j+=3) {
				sum+=arr[j];
			}
			System.out.println(sum);
		}
	}

	private static void problem27() {
		// 2X2 arr
		
		int a[][]= {{1,0,0},
				    {0,0,1},
				    {0,0,0}};
		int r=a.length;
		int c=a[0].length;
		
		int row[]=new int[r];
		int col[]=new int[c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==1) {
				    row[i]=1;
				    col[j]=1;
				}
			}
		}
		
		for(int i=0;i<r;i++) {
			if(row[i]==1){
				for(int j=0;j<c;j++) {
					a[i][j]=1;
				}
			}
		}
		
		for(int j=0;j<c;j++) {
			if(col[j]==1){
				for(int i=0;i<r;i++) {
					a[i][j]=1;
				}
			}
		}
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void problem26() {
		// gcd
		
		int a=3;
		int b=6;
		
		int ans=gcd(a,b);
		System.out.println(ans);
	}

	private static int gcd(int a, int b) {
		if(b==0)
		return a;
		
		return gcd(b,a%b);
	}

	private static void problem25() {
		// ouput 1994
		String a="MCMXCIV";
		int ans =romanToInt(a);
		System.out.print(ans);
	}
	  public static int romanToInt(String s) {
	        
	        int n=s.length();
	        int sum=0;
	        for(int i=0;i<n;i++){
	            if(s.charAt(i)=='I'&& s.charAt(i+1)!='V'){
	                sum+=1;
	            }
	            else if(s.charAt(i)=='I'&&(s.charAt(i+1)=='V'|| s.charAt(i + 1) == 'X')){
	                sum-=1;
	                
	            }
	            else if(s.charAt(i)=='V'){
	                sum+=5;
	            }
	           
	             else if(s.charAt(i)=='X'&&s.charAt(i+1)!='C'){
	                sum+=10;
	            }
	             else if(s.charAt(i)=='X'&&(s.charAt(i + 1) == 'L' ||s.charAt(i+1)=='C')){
		                sum-=10;      
		            }
	             else if(s.charAt(i)=='L'){
	                sum+=50;
	            }
	             else if(s.charAt(i)=='C'&&s.charAt(i+1)!='M'){
	                sum+=100;
	            }
	             else if(s.charAt(i)=='C'&&(s.charAt(i + 1) == 'D' ||s.charAt(i+1)=='M')){
		                sum-=100;
		                
		            }
	             else if(s.charAt(i)=='D'){
	                sum+=500;
	            }
	             else if(s.charAt(i)=='M'){
	                sum+=1000;
	            }
	           
	            else{
	                sum+=0;
	            }
	        }
	   
	        
	        return sum;
	        
	    }

	private static void problem24() {
		// TODO Auto-generated method stub
		
		String a="bba";
		boolean ans=sum24(a);
		System.out.println(ans);
		
		
	
	}

	private static boolean sum24(String a) {
		
		  
		  for(int i=0;i<a.length();i++) {
			  int count=0;
			   for(int j=0;j<a.length();j++) {
				   if(a.charAt(i)==a.charAt(j)) {
					   count++;
				   }
			   }
			   if((int)a.charAt(i)-96!=count) {
				   return false;
			   }
			   
		   }
		return true;
	}

	private static void problem23() {
		
		int a=1;
		int b=3;
		int c=2;
		int n=6;
		
		int sum=0;
		for(int i=3;i<n;i++) {
			sum=a+b+c;
			a=b;
			b=c;
			c=sum;
		}
		System.out.println(sum);
	}

	private static void problem22() {
		// m=4 n=3
		// arr1={1,0,3,2}
		// arr2={2,0,4}
		//output {2,0,10,4,12,8}
		
		int a[]={1,0,3,2};
		int b[]={2,0,4};
		int m=4,n=3;
		int l[]=new int[m+n-1];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				l[i+j]+=a[i]*b[j];
			}
		}
		
		
			System.out.print(Arrays.toString(l));
			
		
		
	}

	private static void problem21() {
		// 1004
		//output 1554
		
		int a=1004;
		int c=0;
		int k=1;
		while(a>0) {
			
			int b=a%10;
			if(b==0) {
				c+=5*k;
			}
			else {
				c+=b*k;
			}
			k*=10;
			a=a/10;
		}
		
		System.out.println(c);
		
	}

	private static void problem20() {
		// s1=computer
		// s2=cat
		//output=ompuer
		
	    String s1="computer";
	    String s2="cat";
	    
		StringBuffer n=new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(s2.indexOf(c)== -1) {
				n.append(c);
			}
		}
		
		System.out.println(n);
	}

	private static void problem19() {
		// TODO Auto-generated method stub
		
		
	}

	private static void problem18() {
//	  input hello
//	  output svool
		
		String a="hello";
		StringBuffer ans=sum18(a);
		System.out.println(ans);
		
	}

	private static StringBuffer sum18(String a) {
		int n=a.length();
		int diff=0;
		StringBuffer copy=new StringBuffer();
		for(int i=0;i<n;i++) {
			
			if(Character.isUpperCase(a.charAt(i))) {
				diff=a.charAt(i)-'A';
				char num=(char)('Z'-diff);
				copy.append(num);
			}
			else if(Character.isLowerCase(a.charAt(i))) {
				diff=a.charAt(i)-'a';
				char num=(char)('z'-diff);
				copy.append(num);
			}
			else {
				copy.append(a.charAt(i));
			}
		}
			
		return copy;
	}

	private static void problem17() {
//		n=6 ,x=16
//	int	arr[]= {1,4,45,6,10,8};
//    output =yes;
//    6+10=16
		
		
		
		int n=6;
		int x=16;
		int arr[]={1,4,45,6,10,8};
		String ans=sum17(n,x,arr);
		System.out.println(ans);
		
	}

	private static String sum17(int n, int x, int[] arr) {
		
          HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			int com=x-arr[i];
			if(set.contains(com)) {
				return "yes";
			}
			 set.add(arr[i]);
		}
		return "no";
	}

	private static void problem16() {
		// input s= GeeksForGeeks
//		    x=fr
//		   output= -1 
//		   input s= GeeksForGeeks,x=For
//		   output =5
		
		String s="GeeksForGeeks";
		String x="For";
		int ans=find(s,x);
		System.out.println(ans);
		}

	private static int find(String s, String x) {
		int n=s.length();
		int m=x.length();
		
		for(int i=0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(s.charAt(i+j)!=x.charAt(j)) {
					break;
				}
			}
			
			
				if(j==m) {
					return i;
				}
			
		}
		
		return -1;
	}

	private static void problem15_1() {
		
		String s1="amazon";
		String s2="azonam";
		boolean ans=rotate1(s1,s2);
		System.out.println(ans);
	}

	private static boolean rotate1(String s1, String s2) {
		   int n = s1.length();
		    if (n != s2.length())
		        return false;
		    
		    
		    if (clockw(s1, s2) || anticw(s1, s2)) {
		        return true;
		    }
		    return false; 
		    
	
	}

	private static boolean anticw(String s1, String s2) {
	     int n=s1.length();
		    // Check if s2 is a rotation of s1 by rotating s1 clockwise
		    for (int i=1;i<n; i++) {
		        String rotated = s1.substring(i) + s1.substring(0,i);
		        if (rotated.equals(s2))
		            return true;
		    }
		return false;
	}

	static boolean clockw(String s1, String s2) {
	 
          int n=s1.length();
	    // Check if s2 is a rotation of s1 by rotating s1 clockwise
	    for (int i = 0; i < n; i++) {
	        String rotated = s1.substring(n - i) + s1.substring(0, n - i);
	        if (rotated.equals(s2))
	            return true;
	    }

	    return false;
	}

	private static void problem15() {
		// amazon -onamaz
		// output ture are flase
		
		String s1="amazon";
		String s2="azonam";
		boolean ans=rotate(s1,s2);
		System.out.println(ans);
	}

	private static boolean rotate(String s1, String s2) {
	    int n = s1.length();
	    if (n != s2.length())
	        return false;
	    
	    // Check if s2 is a rotation of s1 clockwise or anticlockwise
	    if (cw(s1, s2) || acw(s1, s2)) {
	        return true;
	    }
	    return false;

		
	}
       static boolean cw(String s1, String s2) {
		
		int n=s1.length();
		StringBuffer copy=new StringBuffer(s1);
		
		for(int i=0;i<n;i++) {
			char temp=copy.charAt(n - 1);
			copy.deleteCharAt(n-1);
			copy.insert(0, temp);
			 if (copy.toString().equals(s2)) {
		            return true;
		    }
		}
		
		return false;
		
	}
	
	static boolean acw(String s1, String s2) {
		
		int n=s1.length();
		StringBuffer copy=new StringBuffer(s1);
		for(int i=n-1;i>0;i--) {
			char temp=copy.charAt(0);
			copy.deleteCharAt(0);
			copy.append(temp);
			 if (copy.toString().equals(s2)) {
		            return true;
		    }
		}
		
		return false;
		
	}

	private static void problem14() {
		// n=5
		//arr[]={0,-1,2,3,1}
		//output=true
		//time=O(n^2)
		//space=O(1)
		
		int n=5;
		int arr[]={0,-1,2,3,1};
		boolean ans=false;
		Arrays.sort(arr);
	//	System.out.print(Arrays.toString(arr));
		
		for(int i=0;i<n-1;i++) {
			int l=i+1;
			int r=n-1;
			
			while(l<r) {
				
				if(arr[i]+arr[l]+arr[r] == 0) {
					ans=true;
					break;
				}
				else if(arr[i]+arr[l]+arr[r] > 0){
					r--;
				}
				else {
				   l++;
				}
				
			}
			
		}
		System.out.print(ans);
		
	}

	private static void problem13() {
		// int n=3
//	int mat[][]= {{6,5,4},
//		          {1,2,5},
//		          {7,9,7}};
//	
//	output 29 32
		
		int n=3;
		int mat[][]= {{6,5,4},
		              {1,2,5},
		              {7,9,7}};
		int lowerT=0;
		int upperT=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
				lowerT+=mat[i][j];
			}
			for(int j=i;j<3;j++) {
				upperT+=mat[i][j];
			}
		}
		
	
		
		System.out.println("lowerT="+lowerT);
		System.out.println("upperT="+upperT);
	}

	private static void problem12() {
		// find the sum of  values in two arr in count
		
		int a[]= {1,3,5,7};
		int b[]= {2,3,5,8};
		int n=4;
		int m=4;
		int sum=10;
		int count=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]+b[j]==sum) {
					count++;
				}
			}
		}
		System.out.print(count);
		int par=prob12(a,b,n,m,sum);
	}

	private static int prob12(int[] a, int[] b, int n, int m, int sum) {
		
		int par=0;
		int i=0;
		int j=n-1;
		
		while(i<m &&j>=0) {
			if(a[i]+a[j]==sum) {
				par++;
				i++;
				j--;
			}
			else if(a[i]+a[j]<sum) {
				i++;
			}
			else {
				j--;
			}
			
		}
		
		return par;
	}

	private static void problem11() {
		// int a[]={2,5,4,9,7};
		//output 4 and 5 = 1 minmum value of any two between nums
		
		int a[]={2,5,4,9,7};
		Arrays.sort(a);
		
		int min=a[a.length-1];
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i]<min) {
				min=a[i+1]-a[i];
			}
		}
		
		System.out.print(min);
		
	}

	private static void problem10() {
		// n=5
		// a="badcs";
		
		String a="badcs";
		
		for(char i='a';i<='z';i++) {
			for(int j=0;j<a.length();j++) {
				if(i==a.charAt(j)) {
					System.out.print(i);
				}
			}
		}
	}

	private static void problem9() {
		// int a[][]={{1,2,3}{4,5,6}{7,8,9}};
		// output = 123654789
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++) {
			 if((i%2==0)) {
			for(int j=0;j<3;j++) {
			    	System.out.print(a[i][j]);
			}
			    }	
			    else {
			    	for(int j=2;j>=0;j--) {
			    	System.out.print(a[i][j]);
			    	}
			    }
			}	
		}
		
	

	private static void problem8() {
		//int n=5
		//int k=3
		//int a[]={1,2,3,4,5};
		
		int n=5;
		int k=3;
		int a[]= {1,2,3,4,5};
		
		Stack<Integer> l=new Stack<Integer>();
		
		for(int i=0;i<k;i++) {
			l.push(a[i]);
			
		}
		for(int j=0;j<k;j++) {
			a[j]=l.pop();
		}
		
		System.out.print(Arrays.toString(a));
		
	}

	private static void problem7() {
		// n=5
		//arr[]={0,2,1,2,0}
		
		int n=5;
		int arr[]= {0,2,1,2,0};
		int c0=0;
		int c1=0;
		int c2=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c0++;
			}
			else if(arr[i]==1) {
				c1++;
			}
			else {
				c2++;
			}
		}
		
		for(int j=0;j<c0;j++) {
			arr[j]=0;
		}
		for(int j=c0;j<c1+c0;j++) {
			arr[j]=1;
		}
		for(int j=c1+c0;j<arr.length;j++) {
			arr[j]=2;
		}
		
		System.out.print(Arrays.toString(arr));
		
	}

	private static void problem6() {
		// int a[]={1,2,3,4,5};
		// output={3,4,5,2,1}
		
		int a[]={1,2,3,4,5};
		
		int temp;
		
		for(int i=0;i<a.length-2;i++) {
			 temp=a[i+2];
			 a[i+2]=a[i];
			 a[i]=temp;
		}
		
		for(int x:a) {
			System.out.print(x);
		}
	}

	private static void problem5() {
		//int n=5;
		//int a[]={2,2,5,1,3};
		// output=5
		
		int n=5;
		int a[]={2,2,5,1,3};
		int ans=prob5(a,n);
		System.out.println(ans);
	}

	private static int prob5(int[] a, int n) {
	    int sum_a=0;
	    int sum_b=0;
		for(int i=0;i<a.length;i++) {
			sum_a+=a[i];
		}
		for(int j=0;j<a.length;j++) {
			sum_a-=a[j];
			if(sum_a==sum_b) {
				return j;
			}
			sum_b+=a[j];
		}
		return -1;
	}

	private static void problem4() {
		// n=9
		// arr[]={1,15,25,45,42,21,17,12,11};
		// output =45;
		
		int n=9;
		int arr[]={1,15,25,45,42,21,17,12,11};
		
		int ans=prob4(n,arr);
		System.out.println(ans);
		
	}

	private static int prob4(int n, int[] arr) {
		int beg=0;
		int end=n;
		
		while(beg<end) {
			int mid=(beg+end)/2;
			
			if((arr[mid-1]<arr[mid])&&(arr[mid]>arr[mid+1])) {
				return arr[mid];
			}
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else {
				beg=mid+1;
			}
		}
		return 0;
	}

	private static void problem3() {
		//  n=7
		//  a=[1,2,3,4,5,6,7]
		//  b=[1,2,3,8,5,6]
		
		int a[]= {1,2,3,9,5,6,7};
		int b[]= {1,2,3,4,5,6};
		int n=7;
		
		int ans=missing(a,b,n);
		
		System.out.print(ans);
		
	}

	private static int missing(int[] a, int[] b, int n) {
		int beg=0;
		int end=n-1;
		int index=0;
		
		while(beg<=end) {
			
			int mid=(beg+end)/2;
			
			if(a[mid]==b[mid]) {
				beg=mid+1;
			}
			else {
				index=mid;
				end=mid-1;
			}
		}
		return index;
		
	}

	private static void problem2() {
		// input =java.is.a.highlevel.programing
		//  output=programing.highlevel.a.is.java
		
	   String s="java.is.a.highlevel.programing";
	   
	   Stack <String> words =new Stack<String>() ;
	   String a=" ";
	   
	   for(int i=0;i<s.length();i++) {
		   
		   if(s.charAt(i)=='.') {
			   words.push(a);
			   a=" ";
		   }
		   else {
			   a+=s.charAt(i);
		   }
     
	   }
	   words.push(a);
	   
	   String ans=" ";
	   ans+=words.pop();
	   
	   while(!words.isEmpty()) {
		   ans+='.';
		   ans+=words.pop();
	   }
	  
	   System.out.println(ans);
	
	}

	private static void problem1() {
		// input {0,0,0,1,1,1}
		// output 3
		
		int a[]= {0,0,0,1,1};
		int n=5;
		
		int ans=trans(a, n);
		
		System.out.println(ans);
	
		}

	private static int trans(int a[], int n) {
		int beg=0;
		int end=n-1;
		
		
		if(n==1&&a[0]==0) {
			return -1;
		}
		int flag=0;
		
		while(beg<=end) {
			
			int mid=(beg+end)/2;
			
			if(a[mid]==1&&a[mid-1]==0) {
				return mid;
			}
			else if(a[mid]==1) {
				flag=1;
				end=mid-1;
			}
			else {
				beg=mid+1;
			}
			
		}
		
		if(flag==0) {
		   return -1;
		}
		return flag;
	}
	
	
} 