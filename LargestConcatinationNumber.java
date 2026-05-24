package practise;

import java.util.Arrays;

public class LargestConcatinationNumber {
    public static void main(String[] args){
        int arr[] = {5,8,7,4,6,99};

        String[] str = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str,(a,b)-> (b+a).compareTo(a+b));
        if(str[0].equals("a")){
            System.out.print("0");
        }
        StringBuilder sb = new StringBuilder();
        for(String s:str){
            sb.append(s);
        }
        System.out.print(sb);
    }
}
