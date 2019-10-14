import java.util.*;
import java.io.*;

public class bfsErCode{
  static void bfsKorarProcess(int adj[][],int s){
    Queue<Integer> queue = new LinkedList<Integer>();
    int size =adj[0].length-1;
    int source=s;
    int [] visited = new int[size+1];
    int [] time = new int[size+1];
    int [] parent = new int[size+1];
    visited[s]=1;
    time[s]=1;
    parent[s]=-1;
    queue.add(s);
    s=2;
    int ele;
    while(!queue.isEmpty()){
      ele=queue.remove();
      System.out.println(ele +" ");
      for(int y=0;y<adj[0].length;y++){
        if(adj[ele][y]==1 && visited[y]==0){
          visited[y]=-1;
          time[y]=s;
          parent[y]=ele;
          queue.add(y);
        }
      }
      s++;
    }
    for(int i=1;i<adj[0].length;i++){
      System.out.print(i);
      System.out.print(" Distance from source - ");
      System.out.print(time[i]+",");
      System.out.print("path -> ");
      for(int j=i;j>-1;){
        
        if(parent[j]==0)
          break;
        System.out.print(parent[j]+" ");
        if(parent[j]==-1)
          break;
        j=parent[j];
        
      }
      System.out.println();
    }
  }
  public static void main(String[] args) throws Exception{
    File object = new File("Test.txt"); 
    Scanner sc = new Scanner(object); 
    int m=sc.nextInt();
    int[][] a=new int[m+1][m+1];
    int y=sc.nextInt()-1;
    while(sc.hasNext()){
      int x=sc.nextInt()-1;
      y=sc.nextInt()-1;
      a[x+1][y+1]=1;
      //a[y][x]=1;
    }
    bfsKorarProcess(a,3);
  }
}