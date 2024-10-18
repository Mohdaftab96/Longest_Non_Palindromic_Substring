

// Input : "abba" 
// Output : 3
// Here maximum length non-palindromic substring is
// 'abb' which is of length '3'. There could be other
// non-palindromic sub-strings also of length three 
// like 'bba' in this case.

// Input : "a"
// Output : 0



public class Longest_Non_Palindromic_Substring{

      static boolean isPalindrome(String s){
  
          int left = 0;
          int right = s.length() - 1;
          while(left < right){
              while(s.charAt(left) != s.charAt(right)){
                  return true;
              }
              left++;
              right--;
          }
          return false;
      }
  
  
      static int countNonPalinddromicSubstring(String str, int n){
  
          String sum = "";
          int maxCount = 0;
          for(int i=0; i<n/2; i++){
                  sum = str.substring(i, n+i-1);
                  // System.out.print(sum + " ");
  
                  if(isPalindrome(sum)){
                      // System.out.print(sum + " "); // abb bba 
                      int x = sum.length();
                      if(x > maxCount){
                         maxCount = x;
                      }
                  }
          }
          return maxCount;
      }
  
      //Driver Code
      public static void main(String[] args){
  
          String str = "a";
          int n = str.length();
  
          countNonPalinddromicSubstring(str, n);
  
          System.out.println(" Maximum Length : " + countNonPalinddromicSubstring(str, n));
  
  
      }
  }
  
    
