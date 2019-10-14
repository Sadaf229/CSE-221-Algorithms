import java.util.*;
import java.io.*;
import java.lang.Math;
public class longestCommonSubset{
  static void find(String s1, String s2){
    char [] m=s1.toCharArray();
    
    char [] n=s2.toCharArray();
    
    int [][] matric = new int [n.length][m.length];
    
    int [][] direction=new int[n.length][m.length];
    for(int i=1;i<n.length;i++){
      for(int j=1;j<m.length;j++){
        if(s1.charAt(j)==s2.charAt(i)){
          matric[i][j] =Math.max(Math.max(matric[i-1][j-1]+1,matric[i-1][j]),matric[i][j-1]);
          if(matric[i][j]<matric[i-1][j]){
            direction[i][j]=1;;
          }
          else if(matric[i][j]<matric[i][j-1]){
            direction[i][j]=2;
          }
          else{
            direction[i][j] = 3;
          }
        }
        else{
          matric[i][j] =Math.max(matric[i-1][j],matric[i][j-1]);
          if(matric[i][j]<=matric[i-1][j]){
            direction[i][j]=1;
          }
          else if(matric[i][j]<=matric[i][j-1]){
            direction[i][j]=2;
          }
        }
        
        
      }
    }
    /*for(int i=0;i<n.length;i++){
     System.out.println();
     for(int j=0;j<m.length;j++){
     System.out.print(matric[i][j]);}
     }*/
    Stack <String> st = new Stack<String>();
    int i=n.length-1;
    int j=m.length-1;
    while(matric[i][j]!=0){
      if(direction[i][j]==1)
      i--;
    if(direction[i][j]==2)
      j--;
    if(direction[i][j]==3){
      st.push(n[i]+"");
      i--;j--;
    }
    }
    while(!st.empty())
    System.out.print(st.pop());
  }
  
  
  public static void main(String [] args) throws Exception{
    File file = new File("data.txt");
    Scanner read = new Scanner(file);
    String s1=read.nextLine();
    
    String s2=read.nextLine();
    
    find(s1,s2);
  }
  
}