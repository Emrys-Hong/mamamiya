import java.util.*;
class equ{
    public static boolean isAllCharacterUnique(String sIn) {
        char[] sIn2 = sIn.toCharArray();
        boolean a=true;
        int b=sIn.length();
      
        for (int j=0;j<b;j++){
            for(int i=j+1;i<sIn.length();i++){           
                if(sIn2[0]==sIn2[i]){
                    a=false;break;
                }
            }   
        }           
        return a;
    }  
}

public class test {
	public static void main (String[] args) {
        System.out.println(equ.isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));  
    }
}
