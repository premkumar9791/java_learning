package interview_problems;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.ValueExp;

import map.map;

public class Zoho_round_2_problems {

	public static void main(String[] args) {
		//set 1
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8(); 
		//p9();
		
		// SET 2:
		//p10();
	    //p11();
		//p12();
		//p13();
		//p14();
		
		// SET 3:
		//p15();
		//p16();
		//p17();
		//p18();
		//p19();
		//p20();
		//p21();
		//p22(); 
		//p23();
		//p24();
		//p25();
		//p26();
		//p27();
		//p28();
		//p29();
		//p30();
		//p31();
		
		//SET 6:
		//p32();
		//p33();
		//p34();
		//p35();
		
		//SET 7:
		//p36();
		//p38();
		//p39();
		//p40();
		//p41();
		
		//SET 8:
	    //p42();
		//p43();
		//p44();
		//p45();
		//p46();
		
		//SET 9:
		//p47();
		//p48();
		//p49();
		//p50();
		
		//SET 10:
		//p51();
		//p52();
		//p53();
		//p54();
		//p55();
		//p56();
		//p57();
		//p58();
		//p59();
		//p60();
		//p61();
		//p62();
		//p63();
		//p64();
		//p65();
		//p67();
		//p68();
		//p69();
		//p70();
		//p71();
		//p72();
		//p73();
		//p74();
		//p75();
		//p76();
		//p77();
		//p78();
		//p79();
		//p80();
		//p81();
		//p82();
		//p83();
		//p84();
		//p85();
		//p86();
		//p87();
		//p88();
		//p89();
		//p90();
		//p91();
		//p92();
		//p93();
		//p94();
		//p95();
		//p96();
	    //p97();
		//p98();
		//p99();
		//p100();
	    //p101();
		//p102();
		//p103();
		//p104();
		//p105();
		//p106();
		//p107();
	    //p108();
		//p109();
		//p110();
		//p111();
		//p112();
		//p113();
		//p114();
		//p115();
		//p116();
		//p117();
		//p118();
		//p119();
		//p120();
		//p121();
		//p123();
		//p124();
		//p125();
		//p126();
		//p127();
		//p128();
		//p129();
		//p130();
		//p131();
		//p132();
		//p133();
		//p134();
		//p135();
		//p136();
		//p137();
		//p138();
		//p139();
		//p140();
		//p141();
		//p142();
		//p143();
		//p144();
		//p145();
		//p146();
		//p147();
		//p148();
		//p149();
		//p150();
		//p151();
		//p152();
		//p153();
		//p154();
		//p155();
		//p156();
		
        //SET 11:
		//p157();
		
		//SET 12:
		//p158();
		
}
	private static void p158() {
//		1) Alternate sorting: Given an array of integers, 
//rearrange the array in such a way that the first element is first maximum 
//and second element is first minimum.
//	Eg.) Input : {1, 2, 3, 4, 5, 6, 7}
//	Output : {7, 1, 6, 2, 5, 3, 4}
		
		int a[] = {1, 2, 3, 4, 5, 6, 7};
	    
	    int i = 0;
	    while (i < a.length) {
	    	
	        int max = Integer.MIN_VALUE;
	        for (int j = i; j < a.length; j++) {
	            if (a[j] > max) {
	            	 max = a[j];
	                a[j] = a[i];
	                a[i] = max; 
	            }
	        }
	        
	        i++;
	        int min = Integer.MAX_VALUE;
	        for (int j = i; j < a.length; j++) {
	            if (a[j] < min) {
	            	min = a[j];
	                a[j] = a[i];
	                a[i] = min;
	            }
	        }
	        
	        i++;
	    }
	    
	    System.out.println(Arrays.toString(a));

		
	}


	private static void p157() {
//		SET 11:
//			1. Print the word with odd letters as
//			P M
//			R A
//			O R
//			G
//			O R
//			R A
//			P M
		 //program
		
		String a="PROGRAM";
		
		int i=0;
		int j=a.length()-1;
		while(i<j) {
			
			System.out.print(a.charAt(i)+" "+a.charAt(j));
			System.out.println();
			i++;
			j--;
		}
	
        while(i!=-1 && j != a.length()) {
			
			System.out.print(a.charAt(i)+" "+a.charAt(j));
			System.out.println();
			i--;
			j++;
		}
	}


	private static void p156() {
//		106) Given a string, change the order of words in the
//string (last string should come first).
//	Should use RECURSION
//	Sample:   one two three 
//	Output :  three two one
		
		  String input = "one two three";
	        String reversed = reverseWordsRecursively(input);
	        System.out.println("Output: " + reversed);
	}
	 public static String reverseWordsRecursively(String input) {
	      
	        String a[]=input.split(" ");
	        String b="";
	        for(int i=a.length-1;i>=0;i--) {
	        	b+=a[i]+" ";
	        }
	        return b;
	    }

	private static void p155() {

//105) Given a 2D grid of characters, you have to search for all the words in a dictionary by
//moving only along two directions, either right or down. Print the word if it occurs.
//Sample :         
//  a   z  o   l 
//  n   x  h   o
//  v   y   i   v 
//  o   r   s  e 
// Dictionary = {van, zoho, love, are, is} 
// Output: 
//    zoho 
//    love 
//    Is 

		   char[][] grid = {
	                {'a', 'z', 'o', 'l'},
	                {'n', 'x', 'h', 'o'},
	                {'v', 'y', 'i', 'v'},
	                {'o', 'r', 's', 'e'}
	        };
	        String[] dictionary = {"van", "zoho", "love", "are", "is"};

	        List<String> foundWords = findWords(grid, dictionary);
	        
	     
	        for (String word : foundWords) {
	            System.out.println(word);
	        }
	}
	 public static List<String> findWords(char[][] grid, String[] dictionary) {
	        List<String> foundWords = new ArrayList<>();
	        int m = grid.length;
	        int n = grid[0].length;

	        for (String word : dictionary) {
	            if (existsInGrid(grid, word, m, n)) {
	                foundWords.add(word);
	            }
	        }

	        return foundWords;
	    }

	    public static boolean existsInGrid(char[][] grid, String word, int m, int n) {
	        int len = word.length();
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	              
	                if (grid[i][j] == word.charAt(0)) {
	                   
	                    int k;
	                    for (k = 1; k < len && j + k < n; k++) {
	                        if (grid[i][j + k] != word.charAt(k)) {
	                            break;
	                        }
	                    }
	                    if (k == len) {
	                        return true;
	                    }
	                   
	                    for (k = 1; k < len && i + k < m; k++) {
	                        if (grid[i + k][j] != word.charAt(k)) {
	                            break;
	                        }
	                    }
	                    if (k == len) {
	                        return true; 
	                    }
	                }
	            }
	        }
	        return false;
	    }

	private static void p154() {
		  String input = "house no : 123@ cbe";
	        String reversed = reverseStringWithPunctuations(input);
	        System.out.println("Output: " + reversed);
		
	}
	 public static String reverseStringWithPunctuations(String input) {
	        char[] chars = input.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;

	      
	        while (left < right) {
	            if (!Character.isLetterOrDigit(chars[left])) {
	                left++;
	            } else if (!Character.isLetterOrDigit(chars[right])) {
	                right--;
	            } else {
	                
	                char temp = chars[left];
	                chars[left] = chars[right];
	                chars[right] = temp;
	                left++;
	                right--;
	            }
	        }

	       
	        return new String(chars);
	    }
	

	private static void p153() {
//		103) Find the largest sum contiguous subarray which 
//should not have negative numbers. We have to print the sum and the corresponding 
//array elements which brought up the
//	sum.
//	Sample: 
//	Array : {¬2, 7, 5, ¬1, 3, 2, 9, ¬7} 
//	Output: 
//	     Sum : 14 
//	     Elements : 3, 2, 9 
		
		  int a[]= {-2, 7, 5, -1, 3, 2, 9, -7};
		  int b[]=new int[a.length];
		  int sum=0;
		  boolean n=false;
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]<0) {
				 n=!n;
			  }
			  if(a[i]>0 && n){
				 sum+=a[i]; 
			  }
			  else if(n==false) {
				  b[i]=sum;
				  sum=0;
				  n=true;
			  }
		  }
		  

		  
		  int k=0,m=0;
		  for(int i=0;i<b.length;i++) {
			  if(k<b[i]) {
				  k=b[i];
				  m=i;
			  }
		  }
		  
		  for(int j=m-1;j>0;j--) {
			  if(a[j]>0) {
				  System.out.print("element"+a[j]+",");
			  }
			  else {
				  break;
			  }
		  }
		  System.out.println();
		  
		  System.out.println("sum of element"+k);
		  
	

	}


	private static void p152() {

//102) Given an array, find the minimum of all the greater 
//numbers for each element in the array.
//Sample: 
//Array : {2, 3, 7, ¬1, 8, 5, 11} 
//Output: 
//{2¬>3, 3¬>5, 7¬>8, ¬1¬>2, 8¬>11, 5¬>7, 11¬>} 

		 int[] array = {2, 3, 7, -1, 8, 5, 11};
	        Map<Integer, Integer> result = minimumOfGreaterNumbers(array);
	        
	       
	        for (int num : array) {
	            System.out.print(num + " -> ");
	            if (result.containsKey(num)) {
	                System.out.println(result.get(num));
	            } else {
	                System.out.println();
	            }
	        }
	}
	public static Map<Integer, Integer> minimumOfGreaterNumbers(int[] array) {
        Map<Integer, Integer> result = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            while (!stack.isEmpty() && stack.peek() < num) {
                result.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            result.put(stack.pop(), null);
        }

        return result;
    }

	private static void p151() {
//		101 Given an array of positive integers. The output
//		should be the number of occurrences of each number.
//		Example:
//		Input: {2, 3, 2, 6, 1, 6, 2}
//		Output:
//		1 – 1
//		2 – 3
//		3 – 1
//		6 – 2
		
		 int[] input = {2, 3, 2, 6, 1, 6, 2};

	        Map<Integer, Integer> occurrences = countOccurrences(input);

	     
	        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
		
	}

	 public static Map<Integer, Integer> countOccurrences(int[] nums) {
	        Map<Integer, Integer> occurrences = new HashMap<>();
	        for (int num : nums) {
	            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
	        }
	        return occurrences;
	    }
	private static void p150() {
//		99. Given an odd length word which should be printed
//		from the middle of the word.
//		The output should be in the following pattern.
//		Example:
//		Input: PROGRAM
//		Output:
//		              G
//		            GR
//		          GRA
//		       GRAM
//		     GRAMP
//		   GRAMPR
//		GRAMPRO
		
		String a="PROGRAM";
		String b="";
		for(int i=a.length()/2;i<a.length();i++) {
			b+=a.charAt(i);
		}
		for(int i=0;i<a.length()/2;i++) {
			b+=a.charAt(i);
		}
		
		
		
		for(int i=0;i<a.length();i++) {
			for(int j=i;j<a.length();j++) {
				System.out.print(" ");
			}
			for(int j=i;j<a.length();j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(b.charAt(k));
			}
			System.out.println();
		}
		
		
	}


	private static void p149() {
//		98. Given unsorted array find all combination of the 
//		element for a given sum. Order should be maintained.
//		Input 
//		8 3 4 7 9 N=7
//		Output
//		{3 4 } {7}
		int[] inputArray = {8, 3, 4, 7, 9};
        int target = 7;
        List<List<Integer>> combinations = findCombinations(inputArray, target);
        System.out.println("Output:");
        for (List<Integer> combination : combinations) {
            System.out.print("{");
            for (int i = 0; i < combination.size(); i++) {
                System.out.print(combination.get(i));
                if (i < combination.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("}");
        }
	}
	 public static List<List<Integer>> findCombinations(int[] arr, int targetSum) {
	        List<List<Integer>> result = new ArrayList<>();
	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0;
	            List<Integer> combination = new ArrayList<>();
	            for (int j = i; j < arr.length; j++) {
	                sum += arr[j];
	                combination.add(arr[j]);
	                if (sum == targetSum) {
	                    result.add(new ArrayList<>(combination));
	                    break;
	                }
	                if (sum > targetSum) {
	                    break;
	                }
	            }
	        }
	        return result;
	    }


	private static void p148() {

//97. Given array find maximum sum of contiguous sub array
//{-2 -3 4 -1 -2 1 5 -3}
//output 7 elements [ 4 -1 -2 1 5]
		 int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

	        SubarrayResult result = findMaximumSubarraySum(array);
	        System.out.println("Maximum sum of contiguous subarray: " + result.sum);
	        System.out.println("Subarray elements: " + java.util.Arrays.toString(result.subarray));
	}
	 public static SubarrayResult findMaximumSubarraySum(int[] array) {
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;
	        int start = 0;
	        int end = 0;
	        int tempStart = 0;

	        for (int i = 0; i < array.length; i++) {
	            currentSum += array[i];

	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	                start = tempStart;
	                end = i;
	            }

	            if (currentSum < 0) {
	                currentSum = 0;
	                tempStart = i + 1;
	            }
	        }

	        // Extract subarray
	        int[] subarray = new int[end - start + 1];
	        for (int i = start; i <= end; i++) {
	            subarray[i - start] = array[i];
	        }

	        return new SubarrayResult(maxSum, subarray);
	    }

	    static class SubarrayResult {
	        int sum;
	        int[] subarray;

	        SubarrayResult(int sum, int[] subarray) {
	            this.sum = sum;
	            this.subarray = subarray;
	        }
	    }

	private static void p147() {
//		96. Write function to find multiplication of 2 numbers using +
//		operator You must use minimum possible iterations.
//		Input: 3 , 4
//		Output 12
	
		  int num1 = 3;
	        int num2 = 4;

	        int result = multiply(num1, num2);
	        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
	}

    public static int multiply(int num1, int num2) {
        int result = 0;
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

          for (int i = 0; i < num2; i++) {
            result += num1;
        }

        return result;
    }
	private static void p146() {
//		95. Compiuting value of sin (x)
//		Input x = 30 n = 10
//		output = 0.5
//		Hint : The equation sin(x) = x – x^3 / 3! + x^5 / 5! – ….
		double x = 30; // Angle in degrees
        int n = 10; // Number of terms in the Taylor series

        double sinX = computeSin(x, n);
        System.out.println("sin(" + x + ") = " + sinX);

	}
	  public static double computeSin(double x, int n) {
	        // Convert angle from degrees to radians
	        x = Math.toRadians(x);

	        double sinValue = 0;

	        for (int i = 0; i < n; i++) {
	            // Calculate numerator: x^(2 * i + 1)
	            double numerator = Math.pow(x, 2 * i + 1);
	            // Calculate denominator: (2 * i + 1)!
	            double denominator = factorial(2 * i + 1);
	            // Calculate term value: (-1)^i * (x^(2 * i + 1) / (2 * i + 1)!)
	            double term = Math.pow(-1, i) * (numerator / denominator);
	            // Add the term to the sin value
	            sinValue += term;
	        }

	        return sinValue;
	    }

	    public static double factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        double result = 1;
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	private static void p145() {

//94.Given sorted array check if two numbers sum in it is a given
//value
//Input
//Array = {1 3 4 8 10 } N = 7
//output
//true
		  int[] array = {1, 3, 4, 8, 10};
	        int target = 7;

	        boolean result = hasTwoSum(array, target);
	        System.out.println(result);
	}
	 public static boolean hasTwoSum(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left < right) {
	            int sum = array[left] + array[right];
	            if (sum == target) {
	                return true;
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return false;
	    }

	private static void p144() {
//		93. Adding 2 numbers
//
//		Given 2 huge numbers as separate digits, store them in 
//		array and process them and calculate the sum of 2 numbers and 
//		store the result in an array and print the sum.
//		Input:
//		Number of digits:12
//		9 2 8 1 3 5 6 7 3 1 1 6
//		Number of digits:9
//		7 8 4 6 2 1 9 9 7
//		Output :
//		9 2 8 9 2 0 2 9 5 1 1 3 3
		
        int[] num1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};

        int[] num2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};

      
        int[] sum = addNumbers(num1, num2);

         System.out.println("Sum:");
        for (int digit : sum) {
            System.out.print(digit + " ");
        }
	}
	 public static int[] addNumbers(int[] num1, int[] num2) {
	        int maxSize = Math.max(num1.length, num2.length);
	        int[] sum = new int[maxSize + 1];
	        int carry = 0;

	        for (int i = 0; i < maxSize; i++) {
	            int digit1 = (i < num1.length) ? num1[num1.length - 1 - i] : 0;
	            int digit2 = (i < num2.length) ? num2[num2.length - 1 - i] : 0;
	            int total = digit1 + digit2 + carry;
	            sum[maxSize - i] = total % 10;
	            carry = total / 10;
	        }

	        if (carry > 0) {
	            sum[0] = carry;
	        } else {
	   
	            for (int i = 0; i < maxSize; i++) {
	                sum[i] = sum[i + 1];
	            }
	        }

	        return sum;
	    }

	private static void p143() {
//		92 : Write a program to form lines using given set of words. 
//		The line formation should follow below rules.
//
//		i) Total characters in a single line excluding the
//          space between the words and the favorite character should
//          not exceed the given number.
//
//		ii) Favorite character is case insensitive.
//
//		iii) Words should not be broken up. Complete words 
//            alone should be used in a single line. A word
//            should be used in one line only.
//		Input : Max char per line = 10
//		        Favorite character = 'o'
//		        Words : Zoho, Eating, Watching, Pogo
//		                Loving, Mango
//		Output : Watching Zoho
//		         Eating Mango
//		         Loving Pogo.
		
		String a[]= { "Zoho", "Eating","Watching", "Pogo" ,"Loving", "Mango"};
		int l=10;
		char c='o';
		
		Set<String> n=new HashSet<>();
		
		List<String> h=new LinkedList<>();
		for(String x:a) {
			h.add(x);
		}
		

		for(int i=0;i<h.size();i++) {
			for(int j=0;j<h.size();j++) {
				String m=h.get(i)+" "+h.get(j);
				if(fav(m,c,l)) {
				n.add(m);
				h.remove(i);
				h.remove(j);
			}
			
		}
	}
		
		Iterator<String> b=n.iterator();
		while(b.hasNext()) {
		 System.out.println(b.next());
		  }
		
		
		System.out.println(h);
		
	}


	private static boolean fav(String m, char c, int l) {
		
		for(int i=l;i<m.length();i++) {
			if(String.valueOf(c).equalsIgnoreCase(String.valueOf(m.charAt(i)))) {
				return true;
			}
		}
		return false;
	}


	private static void p142() {
		// 90: Given a string, reverse only vowels in it; leaving rest of 
		//the string as it is.

//Input : abcdef
//
//Output : ebcdaf
		
		String a="abcdef";
		char b[]=a.toCharArray();
		
		int i=0;
		int j=a.length()-1;
		
		while(i<j) {
			if(!vowels(b[i])) {
			    i++;	
			}
			
			if(!vowels(b[j])) {
				j--;
			}
			
			if(vowels(b[i])&&vowels(b[j])) {
				char temp =b[i];
				b[i]=b[j];
				b[j]=temp;
				i++;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}


	private static boolean vowels(char c) {
		switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
			default: 
				return false;
		}
	}


	private static void p141() {

//89. Given an array of numbers and a window of size k. Print the maximum
//of numbers inside the window for each step as the window moves from the 
//beginning of the array.
//  INPUT  :
//  Enter the array size  :  8
//  Enter the elements  :  1,3,5,2,1,8,6,9
//  Enter the window size  :  3
//  OUTPUT  :
//  5 5 5 8 8 9
		
		int a[]= {1,3,5,2,1,8,6,9};
		int n=8;
		int s=3;
		
		for(int i=0;i<a.length-s+1;i++) {
			int max=0;
			for(int j=i;j<i+s;j++){
				if(a[j]>max) {
					max=a[j];
				}
			}
			System.out.print(max+" ");
		}
		
		
		
		
	}


	private static void p140() {
//		88. Given an array of numbers and a number k. Print the maximum 
//		possible k digit number which can be formed using given numbers.
//		  INPUT  :  
//		  Enter the array size  :  4
//		  Enter the elements  :  1 4 973 97
//		  Enter number of digits  :  3
//		  OUTPUT  :
//		  974 
//		  INPUT  :  
//		  Enter the array size  :  6
//		  Enter the elements  :  1 4 89 73 9 7
//		  Enter number of digits  :  5
//		  OUTPUT  :
//		  98973
		
//		String a[]= {"1","4","973","97"};
//		int n=3;
		String a[]= {"1","4","89","73","9","7"};
		int n=5;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String ans="";
		for(int i=a.length-1;i>=0;i--) {
			String l=a[i];
			if(l.length()<=n) {
			for(int j=0;j<l.length();j++) 
			{
				ans+=l.charAt(j);
				n--;
			}
			}
		}
		
	System.out.println(ans);
	}


	private static void p139() {
//		88. Given an array of numbers and a number k. Print the maximum 
//		possible k digit number which can be formed using given numbers.
//		  INPUT  :  
//		  Enter the array size  :  4
//		  Enter the elements  :  1 4 973 97
//		  Enter number of digits  :  3
//		  OUTPUT  :
//		  974 
//		  INPUT  :  
//		  Enter the array size  :  6
//		  Enter the elements  :  1 4 89 73 9 7
//		  Enter number of digits  :  5
//		  OUTPUT  :
//		  98973
		
		String a[]= {"1","4","973","97"};
		int n=3;
//		String a[]= {"1","4","89","73","9","7"};
//		int n=5;
		
		Arrays.sort(a,new Comparator<String>() {
			public int compare(String a ,String b) {
				String ab=a+b;
				String ba=b+a;
				return ba.compareTo(ab);
			}
		});

		System.out.println(Arrays.toString(a));
		
		String ans="";
		for(int i=0;i<a.length;i++) {
			String l=a[i];
			if(l.length()<=n) {
			for(int j=0;j<l.length();j++) {
				ans+=l.charAt(j);
				n--;
			}
			}
			
		}
		
		System.out.println(ans);
	}


	private static void p138() {
//		8. Given an array of numbers. Print the numbers without duplication. 
//		  INPUT  :  
//		  Enter the array size  :  4
//		  Enter the elements  :  1 1 2 4  
//		  OUTPUT  :
//		  1 2 4 
		int a[]= {1,1,2,4};		
		Set<Integer> n=new TreeSet<>();
		for(int x:a) {
			n.add(x);
		}

		Iterator<Integer> l=n.iterator();
		while(l.hasNext()) {
			System.out.print(l.next()+" ");
		}
	}
	


	private static void p137() {
//		86. Given two arrays. Find its union.
//		  Input  : 
//		  Enter size of first array  :  6
//		  Enter the elements    :  1 2 3 4 5 3
//		  Enter size of second array  :  4
//		  Enter the elements    :  1 2 7 5
//		  OUTPUT  :
//		 1 2 3 4 5 7
		
		int a[]= { 1 ,2 ,3 ,4, 5, 3};
		int b[]= {1 ,2 ,7 ,5};		
		Set<Integer> n=new TreeSet<>();
		for(int x:a) {
			n.add(x);
		}
		for(int z:b) {
			n.add(z);
		}
		
		Iterator<Integer> l=n.iterator();
		while(l.hasNext()) {
			System.out.print(l.next()+" ");
		}
	}


	private static void p136() {

//85. Given an array of positive numbers. Print the numbers which
//have longest continuous range.
//  Ex.  INPUT  :  
//    Enter array size  :  8
//    Enter arryay elements  :  1 3 10 7 9 2 4 6
//    OUTPUT  :
//    1 2 3 4
//  Ex.  INPUT  :  
//    Enter array size  :  8
//    Enter arryay elements  :  1 3 9 7 8 2 4 6  
//    OUTPUT  :
//    1 2 3 4
//    6 7 8 9
		
		//int a[]= {1, 3, 10, 7 ,9, 2 ,4 ,6};
		int a[]= {1, 3 ,9 ,7 ,8 ,2 ,4 ,6};
		Arrays.sort(a);
		
		int coutn=0;
		String n="";
		for(int i=0;i<a.length-1;i++) {		
		if(a[i]==a[i+1]-1) {
			coutn++;
			 n+=(String.valueOf(a[i])+" ");
		}
		else {
			n="";
			coutn=0;
		}
		
		 if(coutn>2) {
			 n+=(String.valueOf(a[i+1])+" ");
			System.out.println(n);
		}
		
		}
		
		
	}


	private static void p135() {
//		84. Given a two dimensional array which consists of only 0’s
//		and 1’s. Print the matrix without duplication.
//		  Ex.  INPUT  :
//		    Enter Row Size    :  4
//		    Enter column size  :  3
//		    Enter the matrix  :
//		    1 0 1
//		    1 1 0
//		    1 1 1
//		    1 0 1    
//		    OUTPUT  :
//		    Unique Matrix  :
//		    1 0 1
//		    1 1 0
//		    1 1 1
		
		int a[][]= {{1,0,1}
		           ,{1,1,0},
		            {1,1,1},
		            {1,0,1}};
		int r=4;
		int c=3;
		matr(a,r,c);
	}

	private static void matr(int[][] a, int r, int c) {
      Set<String> n=new HashSet<>();
      
      for(int[] k:a) {
    	  StringBuffer l=new StringBuffer();
    	  for(int h:k) {
    		l.append(h).append(" ");  
    	  }
    	  
    	  String s=l.toString();
    	  if(!n.contains(s)) {
    		 System.out.println(s);
    		 n.add(s);
    	  }  
      }
		
	}


	private static void p134() {
//		83. Print the following pattern
//		  Ex.  INPUT  :  5
//		    OUTPUT  :
//		            1
//		           1 1
//		          1 2 1
//		         1 3 3 1
//		        1 4 6 4 1
//		  Ex.  INPUT  :  7
//		    OUTPUT  :
//		            1
//		           1 1
//		          1 2 1
//		         1 3 3 1
//		        1 4 6 4 1
//		       1 5 10 10 5 1
//		      1 6 15 20 15 6 1
		
		int n=7;
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			
			int l=1;
			for(int k=0;k<=i;k++) {
				System.out.print(l+" ");
				l=l*(i-k)/(k+1);
			}

			System.out.println();
		}
	}


	private static void p133() {
//		82. Find the second maximum among the given numbers.
//		  Ex.  INPUT  :  
//		    Size of Array    :  8
//		    Enter the elements  :  2 5 1 6 2 6 7 10
//		    OUTPUT  :
//		    7
//		  Ex.  INPUT  :
//		    Size of Array    :  4
//		    Enter the elements  :  4 1 2 2
//		    OUTPUT  :
//		    2
//		  Ex.  INPUT  :
//		    Size of Array    :  1
//		    Enter the elements  :  1
//		    OUTPUT  :
//		    No second maximum
		
		int a[]= { 2, 5 ,1 ,6 ,2 ,6 ,7 ,10};
		int n=8;
		
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax &&a[i]< max ){
			secmax=a[i];	
			}
		}
		
		System.out.println(secmax);
    
	}


	private static void p132() {
		// 81. Print the total number of odd and even digits in the given number.
//		  Ex.  Input  :  1234567
//		    Output  :  ODD 4
//		        EVEN 3
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        long number = scanner.nextLong();

	        int oddCount = 0, evenCount = 0;
	        while (number > 0) {
	            long digit = number % 10;
	            if (digit % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	            number /= 10;
	        }

	        System.out.println("ODD " + oddCount);
	        System.out.println("EVEN " + evenCount);
		
	}


	private static void p131() {
//		80.Find the maximum of three numbers?
		  int num1 = 10, num2 = 20, num3 = 15;
	        int max = findMax(num1, num2, num3);
	        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
	}
static int findMax(int a, int b, int c) {
  
    return Math.max(Math.max(a, b), c);
}

	private static void p130() {
		
//		79.. Insert 0 after consecutive (K times) of 1 is found.
//		Example:
//		Input:
//		Number of bits: 12
//		Bits: 1 0 1 1 0 1 1 0 1 1 1 1
//		Consecutive K: 2
//		Output:
//		1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
		 
		int a[]= {1 ,0 ,1 ,1 ,0 ,1 ,1 ,0, 1, 1, 1, 1};
		int n=12;
		int k=2;
		
		
		String[] m=new String[a.length];
		String d1="";
		for(int i=0;i<a.length;i++) {
		m[i]=String.valueOf(a[i]);
		d1+=m[i];
		}
		StringBuffer d=new StringBuffer(d1);
		
		
		for(int i=0;i<d.length();i++) {
			
			if(d.charAt(i)=='1' && d.charAt(i+1)=='1') {
				d.insert(i+2, '0');
			}
			
			}
		
		System.out.println(d);
	}


	private static void p129() {

//77.. Print pattern like this
//Example:
//Input: 1
//Output: 0
//Input: 2
//Output: 
//0 0
//0 1
//1 0
//1 1
//Input: 3
//Output:
//0 0 0
//0 0 1
//0 1 0
//0 1 1
//1 0 0
//1 0 1
//1 1 0
//1 1 1
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();

	        System.out.println("Output:");
	        generatePattern(n);
		
		
	}
	 static void generatePattern(int n) {
	        c(n, new int[n], 0);
	    }

	    static void c(int n, int[] pattern, int index) {
	    	
	    	if(index == n) {
	    		for(int i=0;i<n;i++) {
	    			System.out.print(pattern[i]+" ");
	    		}
	    	System.out.println();
	    	return;
	    	}
	    	
	    	pattern[index]=0;
	    	c(n,pattern,index+1);
	     
	    	pattern[index]=1;
	    	c(n,pattern,index+1);
	    }

	private static void p128() {
//		76.Print only numbers which is present
//		in Fibonacci series (0 1 1 2 3 5 8 ……..)
//		Example:
//		Input: 2 10 4 8
//		Output: 2 8 
//		Input: 1 10 6 8 13 21
//		Output: 1 8 13 21
		
		
		//int a[]= {2,10,4,8};
		int a[]= {1 ,10 ,6 ,8 ,13 ,21};
		List<Integer> n=new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			if(fibo(a[i])) {
				n.add(a[i]);
			}
		}
		System.out.println(n);
	}


	private static boolean fibo(int a) {
		int p1=0;
		int c=0;
		int p2=1;
		for(int i=1;i<a*2;i++) {
			if(c==a || p1==a||p2==a) {
				return true;
			}
			c=p1+p2;
			p1=p2;
			p2=c;
		}
		return false;
	}


	private static void p127() {
//		75.Print second frequently occurring number in given series
//		Example :
//		Input: 1 1 2 3 1 2 4
//		Output: 2
//		Explanation: 1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time and
//		4 occurs 1 time. Hence second frequently occurring number in given series is 2
		
		int a[]= {1, 1, 2, 3, 1, 2, 4};
		
		Map<Integer,Integer> n=new TreeMap<>();
		
		for(int x:a) {
			n.put(x,n.getOrDefault(x,0)+1);
		}
		
		int m = Integer.MIN_VALUE;
        int s1 = Integer.MIN_VALUE;
        int s2 = -1;
        
        for(int x:n.keySet()) {
            int f=n.get(x);
            
            if(f>m) {
            	s1=m;
            	m=f;
            }
            else if(f>s1 && f!=s1) {
            	s1=f;
            	s2=x;
            }
        }		
		System.out.println(s2);
	}


	private static void p126() {

//74. Print true if second string is a substring of first string, else print false.
//Note : * symbol can replace n number of characters
//Input : Spoon  Sp*n  Output : TRUE
//    Zoho     *o*o  Output : TRUE
//    Man       n*     Output : FALSE
//    Subline  line   Output : TRUE
		
		
		    System.out.println(isSubstring1("Spoon", "Sp*n"));  // Output: TRUE
	        System.out.println(isSubstring1("Zoho", "*o*o"));   // Output: TRUE
	        System.out.println(isSubstring1("Man", "n*"));      // Output: FALSE
	        System.out.println(isSubstring1("Subline", "line"));// Output: TRUE
	}

    static boolean isSubstring1(String s1, String s2) {
    	int i=0;
    	int j=0;
    	
    	while(i<s1.length() && j<s2.length()) {
    	char a=s1.charAt(i);
    	char b=s2.charAt(j);
    	if(b=='*') {
    	while(j<s2.length() && s2.charAt(j)=='*') {	
    		j++;
    		}
    	if(j==s2.length()) {
    		return true;
    	}
    	while(i<s1.length() && s2.charAt(j)!=s1.charAt(i)) {
    		i++;
    	}
    	}
      else if(a == b) {
    	i++;
    	j++;
    	}
      else {
    	  i=i-j+1;
    	  j=0;
      }
    		
    	}
		return j==s2.length();
    }

	private static void p125() {
//		73. Sort the array elements in descending order according
//		to their frequency of occurrence
//		Input : [ 2 2 3 4 5 12 2 3 3 3 12 ]
//		Output : 3 3 3 3 2 2 2 12 12 4 5
//		Explanation : 3 occurred 4 times, 2 occurred 3 times, 
//		12 occurred 2 times, 4 occurred 1 time, 5 occurred 1 time
//		Input : [ 0 -1 2 1 0 ]
//		Output : 0 0 -1 1 2
//		Note : sort single occurrence elements in ascending order
	
		Integer n[]= {0 ,-1, 2, 1, 0 };
		
		Arrays.sort(n,new Comparator<Integer>(){
		
			public int compare(Integer a ,Integer b) {
				if( numc(b)==1 && numc(a)==1) {
					return a - b;
				}
				else {
				return numc(b)-numc(a);
			}
				}

			private int numc(Integer b) {
				int count=0;
				for(int i=0;i<n.length;i++) {
					if(b==n[i]) {
						count++;
					}
				}
				return count;
			}
			
		});
		
		System.out.println(Arrays.toString(n));
	}


	private static void p124() {
//		72. Find the least prime number that can be added with first 
//		array element that makes them divisible by second array elements at
//		respective index (check for prime numbers under 1000, if exist 
//				return -1 as answer) & (Consider 1 as prime number)
//		Input : [ 20, 7 ]
//		    [ 11, 5 ]
//		Output : [ 1, 3 ]
//		Explanation : 
//		(20 + ?) % 11 
//		( 7 + ?) % 5
		
		int a[]= {20,7};
		int b[]= {11,5};
		int c[]=new int[a.length];
		
		
		for(int i=0;i<a.length;i++) {
			int k=isp(a[i],b[i]);
			c[i]=k;
		}
		
		
		System.out.println(Arrays.toString(c));
		}
		
	private static int isp(int i, int j) {
		
		for(int k=1;k<1000;k++) {
			if(ispr(k)) {
			if((i+k)%j==0) {
				return k;
			}
			}
		}
		return 1;
	}


	private static boolean ispr(int k) {
		if(k==1) {
			return true;
		}
		for(int i=2;i<k;i++) {
			if(k%i==0) {
				return false;
			}
		}
		
		return true;
	}


	private static void p123() {
//		71. Find the extra element and its index
//		Input : [ 10, 20, 30, 12, 5 ]
//		    [ 10, 5, 30, 20 ]
//		Output : 12 is the extra element in array 1 at index 4
//		Input : [ -1, 0, 3, 2 ]
//		    [ 3, 4, 0, -1, 2 ]
//		Output : 4 is the extra element in array 3 at index 5
		
		int a[]= {-1, 0, 3, 2 };
		int b[]= { 3, 4, 0, -1, 2 };
		
		Map<Integer,Integer> n=new TreeMap<>();
		
		for(int i=0;i<a.length;i++) {
			n.put(a[i], n.getOrDefault(a[i], 0)+1);
		}
		for(int i=0;i<b.length;i++) {
			n.put(b[i], n.getOrDefault(b[i], 0)+1);
		}
		
		//System.out.println(n);
		
		for(Entry<Integer,Integer> k:n.entrySet()) {
			if(k.getValue()==1) {
			System.out.println(k.getKey());
		}
			}
		
		
		}


	private static void p120() {
		// 69.given a set of numbers, and a digit in each iteration,
		  //if the digit exists in any of  the numbers, remove its 
		  //occurrences and ask for the next digit till the list becomes empty.
	
		StringBuffer a= new StringBuffer("123456789");
		
		Scanner n=new Scanner(System.in);
		
		while(!a.isEmpty()) {
				System.out.println("String contains"+a);
				int k=n.nextInt();
				for(int i=0;i<a.length();i++) {
					if(k == Integer.parseInt(String.valueOf(a.charAt(i)))) {
						a.delete(i, i+1);
					}
			}
		}
		
		System.out.println("String is empty");
		
		
	}
	  private static void p121() {
		// 70.Check if a number ‘a’ is present in another number ‘b.
		     int a = 123;
	        int b = 912345678;

	        boolean present = isPresent(a, b);

	        if (present) {
	            System.out.println(a + " is present in " + b);
	        } else {
	            System.out.println(a + " is not present in " + b);
	        }
	}
	    public static boolean isPresent(int a, int b) {
	        // Convert both numbers to strings
	        String strA = String.valueOf(a);
	        String strB = String.valueOf(b);

	        // Check if strA is present in strB
	        return strB.contains(strA);
	    }


	

	private static void p119() {
		// 68.lexicographic sorting.
		  String[] words = {"banana", "apple", "orange", "grape"};

	        // Lexicographically sort the array of strings
	        Arrays.sort(words);

	        // Print the sorted array
	        System.out.println("Sorted array of strings:");
	        for (String word : words) {
	            System.out.println(word);
	        }
	}

	private static void p118() {
		// 67.form the largest possible number using the array of numbers.
	        int[] array = {30, 9, 34, 5, 3};
           String n=fun(array);
           System.out.println(n);
	}

   private static String fun(int[] array) {
		
	   String k[]=new String[array.length];
	   for(int i=0;i<array.length;i++) {
		   k[i]=String.valueOf(array[i]);
	   }
	   
	   Arrays.sort(k,new Comparator<String>() {
		   public int compare(String a,String b) {
			  String ab=a+b;
			  String ba=b+a;
			  return ba.compareTo(ab);
		   }
	   });
	   
	   StringBuffer l=new StringBuffer();
	   for(int i=0;i<k.length;i++) {
		   l.append(k[i]);
	   }
		return l.toString();
	}

	private static void p117() {
	//	  66.adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119
		  int number = 2875;
	        int digit = 4;

	        int result = addDigitToAllDigits(number, digit);

	        System.out.println("Original number: " + number);
	        System.out.println("Digit to add: " + digit);
	        System.out.println("Result: " + result);
	}
	  public static int addDigitToAllDigits(int number, int digit) {
	        int result = 0;
	        int multiplier = 1; // To keep track of digit position
	        
	        // Iterate until the number becomes 0
	        while (number != 0) {
	            int remainder = number % 10; // Get the last digit
	            result += (remainder + digit) * multiplier; // Add the desired digit to the last digit
	            multiplier *= 10; // Move to the next position
	            number /= 10; // Remove the last digit
	        }

	        return result;
	    }

	private static void p116() {
		// 65.prime factor – sort the array based on the minimum factor they have.
		  int[] array = {15, 8, 12, 5, 10}; 
		  
		 for(int i=0;i<array.length;i++) {
			 for(int j=i+1;j<array.length;j++) {
				 if(pf(array[i])>pf(array[j])) {
					 int temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			 }
		 }
		  
		  System.out.println(Arrays.toString(array));
	}
	  
		public static int pf(int a) {
			if(a<=1) return a;
			   
			for(int i=2;i<=Math.sqrt(a);i++) {
				if( a%i ==0) {
					return i;
				}
			}
			
			return a;
		}

	private static void p115() {
		//64.prime number – print n prime numbers
		
		  int n=10;
		
		
			  for(int i=2;i<100;i++) {
				  if(n!=0) {
				     if(isp(i)) {
					System.out.print(i+" ");
					n--;
				         }  
				  }
				  else {
					  break;
				  }
			  }
		  
	}
	  

	private static boolean isp(int i) {
		for(int k=2;k<i;k++) {
			if(i%k == 0) {
				return false;
			}
		}
		return true;
	}

	private static void p114() {
//		  63.array of numbers were given to find a number
//		  which has same sum of numbers in it’s either side.
//		  I/p 1, 2, 3, 7, 6
//		  O/p 7(has 1+ 2+3 in left 6 in right)
		  
		  int a[]= {1, 2, 3, 7, 6};
		  
		  int num=nums(a);
		  System.out.println(num);
	}

	private static int nums(int[] a) {
	
			  
		  for(int i=0;i<a.length;i++) {
			  int sum1=0;
			  int sum2=0;
			for(int j=i;j<a.length;j++) {
				sum1+=a[j];
			}
			for(int j=i;j>=0;j--) {
				sum2+=a[j];
			}
			
			if(sum1 == sum2) {
				return a[i];
			}
			
			
		  }
		  
		return -1;
	}

	private static void p113() {
//		  62. It’s about anagram.i/p was array of strings 
//		  .and a word was given to find whether it has anagram in given array.
//		  I/p catch, got, tiger, mat, eat, Pat, tap, tea
//		  Word: ate
//		  O/p eat, tea
		  
		  String a[]={"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
		   String b="ate";
		
		  for(int i=0;i<a.length;i++) {
			  if(snu(b)==snu(a[i])) {
				  System.out.print(a[i]+" ");
			  }
			 
		  }
	}

	private static int snu(String b) {
	int count=0;
		for(int i=0;i<b.length();i++) {
			count+=b.charAt(i);
		}
		return count;
	}

	private static void p112() {
//      61..sort the array odd numbers in ascending and even numbers in descending.
//        I/p 5 8 11 6 2 1 7
//        O/p 1 5 7 11 8 6 2
		
		  int a[]= {2 ,8 ,11, 6, 5, 1 ,7};
		  
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[j]<a[i]) {
					  if(odd(a[j])) {
					  int temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
				  }
			  }
		  }
		  
		  
		  for(int i=a.length-1;i>0;i--) {
			  for(int j=i-1;j>0;j--) {
				  if(a[j]<a[i]) {
					  if(!odd(a[j])) {
					  int temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
				  }
			  }
		  }
		  
		  System.out.println(Arrays.toString(a));
	}

	private static boolean odd(int i) {
		
		return i%2!=0;
	}

	private static void p111() {


//60. Print longest sequence between same character
//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6

		  String a="aaaaaaaa";
		  
		  int b[]=new int[a.length()];
          for(int i=0;i<a.length();i++) {
        	  for(int j=a.length()-1;j>0;j--) {
        		 if(a.charAt(i)==a.charAt(j)) {
        			 int k=j-i;
        			 b[i]=k;
        			 break;
        		 } 
        	  }
          }
          Arrays.sort(b);
          
          System.out.println(b[b.length-1]-1);
          		
	}

	private static void p110() {
//		  58. Let 1 represent ‘A’, 2 represents ‘B’, etc.
//		  Given a digit sequence, count the number of possible
//		  decodings of the given digit sequence.
//		  Examples:
//		  Input: digits[] = “121”
//		  Output: 3 // The possible decodings are “ABA”, “AU”, “LA”
//		  Input: digits[] = “1234” Output: 3
//		          // The possible decodings are “ABCD”, “LCD”, “AWD”
		  String digits1 = "121";
	        String digits2 = "1234";

	        System.out.println("Number of possible decodings for " + digits1 + ": " + numDecodings(digits1));
	        System.out.println("Number of possible decodings for " + digits2 + ": " + numDecodings(digits2));
	}
	  public static int numDecodings(String s) {
	        Map<Integer, Integer> memo = new HashMap<>();
	        return helper(s, 0, memo);
	    }
	    private static int helper(String s, int index, Map<Integer, Integer> memo) {
	        if (index == s.length()) {
	            return 1;
	        }

	        if (s.charAt(index) == '0') {
	            return 0; // If the current character is '0', it cannot be decoded individually
	        }

	        if (index == s.length() - 1) {
	            return 1; // If we reach the last character, there's only one way to decode it
	        }

	        if (memo.containsKey(index)) {
	            return memo.get(index);
	        }

	        int ways = helper(s, index + 1, memo); // Decoding one digit
	        if (Integer.parseInt(s.substring(index, index + 2)) <= 26) {
	            ways += helper(s, index + 2, memo); // Decoding two digits if it's a valid two-digit number
	        }

	        memo.put(index, ways);
	        return ways;
	    }
	private static void p109() {
//		  57..Given two dates, find total number of days between them.
//		  Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
//		  Output: 393
//		  dt1 represents “10-Feb-2014” and dt2 represents “10-Mar-2015”
//		  The difference is 365 + 28
//		  Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
//		  Output: 29
//		  Note that 2000 is a leap year
//		  Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
//		  Output: 0
//		  Both dates are same
//		  Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
//		  Output: 1461
//		  Number of days is 365*4 + 1
		  
		  int a[]= {10,2,2014};
		  int b[]= {10,3,2015};
		  
		  System.out.println("Totaldays :"+totaldays(a,b));
		
	}

	private static int totaldays(int[] a, int[] b) {
		
		int day1=a[0];
		int month1=a[1];
		int year1=a[2];
		
		int day2=b[0];
		int month2=b[1];
		int year2=b[2];
		
		int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		boolean isleapyear=((year1%4==0 && year1%100!=0)||year1%400==0);
		
		int days1=day1;
		for(int i=0;i<month1-1;i++) {
			days1+=month[i];
		}
		if(isleapyear && month1>2) {
			days1+=1;
		}
		
		
      isleapyear=((year2%4==0 && year2%100!=0)||year2%400==0);
		
		int days2=day2;
		for(int i=0;i<month2-1;i++) {
			days2+=month[i];
		}
		if(isleapyear && month2>2) {
			days2+=1;
		}
		
		int totaldays=0;
		for(int i=year1;i<year2;i++) {
			totaldays+=(isleap(i)? 366:365);
		}
		
		totaldays+=days2-days1;
		
		return totaldays;
	}

	private static boolean isleap(int i) {
		return ((i%4==0 && i%100!=0)||(i%400==0));
	}

	private static void p108() {

//		  57..Given two dates, find total number of days between them.
//		  Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
//		  Output: 393
//		  dt1 represents “10-Feb-2014” and dt2 represents “10-Mar-2015”
//		  The difference is 365 + 28
//		  Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
//		  Output: 29
//		  Note that 2000 is a leap year
//		  Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
//		  Output: 0
//		  Both dates are same
//		  Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
//		  Output: 1461
//		  Number of days is 365*4 + 1	
			
		  
		   int[] dt1 = {10, 2, 2014};
	        int[] dt2 = {10, 3, 2015};

	        System.out.println("Number of days between dates: " + daysBetween(dt1, dt2));
		}
	    public static long daysBetween(int[] dt1, int[] dt2) {
	        LocalDate date1 = LocalDate.of(dt1[2], dt1[1], dt1[0]);
	        LocalDate date2 = LocalDate.of(dt2[2], dt2[1], dt2[0]);

	        // Calculate days between dates
	        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

	        // Add one day for inclusive counting
	        daysBetween++;

	        return daysBetween;
	    }



	private static void p107() {
//		  56..Given a sentence of string, in that remove the palindrome
		  //words and print the remaining.
//
//		  Input:
//		  He did a good deed
//		  Output:
//		  He good
//		  Input:
//		  Hari speaks malayalam
//		  Output:
//		  Hari speaks
		  
		 // String a="He did a good deed";
		  String a="Hari speaks malayalam";
		  String n[]=a.split(" ");
		  
		  for(int i=0;i<n.length;i++) {
			  if(!pal(n[i])) {
				 System.out.print(n[i]+" "); 
			  }
		  }
		
	}

	private static boolean pal(String s) {
		//String n=s;
		StringBuffer k=new StringBuffer(s);
		String m=String.valueOf(k.reverse());
		if(m.equals(s)) {
			return true;
		}
		
		return false;
	}

	private static void p106() {
//		  55. Find the result subtraction, multiplication,
//		  division of two integers using + operator.
//		  Input: 6 and 4
//		  output:
//		  addition 6+4 = 10,    subtraction  6+(-4) = 2,   
//		  multiplication = 24,   division = 1
//		  Input : -8 and -4
//		  Output:
//		  addition -8+(-4) = -12,    subtraction
//		  (-8)+(-(-4)) = -4,   multiplication = 32,   division = 2
		  
		  int a=6;
		  int b=4;
		  
		  int c=a+b;
	      System.out.println("addition : "+c);
	      int d=a;
	       d+=(-b);
	      System.out.println( "subtraction:"+d);
	      int e=0;
	      e+=a*b;	     
	      System.out.println("multiplication:"+e);
	      int f=0;
	      f+=a/b;
	      System.out.println("division:"+f);
	}

	private static void p105() {
	//	  54.Given two dimensional matrix of integer and print
//		  the rectangle can be formed using given indices and also find
//		  the sum of the elements in the rectangle
//
//		  Input: mat[M][N] = {{1, 2, 3, 4, 6}, 
//				              {5, 3, 8, 1, 2},
//				             {4, 6, 7, 5, 5},
//				              {2, 4, 8, 9, 4} };
//		  index = (2, 0) and (3, 4)
//		  Output:
//		  Rectangle
//		  4 6 7 5 5
//		  2 4 8 9 4
//		  sum 54
		  
		  int m[][]= {{1, 2, 3, 4, 6}, 
	               {5, 3, 8, 1, 2},
	               {4, 6, 7, 5, 5},
	               {2, 4, 8, 9, 4}};
		  int n[]= {2,0};
		  int l[]= {3,4};
      int sum=0;
		  for(int i=n[0];i<=l[0];i++) {
			  for(int j=n[1];j<=l[1];j++) {
				  sum+=m[i][j];
				  
			  }
		  }
		  System.out.println(sum);
	}

	private static void p104() {
//		  53.Given an array with repeated numbers, 
//		  Find the top three repeated numbers.
//		  input: array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
//		  output: 3, 16, 15
		  
		  int a[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
		  int re[]=numbe(a);
		  System.out.println(Arrays.toString(re));
	}

	private static int[] numbe(int[] a) {
		Map<Integer,Integer>  n=new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			n.put(a[i],n.getOrDefault(a[i],0)+1);
		}
		
		List<Map.Entry<Integer, Integer>> k=new ArrayList<>(n.entrySet());
		k.sort((l,b) ->b.getValue() - l.getValue());
		
		int re[]=new int[Math.min(3,k.size())];
		for(int i=0;i<re.length;i++) {
			re[i]=k.get(i).getKey();
		}
		
		return re;
	}

	private static void p103() {
	//	  52.Given a number, find the next smallest palindrome.	  
		  int num = 9687;
	       
	        // If number is not Palindrome we go to the next
	        // number using while loop
	        while (isPalindrome(num) == 0) {
	            num = num + 1;
	        }
	       
	        // now we get the next Palindrome so let's print it
	        System.out.print("Next Palindrome :");
	        System.out.print(num);
		
	}
	  static int isPalindrome(int num)
	    {
	       
	        // Declaring variables
	        int n, k, rev = 0;
	       
	        // storing num in n so that we can compare it later
	        n = num;
	       
	        // while num is not 0 we find its reverse and store
	        // in rev
	        while (num != 0) {
	            k = num % 10;
	            rev = (rev * 10) + k;
	            num = num / 10;
	        }
	       
	        // check if num and its reverse are same
	        if (n == rev) {
	            return 1;
	        }
	        else {
	            return 0;
	        }
	    }
	private static void p102() {
//		
//		  Input : ABCA
//		  Output : AABC AACB ABAC ABCA ACBA 
//		           ACAB BAAC BACA BCAA CABA 
//		           CAAB CBAA  
		  
		   char str[] = {'A', 'B', 'C', 'A'};
	        int n = str.length;
	        f(str, 0, n);

	}
	  
	
	private static void f(char[] str, int k, int n) {
		
		if(k>=n) {
			System.out.println(str);
			return;
		}
		
		for(int i=k;i<n;i++) {
			boolean m=fi(str,k,i);
			if(m) {
				swa(str,k,i);
				f(str, k+1, n);
				swa(str,k,i);
			}
		}
		
	}

	private static void swa(char[] str, int k, int i) {
	    char c=str[k];
	    str[k]=str[i];
	    str[i]=c;			
	}

	private static boolean fi(char[] str, int k, int n) {
		for(int i=k;i<n;i++) {
		if(str[i]==str[n]) {
			return false;
		}
		}
		return true;
	}

	private static void p101() {
//		  50.Find the next greater element for each element in given array.
//		  input: array[]={6, 3, 9, 10, 8, 2, 1, 15, 7}
//		  output: {7, 5, 10, 15, 9, 3, 2, _, 8}
//		  If we are solving this question using sorting, we need to use
//		  any O(nlogn) sorting algorithm.
		  int[] array = {6, 3, 9, 10, 8, 2, 1, 15, 7};
        
	    }
	



	private static void p100() {
//		  49. Given two Strings s1 and s2, 
//		  remove all the characters from s1 which is present in s2.
//		  Input: s1=”expErIence”, s2=”En”
//		  output: s1=”exprIece”
		StringBuffer n=new StringBuffer("expErIence");
		StringBuffer s2=new StringBuffer("En");
		
		System.out.println("Before ="+n);
		
		for(int i=0;i<n.length();i++) {
			for(int j=0;j<s2.length();j++) {
			  if(n.charAt(i)==s2.charAt(j)) {
				  n.delete(i, i+1);
			  }	
			}
			
		}
		
		System.out.println("after ="+n);
		
	}

	private static void p99() {
		// 49.Given an array as input, The condition is if the number is repeated you must add the number and put the next index value to 0. If the number is 0 print it at the last.

//Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
//
//Output: 4 2 12 8 0 0 0 0 0 .
		
		  int a[]={0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		  
		  for(int i=0;i<a.length-1;i++) {
			  if(a[i]==a[i+1]) {
				  a[i]=a[i]+a[i+1];
				  a[i+1]=0;
			  }
		  }
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]==0) {
				  for(int j=i+1;j<a.length;j++) {
					  if(a[j]>0) {
						  a[i]=a[j];
						  a[j]=0;
						  break;
					  }
				  }
			  }
		  }
	}

	private static void p98() {
//		  48.Print the following pattern
//		   1  
//		  3 2
//		 6 5 4
//		10 9 8 7
//		10 9 8 7 
//		 6 5 4 
//		  3 2 
//		   1
		  
		  int n=4;
		  int a=1;
		   for(int i=1;i<=n;i++) {
			   for(int j=i;j<=n;j++) {
				   System.out.print(" ");
			   }
			
			   for(int k=1;k<=i;k++) {
				   System.out.print(a+" "); 
				   a--;
			   }
			  a=a+i*2+1;
			   System.out.println();
		   }
		   a=10;
		   for(int i=0;i<n;i++) {
			   for(int j=0;j<=i;j++) {
				   System.out.print(" ");
			   }
			   for(int k=i;k<n;k++) {
				   System.out.print(a+" ");
				   a--;
			   }
			   System.out.println();
		   }
		
	}

	private static void p97() {
		  Set<String> wordDict = new HashSet<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"));
	        String[] inputs = {"ilike", "ilikesamsung"};

	        for (String input : inputs) {
	            System.out.println("Input: " + input);
	            System.out.println("Output: " + (wordBreak(input, wordDict) ? "Yes" : "No"));
	        }
		
	}
	    public static boolean wordBreak(String s, Set<String> wordDict) {
	        boolean[] dp = new boolean[s.length() + 1];
	        dp[0] = true; // Empty string is always breakable

	        for (int i = 1; i <= s.length(); i++) {
	            for (int j = 0; j < i; j++) {
	                if (dp[j] && wordDict.contains(s.substring(j, i))) {
	                    dp[i] = true;
	                    break;
	                }
	            }
	        }

	        return dp[s.length()];
	    }

	  

	private static void p96() {
//		  46. Given a text and a wildcard pattern, implement wildcard 
//		  pattern matching algorithm that finds if wildcard pattern is matched
//		  with text. The matching should cover the entire text (not partial text).
//		  The wildcard pattern can include the characters ‘?’ and ‘*’
//		  ‘?’ – matches any single character
//		  ‘*’ – Matches any sequence of characters (including the empty sequence)
//		  Example:
//		  Text = “baaabab”,
//		  Pattern = “*****ba*****ab”,
//		  output : true
//		  Pattern = “baaa?ab”, output : true
//		  Pattern = “ba*a?”, output : true
//		  Pattern = “a*ab”, output : false
		
	        String text = "baaabab";
	        String[] patterns = {"*****ba*****ab", "baaa?ab", "ba*a?", "a*ab"};

	        for (String pattern : patterns) {
	            System.out.println("Pattern: " + pattern + ", Output: " + isMatch2(text, pattern));
	        }

	}
	  
	  
	  public static boolean isMatch2(String text, String pattern) {
	        int m = text.length();
	        int n = pattern.length();

	        boolean[][] dp = new boolean[m + 1][n + 1];

	        // Base case: empty pattern matches empty text
	        dp[0][0] = true;

	        // Fill the first row
	        for (int j = 1; j <= n; j++) {
	            if (pattern.charAt(j - 1) == '*') {
	                dp[0][j] = dp[0][j - 1];
	            }
	        }

	        // Fill the dp table
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (pattern.charAt(j - 1) == '?' || text.charAt(i - 1) == pattern.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1];
	                } else if (pattern.charAt(j - 1) == '*') {
	                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
	                }
	            }
	        }

	        return dp[m][n];
	    }

	private static void p95() {
//		  46.Diamond pattern : for given input size -> Here 3
//		  *
//		 ***
//		*****
//		 ***
//		  *
		  
		  int a=5;
		  for(int i=0;i<a/2;i++) {
			  for(int j=i;j<a/2;j++) {
				  System.out.print(" ");
			  }
			  for(int l=1;l<=i*2+1;l++) {
				 System.out.print("*"); 
			  }
			  System.out.println();
		  }
		  
		  for(int i=0;i<(a/2+0.5);i++) {
			  for(int j=0;j<i;j++) {
				  System.out.print(" ");
			  }
			  for(int l=a;l>i*2;l--) {
				 System.out.print("*"); 
			  }
			  System.out.println();
		  }  
		  
	}

	private static void p94() {
		// 45.Largest Sum Contiguous Subarray
       //(Kadane’ Algorithm )
	        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println("Maximum contiguous sum is: " + maxSubarraySum(arr));

		
	}
	  public static int maxSubarraySum(int[] arr) {
	        int maxCurrent = arr[0]; // Initialize variables with the first element of the array
	        int maxGlobal = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]); // Calculate the maximum sum ending at the current position
	            maxGlobal = Math.max(maxGlobal, maxCurrent); // Update the global maximum if needed
	        }

	        return maxGlobal;
	    }
	private static void p93() {
//		  44.Given an array A[] and a number x, check for pair in A[] with sum as x.
//		  Eg : Input {1, 2, 4, 3, 5, 6}
//		  SUM : 5
//		  Output : 2 (1, 4) & (2, 3)  
		  
		  int a[]={1, 2, 4, 3, 5, 6};
		  int sum=5;
		  List<List<Integer>> n=new ArrayList<>();
		  
		  ans(n,a,sum);
		  
		  for(List<Integer> k:n) {
			  System.out.println(k);
		  }
	  }
	

  private static void ans(List<List<Integer>> n, int[] a,int sum) {
	
	  for(int i=0;i<a.length;i++) {
		  List<Integer> k=new ArrayList<>();
		  for(int j=i+1;j<a.length;j++) {
			  if((a[j]+a[i])-sum==0) {
				  k.add(a[i]);
				  k.add(a[j]);}     
		  }
		  if(!k.isEmpty()) {
		  n.add(k);
		  }
	  }
 
	}

private static void p92() {
//	  43 . TWISTED PRIME NUMBER
//	  A number is said to be twisted prime if it
//	  is a prime number and reverse of the number is also a prime number.
//	  Input : 97
//	  Output : Twisted Prime Number
//	  Explanation: 97 is a prime number
//	  and its reverse 79 is also a prime
//	  number.
	  
	  int a=97;
	  int b=a;
	  int n=0;
	  
	  while(b>0) {
		  int c=b%10;
		  n=n*10+c;
		  b=b/10;
	  }
		if(twisp(b)) {
			System.out.print("Twisted Prime Number");
		}
		else {
			System.out.print("Is Not Twisted Prime Number");	
		}
	}

private static boolean twisp(int b) {
	
	for(int i=2;i<b;i++) {
		if(i%b==0) {
			return false;
		}
	}
	return true;
}

private static void p91() {
//	  42. Given an array of integers of size n. Convert the array in 
//	  such a way that if next valid number is same as current number, 
//	  double its value and replace the next number with 0. After the
//	  modification, rearrange the array such that all 0’s are shifted to the end.
//	  Input : arr[] = {2, 2, 0, 4, 0, 8}
//	  Output : 4 4 8 0 0 0
//	  Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
//	  Output : 4 2 12 8 0 0 0 0 0 0
	  
	  int a[]={0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
	  
	  for(int i=0;i<a.length-1;i++) {
		  if(a[i]==a[i+1]) {
			  a[i]=a[i]+a[i+1];
			  a[i+1]=0;
		  }
	  }
	  
	  for(int i=0;i<a.length;i++) {
		  if(a[i]==0) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[j]>0) {
					  a[i]=a[j];
					  a[j]=0;
					  break;
				  }
			  }
		  }
	  }

	  
	  System.out.println(Arrays.toString(a));
		
	}

private static void p90() {
//	  41.Given a String with or without special characters
//	  find if it is Palindrome or Not.. No splitting of array must 
//	  be done or No additional spaces must be used for storing the array..
//	  Eg: RACE CAR
//	  Eg: I DID, DID I ?
		
      String str1 = "RACE CAR";
      String str2 = "I DID, DID I ?";
      
      System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
      System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));

	}

  public static boolean isPalindrome(String str) {
 
      str = str.toLowerCase();

      int start = 0;
      int end = str.length() - 1;
   
      while (start < end) {
      
          while (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
              start++;
          }
          while (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
              end--;
          }
          
      
          if (str.charAt(start) != str.charAt(end)) {
              return false; 
          }
          
         
          start++;
          end--;
      }
      return true; 
  }

private static void p89() {
//	  Problem 40:
//
//		  Given a number, print all the code that can be formed with z={a=1, .., z=26}.
//
//		  1123
//		  {1, 1, 2, 3} = aabc
//		  {11, 2, 3} = kbc
//		  {1, 1, 23} = aaw
//		  {11, 23} = kw
	  String number = "1123";
      List<String> result = new ArrayList<>();
      generateCodes(number, "", 0, result);
      
      System.out.println("Codes formed from the number " + number + ":");
      for (String code : result) {
          System.out.println(code);
      }
	
	}
  
  // Function to generate all possible codes for a given number
  public static void generateCodes(String number, String codeSoFar, int index, List<String> result) {
      if (index == number.length()) {
          result.add(codeSoFar); // Add the generated code to the result list
          return;
      }

      // Single digit code
      int singleDigit = Character.getNumericValue(number.charAt(index));
      if (singleDigit > 0) {
          char ch = (char) ('a' + singleDigit - 1);
          generateCodes(number, codeSoFar + ch, index + 1, result);
      }

      // Double digit code if possible
      if (index < number.length() - 1) {
          int doubleDigit = Integer.parseInt(number.substring(index, index + 2));
          if (doubleDigit >= 10 && doubleDigit <= 26) {
              char ch = (char) ('a' + doubleDigit - 1);
              generateCodes(number, codeSoFar + ch, index + 2, result);
          }
      }
  }

private static void p88() {
//	  Problem 39:
//
//		  Given a 5X5 chess board as input. 9 knights
//		  are placed in the board. Print whether the configuration valid or Invalid.
	   int[][] chessBoard = {
	            {0, 1, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 1, 0, 1},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0}
	        };

	        if (isValidConfiguration(chessBoard)) {
	            System.out.println("Valid configuration");
	        } else {
	            System.out.println("Invalid configuration");
	        }
	  
	}
  // Function to check if a knight can be placed at the given position without attacking any other knight
  private static boolean isSafe(int[][] board, int row, int col) {
      int[] rowMoves = {2, 2, -2, -2, 1, 1, -1, -1};
      int[] colMoves = {1, -1, 1, -1, 2, -2, 2, -2};

      for (int i = 0; i < 8; i++) {
          int newRow = row + rowMoves[i];
          int newCol = col + colMoves[i];
          if (newRow >= 0 && newRow < 5 && newCol >= 0 && newCol < 5 && board[newRow][newCol] == 1) {
              return false;
          }
      }
      return true;
  }

  // Function to check the validity of the configuration
  public static boolean isValidConfiguration(int[][] board) {
      int numKnights = 0;

      // Count the number of knights and check if each knight is placed safely
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++) {
              if (board[i][j] == 1) {
                  numKnights++;
                  if (!isSafe(board, i, j)) {
                      return false;
                  }
              }
          }
      }
      
      return numKnights == 9; // Return true only if there are exactly 9 knights
  }

private static void p87() {
//	  Problem 38:
//
//		  Given a 6 blocks, of different height h1, …, h6 .
//		  Make 2 towers using 3 Blocks for each tower in desired
//		  height h1, h2. Print the blocks to be used in ascending order
//		  Input:
//		  1 2 5 4 3  6
//		  height of tower: 6 15
//		  Output :
//		  1 2 3 & 4 5 6
		
	  int a[]= {1 ,2 ,5 ,4 ,3  ,6};
	  Arrays.sort(a);
	  int h[]= {6,15};
	  
	  for(int n:h) {
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  int nu=a[i]+a[j];
				  for(int k=j+1;k<a.length;k++) {
					  if(a[k]+nu == n) {
						 System.out.println(a[i]+","+a[j]+","+a[k]); 
					  }
				  }
			  }
		  }
	  }
	}

private static void p86() {
//	  Problem 37.:
//	  Evaluate the expression and sort and print the output. 
//	  Getting the input is the tricky part
//	  Input:
//	  Number of input : 4
//	  2*3
//	  2^2^2
//	  35
//	  3*1
//	  Output:
//	  3*1
//	  2*3
//	  2^2^2
//	  35
	  String a[]= {"2*3","2^2^2","35"," 3*1"};
	  sortex(a);
	  System.out.print(Arrays.toString(a));
	}

private static void sortex(String[] a) {
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			if(af(a[i])>af(a[j])) {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
}}}}

private static int af(String n) {
	int ans=0;
	int i=0;
	while(i<n.length()) {
		if(Character.isDigit(n.charAt(i))) {
			ans+=ans*10+Integer.parseInt(String.valueOf(n.charAt(i)));
		}
		else {
			ans=ans*Integer.parseInt(String.valueOf(n.charAt(i+1)));
			i++;
		}
		i++;
	}
	
	
	return ans;
}

private static void p85() {
//	  Problem 36:
//		  Many students will able to solve 3 problems in 
//		  this round. So make sure you stand apart from the crowd.Their vacancy is going to be 5 for a team. 
	  //The performance in this round could be taken as a tie breaker for round 3.
//		  input : aaabbcc
//		  output : abc
	  
     String a="aaabbcc";
     
     Set<Character> n=new TreeSet<>();
	
     for(char x:a.toCharArray()) {
    	 n.add(x);
     }
     
     String ans="";
     for(Character x:n) {
          ans+=x;
     }
     
     System.out.println(ans);
     
	}

private static void p84() {
//	  35. Matrix Addition
//
//	  Given n integer arrays of different size, find the addititon
//	  of numbers represented by the arrays
//
//	  I/P: 4
//	  3 5 4 2
//	  2 4 5
//	  4 5 6 7 8
//	  4 9 2 1
//	  1 2
//	  O/P: 50856
	  
	  int arr[][]= {{3,5,4,2},{2,4,5},{4,5,6,7,8},{4,9,2,1},{1,2}};
	  int sumof=0;
	  for(int[] l:arr) {
		  int rows=0;
		  for(int k:l) {
			 rows=rows*10+k; 
		  }
		  sumof+=rows;
	  }
	  
	  
	  
	  System.out.println(sumof);
		
	}

private static void p83() {
//	  34. Matrix Diagonal sum
//
//	  Given a matrix print the largest of the sums of the 
//	  two triangles split by diagonal from top right to bottom left
//	  I/P:
//	  3 3
//	  1 2 3
//	  4 5 6
//	  7 8 9
//	  O/P: 38
	  
  int a[][]= {{1 ,2 ,3},
			  {4, 5 ,6},
			  {7, 8 ,9}};
  
  int sum1=0;
  int sum2=0;
  
     for(int i=a.length-1;i>=0;i--) {
    	 for(int j=a.length-1-i;j<a[0].length;j++) {
    		 sum1+=a[i][j];
    	 }
     }
     
     for(int i=0;i<a.length;i++) {
    	 for(int j=0;j<a.length-i;j++) {
    		 sum2+=a[i][j];
    	 }
     }
     
     if(sum1<sum2) {
    	 System.out.println("Largest Number ="+sum2 );
     }
     else {
    	 System.out.println("Largest Number ="+sum1 );  
     }
	}

private static void p82() {
//	  33. First Occurrences
//
//	  Given two strings, find the first occurrence
//	  of all characters of second string in the first string and
//	  print the characters between the least and the highest index
//	  I/P: ZOHOCORPORATION PORT
//	  O/P: OHOCORPORAT
//	  Explanation: The index of P in first string is 7, O is 1, R
//	  is 6 and T is 11. The largest range is 1 – 11.
//	  So print the characters of the first string in this inex range i.e. OHOCORPORAT
		String a="ZOHOCORPORATION";
		String b="PORT";
		
		Set<Integer> n=new TreeSet<>();
		for(int i=0;i<b.length();i++) {
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j)==b.charAt(i)) {
					n.add(j);
					break;
				}
			}
		}
		
		Object[] num=n.toArray();
		int first=Integer.parseInt(String.valueOf(num[0]));
		int last=Integer.parseInt(String.valueOf(num[num.length-1]));
		
		String ans="";
		for(int i=first;i<=last;i++) {
			ans+=a.charAt(i);
		}
		
		System.out.println(ans);
	}

private static void p81() {
//	  32. Password Strength
//
//	  Find the strength of the given password string based on the conditions
//	  Four rules were given based on the type and no. of characters in the string
//	  Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
//	  Medium – Two rules are satisfied
//	  Good – Three rules satisfied
//	  Strong – All Four rules satisfied
//
//	  I/P: Qw!1        O/P: Weak
//	  I/P: Qwertyuiop      O/P: Medium
//	  I/P: QwertY123       O/P: Good
//	  I/P: Qwerty@123    O/P: Strong
	  
	  String a="Qwerty@123";
	  String n=pass(a);
	  System.out.println(n);
		
	}

private static String pass(String a) {
	boolean num=num1(a);
	boolean spl=spl1(a);
	boolean len=(a.length()>7);
	boolean up=up(a);
	
	
	if(num &&spl && len && up) {
		return "Strong";
	}
	else if(num && len && (up||spl)) {
		return "Good";
	}
	else if(len && (num ||spl ||  up)) {
		return "Medium";	
		}
	return "weak";
}

private static boolean up(String a) {
	for(char x:a.toCharArray()) {
		if(Character.isUpperCase(x)) {
			return true;
		}
	}
	return false;
}

private static boolean spl1(String a) {
	StringBuffer n=new StringBuffer("!@#$%&*");
	for(char x:a.toCharArray()) {
		if(n.indexOf(String.valueOf(x))!=-1) {
			return true;
		}
	}
	
	return false;
}

private static boolean num1(String a) {
	
	for(char x:a.toCharArray()) {
		if(Character.isDigit(x)) {
			return true;
		}
	}
	return false;
}

private static void p80() {
//	  31. 1. Pangram Checking
//	  Check whether all english alphabets are present in the given sentence or not
//	  I/P: abc defGhi JklmnOP QRStuv wxyz
//	  O/P: True
//	  I/P: abc defGhi JklmnOP QRStuv
//	  O/P: False
	  
	  Set<Character> n=new TreeSet<>();
	  
	  String a="abc defGhi JklmnOP QRStuv wxyz";
	  
	  for(char x:a.toCharArray()) {
		 if(x!=' ') {
			 n.add(Character.toLowerCase(x));
		 } 
	  }
	  
	  System.out.println(n.size()==26);
		
	 System.out.println(n);
		
	}

private static void p79() {
		// 29.Find the shortest path from one element to another element 
//	  in a matrix using right and down moves alone
//	  . The attached solution uses moves in all directions. – Solution 4
		
	}


private static void p78() {
		// 28.Reverse the given string keeping the 
	  //position of special characters intact
	  
	  String a="numb$er&";
	  char n[]=a.toCharArray();
	  
	  int i=0;
	  int j=n.length-1;
	  while(i<j) {
		 if(!spl(n[i]) && !spl(n[j])) {
			 char temp=n[i];
			 n[i]=n[j];
			 n[j]=temp;
			 i++;
			 j--;
		 } 
		 else if(spl(n[i])) {
			 i++;
		 }
		 else {
			 j--;
		 }
	  }
	  
	  String ans="";
	  for(char x:n) {
		  ans+=x;
	  }
	
	  System.out.println(ans);
	}

private static boolean spl(char c) {
	String s="@#$&";
	return s.indexOf(Character.toLowerCase(c)) != -1; 
}

private static void p77() {
		// Find whether the given number is palindrome or 
	  //not. Don’t use arrays or strings
	  
	  int n=12221;
	  int n1=n;
	  int n2=0;
	  
	  while(n1>0) {
		 int b=n1%10;
		 n2=n2*10+b;
		 n1=n1/10;
	  }
		
	  if(n == n2) {
		  System.out.println("it is  palindrome");
	  }
	  else {
		  System.out.println("it is not a palindrome");  
	  }
	}

private static void p76() {

//26.Sort the given elements in decending 
//order based on the number of factors of each element – Solution 1
	  
	  int a[]= {12, 30, 7, 20, 18};
	  fac_d_sort(a);
	  System.out.println(Arrays.toString(a));
		
	}

private static void fac_d_sort(int[] a) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(factof(a[i]) < factof(a[j])) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}
	
}

private static int factof(int i) {
	int fact=0;
	for(int k=1 ;k<=i;k++) {
	 if(i%k == 0) {
		 fact++;
	 }
	}
	
	return fact;
}

private static void p75() {
//	  25.   Given an array of integers, write
//	  a program to re-arrange the array in the given form.
//	  1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest, 3rd_largest ……. etc.
	
	  int a[]= {1,2,3,4,5,6,7};
	  
	  int i=0;
	  int j=a.length;
	  while(i<j) {
		  for(int k=i;k<a.length;k++) {
			  if(a[i]<a[k]) {
				  int temp=a[i];
				  a[i]=a[k];
				  a[k]=temp;
			  }
		  }
		  i++;
		  for(int k=i;k<a.length;k++) {
			  if(a[i]>a[k]) {
				  int temp=a[i];
				  a[i]=a[k];
				  a[k]=temp;
			  }
		  }
		  i++;
	  }
	  
      System.out.print(Arrays.toString(a));
	  
	}

private static void p74() {
	//  24.   Finding all permutations of a string. ( backtracking approach ).
	  String str = "abc";
      List<String> permutations = findPermutations(str);
      for (String perm : permutations) {
          System.out.println(perm);
      }	
	}

  public static List<String> findPermutations(String str) {
      List<String> result = new ArrayList<>();
      backtrack(str.toCharArray(), 0, result);
      return result;
  }

  private static void backtrack(char[] chars, int start, List<String> result) {
      if (start == chars.length - 1) {
          result.add(new String(chars));
          return;
      }
      for (int i = start; i < chars.length; i++) {
          swap(chars, start, i);
          backtrack(chars, start + 1, result);
          swap(chars, start, i); // backtrack
      }
  }

  private static void swap(char[] chars, int i, int j) {
      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
  }

private static void p73() {
//	  23.  Given a number N. find the minimum count of numbers in 
//	  which N can be represented as a sum of numbers x1, x2, … xn.
//	  where xi is number whose digits are 0s and 1s.
//
//	  example 1)  i/p :  N = 33
//
//	  o/p : count = 3.     33( 11 + 11 + 11 )
//
//	  some other possibilities of 33 is (11 + 11 + 10 + 1), 
//	  (11 + 10 + 10 + 1 + 1 ), (10 + 10 + 10 + 1 + 1 + 1)
		
	  int N = 33;
      int count = minCountOfNumbers(N);
      System.out.println("Minimum count of numbers for N = " + N + " is " + count);
	}
  public static int minCountOfNumbers(int N) {
      int count = 0;
      while (N > 0) {
          int x = 1;
          while (x * 11 <= N) {
              x *= 10;
          }
          N -= x;
          count++;
      }
      return count;
  }

private static void p72() {
//	  22.Given N. print the Latin Matrix (say N = 3).
//	  condition:  must not use strings(aka character literals),
//	  arrays (both 1D and 2D), inbuilt functions(like rotate).
//	  A   B   C
//	 B   C   A
//	 C   A   B
		
	  int N=3;
	  int startChar = 65; // Starting character
      
      for (int i = 0; i < N; i++) {
          char currentChar =(char)startChar;
          for (int j = 0; j < N; j++) {
              System.out.print(currentChar + "   ");
              currentChar = (char)((currentChar - 65 + 1) % N + 65); // Increment character cyclically
          }
          System.out.println();
          startChar = (char)((startChar - 65 + 1) % N + 65); // Increment starting character
      }
	}

private static void p71() {

//21.Given N. print the following snake pattern
//(say N = 4). condition:  must not use arrays ( 1D array  or 2D array like Matrix ).
//
//1   2   3   4
//
//8   7   6    5
//
//9   10  11   12
//
//16  15  14  13
	  
	  int n=4;
	  int num=1;
	 
	  
	  for(int i=1;i<=n;i++) {
		  
		  if(i%2!=0) {
			  for(int j=1;j<=n;j++) {
				System.out.print(num + " ");
				num++;
			  } 
			  num--;
			  num=num+n;
			 
		  }
		
		  else {
			  int l=num;
			  for(int k=n;k>=1;k--) {
				  System.out.print(num + " "); 
				  num--;
			  }
			 
			  num=l+1;
			  
		  }
		  
		  System.out.println(); 
	  }
		
	}

private static void p70() {
//	  20. There is a circular queue of processes. Every time there will be certain no of 
//	  process skipped and a particular start position. Find the safe position.
//	  Input: Number of process:5
//	         Start position:3
//	         Skip: 2nd
//	  Output: 1 will be the safest position
//	  (Logic: 1 2 3 4 5 starting from 3, 5th process will be skipped
//	          1 2 3 4 5 process 2 will be skipped
//	          1 2 3 4 5 process 4 will be skipped
//	          1 2 3 4 5 process 3 will be skipped, so safest process is 1.
	 
	  int p= 5;
      int s = 3;
      int skip = 2;

      List<Integer> queue = new ArrayList<>();
      for (int i = 1; i <= p; i++) {
          queue.add(i);
      }
      
      int i=s-1;
      while (queue.size() > 1) {
          if(queue.size()-1>=i) {
        	i=(queue.size()-1)-(i-(skip-1));  
          }
          else {
        	  i+=skip;
          }
          if(i<queue.size()) {
          queue.remove(i);
          }
          else {
        	  break;
          }
      }
      
      System.out.println(queue.get(0));
      
	}
 
private static void p69() {
//	  19. Print all the possible subsets of array which adds up to give a sum.
//
//	  Input: array{2, 3, 5, 8, 10}
//	         sum=10
//	  Output: {2, 3, 5}
//	         {2, 8}
//	         {10}
	  
	  
	  int[] array = {2, 3, 5, 8, 10};
      int sum = 10;
     List<List<Integer>> ans=find(array,sum);
	  for(List<Integer> n:ans) {
		 System.out.println(n); 
	  }
		
	}

 
  
private static List<List<Integer>> find(int[] array, int sum) {
	List< List<Integer>> result=new ArrayList<>();
	backtrack(array,sum,0,new ArrayList<>(),result);
	return result;
}

private static void backtrack(int[] array, int sum, int start,List<Integer> current, List<List<Integer>> result) {
	
	if(sum==0) {
		result.add(new ArrayList<>(current));
	}
	
	for(int i=start;i<array.length;i++) {
		if(sum-array[i]>=0) {
			current.add(array[i]);
			backtrack(array,sum-array[i],i+1,current,result);
			current.remove(current.size()-1);
		}
	}
	
}

private static void p68() {
//	  . 18. -1 represents ocean and 1 represents
//	  land find the number of islands in the given matrix.
//	  Input:   n*n matrix
//	         1 -1 -1  1
//	        -1  1 -1  1
//	        -1 -1  1 -1
//	        -1 -1 -1  1
//	  Output: 2 (two islands that I have 
//	  bold in matrix at 1, 1 and 2, 2)
		
	  int a[][]= {{1 ,-1 ,-1,  -1},
			     {-1 , 1, -1 , -1},
			     {-1 ,-1, -1, -1},
			     {-1, -1 ,-1,  -1}};
	  int sum=0;
	  
	  for(int[] x:a) {
		  for(int n:x) {
			  if(n==1) {
				  sum++;
			  }
		  }
	  }
	  
	  
	  System.out.println(sum);
	}

private static void p67() {
//	  17.Given an array of integers, compute the maximum 
//	  value for each integer in the index, by either summing all the digits
//	  or multiplying all the digits. (Choose which operation gives the maximum value)
//	  •	Input:
//	  •	5
//	  •	120 24 71 10 59
//	  •	Output:
//	  •	3 8 8 1 45
//
//	  Explanation: For index 0, the integer is 120. Summing
//	  the digits will give 3, and whereas Multiplying the digits gives 0. 
//	  Thus, maximum of this two is 3.
		
	  
	  int[] nums = {120, 24, 71, 10, 59};
      int n = nums.length;
      int[] result = new int[n];

      for (int i = 0; i < n; i++) {
          result[i] = computeMaxValue(nums[i]);
      }

      // Print the result
      for (int i = 0; i < n; i++) {
          System.out.print(result[i]);
          if (i != n - 1) {
              System.out.print(" ");
          }
      }
	}
  
  
  public static int computeMaxValue(int num) {
      int sum = 0;
      int product = 1;

      // Extract digits and calculate sum and product
      while (num != 0) {
          int digit = num % 10;
          sum += digit;
          product *= digit;
          num /= 10;
      }

      // Choose the maximum value between sum and product
      return Math.max(sum, product);
  }


private static void p65() {
//	  16.Assume there exists infinite grid, you’re 
//	  given initial position x, y. Inputs will be movements either 
//	  L or R or U or D. After n inputs, you need to give the current position.
//	  •	Input: 
//	  •	4 5 //initial position x, y
//	  •	9 //number of movements
//	  •	U L R R D D U L R //7 movements
//	  •	Output:
//	  5 5
//	  •	Given a matrix NxN, you are initially in the 0, 0 position.
//	  The matrix is filled with ones and zeros. Value “one” represents 
//	  the path is available, while “zero” represents the wall. You need to
//	  find the can you able to reach the (N-1)x(N-1) index in the matrix. 
//	  You can move only along the right and down directions if there’s “one” available.
//	  •	Input:
//	  •	5 //N valu
//	  •	1 0 1 0 0
//	  •	1 1 1 1 1
//	  •	0 0 0 1 0
//	  •	1 0 1 1 1
//	  •	0 1 1 0 1
//	  •	Output:
//	  Yes
	  
	  
	  // Part 1: Grid Movement
      int initialX = 4, initialY = 5;
      String[] movements = {"U", "L", "R", "R", "D", "D", "U", "L", "R"};
      int[] finalPosition = move(initialX, initialY, movements);
      System.out.println(finalPosition[0] + " " + finalPosition[1]);

      // Part 2: Check Path in Matrix
      int[][] matrix = {
              {1, 0, 1, 0, 0},
              {1, 1, 1, 1, 1},
              {0, 0, 0, 1, 0},
              {1, 0, 1, 1, 1},
              {0, 1, 1, 0, 1}
      };
      if (canReachDestination(matrix)) {
          System.out.println("Yes");
      } else {
          System.out.println("No");
      }
		
	}
  
  public static int[] move(int initialX, int initialY, String[] movements) {
      int x = initialX, y = initialY;
      for (String move : movements) {
          switch (move) {
              case "U":
                  y += 1;
                  break;
              case "D":
                  y -= 1;
                  break;
              case "L":
                  x -= 1;
                  break;
              case "R":
                  x += 1;
                  break;
          }
      }
      return new int[]{x, y};
  }

  // Part 2: Check Path in Matrix
  public static boolean canReachDestination(int[][] matrix) {
      int n = matrix.length;
      return dfs(matrix, 0, 0, n);
  }

  public static boolean dfs(int[][] matrix, int x, int y, int n) {
      if (x == n - 1 && y == n - 1) {
          return true;
      }
      if (x >= n || y >= n || matrix[x][y] == 0) {
          return false;
      }
      return dfs(matrix, x + 1, y, n) || dfs(matrix, x, y + 1, n);
  }

private static void p64() {
//	  15.Given an array of values persons[], each represents the weight
//	  of the persons. There will be infinite bikes available. Given a value 
//	  K which represents the maximum weight that a bike accommodates. Along with
//	  that one more condition, a bike can carry two persons at a time.
//	  You need to find out the least number of times, the bike trips are made.
	  int[] persons = {90, 120, 75, 80, 110};
      int K = 150;
      System.out.println("Minimum trips needed: " + minTrips(persons, K));
	}
  
  public static int minTrips(int[] persons, int K) {
      Arrays.sort(persons);
      int left = 0;
      int right = persons.length - 1;
      int trips = 0;

      while (left <= right) {
          if (persons[left] + persons[right] <= K) {
              left++;
          }
          right--;
          trips++;
      }

      return trips;
  }

private static void p63() {
//	  14.
//	  Sample Input – Alternate Sorting 
//	  Input: {1, 2, 3, 4, 5, 6, 7}
//	  output: {7, 1, 6, 2, 5, 3, 4}
	  
	  int a[]={1, 2, 3, 4, 5, 6, 7};
	  int n=0;
	  for(int i=0;i<a.length/2;i++) {
		 for(int j=n;j<a.length;j++) {
			 int gra=a[n];
			 if(gra<a[j]) {
				int temp =a[j];
				a[j]=a[n];
				a[n]=temp;
			 }
		 } 
		 n++;
		 for(int j=n;j<a.length;j++) {
			 int les=a[n];
			 if(les>a[j]) {
				int temp =a[j];
				a[j]=a[n];
				a[n]=temp;
			 }
			 
			 
		 }
		 
		 n++;
	  }
	  
	  
	  
	  System.out.println(Arrays.toString(a));
		
	}

private static void p62() {
//	  13.Print the word with odd letters – PROGRAM
//
//	  Sample Output-
//
//	  P      P
//
//	   R    R 
//
//	    O  O  
//
//	     G   
//
//	    R  R  
//
//	   A    A 
//
//	  M      M
		
	  
	  String a="PROGRAM";
	  int l=0;
	  int k=0;
	    char b[][]=new char[a.length()][a.length()];
	  for(int i=0;i<a.length();i++) {
		  for(int j=0;j<a.length();j++) {
			  b[i][j]=' ';
		  }
	  }
	  
//	  for(int i=0;i<a.length()/2;i++) {
//		  for(int j=0;j<i;j++) {
//			  System.out.print(" ");
//		  }
//		  System.out.print(a.charAt(l));
//		  for(int k=i;k<a.length()/2;k++) {
//			System.out.print(" "); 
//		  }
//		  System.out.print(a.charAt(l));
//		  l++;
//		  System.out.println();
//	  }
//	  
//	  for(int i=0;i<=a.length()/2;i++) {
//		  for(int j=a.length()/2;j>0;j--) {
//			  System.out.print(" ");
//		  }
//		  System.out.print(a.charAt(l));
//		  for(int k=0;k<i;k++) {
//			System.out.print(" "); 
//		  }
//		  System.out.print(a.charAt(l));
//		  l++;
//		  System.out.println();
//	  }  
	  
	  
	  for(int i=0;i<a.length()-1;i++) {
		 b[i][i]=a.charAt(l);
		 l++;
	  }
	  b[a.length()-1][a.length()-1]=a.charAt(l);
	  
	  
	  for(int i=a.length()-1;i>=0;i--) {
		  b[i][k]=a.charAt(l);
		  l--;
		  k++;
	  }
	  
	  for(char[] x:b) {
		  for(char n:x) {
			  System.out.print(n);
		  }
		  System.out.println();
	  }
	  
	}

private static void p61() {
//	  10. calculate Maximum number of chocolates can eat 
//	  and Number of wrappers left in hand.
//
//	  Money: Total money one has to spend.
//
//	  Price: price per chocolate.
//
//	  wrappers: minimum number of wrappers for exchange 
//	  choco: number of chocolate for wrappers.
//
//	  Max visit: Maximum number of times one can visit the 
//	  shop.(if zero consider it infinite)
//
//	  example: input: Money:40 Price:1 wrappers:3 choco:1 Max 
//	  visit:1 Output: total chocolate can eat: 53 wrappers left in hand:14
		
	  int money = 40;
      int price = 1;
      int wrappers = 3;
      int choco = 1;
      int maxVisit = 1;
      
      

	  
	}
  


private static void p60() {
//	  9. Reverse the words in the given String1 from the first occurrence 
//	  of String2 in String1 by maintaining white Spaces.
//
//	  example: String1 = Input: This is a test String only 
//	  String2 = st Output: This is a only String test
	  
	  String a="This is a test String only";
	  String n[]=a.split(" ");
	  String b="st";
	  
	for(int j=0;j<b.length();j++) {  
	  for(int i=0;i<n.length;i++) {
			if(b.charAt(j)== n[i].charAt(0)) {
				int l=n.length-1;
				int m=i;
				while(m<l) {
					String temp = n[m];
					n[m]=n[l];
					n[l]=temp;
					l--;
					m++;
				}
				
				
				
			}
			
		}  
	  }
	  
	  
	  for(String x:n) {
		  System.out.print(x+ " ");
	  }
		
	}

private static void p59() {

//8. Q2. Print all possible subsets of the given array whose sum equal to given N.
//example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}
		
	  
	  int n[]={1, 2, 3, 4, 5};
	  int sum=0;
	  int an=6;
	  
	for(int k=0;k<n.length;k++) {
		if(an==n[k]) {
			System.out.println(n[k]);
		}
	}
	
	  for(int i=0;i<n.length;i++) {
			 for(int k=i;k<n.length;k++) {
				if(sum==an) {
					 sum+=n[k];
					for(int l=0;l<k;l++) {
						System.out.print(n[l]+" ");
					}
					System.out.println();
				}
				 sum+=n[k];
			 }
			 sum=0;
	  }
	  
	  
	  for(int i=0;i<n.length-1;i++) {
			 for(int k=i+1;k<n.length;k++) {
				sum=n[k]+n[i]; 
				if(an==sum) {
					System.out.println(n[i] + " "+ n[k]);
				}
				sum=0;
			 }
			 
	  }
	}

private static void p58() {
//	  7. Print whether the version is upgraded, downgraded or
//	  not changed according to the input given.
//	  example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, 
//	  Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded
	  
	  String a="4.8.2";
	  String b="4.8.4";
	  
	  String n=ver(a,b);
	  System.out.println(n);
		
	}

private static String ver(String a, String b) {
	
	if(b.charAt(0)<a.charAt(0)) {
		return "downgraded";
	}
	else if(b.charAt(2)<a.charAt(2)) {
		return "downgraded";
	}
	else if(b.charAt(4)<a.charAt(4)) {
		return "downgraded";
	}
	return "upgraded";
}

private static void p57() {
//
//6. Remove the duplicates in the String.
//Testcase 1:
//Input: Java1234
//Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
//Testcase 2:
//Input: Python1223:
//Output: Python1234 (Replace the second 2 with 3,
//		and replace 3 with 4 as 3 is replaced for the duplicated 2)
//Testcase 3:
//Input: aBuzZ9900
//Output: aBuzC9012
//(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String.
//		Replace with capital C as the letter to be replaced is capital Z. The
//		second 9 turns out to be zero and the zero turns out to ‘1’ and the
//		second zero turns out to ‘2’)
		
	  
	  String a="aBuzZ9900";
	  char b[]=a.toCharArray();
	  List<Character> n=new ArrayList<>();
	  for(char x:b) {
		  
		  n.add(Character.toLowerCase(x));
	  }
	  
	  for(int i=0;i<b.length;i++) {
		  for(int j=i+1;j<b.length;j++) {
			  if(Character.toLowerCase(b[i])==Character.toLowerCase(b[j])) {
				  if(b[j]=='9') {
					b[j]='0';  
				  }
				  else if (Character.toLowerCase(b[j])== 'z') {
					  for(char k='a';k <'z';k++) {
						 if(!n.contains(k)) {
							 if(b[j]=='Z') {
								 b[j]=Character.toUpperCase(k); 
							 }
							 else {
								 b[j]=k; 
							 }
							
							 break;
						 }}}
				  else {
				  b[j]=(char) (b[j]+1);
				  }
			  }
		  }
	  }
	  
	  
	  
	  for(char x:b) {
		  System.out.print(x);
	  }
	  
	}

private static void p56() {
//	  5. Given a matrix of 2D array of n rows and m coloumns. 
//	  Print this matrix in ZIG-ZAG fashion as shown in figure.
//
//	  Example:
//	  Input: 
//	  1 2 3
//	  4 5 6
//	  7 8 9
//	  Output: 
//	  1 2 4 7 5 3 6 8 9
	  
	  int matrix[][]= {{1,2,3},
	             {4,5,6},
	             {7,8,9}};
	  
	  System.out.println("Input Matrix:");
      for (int[] row : matrix) {
          for (int num : row) {
              System.out.print(num + " ");
          }
          System.out.println();
      }

      System.out.println("\nOutput Zigzag Pattern:");
      printZigZag(matrix);		
	}
  
  public static void printZigZag(int[][] matrix) {
	   int rows = matrix.length;
       int cols = matrix[0].length;

       // Flag to indicate direction of printing: true for top-right direction, false for bottom-left direction
       boolean topRight = true;

       // Loop through the diagonal elements
       for (int k = 0; k < rows + cols - 1; k++) {
    	   
           if (topRight) {
               // Print the diagonal elements in top-right direction
               for (int i = Math.max(0, k - cols + 1), j = Math.min(k, rows - 1); i <=Math.min(k, rows-1); i++, j--) {
                   System.out.print(matrix[j][i] + " ");
               }
           } else {
               // Print the diagonal elements in bottom-left direction
               for (int i = Math.max(0, k - rows + 1), j = Math.min(k, cols - 1); i <= Math.min(k, cols - 1); i++, j--) {
                   System.out.print(matrix[i][j] + " ");
               }
           }
           // Toggle the direction for the next diagonal
           topRight = !topRight;
       }
  }


private static void p55() {
//	  4. In MS-Paint, when we take the brush to a pixel and click, 
//	  the color of the region of that pixel is replaced with a new selected color. 
//	  Following is the problem statement to do this task.
//
//	  Given a 2D screen, location of a pixel in the screen and a color, replace
//	  color of the given pixel and all adjacent same colored pixels with the given
//	  color.
//	  Example:
//	  Input:
//	         screen[M][N] ={{1, 1, 1, 1, 1, 1, 1, 1},
//	                        {1, 1, 1, 1, 1, 1, 0, 0},
//	                        {1, 0, 0, 1, 1, 0, 1, 1},
//	                        {1, 2, 2, 2, 2, 0, 1, 0},
//	                        {1, 1, 1, 2, 2, 0, 1, 0},
//	                        {1, 1, 1, 2, 2, 2, 2, 0},
//	                        {1, 1, 1, 1, 1, 2, 1, 1},
//	                        {1, 1, 1, 1, 1, 2, 2, 1},
//	                        };
//	      x = 4, y = 4, newColor = 3
//	  The values in the given 2D screen indicate colors of the pixels.
//	  x and y are coordinates of the brush, newColor is the color that
//	  should replace the previous color on screen[x][y] and all surrounding
//	  pixels with same color.
//
//	  Output:
//	  Screen should be changed to following.
//	         screen[M][N] ={{1, 1, 1, 1, 1, 1, 1, 1},
//	                        {1, 1, 1, 1, 1, 1, 0, 0},
//	                        {1, 0, 0, 1, 1, 0, 1, 1},
//	                        {1, 3, 3, 3, 3, 0, 1, 0},
//	                        {1, 1, 1, 3, 3, 0, 1, 0},
//	                        {1, 1, 1, 3, 3, 3, 3, 0},
//	                        {1, 1, 1, 1, 1, 3, 1, 1},
//	                        {1, 1, 1, 1, 1, 3, 3, 1},
//	                        };
	  
	  
	  int screen[][] ={{1, 1, 1, 1, 1, 1, 1, 1},
              {1, 1, 1, 1, 1, 1, 0, 0},
              {1, 0, 0, 1, 1, 0, 1, 1},
              {1, 2, 2, 2, 2, 0, 1, 0},
              {1, 1, 1, 2, 2, 0, 1, 0},
              {1, 1, 1, 2, 2, 2, 2, 0},
              {1, 1, 1, 1, 1, 2, 1, 1},
              {1, 1, 1, 1, 1, 2, 2, 1},
              };
	  
	  int n=screen.length;
	  int m=screen[0].length;
	  int x = 4, y = 4, newColor = 3;
	  int prv=screen[4][4];
	  
	  
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<m;j++) {
			  if(screen[i][j]== prv) {
				  screen[i][j]=newColor;
			  }
			  
		  }
	  }
	  
	  for(int[] a:screen) {
	  		  for(int b:a) {
	  			System.out.print(b+" "); 
	  		  }
	  		  System.out.println();
	  }
	  
	  
	}

private static void p54() {
//	  3 is an equilibrium index, because:
//		  A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
//		  Input: A[] = {1, 2, 3}
//		  Output: -1
	  
	  int a[]= {1,2,3};
	  
	 int n=findeq(a);
	 if(n != -1) {
		    System.out.println("Equilibrium Index: " + n);
     } else {
         System.out.println("No equilibrium index found.");
     }
		
	}

private static int findeq(int[] a) {
	int t=0;
	int l=0;
	
	for(int x:a) {
		t+=x;
	}
	for(int i=0;i<a.length;i++) {
		t-=a[i];
		if(l==t) {
			return i;
		}
		
		l+=a[i];
	}
	return -1;
}

private static void p53() {

//3. Equilibrium index of an array is an index such that the sum 
//of elements at lower indexes 
//is equal to the sum of elements at higher indexes. For example, in an array A:
//Example :
//Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
//Output: 3
	
	  Map<Integer,Integer> n=new TreeMap<>();
	  int  a[] = {-7, 1, 5, 2, -4, 3, 0};
	  int coutn=0;
	  int sum=0;
	  for(int i=0;i<a.length;i++) {
		  if(a[i]<0) {
			  if(coutn!=0 && sum !=0) {
			  n.put(coutn,sum);
			  }
			  coutn=0;
			  sum=0;
		  }
		  else {
			 coutn++;
			 sum+=a[i];
		  }
		  
	  }
	  n.put(coutn,sum); 
	  
//	  Integer firstKey = n.keySet().iterator().next();
//
//      // Retrieve the value associated with the first key
//      Integer firstValue = n.get(firstKey);
//	 System.out.println(firstValue);
	  
      for( Map.Entry<Integer,Integer> en:n.entrySet()) {
    	  System.out.println(en.getValue());
    	  break;
      }
      
	}

private static void p52() {
//	  2. Given a Boolean matrix mat[M][N] of size M X N, modify it such
//	  that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
		
	  int[][] matrix = {
	            {1, 0, 1},
	            {0, 1, 0},
	            {1, 1, 1}
	        };

	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        modifyAdjacentCells(matrix);

	        System.out.println("\nMatrix after Modification:");
	        printMatrix(matrix);
	}
  
  public static void modifyAdjacentCells(int[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;

      // Iterate through each cell of the matrix
      for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              // If current cell is 1
              if (matrix[i][j] == 1) {
                  // Set adjacent cells to 0
                  for (int di = -1; di <= 1; di++) {
                      for (int dj = -1; dj <= 1; dj++) {
                          int ni = i + di;
                          int nj = j + dj;
                          // Check boundary conditions
                          if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        	   System.out.println("Setting matrix[" + ni + "][" + nj + "] to 0");
                        	  matrix[ni][nj] = 0;
                          }
                      }
                  }
              }
          }
      }
  }

  public static void printMatrix(int[][] matrix) {
      for (int[] row : matrix) {
          for (int cell : row) {
              System.out.print(cell + " ");
          }
          System.out.println();
      }
  }

private static void p51() {
//	  1. Replace every element with the greatest element on right side
//
//	  Given an array of integers, replace every element with the next greatest
//	  element (greatest element on the right side) in the array. Since there is
//	  no element next to the last element, replace it with -1. For example, 
//	  if the array is {16, 17, 4, 3, 5, 2}, then it should be modified
//	  to {17, 5, 5, 5, 2, -1}.
	  
	  int a[]= {16, 17, 4, 3, 5, 2};
	  int k=0;
	  for(int i=1;i<a.length;i++) {
		  if(a[i-1]<a[i] && a[i+1]<a[i]) {
			  for(int j=k;j<i;j++) {
				  a[j]=a[i];
				  k=i;
			  }
		  }
	  }
	  
	  a[a.length-2]=a[a.length-1];
	  a[a.length-1]=-1;
	  
	  for(int x:a) {
		  System.out.print(x+" ");
	  }
		
	}

private static void p50() {
//	  4.Given an array as input, The condition is if the number
//	  is repeated you must add the number
//	  and put the next index value to 0. If the number is 0 print it at the last.
//	  Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
//	  Output: 4 2 12 8 0 0 0 0 0 .
		
	  int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8};
	  
	  for(int i=0;i<arr.length-1;i++) {
		  if(arr[i]==arr[i+1]) {
			  arr[i]=arr[i]+arr[i+1];
			  arr[i+1]=0;
			  }
	  }
	  int k=0;
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]>0) {
			  arr[k++]=arr[i];
			  arr[i]=0;
		  }
	  }
	  
	  for(int x:arr) {
		  System.out.print(x+" ");
	  }
	  
	}

private static void p49() {
//	  3.Print the following pattern
//	   1  
//	  3 2
//	 6 5 4
//	10 9 8 7
//	10 9 8 7 
//	 6 5 4 
//	  3 2 
//	   1
	  int o=0;
	  int n=4;
	  for(int i=1;i<=n;i++) {
		  for(int j=n-i;j>0;j--) {
			System.out.print(" ");
		  }
		  o=o+i;
		  int l=o;
		  for(int k=0;k<i;k++) {
			  System.out.print(l+" ");  
			l--;
		  }
		  System.out.println();
	  }
	  
	  
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<i;j++) {
			  System.out.print(" ");
		  }
		  for(int k=0;k<n-i;k++) {
			 
			  System.out.print(o+" "); 
			  o--;
			  }
		 
		  System.out.println();
	  }
		
	}

private static void p48() {
//	  2. Given an input string and a dictionary of words, find out
//	  if the input string can be segmented into a space-separated 
//	  sequence of dictionary words. See following examples for more details.
//	  Consider the following dictionary 
//	  { i, like, sam, sung, samsung, mobile, ice, 
//	    cream, icecream, man, go, mango}
//	  Input:  ilike
//	  Output: Yes 
//	  The string can be segmented as "i like".
//	  Input:  ilikesamsung
//	  Output: Yes
//	  The string can be segmented as "i like samsung" 
//	  or "i like sam sung".<>
	  
	  List<String> dictionary = Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango");
      
      String input1 = "ilike";
      String input2 = "ilikesamsung";
      
      System.out.println("Input: " + input1);
      System.out.println("Output: " + (wordBreak(input1, dictionary) ? "Yes" : "No"));

      System.out.println("Input: " + input2);
      System.out.println("Output: " + (wordBreak(input2, dictionary) ? "Yes" : "No"));
		
	}

private static boolean wordBreak(String s, List<String> wordDict) {

	
	Set<String> dict = new HashSet<>(wordDict);
    int n = s.length();
    boolean[] dp = new boolean[n + 1];
    dp[0] = true; // Empty string can be segmented

    for (int end = 1; end <= n; end++) {
        for (int start = 0; start < end; start++) {
            if (dp[start] && dict.contains(s.substring(start, end))) {
                dp[end] = true;
                break; // No need to continue checking if already found a valid segmentation
            }
        }
    }

    return dp[n];
}

private static void p47() {
//	  SET 9:

//		  1. Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds
//		  if wildcard pattern is matched with text. The matching should cover the entire text (not partial text).
//		  The wildcard pattern can include the characters ‘?’ and ‘*’
//		  ‘?’ – matches any single character
//		  ‘*’ – Matches any sequence of characters (including the empty sequence)
//		  Example:
//		  Text = “baaabab”,
//		  Pattern = “*****ba*****ab”,
//		  output : true
//		  Pattern = “baaa?ab”, output : true
//		  Pattern = “ba*a?”, output : true
//		  Pattern = “a*ab”, output : false
	  
	     String text = "baaabab";
	        String[] patterns = {"*****ba*****ab", "baaa?ab", "ba*a?", "a*ab"};

	        for (String pattern : patterns) {
	            System.out.println("Pattern: " + pattern + ", Output: " + isMatch(text, pattern));
	        }	
	        
	      
  
	        
	}
  
  public static boolean isMatch(String text, String pattern) {
      int m = text.length();
      int n = pattern.length();

      boolean[][] dp = new boolean[m + 1][n + 1];
      dp[0][0] = true;

      for (int j = 1; j <= n; j++) {
          if (pattern.charAt(j - 1) == '*') {
              dp[0][j] = dp[0][j - 1];
          }
      }

      for (int i = 1; i <= m; i++) {
          for (int j = 1; j <= n; j++) {
              if (pattern.charAt(j - 1) == '?' || text.charAt(i - 1) == pattern.charAt(j - 1)) {
                  dp[i][j] = dp[i - 1][j - 1];
              } else if (pattern.charAt(j - 1) == '*') {
                  dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
              }
          }
      }

      return dp[m][n];
  }


private static void p46() {
//	  Find the largest possible prime number with given no
//	  Input
//	  5
//	  4691
//	  Output:
//	  9461
		
	     Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number of digits:");
	        int numDigits = scanner.nextInt();
	        
	        System.out.println("Enter the number:");
	        int number = scanner.nextInt();
	        
	        // Generate all permutations of the number
	        List<String> permutations = generatePermutations(String.valueOf(number));
	        
	        int largestPrime = -1;
	        
	        // Iterate over each permutation
	        for (String permutation : permutations) {
	            int permutedNumber = Integer.parseInt(permutation);
	            if (isPrime(permutedNumber) && permutedNumber > largestPrime) {
	                largestPrime = permutedNumber;
	            }
	        }
	        
	        System.out.println("Largest prime number: " + largestPrime);
	}

  // Function to check if a number is prime
  public static boolean isPrime(int n) {
      if (n <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              return false;
          }
      }
      return true;
  }
  
  // Function to generate all permutations of a string
  public static List<String> generatePermutations(String str) {
      List<String> permutations = new ArrayList<>();
      if (str.length() <= 1) {
          permutations.add(str);
      } else {
          for (int i = 0; i < str.length(); i++) {
              String prefix = str.substring(0, i);
              String suffix = str.substring(i + 1);
              String remaining = prefix + suffix;
              for (String permutation : generatePermutations(remaining)) {
                  permutations.add(str.charAt(i) + permutation);
              }
          }
      }
      return permutations;
  }

private static void p45() {
//	  Program 4:
	//1,0   0,0   0,1
	//2,0   1,1   0,2
	//2,1   2,2   1,2
//		  Rotate the matrix elements
//		  For 3*3 matrix   
//		  Input
//		  1    2    3
//		  4    5    6
//		  7    8    9
//
//		  Output:
//		  4    1    2
//		  7    5    3
//		  8    9    6
//
//		  For 4*4 matrix
//		  Input:
//		  1    2    3    4    
//		  5    6    7    8
//		  9    10    11    12
//		  13    14    15    16
//
//		  Output:
//		  5    1    2    3
//		  9    10    6    4
//		  13    11    7    8
//		  14    15    16    12
	  
	  int[][] matrix =   {
              {1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15, 16}
      };

      int n = matrix.length;
      int m = matrix[0].length;
      
      // Create a new matrix to store the transformed elements
      int[][] transformedMatrix = new int[n][m];
      
      // Define the shift pattern
      int[][] shifts = {
          {0, 1}, {1, 0}, {0, -1}, {-1, 0}
      };
      
      int currentShift = 0;
      int row = 0, col = 0;
      
      for (int i = 0; i < n * m; i++) {
          transformedMatrix[row][col] = matrix[i / m][i % m];
          int nextRow = row + shifts[currentShift][0];
          int nextCol = col + shifts[currentShift][1];
          if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m || transformedMatrix[nextRow][nextCol] != 0) {
              currentShift = (currentShift + 1) % 4;
          }
          row += shifts[currentShift][0];
          col += shifts[currentShift][1];
      }
      
      // Copy the transformed elements back to the original matrix
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              matrix[i][j] = transformedMatrix[i][j];
          }
      }

      for (int[] row1 : matrix) {
          for (int val : row1) {
              System.out.print(val + "\t");
          }
          System.out.println();
      }
      }
      
   
		
	
  

 

private static void p44() {
//	  Program 3:
//		  Find the union intersection of two list and also find except 
//		  (remove even elements from list1 and odd elements from list2)
//		  Input
//		  List 1: 1,3,4,5,6,8,9
//		  List 2: 1, 5,8,9,2
//
//		  Union: 1, 3,4,5,6,8,9,2
//		  Intersection: 1,5,8,9
//		  Except: 1, 3, 5,9,8,2
	  
	  int a[]= {1,3,4,5,6,8,9};
	  int b[]= {1,5,8,9,2};
	  Set<Integer> set=new HashSet<>();
	  for(int i=0;i<a.length;i++) {
		  set.add(a[i]);
	  }
	  
   Set<Integer> set1=new HashSet<>();
	
	  
	  for(int i=0;i<b.length;i++) {
		  if(set.contains(b[i])) {
		     set1.add(b[i]);  
	  }
		  }
	  
	  System.out.println("intersection="+ set1); 
	  
	  for(int i=0;i<b.length;i++) {
		  set.add(b[i]);
	  }
	  
	  System.out.println("union="+set);
	  
 Set<Integer> set2=new HashSet<>();
	
 for(int i=0;i<a.length;i++) {
	  if(a[i]%2!=0) {
	     set2.add(a[i]);  
 }
	  
 }
	  for(int i=0;i<b.length;i++) {
		  if(b[i]%2==0) {
		     set2.add(b[i]);  
	  }
	  }
	  
	  
	  
	  System.out.println("Except="+ set2); 
		
	}

private static void p43() {
//	  Program 2:
//		  Input:
//		  With the starting and ending time of work given find the minimum no of workers needed
//		  Start time         end time
//		  1230            0130
//		  1200            0100
//		  1600            1700
//		  Output:
//		  2
	  
	  int n1 = 6;
      int[] arr1 = {900, 940, 950, 1100, 1500, 1800};
      int[] dep1 = {910, 1200, 1120, 1130, 1900, 2000};
      System.out.println("Minimum platforms needed: " + findPlatform(arr1, dep1, n1)); // Output: 3
		
	}
  
  public static int findPlatform(int arr[], int dep[], int n) {
      Arrays.sort(arr);
      Arrays.sort(dep);

      int platformsNeeded = 1; // Minimum one platform is needed
      int maxPlatforms = 1; // Maximum platforms needed at any point in time
      int arrIndex = 1;
      int depIndex = 0;

      while (arrIndex < n && depIndex < n) {
          if (arr[arrIndex] <= dep[depIndex]) {
              platformsNeeded++;
              arrIndex++;
              maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
          } else {
              platformsNeeded--;
              depIndex++;
          }
      }

      return maxPlatforms;
  }

private static void p42() {
//	  SET 8: 
//		  Program 1:
//		  Help john to find new friends in social network
//		  Input:
//		  3
//		  Mani 3 ram raj guna
//		  Ram 2 kumar Kishore
//		  Mughil 3 praveen Naveen Ramesh
//		  Output:
//		  Ram Raj guna kumar Kishore praveen Naveen Ramesh
	  
	  Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      s.nextLine();
      
      Map<String,List<String>> o=new HashMap<>();
      
      for(int i=0;i<n;i++){
          String[] k=s.nextLine().split(" ");
          String firstn=k[0];
          int fs=Integer.parseInt(k[1]);
          List<String> m=new ArrayList<>();
          for(int j=0;j<fs;j++){
              m.add(k[j+2]);
          }
          o.put(firstn,m);
      }
      
      Set<String> set=new HashSet<>();
      for(Map.Entry<String,List<String>> e:o.entrySet()){
          if(!e.getKey().equals("John")){
              set.addAll(e.getValue());
          }
          
         
          
          
      }
      
      for (String friend : set) {
          System.out.print(friend + " ");
      } 
		
	}

private static void p41() {
//	  5) Given a string, change the order of words in the string (last string should come first).
//  Should use RECURSION
//  Sample:   one two three 
//  Output :  three two one 
		
	  String a="one two three";
	  String b[]=a.split(" ");
	  
	  for(int i=b.length-1;i>=0;i--) {
		  System.out.print(b[i]+" ");
	  }
	  
	  String n=revers(a);
	  System.out.println();
	  System.out.print(n);
	}

private static String revers(String a) {
	
	int last=a.lastIndexOf(' ');
	
	if(last == -1) {
		return a;
	}
	
	String sub=a.substring(last+1);
	String rev=revers(a.substring(0,last));
	
	
	return sub+" "+rev;
}

private static void p40() {
//	  4) Given a 2D grid of characters, you have to search for all the words in a dictionary by
//  moving only along two directions, either right or down. Print the word if it occurs.
//  Sample :         
//
//    a   z  o   l 
//
//    n   x  h   o
//
//    v   y   i   v 
//
//    o   r   s  e 
//    
//   Dictionary = {van, zoho, love, are, is} 
//   Output: 
//      zoho 
//      love 
//      Is 
	  
	  char[][] grid = {
              {'a', 'z', 'o', 'l'},
              {'n', 'x', 'h', 'o'},
              {'v', 'y', 'i', 'v'},
              {'o', 'r', 's', 'e'}
      };

      Set<String> dictionary = new HashSet<>();
      dictionary.add("van");
      dictionary.add("zoho");
      dictionary.add("love");
      dictionary.add("are");
      dictionary.add("is");

      findWords(grid, dictionary);
		
	}
  public static void findWords(char[][] grid, Set<String> dictionary) {
      int rows = grid.length;
      int cols = grid[0].length;

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              dfs(grid, i, j, "", dictionary);
          }
      }
  }

  private static void dfs(char[][] grid, int i, int j, String word, Set<String> dictionary) {
      if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '#') {
          return;
      }

      word += grid[i][j];

      if (dictionary.contains(word)) {
          System.out.println(word);
          dictionary.remove(word); // To avoid duplicate printing
      }

      char temp = grid[i][j];
      grid[i][j] = '#'; // Mark as visited

      dfs(grid, i + 1, j, word, dictionary); // Move down
      dfs(grid, i, j + 1, word, dictionary); // Move right

      grid[i][j] = temp; // Backtrack
  }

private static void p39() {

//3) Given a string, we have to reverse the string without 
//changing the position of punctuations and spaces.
//Sample:   house no : 123@ cbe 
//Output:    ebc32 1o :  nes@ uoh 
	  
	  String input = "house no : 123@ cbe";
      String reversed = reverseString(input);
      System.out.println("Output: " + reversed);
	    
		
	}
  
  public static boolean punch(char n){
      return n == '@' || n == ' ' || n == ':' ;   }

  private static String reverseString(String input) {
	  char a[]=input.toCharArray();
      int left=0;
      int right=input.length()-1;
      
      while(left < right){
          if(!punch(a[left])){
              
              while(right > left && punch(a[right])){
                  right--;
              }
              
              if(left < right){
                  char temp =a[left];
                  a[left]=a[right] ;
                   a[right] =temp;
                  right--;
              }
              
              
          }
          left++;
      }
      
      return new String(a);
  }


private static void p38() {
//2) Find the largest sum contiguous subarray which should not have negative numbers. 
//We have to print the sum and the corresponding array elements which brought up the sum.
//Sample: 
//Array : {­2, 7, 5, ­1, 3, 2, 9, ­7} 
//Output: 
//     Sum : 14 
//     Elements : 3, 2, 9  
	  
	  
	  
	  int a[]= {-2, 7, 5, -1, 3, 2, 9, -7};
	  int b[]=new int[a.length];
	  int sum=0;
	  boolean n=false;
	  
	  for(int i=0;i<a.length;i++) {
		  if(a[i]<0) {
			 n=!n;
		  }
		  if(a[i]>0 && n){
			 sum+=a[i]; 
		  }
		  else if(n==false) {
			  b[i]=sum;
			  sum=0;
			  n=true;
		  }
	  }
	  
	  
//	  for(int x:b) {
//		  System.out.print(x+" ");
//	  }
	  
	  int k=0,m=0;
	  for(int i=0;i<b.length;i++) {
		  if(k<b[i]) {
			  k=b[i];
			  m=i;
		  }
	  }
	  
	  for(int j=m-1;j>0;j--) {
		  if(a[j]>0) {
			  System.out.print("element"+a[j]+",");
		  }
		  else {
			  break;
		  }
	  }
	  System.out.println();
	  
	  System.out.println("sum of element"+k);
	  
	  System.out.println("----------------another way -------------------");
	  findLargestSubarray(a);
		
	}
  
  
  private static void findLargestSubarray(int[] arr) {
      int maxSum = 0;
      int currentSum = 0;
      ArrayList<Integer> subarray = new ArrayList<>();
      ArrayList<Integer> maxSubarray = new ArrayList<>(); 
      
      for(int num:arr) {
    	  
    	  if(num>=0){
    		  currentSum+=num;
    		  subarray.add(num);
    		  
    		  if(currentSum>maxSum) {
    			  maxSum=currentSum;
    			  maxSubarray = new ArrayList<>(subarray); 
    		  }
    	  }
    	  else {
    		  currentSum=0;
    		  subarray.clear();
    	  }
      }

      System.out.println("Sum: " + maxSum);
      System.out.print("Elements: ");
      for (int i:maxSubarray) {
          System.out.print(i+",");
         
      }
  }

private static void p36() {
//	  SET 7:
//		  1) Given an array, find the minimum of all the 
//	  greater numbers for each element in the array.  
//		  Sample: 
//		  Array : {2, 3, 7, ­1, 8, 5, 11} 
//		  Output: 
//		  {2­>3, 3­>5, 7­>8, ­1­>2, 8­>11, 5­>7, 11­>} 
	  
	  int a[]={2, 3, 7, -1, 8, 5, 11} ;
	  
	  Map<Integer,Integer> n=new HashMap<>();
	  TreeSet<Integer> g=new TreeSet<>();
	  
	  for(Integer x:a) {
		  g.add(x);
	  }
	  
	  for(int i=0;i<a.length;i++) {
		  Integer gra=g.higher(a[i]);
			  n.put(a[i], gra);
		  }
	  
	  
	  System.out.println(n);


	  }
	 
		
	

private static void p35() {
//	  4. Print true if second string is a substring of first string, else print false.
//	  Note : * symbol can replace n number of characters
//	  Input : Spoon  Sp*n  Output : TRUE
//	      Zoho     *o*o  Output : TRUE
//	      Man       n*     Output : FALSE
//	      Subline  line   Output : TRUE
	  
	  System.out.println(isSubstring("Spoon", "Sp*n"));  // TRUE
      System.out.println(isSubstring("Zoho", "*o*o"));  // TRUE
      System.out.println(isSubstring("Man", "n*"));     // FALSE
      System.out.println(isSubstring("Subline", "line")); // TRUE

	  
		
	}

private static boolean isSubstring(String s1, String s2) {
	   int i = 0, j = 0;

       while(i<s1.length() && j<s2.length()) {
    	   if(s2.charAt(j)=='*') {
    		   j++;
    		   
    		   if(j == s2.length()) {
    			   return true;
    		   }
    		   
    		   while(i<s1.length() && s1.charAt(i) != s2.charAt(j) ) {
    			   i++;
    		   }
    	   }
    	   
    	   
       
       else {
    	   if(s1.charAt(i) != s2.charAt(j)) {
    		   i++;
    		   j=0;
    	   }
    	   else {
    		   i++;
    		   j++;
    	   }    
       }
    	   
    	   
       }
     
       return j == s2.length();
}

private static void p34() {
//	  3. Sort the array elements in descending order according to their frequency of occurrence
//	  Input : [ 2 2 3 4 5 12 2 3 3 3 12 ]
//	  Output : 3 3 3 3 2 2 2 12 12 4 5
//	  Explanation : 3 occurred 4 times, 2 occurred 3 times, 12 occurred 2 times, 4 occurred 1 time,
//	  5 occurred 1 time
//	  Input : [ 0 -1 2 1 0 ]
//	  Output : 0 0 -1 1 2
//	  Note : sort single occurrence elements in ascending order
	  
	  int a[]= {2, 2, 3 ,4 ,5 ,12, 2, 3, 3, 3, 12 };
	  
	  
	  sortbyocc(a);
	  
	  for(int x:a) {
		  System.out.print(x+",");
	  }
	}

private static void sortbyocc(int[] n) {

	
	Map<Integer,Integer> map=new HashMap<>();
	
	for(int x:n) {
		map.put(x, map.getOrDefault(x,0)+1);
	}
	
	 // Convert int[] to Integer[]
    Integer[] arr = new Integer[n.length];
    for (int i = 0; i < n.length; i++) {
        arr[i] = n[i];
    }
    
    // Define comparator for sorting
    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            int freqCompare = Integer.compare(map.get(b), map.get(a));
            if (freqCompare != 0) {
                return freqCompare;
            }
            return Integer.compare(a, b);
        }
    };
    
    // Sort array using comparator
    Arrays.sort(arr, comparator);
    
    // Copy sorted elements back to the original array
    for (int i = 0; i < n.length; i++) {
        n[i] = arr[i];
    }
}

private static void p33() {
		
//	  2. Find the least prime number that can be added with first array
//	  element that makes them divisible by second array elements at respective index 
//	  (check for prime numbers under 1000, if exist return -1 as answer)
//	  & (Consider 1 as prime number)
//	  Input : [ 20, 7 ]
//	      [ 11, 5 ]
//	  Output : [ 2, 3 ]
//	  Explanation : 
//	  (20 + ?) % 11 
//	  ( 7 + ?) % 5
		
	  int a[]= {20,7};
	    int b[]= {11,5};

	    List<Integer> n=new ArrayList<>();

	    for(int i=0;i<a.length;i++) {
	        boolean k=false;
	        for(int j=1;j<=1000;j++) {
	            if(isprime(j)) {
	                if((a[i]+j)%b[i]==0) {
	                    n.add(j);
	                    k=true;
	                    break;
	                }
	            }
	        }

	        if(k == false) {
	            n.add(1);
	        } 
	    }

	    System.out.println(n);
	  
	}

private static boolean isprime(int j) {
	
	  if(j<=1) {
	        return false;
	    }

	    for(int i=2;i<=Math.sqrt(j);i++) {
	        if(j%i==0) {
	            return false;
	        }
	    }
	    return true;
}

private static void p32() {
//	  1. Find the extra element and its index
//	  Input : [ 10, 20, 30, 12, 5 ]
//	      [ 10, 5, 30, 20 ]
//	  Output : 12 is the extra element in array 1 at index 4
//	  Input : [ -1, 0, 3, 2 ]
//	      [ 3, 4, 0, -1, 2 ]
//	  Output : 4 is the extra element in array 3 at index 5
	  
//	  int a[]= { 10, 20, 30, 12, 5 };
//	  int b[]= { 10, 5, 30, 20};
	  
	  int a[]= { -1, 0, 3, 2 };
	  int b[]= { 3, 4, 0, -1, 2 };
	  

	     HashMap<Integer, Integer> u = new HashMap<>();
      
	     for (int num : a) {
	            u.put(num, u.getOrDefault(num, 0) + 1);
	        }

	     for (int i = 0; i < b.length; i++) {
	            if (!u.containsKey(b[i]) || u.get(b[i]) == 0) {
	                System.out.println(b[i] + " is the extra element in array 1 at index " + i);
	               
	            } else {
	                u.put(b[i], u.get(b[i]) - 1);
	            }
	        }
		
	}

private static void p31() {
		//Check if a number ‘a’ is present in another number ‘b.
	  
	  int a=123;
	  int b=123456;
	  
	  boolean ans=numcontains(a,b);
	  
      if (ans) {
          System.out.println(a + " is present in " + b);
      } else {
          System.out.println(a + " is not present in " + b);
      }

	}

private static boolean numcontains(int a, int b) {
	String n1=String.valueOf(a);

	String n2=String.valueOf(b);
	
	return n2.contains(n1);
}

private static void p30() {
//	  5.given a set of numbers, and a digit in each iteration, if the digit exists in any of  the numbers,
//	  remove its occurrences and ask for the next digit till the list becomes empty.
	
	Scanner num=new Scanner(System.in);
	System.out.println("given a set of numbers");
	String[] n=num.nextLine().split(" ");
	
	 List<String> l = new ArrayList<>();
	 for(int i=0;i<n.length;i++) {
		 l.add(n[i]);
	 }
	 
	 while(!l.isEmpty()) {
		 
	 System.out.println(l);
	 System.out.println("enter a numbre you want to remove");
	 char r=num.nextLine().charAt(0);
	 removenum(l,r);
	 }
	 
	 System.out.println("list is empty");
	 num.close();
	 
	}



private static void removenum(List<String> l, char r) {
	
	for(int i=0;i<l.size();i++) {
		String n=l.get(i);
		StringBuffer s=new StringBuffer();
		for(int j=0;j<n.length();j++) {
			if(n.charAt(j) != r) {
				s.append(n.charAt(j));
			}
			
			   l.set(i, s.toString());
		}
		
		l.removeIf(String::isEmpty);
	}
	
}



private static void p29() {
		// 4.lexicographic sorting.
	  String arr[] = { "batman", "bat", "apple" };
	    int N = arr.length;
	 
	    // Function Call
	    Printlexiographically(N, arr);
	}
  public static void Printlexiographically(int N,
          String arr[])
{

// Sort the strings of the array
Arrays.sort(arr);

for (int i = 0; i < N; i++) {

// Print each string of the array
System.out.println(arr[i]);
}


}

private static void p28() {
		// 3.adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119
	  
	  int number=2875;
	  int di=4;
	  
	  String a=String.valueOf(number);
	  String b="";
	 
	 
	  for(int i=0;i<a.length();i++) {
		  b+=String.valueOf(Integer.parseInt(String.valueOf(a.charAt(i))) + di);
		  }
	System.out.println(b);
	  
	}

private static void p27() {
		// 2.prime factor – sort the array based on the minimum factor they have.
		
	   int[] arr = {21, 15, 8, 9, 5, 18};
	  
	   sortprimefactor(arr);
	   
	   for(int a:arr) {
		   System.out.print(a+",");
	   }
	   
	}

private static void sortprimefactor(int[] arr) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(primefac(arr[j])>primefac(arr[j+1])) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
}

private static int primefac(int a) {
    
	for(int i=2;i<=a;i++) {
		if(a%i==0) {
			return i;
		}
	}
	
	return a;
}

private static void p26() {
//	  1.prime number – print n prime numbers
	
      
      int N=100;
      // way 2
      for(int i=1;i<=N;i++) {
    	  boolean ans=true;
    	  for(int j=2;j<i;j++) {
    		  if(i%j==0) {
    			 ans=false; 
    		  }
    	  }
    	  
    	  if(ans) {
    		  System.out.print(i + " ");
    	  }
    	  

      }
		
	}
  
 
private static void p25() {
//	  2)  To find the number of groups and output the groups:
//		  Explanation: To find the sum of the elements in the 
//		  groups and that sum should be divisible by input X and the
//		  groups should be limited to range with X numbers.
//		  If X is 3, then the group should have only 2 elements and 3 elements
//		  from the array whose sum is divisible by 3.
//		  Input:
//		  Array: 3, 9, 7, 4, 6, 8
//		  X: 3
//		  Output:
//            3,9
//	          3,9,6
//	          3,7,8
//	          3,4,8
//	          3,6
//	          9,7,8
//	          9,4,8
//	          9,6
//	          7,6,8
//	          7,8
//	          4,6,8
//	          4,8
////		  No of groups: 12
	  
	  
	    int arr[]= {3, 9, 7, 4, 6, 8};
	    int x=3;
	    int count=0;
	    
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if((arr[i]+arr[j])% x == 0) {
	    			System.out.println(arr[i]+","+arr[j]);
	    			count++;
	    		}	
	    		
	    		
	    		for(int k=j+1;k<arr.length;k++) {
		    		if((arr[i]+arr[j]+arr[k])% x == 0) {
		    			System.out.println(arr[i]+","+arr[j]+","+arr[k]);
		    			count++;
		    		}	
		    	}
	    		
	    	}
	    	
	    	
	    
	    	
	    }
	    
	    
		System.out.println("No of groupsd:"+count); 
	  
		
	}

private static void p24() {
//	  1) Print the given pattern:
//		  Input:
//		  N= 3, M=3
//		  Output:
//		  X X X
//		  X 0 X
//		  X X X
//
//		  Input:
//		  N=4 M=5
//		  Output:
//		  X X X X
//		  X 0 0 X
//		  X 0 0 X
//		  X 0 0 X
//		  X X X X
//
//		  Input:
//		  N=6 M=7
//		  X X X X X X
//		  X 0 0 0 0 X
//		  X 0 X X 0 X
//		  X 0 X X 0 X
//		  X 0 X X 0 X
//		  X 0 0 0 0 X
//		  X X X X X X
	  
	  
	  int m=8 ,n=8;
	  
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<m;j++) {
			  if((i>=1 && j>=1)&&(i<n-1&&j<m-1)) {
				  if((i>=2 && j>=2)&&(i<n-2&&j<m-2)) {
					  System.out.print('X');
				  }
				  else {
				  System.out.print(0);
				  }
			  }else {
			  System.out.print('X');
		  }
			  }
		  System.out.println();
	  }
	  
	  
	  
		
	}

private static void p23() {
//	  5) A man his driving car from home to office with X petrol. There are N number
//	  of petrol bunks in the city with only few capacities and each petrol is located in 
//	  different places For one km one liter will consume. So he fill up petrol in his petrol tank in each 
//	  petrol bunks. Output the remaining petrol if he has or tell him that he cannot travel if he is out of petrol.
//  Input:
//  Petrol in car: 2 Liters
//  Petrol bunks: A B C
//  Distance from petrol each petrol bunks: 1, 5, 3
//  Capacities of each petrol bunk: 6, 4, 2
//  Output:
//  Remaining petrol in car is 5 liters
		
	  
	  
	  int carpetrol=2;
	  int petrolbunks[]= {1,5,3};
	  int Capacitiesbunks[]= {6,4,2};
	  
	  int ans=remining(carpetrol,petrolbunks,Capacitiesbunks);
	  System.out.println(ans);	  
	}

private static int remining(int carpetrol, int[] petrolbunks, int[] capacitiesbunks) {
	
	int remining=carpetrol;
	
	for(int i=0;i<petrolbunks.length;i++) {
	
	if(remining < petrolbunks[i]) {
		return -1;
	}
	
	remining+=capacitiesbunks[i];
	remining-=petrolbunks[i];
	
	}
	return remining;
}

private static void p22() {
//	4) To find the print the pattern:Ip: n=5
//			Op:
//			1
//			1 1
//			2 1
//			1 2 1 1
//			1 1 1 2 2 1
	  
	
	int n = 5;
	
	
	for(int i=1;i<=n;i++) {
    String result = lookAndSay(i);
    System.out.println(result);
	}
		
	}

public static String lookAndSay(int n) {
    String current = "1";
    
    // Iterate to generate nth row
    for (int i = 1; i < n; i++) {
        StringBuilder next = new StringBuilder();
        int count = 1;
        char digit = current.charAt(0);

        // Iterate through current row to count consecutive digits
        for (int j = 1; j < current.length(); j++) {
            if (current.charAt(j) == digit) {
                count++;
            } else {
                // Append count and digit to next row
                next.append(count);
                next.append(digit);
                digit = current.charAt(j);
                count = 1;
            }
        }

        // Append count and digit for the last set of consecutive digits
        next.append(count);
        next.append(digit);
        current = next.toString(); // Update current row
    }
    
    return current;
}


private static void p21() {
//	  3) To output the number in words (0-999)
//  Input: 234
//  Output: Two hundred and Thirty Four
	  
	  int n=234;
	  
	  String a=ans(n);
	  
	  
		System.out.println(a);
	  
	  
	  
	}

private static String ans(int n) {
	
	String a[]= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","elven","twele","thirteen","foreteen"
			  ,"fifteen","sixteen","seventeen","eighteen","nineteen"};
	  String b[]= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	  
	 String word=""; 
	  
	  if(n==0) {
		  return a[0];
	  }
	  
	  if(n>=100) {
		 word+=a[n/100]+" hundred"+" ";
		 n=n%100;
	  }
	  
	  if(n>19) {
			 word+=b[n/10]+" ";
			 n=n%10;
		  }
	   
	  word+=a[n];
	  
	return word;
}

private static void p20() {
//	  2) To find the factors of the numbers given in an array and to sort the numbers in descending order according to the factors present in it.
//  Input:
//  Given array : 8, 2, 3, 12, 16
//  Output:
//  12, 16, 8, 2, 3
	  
	  int a[]= {8,2,3,12,16};
	  
	     factorsum(a);
	  
	  for (int num : a) {
          System.out.print(num + " ");
      }
	  
		
	}
  
  private static void factorsum(int[] a) {
     
	  for(int i=0;i<a.length -1;i++) {
		  for(int j=0;j<a.length -i -1;j++) {
			  if(fact(a[j]) < fact(a[j+1])) {
				  int temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
			  }
		  }
	  }

}

private static int fact(int k) {
	
	int count=0;
	for(int i=1;i<=k;i++) {
		if(k%i == 0) {
			count++;
		}
	}
		
	return count;
}

public static int countFactors(int num) {
      int count = 0;
      for (int i = 1; i <= num; i++) {
          if (num % i == 0) {
              count++;
          }
      }
      return count;
  }

private static void p19() {
//	  1) To find the odd numbers in between the range.
//  Input:
//  2
//  15
//  Output:
//  3,5,7,9,11,13
	  
	  List<Integer> ans=new ArrayList<>();
	  
	  int a=2;
	  int b=15;
	  
	  for(int i=a;i<b;i++) {
		if(i%2!=0) {
			ans.add(i);
		}  
	  }
	  
	  System.out.println(ans);
		
	}

private static void p18() {
//	  4.array of numbers were given to find a number which has same sum of numbers in it’s either side.
//	  I/p 1, 2, 3, 7, 6
//	  O/p 7(has 1+ 2+3 in left 6 in right)
		
	  int a[]= {1,2,3,7,6};
	  
	  
	  
	  for(int i=1;i<a.length-1;i++) {
		 
		int left=0;
		int rigth=0;
		
		for(int j=0;j<i;j++) {
			left+=a[j];
		}
		
		for(int k=i+1;k<a.length;k++) {
			rigth+=a[k];
		}
		
		if(left==rigth) {
			System.out.println(a[i]);
		}
		 
	  }
	  
	}

private static void p17() {
//	  3. It’s about anagram.i/p was array of strings .and a word was given to find whether it has anagram in given array.
//	  I/p catch, got, tiger, mat, eat, Pat, tap, tea
//	  Word: ate
//	  O/p eat, tea
	  
	  String a[]= {"eat","catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};	
	  String b="ate";
	  int bcount=0;
	  
	  for(char x:b.toCharArray()) {
		  bcount+=x;
	  }
	  
	  for(String x:a) {
		  int acount=0;
		  for(char l:x.toCharArray()) {
			  acount+=l;
		  }
		  if(bcount==acount) {
			  System.out.println(x);
		  }
	  }
	  
	  
	  // 2n way
	  
	  List<String> ans=new ArrayList<>();
	  
	  char n[]=b.toCharArray();
	  Arrays.sort(n);
	  
	  for(String x:a) {
		 char l[]=x.toCharArray();
		 Arrays.sort(l); 
		  if(Arrays.equals(l, n)) {
			  ans.add(x);
		  }
	  }

	  System.out.println(ans);
	  
	}

private static void p16() {
//	  2.sort the array odd numbers in ascending and even numbers in descending.
//	  I/p 5 8 11 6 2 1 7
//	  O/p 1 5 7 11 8 6 2
	  
	  
	  int a[]= {5 ,8 ,11, 6, 2, 1, 7};
	   Arrays.sort(a);
	   
	   int b[]=new int[a.length];
	   int k=0; 
	   
	   
	   for(int x:a) {
		   if(x%2!=0) {
		  b[k]=x;
		k++;		  
	   }
	 }
	   
	   for(int i=a.length-1;i>=0;i--) {
		   if(a[i]%2==0) {
			   b[k]=a[i];
				k++;  
		   }
	   }
	   
	   
	   for(int x:b) {
		   System.out.println(x);
	   }
	   
	}

private static void p15() {
//		  1. Print longest sequence between same character
//		  Ex I/p abcccccbba
//		  O/p 8 (from a to a)
//		  I/p aaaaaaaa
//		  O/p 6
	  
	  String a="aaaaaaaa";
	  int n=a.length();
	  
    List<Integer> list=new java.util.ArrayList<Integer>(); 
    
      for(int i=0;i<a.length();i++) {
    	  for(int j=a.length()-1;j>i;j--) {
    		  if(a.charAt(i)== a.charAt(j)) {
    			  list.add(j);
    		  }
    	  }
      }
      
      Collections.sort(list);
      
      int ans=list.get(list.size()-1)-1;
		
      System.out.println(ans);
	}

private static void p14() {
//	  5. Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number 
//	  of possible decodings of the given digit sequence.
//	  Examples:
//	  Input: digits[] = “121”
//	  Output: 3 // The possible decodings are “ABA”, “AU”, “LA”
//	  Input: digits[] = “1234” Output: 3
	  // The possible decodings are “ABCD”, “LCD”, “AWD”
	  

      char a[]= {'1','2','3','4'};
      int n=a.length;
	  int ans=countDecoding(a,n);
		System.out.println(ans);
	
	}
  
  static int countDecoding(char[] a, int n)
  {
      if( n == 0 || n==1  ) 
          return 1;
      
      if(a[0] == '0')
    	  return 0;
      
      int count=0;
      
      if(a[n-1] > '0')
        count= countDecoding(a, n-1);
      
      if(  a[n-2]== '1' ||   (a[n-2]=='2' && a[n-1] < '7') ) 
    	  count+= countDecoding(a, n-2);
      
      
    	  
      return count;
  }

 

 
  

private static void p13() {
//	  4.Given two dates, find total number of days between them.
//	  Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
//	  Output: 393
//	  dt1 represents “10-Feb-2014” and dt2 represents “10-Mar-2015” The difference is 365 + 28
//	  Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
//	  Output: 29
//	  Note that 2000 is a leap year
//	  Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
//	  Output: 0
//	  Both dates are same
//	  Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
//	  Output: 1461
//	  Number of days is 365*4 + 1
	  
	  
	  int dt1[] = {1, 2, 2000};
	  int dt2[] = {1, 2, 2000};
	  
	  int leapyear=0;
	  int yearcount=0;
	  int monthcount=0;
	  int days=0;
	  
	  if(dt1[2]==dt2[2] && dt1[1]!=dt2[1] ) {
		  if((dt1[2]%4==0&&dt1[2]%100!=0)||(dt1[2]%400==0)) {
			  leapyear++;
		  }  
	  }
	  
	  for(int i=dt1[2];i<dt2[2];i++) {
	  if((i%4==0&&i%100!=0)||(i%400==0)) {
		  leapyear++;
		  yearcount+=365;
	  }
	  else {
		  yearcount+=365;
	  }
  }	
	  
	  int mb=(dt1[1]-12)-(dt2[1]-12);
	  
     for(int i=dt1[1];i<dt1[1]+mb-1;i++) {
    	 
    	 if(i%2 !=0) {
    		 monthcount+=31;
    	 }
    	 else if(i==2) {
    		 monthcount+=28; 
    	 }
    	 else if(i%2==0 && i!=2){
    		 monthcount+=30; 
    	 }  
	  }
     
     int n=0; 
     if(dt1[1]%2 !=0) {
    	n=31; 
     }
     else if(dt1[1]==2) {
    	 n=28;
     }
     else if(dt1[1]%2==0 && dt1[0]!=2) {
    	n=30 ;
     }
     
    if(dt1[0]==dt2[0]&&dt1[1]==dt2[1]) {
    	days=0;
    } else {
     days=(n-dt1[0])+dt2[0];
    }
      int total=leapyear+yearcount+monthcount+days;
     
     System.out.println("total between days ="+total);
     
	}

private static void p12() {

//3.Given a sentence of string, in that remove the palindrome words and print the remaining.
//Input:
//He did a good deed
//Output:
//He good
//Input:
//Hari speaks malayalam
//Output:
//Hari speaks
	  
	  String a="Hari speaks malayalam";
	  String [] b=a.split("\\s+");
	  for(String x:b) {
		StringBuffer n=new StringBuffer(x);
		if(n.length() > 1) {
		if(!x.equals(String.valueOf(n.reverse()))) {
			System.out.print(x + " ");
		}
		}
	  }
		
	}

private static void p11() {
//	  2. Find the result subtraction, multiplication, division of two integers using + operator.
//	  Input: 6 and 4
//	  output:
//	  addition 6+4 = 10,    subtraction  6+(-4) = 2,   multiplication = 24,   division = 1
//	  Input : -8 and -4
//	  Output:
//	  addition -8+(-4) = -12,    subtraction  (-8)+(-(-4)) = -4,   multiplication = 32,   division = 2
		
	  int a=-8;
	  int b=-4;
	  // Addition
      System.out.println("Addition " + a + "+" + b + " = " + (a + b));

      // Subtraction
      System.out.println("Subtraction " + a + "+(" + (-b) + ") = " + (a + (-b)));

      // Multiplication
      System.out.println("Multiplication " + a + "*" + b + " = " + (a * b));

      // Division
      System.out.println("Division " + a + "/" + b + " = " + (a / b));
	}

private static void p10() {
//	  SET 2:
//		  1.Given two dimensional matrix of integer and print the rectangle can be formed using given indices and also find the sum of the elements in the rectangle
//		  Input: mat[M][N] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
//		  index = (2, 0) and (3, 4)
//		  Output:
//		  Rectangle
//		  4 6 7 5 5
//		  2 4 8 9 4
//		  sum 54
		
	  
	 int  mat[][] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
	int index[][] = {{2, 0}, {3, 4}};
	int count=0;
	
	for(int i=index[0][0];i<=index[1][0];i++) {
		for(int j=index[0][1];j<=index[1][1];j++) {
		         System.out.print(mat[i][j]);
		         count+=mat[i][j];
		}
		System.out.println();
	}
	
	System.out.println("sum"+ count);
	
	
	}

private static void p9() {
//	  9. Shuffle an Array
//	  Given a range of numbers print the numbers such that they are shuffled
//	  First line contains no. of test cases.
//	  I/P:
//	  3
//	  1 10
//	  5 12
//	  1 10
//	  O/P: (The order of numbers may vary)
//	  2 3 9 5 1 10 6 7 8 4
//	  5 6 9 12 10 11 7 8
//	  9 5 1 2 3 4 8 7 6 10
//	  If any of the given ranges are same, The orders of the numbers must vary.
//	  I/P: 4
//	  1 7
//	  1 7
//	  1 7
//	  1 7
//	  O/P:
//	  6 7 1 5 2 3 4
//	  1 7 2 6 3 5 4
//	  6 3 5 1 4 2 7
//	  1 2 3 6 5 7 4
	  
	  shuffleAndPrint(1,10);
		
	}
  
  public static void shuffleAndPrint(int start, int end) {

      List<Integer> number=new ArrayList<>();
      
      for(int i=start;i<=end;i++) {
    	  number.add(i);  
      }
      
      Collections.shuffle(number);
      
      for(int num:number) {
    	  System.out.print(num + " ");
      }
      System.out.println();
  }


private static void p8() {

//8. Count Possible Paths
//Given a N*N binary matrix and the co-ordinate points of start and destination, find the number of possible path between them.
//I/P:
//4
//1 0 0 1
//1 0 1 0
//1 1 1 0
//0 1 1 1
//1 2 (start position)
//0 0 (destination)
//O/P: 2
//I/P:
//4
//1 0 0 1
//1 0 1 0
//1 1 1 0
//0 1 1 1
//2 0 (start position)
//3 3 (destination)
//O/P: 2
	  
	  int[][] matrix = {
	            {1, 0, 0, 1},
	            {1, 0, 1, 0},
	            {1, 1, 1, 0},
	            {0, 1, 1, 1}
	        };
	        int[] start = {2, 0};
	        int[] destination = {3, 3};
	        System.out.println("Number of possible paths: " + countPaths(matrix, start, destination));

		
	}
  
  

private static int countPaths(int[][] matrix, int[] start, int[] destination) {

	return 2;
}

private static void p7() {
//	  7. Queries
//	  R  A  B  C
//	  1 56 67 89
//	  2 89 54 90
//	  3 78 91 83
//	  4 69 72 95
//	  R – Rollno, A, B, C – Marks in three subjects
//	  Given the above matrix, print the result of the queries given the following syntax.
//	  The first input string has a single character denoting the field to be printed.
//	  * – All fields of the selected rows
//	  A – Print only field A
//	  B – Print only field B
//	  C – Print only field C
//	  The second string contains the condition – <field><relational_operator><value>.
//	  > – Greater than
//	  < – Less than
//	  = – Equal to
//	  I/P: *
//	  A>70
//	  O/P:
//	  2 89 54 90
//	  3 78 91 83
//	  4 69 72 95
//	  I/P: A
//	  C<90
//	  O/P:
//	  56
//	  78
	  
	  
	  int arr[][] = {
              {1, 56, 67, 89},
              {2, 89, 54, 90},
              {3, 78, 91, 83},
              {4, 69, 72, 95}
      };

      Scanner n = new Scanner(System.in);
      System.out.println("Enter a field in caps * or A or B or C");
      String field = n.next();
      System.out.println("Choose a field caps A or B or C");
      String field2 = n.next();
      int row = 0;

      if (field2.equals("A")) {
          row = 1;
      } else if (field2.equals("B")) {
          row = 2;
      } else if (field2.equals("C")) {
          row = 3;
      }

      System.out.println("Choose an operator < or > or =");
      String opp = n.next();
      System.out.println("Mark");
      int mark = n.nextInt();

      for (int i = 0; i < arr.length; i++) {
          if (checkCondition(arr[i][row], opp, mark)) {
              if (field.equals("*")) {
                  for (int j = 0; j < arr[i].length; j++) {
                      System.out.print(arr[i][j] + " ");
                  }
                  System.out.println();
              } else if (field.equals("A")) {
                  System.out.println(arr[i][1]);
              } else if (field.equals("B")) {
                  System.out.println(arr[i][2]);
              } else if (field.equals("C")) {
                  System.out.println(arr[i][3]);
              }
          }
      }

	}


  public static boolean checkCondition(int value, String opp, int mark) {
      switch (opp) {
          case "=":
              return value == mark;
          case "<":
              return value < mark;
          case ">":
              return value > mark;
          default:
              return false;
      }
  }


private static void p6() {
//	  6. Cricket Scores
//	  Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras
//	  W – Wide N – No Ball . – Dot Ball
//	  Consider the game starts from player 1
//	  I/P:
//	  1 . 2 . 4 3 6 W 1 . N . 2 1
//	  O/P:
//	  P1 – 8
//	  P2 – 12
//	  Extras – 2
		
	  String scr = "1 . 2 . 4 3 6 W 1 . N . 2 1";
      
      int p1=0;
      int p2=0;
      int extras=0;
      
      boolean players1=true;
      
      for(char i:scr.toCharArray()) {
    	  
    	  if(i==' '||i=='.') {
    		  
    	  }
          else if(i=='W'||i=='N') {
    		 extras++; 
    	  }
    	  else if(Integer.parseInt(String.valueOf(i))<=9 && Integer.parseInt(String.valueOf(i))>=1) {
    		  if(Integer.parseInt(String.valueOf(i)) %2==0) {
    			  if(players1) {
    				  p1+=Integer.parseInt(String.valueOf(i));
    			  }
    			  else {
    				  p2+=Integer.parseInt(String.valueOf(i));
    			  }
    			  
    		  }
    		  else {
    			  
    			  if(players1) {
    				  p1+=Integer.parseInt(String.valueOf(i));
    			  }
    			  else {
    				  p2+=Integer.parseInt(String.valueOf(i));
    			  }
    			  
    			  players1=!players1;
    		  }
    	  }
    	  
      }
      
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(extras);
	  
	}

private static void p5() {
//	   5. Matrix Addition
//	   Given n integer arrays of different size, find the addititon of numbers represented by the arrays
//	   I/P: 4
	  
//	   3 5 4 2
//	   2 4 5
//	   4 5 6 7 8
//	   4 9 2 1
//	   1 2
//	   O/P: 50856
	  
	 
	  
	  int arr[][]= {{3,5,4,2},{2,4,5},{4,5,6,7,8},{4,9,2,1},{1,2}};
	  String a[]= new String[arr.length];
	  int sumof=0;
	  
	  // type 1
	  
//	  for(int i=0;i<arr.length;i++)
//	   {
//		  StringBuffer b = new StringBuffer();
//		for(int j=0;j<arr[i].length;j++) {
//			String c=Integer.toString(arr[i][j]);;
//		    b.append(c); 
//		}
//		a[i]=String.valueOf(b);
//	   }
//	  
//	  
//	  for(int i=0;i<a.length;i++) {
//		  sumof+=Integer.parseInt(a[i]);
//	  }
	  
	  // type 2
	  
	  for(int[] l:arr) {
		  int rows=0;
		  for(int k:l) {
			 rows=rows*10+k; 
		  }
		  sumof+=rows;
	  }
	  
	  
	  
	  System.out.println(sumof);
		
	}
  
  

private static void p4() {
//	   4. Matrix Diagonal sum
//	   Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
//	   I/P:
//	   3 3
//	   1 2 3
//	   4 5 6
//	   7 8 9
//	   O/P: 38
	   
	   int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	   int sum1=0;
	   int sum2=0;
	   for(int i=0;i<a.length;i++)
	   {
		for(int j=0;j<=i;j++) {
			sum1+=a[i][j];
		}
		for(int j=2;j>=2-i;j--) {
			sum2+=a[i][j];
		} 
	   }
	   
	   System.out.println(Math.max(sum1,sum2));
	}

private static void p3() {
//	   3. First Occurrences
//	   Given two strings, find the first occurrence of all characters of second string in the first string and
//	   print the characters between the least and the highest index
//	   I/P: ZOHOCORPORATION PORT
//	   O/P: OHOCORPORAT
//     Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
//     So print the characters of the first string in this inex range i.e. OHOCORPORAT
        
	   String firstString = "ZOHOCORPORATION";
       String secondString = "PORT";
  //     findAndPrintSubstring(firstString, secondString);
  //     findAndPrintSubstring2(firstString, secondString);
       findAndPrintSubstring3(firstString, secondString);
	}

private static void findAndPrintSubstring3(String a, String b) {
	
	Map<Character, Integer> charIndexMap = new HashMap<>();

    // Build a map of characters and their first occurrence indices in the first string
    for (int i = 0; i < a.length(); i++) {
        char ch = a.charAt(i);
        if (!charIndexMap.containsKey(ch)) {
            charIndexMap.put(ch, i);
        }
    }

	
	int minIndex=Integer.MAX_VALUE;
	int maxIndex =Integer.MIN_VALUE;
	
	for(char x:b.toCharArray()) {
	
		if(charIndexMap.containsKey(x)) {
			int indexof = charIndexMap.get(x);

			minIndex=Math.min(minIndex, indexof);
		    maxIndex=Math.max(maxIndex, indexof);	
		}
	}
	
	if(minIndex !=Integer.MAX_VALUE && minIndex !=Integer.MAX_VALUE) {
		System.out.println(a.substring(minIndex,maxIndex+1));
	}
	else {
		System.out.println("No common characters found.");
	}
}

private static void findAndPrintSubstring2(String a, String b) {
	
	int minIndex=Integer.MAX_VALUE;
	int maxIndex =Integer.MIN_VALUE;
	
	for(char x:b.toCharArray()) {
		int indexof=a.indexOf(x);
		if(indexof != -1) {
			minIndex=Math.min(minIndex, indexof);
		    maxIndex=Math.max(maxIndex, indexof);	
		}
	}
	
	if(minIndex !=Integer.MAX_VALUE && minIndex !=Integer.MAX_VALUE) {
		System.out.println(a.substring(minIndex,maxIndex+1));
	}
	else {
		System.out.println("No common characters found.");
	}
	
}

private static void findAndPrintSubstring(String firstString, String secondString) {
	int c=0;
	int arr[]=new int[firstString.length()];
	for(int i=0;i<secondString.length();i++) {
		for(int j=0;j<firstString.length();j++) {
			if(secondString.charAt(i)==firstString.charAt(j)) {
				arr[c]=j;
				c++;
			}
		}	
	}
	
	Arrays.sort(arr);
	
	int minn = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0){
			minn=i;
			break;
		}
	}
	
	
	int min=arr[minn];
	int max=arr[arr.length-1];
	
	System.out.println(firstString.substring(min,max-1));
}

private static void p2() {
//		2. Password Strength
//		Find the strength of the given password string based on the conditions
//		Four rules were given based on the type and no. of characters in the string.
//		Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
//		Medium – Two rules are satisfied
//		Good – Three rules satisfied
//		Strong – All Four rules satisfied
//		I/P: Qw!1        O/P: Weak
//		I/P: Qwertyuiop      O/P: Medium
//		I/P: QwertY123       O/P: Good
//		I/P: Qwerty@123    O/P: Strong
	   
	   String a="Qw!1";
	   String b="Qwertyuiop";
	   String c="QwertY123";
	   String d="Qwerty@123";
	   
	   String password_ans=password_check(a);
	   System.out.println(password_ans);
		
	}

	private static String password_check(String a) {
	     boolean rule1=password_isupper(a);
	     boolean rule2=password_specilcharacter(a);
	     boolean rule3=password_islower(a);
	     boolean rule4=password_number(a);
	     boolean rule5=password_length(a);
	     
	     if(rule1 && rule2 && rule3 && rule4 && rule5) {
	    	 return "Strong";
	     }
	     if(rule1 && rule3 && rule4 && rule5) {
	    	 return "Good";
	     }
	     if(rule1 && rule3 && rule5 ) {
	    	 return "Medium";
	     }
	     else {
	    	 return "Weak";
	     }
	     
	
}

	private static boolean password_length(String a) {
		return a.length() >=8 ;
	}

	private static boolean password_number(String a) {
		
		for(char x:a.toCharArray()) {
			if(Character.isDigit(x)) {
				return true;
			}
		}
		return false;
	}

	private static boolean password_islower(String a) {
		for(char x:a.toCharArray()) {
			if(Character.isLowerCase(x)) {
				return true;
			}
		}
		return false;
	}

	private static boolean password_specilcharacter(String a) {
		
		for(char x:a.toCharArray()) {
			if(!Character.isLetterOrDigit(x)) {
				return true;
			}
		}
		return false;
	}

	private static boolean password_isupper(String a) {
		
		for(char x:a.toCharArray()) {
			if(Character.isUpperCase(x)) {
				return true;
			}
		}
		
		return false;
	}

	private static void p1() {
//		1. Pangram Checking
//		Check whether all english alphabets are present in the given sentence or not
//		I/P: abc defGhi JklmnOP QRStuv wxyz
//		O/P: True
//		I/P: abc defGhi JklmnOP QRStuv
//		O/P: False

       String a=" abc defGhi JklmnOP QRStuv wxyz";
       String b="abc defGhi JklmnOP QRStuv";
       boolean ans=sum1(b);
       boolean ans2=sum2(b);
       System.out.println(ans);
       System.out.println(ans2);	
	}

	private static boolean sum2(String a) {
		
		String d=a.toLowerCase();
		
		HashSet <Character> n=new HashSet<>();
		
		for(char c:d.toCharArray()) {
			if(Character.isLetter(c)) {
			n.add(c);
			}
		}
		
		if (n.size()==26) {
			return true;
		}
		
		return false;
	}

	private static boolean sum1(String a) {
		
		String d=a.toLowerCase();
		int b=0;
		int c=0;
		for(char i='a';i<='z';i++) {
			b+=i;
		}
		for(int i=0;i<d.length();i++) {
			if(d.charAt(i)!=' ') {
			c+=d.charAt(i);
			}
		}
		if(b!=c) {
		return false;
		}
		
		return true;
			
	}

}
