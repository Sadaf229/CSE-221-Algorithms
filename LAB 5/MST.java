import java.util.*;
import java.io.File;
public class MST{
  public static void main(String [] args) throws Exception{
    File file = new File("New Text Document.txt");
    Scanner sc = new Scanner(file);
    int size = sc.nextInt();
    int [][] a= new int[size][size];
    node b[]=new node[size];
    for(int i=0;i<6;i++){
      node n=new node(sc.next());
      b[i]=n;
    }
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        int in=i; int jn=j;
        a[in][jn]=sc.nextInt();
      }
    }
    prim(a,size,b);
    /*for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
       System.out.print(" "+a[i][j] );
      }System.out.println();}*/
  }
  static void prim(int array[][],int size,node nodes[]){
    node []p=new node[size];
    for(int i=0;i<nodes.length;i++){
      if(nodes[i].v==true)
        break;
      int min =array[i][0];
      int jocker=0;
      for(int j=1;j<array[0].length;j++){
        if(array[i][j]<min){
          min=array[i][j];
          jocker=j;
        }
      }
      nodes[i].d=min;
      nodes[i].v=true;
      p[jocker]=nodes[i];
    }
    for(int i=p.length-1;i>=0;i--)
    System.out.println(p[i].n+" ");
  }
}