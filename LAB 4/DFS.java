import java.util.*;
import java.io.File;

public class DFS{
  public static void main(String []args) throws Exception{
    File file =  new File("New Text Document.txt"); 
    Scanner sc = new Scanner(file); 
    int size = sc.nextInt();
    int [][]array= new int[size+1][size+1];
    while (sc.hasNext()){
      int x = sc.nextInt();
      int y =sc.nextInt();
      array[x][y]=1;
    }
    Stack<Integer> stack = new Stack<Integer>();
    int []parent=new int[array[0].length];
    int []color=new int[array[0].length];
    int time[] =new int[array[0].length];
    int somoy=0;
    int white =0;
    int black = -1;
    for(int i=1;i<array[0].length;i++){
      if(color[i]==white)
        
    }
  }
  
  static DFS(){
    
  }
  
}