//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		//ans staack and temp stack
		
		Stack<Integer>ans=new Stack<>();
		Stack<Integer>temp=new Stack<>();
		
		while(!s.isEmpty()){
		    
		    int key=s.peek();
		    
		    if(ans.isEmpty()){
		        ans.push(key);
		    }
		    else if(!ans.isEmpty() && ans.peek()<=key){
		        ans.push(key);
		    }
            else{
                while(!ans.isEmpty() && ans.peek()>key){
                    temp.push(ans.pop());
                }
                ans.push(key);
                
                    
               
                        
                    while(!temp.isEmpty()){
                        ans.push(temp.pop());
                    }
                }
       
		    s.pop();
		    
		}
		
		
		
		return ans;
	}
}