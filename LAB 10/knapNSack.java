import java.util.*;
import java.io.*;
import java.lang.Math;

public class knapNSack{
  
  public static void knapSack(int [][] array, int capacity){
    int [][]solve=new int[array[0].length][capacity+1];
    for(int i=1;i<solve.length;i++){
      for(int j=1;j<solve[0].length;j++){
        //K for checking all the weights till current items weight
        for(int k=1;k<=i;k++){         
          if(array[0][k]<=j){
            int value=(solve[i-1][j-array[0][k]])+array[1][k];
            value=Math.max(Math.max(value,solve[i-1][j]),solve[i][j-1]);
            solve[i][j]=value;
          }
          else
            solve[i][j]=Math.max(solve[i-1][j],solve[i][j-1]);
        }
      }
    }
    int i=solve.length-1;
    int j=solve[0].length-1;
    while(solve[i][j]!=0){
    if(solve[i][j]!=solve[i-1][j]&&solve[i][j]!=solve[i][j-1]){
      System.out.print(i+" ");
      j-=array[0][i];
      i--;
    }
    else if(solve [i][j]==solve[i-1][j])  i--;
    else j--;
  }
  
}



public static void main(String[]args) throws Exception{
  File something = new File("New Text Document.txt");
  Scanner sc = new Scanner(something);
  int tests= sc.nextInt();
  while(tests!=0){
    int [][] a =new int[2][sc.nextInt()+1];
    
    int cap = sc.nextInt();
    
    for(int k=0;k<a.length;k++) 
      for(int i=1;i<a[0].length;i++){
      a[k][i]=sc.nextInt();
    }
    
    //   System.out.println(a[k][i]);
    
    knapSack(a,cap);
    
    
    
    tests--;
  }
  
}


}