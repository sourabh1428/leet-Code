//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Tuple{
    int n1;
    int d1;
    public Tuple(int n,int d){
        n1=n;
        d1=d;
    }
}


class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<Tuple>>adj=new ArrayList<>();
	    for(int i=0;i<V;i++){adj.add(new ArrayList<>());}
	    
	    for(int i=0;i<E;i++){
	        adj.get(edges[i][0]).add(new Tuple(edges[i][1],edges[i][2]));
	         adj.get(edges[i][1]).add(new Tuple(edges[i][0],edges[i][2]));
	    }
	    PriorityQueue<Tuple>q=new PriorityQueue<>((a,b)->a.d1-b.d1);

        int[] vis=new int[V];
        q.add(new Tuple(0,0));
        int ans=0;
        
        while(!q.isEmpty()){
            int node=q.peek().n1;
            int dis=q.peek().d1;
            q.remove();
            if(vis[node]==1)continue;
            
            vis[node]=1;
            ans+=dis;
            
            for(Tuple pe:adj.get(node)){
                
                int no=pe.n1;
                int diss=pe.d1;
                if(vis[no]!=1){
                    q.add(new Tuple(no,diss));
                }
                
            }
            
        }
        
        return ans;
	}
}