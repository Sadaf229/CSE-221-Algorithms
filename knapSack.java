import java.util.*;
import java.io.*;
import java.lang.Math;
public class knapSack{
    static void find(int [] weight, int[] value,int  limit){
        int[][] weightd2=new int[3][weight.length];
        int [][] matric = new int [weight.length][limit];
        for(int i=1;i<weight.length;i++){
            weightd2[1][i]=weight[i];
            weightd2[2][i]=value[i];
        }
        for(int i=1;i<weight.length;i++){
            for(int j=1;j<limit;j++){
                if(j<weightd2[1][i]){
                    matric[i][j]=0;
                }
                else {
                    matric[i][j]=Math.max(matric[i-1][j],(weightd2[2][i] + matric[i - 1][j - weightd2[1][i]]));
                }
            }
        }
        Stack <Integer> st = new Stack<Integer>();
        int i=weight.length-1;
        int j=limit-1;
        while(matric[i][j]!=0){
            if(matric[i][j]==matric[i-1][j]){
                i--;
            }
            if(matric[i][j]==matric[i][j-1]){
                j--;
            }
            else{
                st.push(new Integer (weightd2[2][i]));
                i-=1;
                j=j-weightd2[1][i];
            }
        }
        while(!st.empty()){
            System.out.print(" "+st.pop());
        }
    }

    public static void main(String [] args) throws Exception{
        File file = new File("texy.txt");
        Scanner sc = new Scanner(file);
        int tests=sc.nextInt();
        int arrSize=sc.nextInt();
        while(tests!=0){
            int maxi=sc.nextInt();
            int[] arr1=new int[arrSize];
            int[] arr2=new int[arrSize];
            for(int i=0;i<arrSize;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<arrSize;i++){
                arr2[i]=sc.nextInt();
            }
            find(arr1,arr2,maxi);
            --tests;
        }
    }
}
          
          