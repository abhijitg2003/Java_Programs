import java.util.*;

public class Main {

    public static int findMaxOnes(int a[], int k){

        int maxOnes=Integer.MIN_VALUE;
        int replacements=0;
        int start=0;

        for(int end=0;end<a.length;end++){

            if(a[end]==0){
                replacements++;
            }

            while(replacements>k){
                if(a[start]==0){
                    replacements--;
                }
                start++;
            }

            maxOnes=Math.max(maxOnes, end-start+1);

        }


        return maxOnes;
    }


    public static void main(String[] args){

        int [] a= new int[]{1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k=3;

        int result=findMaxOnes(a,k);

        System.out.println("Length of longest contiguous subarray containing only 1s :"+result);

    }

}
