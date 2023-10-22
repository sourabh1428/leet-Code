//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
String encode(String str) {
    String ans = "";
    int n = str.length();
    int i = 0;  // Start with the first character
    
    while (i < n) {
        char ch = str.charAt(i);
        int count = 0;
        
        // Count consecutive occurrences of the current character
        while (i < n && str.charAt(i) == ch) {
            count++;
            i++;
        }
        
        // Append the character and its count to the result string
        ans += ch;
        ans += count;
    }
    
    return ans;
}

 }