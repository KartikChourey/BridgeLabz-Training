// Leetcode #9
// Pallindrome Number

public class PallindromeNumber {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int n=x;
        int Revnum=0;
        
        while(n>0){
            
            int d=n%10;
            Revnum = Revnum*10 + d;
            n=n/10;
           
        }
        if(Revnum==x){
            return true;
        }
        else{
            return false;
        }
    }
}