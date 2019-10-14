import java.util.*;
import java.io.File;
public class DijkstraCopy{
  public static void main(String[]args) throws Exception{
    File file= new File("text.txt");
    Scanner sc=new Scanner(file);
    int c =sc.nextInt();
    int counter = sc.nextInt();
    int [][] a= new int[c][c];
    System.out.println(a[0].length);
    for(int i=0;i<counter;i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      a[x][y]=sc.nextInt();
    }
//    for(int i=0;i<c;i++){
//      for(int j=0;j<c;j++){
//        System.out.print(a[i][j]+" ");
//      }
//      System.out.println();
//    }
//  }
    int dis[]=new int[a[0].length];
    for(int i=0;i<a[0].length;i++){
      dis[i]=-1;
    }
    int visit[]=new int[a[0].length];
    int parent[]=new int[a[0].length];
    for(int i=0;i<a[0].length;i++){
      parent[i]=-1;
    }
    for(int i=0;i<a[0].length;i++){
      for(int j=0;j<a[0].length;j++){
        if(visit[i]==1)
          continue;
        visit[i]=1;
        if(a[i][j]!=0){
          if(dis[j]>dis[i]+a[i][j]){
            parent[j]=i;
            dis[j]=(dis[j]+1)+a[i][j];
          } 
        }
      }
    }
    
    for(int i=0;i<a[0].length;i++){
      System.out.print(i);
      int h=i;
      while(1==1){
        if(parent[h]==-1)
          break;
        System.out.print(parent[h]);
        h=parent[h];
      }
      System.out.println();
    }
    
    int printer = 0;
    for(int sd=0;sd<dis.length;sd++)
      printer+=sd;
    System.out.println(printer);
  }
}