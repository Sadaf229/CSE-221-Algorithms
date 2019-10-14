import java.util.*;
import java.io.File;
public class Dijkstra{
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
      dis[i]=999;
    }
    int visit[]=new int[a[0].length];
    for(int i=0;i<visit.length;i++)
      visit[i]=0;
    int parent[]=new int[a[0].length];
    for(int i=0;i<a[0].length;i++){
      parent[i]=-1;
    }
    for(int i=0;i<a[0].length;i++){
      System.out.println();
      for(int j=0;j<a[0].length;j++){
        System.out.print(a[i][j]);
      }
    }dis[0]=0;
    
    for(int i=0;i<a[0].length;i++){
      for(int j=0;j<a[0].length;j++){
        if(visit[i]==1)
        {//System.out.println(dis[j]);
          continue;}
        
        if(a[i][j]!=0){//System.out.println(dis[j]+".....");
          if(dis[j]>dis[i]+a[i][j]){
            parent[j]=i;
            dis[j]=dis[i]+a[i][j];
            //System.out.println(dis[j]+"____");
            visit[i]=1;
          }
        } 
      }
    }
    
    for(int i=0; i<c;i++){
      int jabo=i;
      System.out.println();
      System.out.print(jabo);
      while(1==1){
        if(parent[jabo]==-1)
          break;
        System.out.print(parent[jabo]);
        jabo=parent[jabo];
      }
      
    }
    /*int total=0;
     for(int i=0;i<c;i++)
     if(dis[i]!=111)
     total+=dis[i];
     System.out.println(total);*/
  }
}