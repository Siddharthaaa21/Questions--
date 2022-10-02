
class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer str = new StringBuffer(Interger.toString(x));

        if ((str.reverse().toString().equals(str.toString())))
            return (true);
        else
            return false;
    }}//this is not the fastest way tho.
 
//class Solution {
//    public boolean isPalindrome(int x) {
//       StringBuffer str=new StringBuffer(Integer.toString(x));
//
//                    return (str.toString()).equals(str.reverse().toString());
//
//    }
//}
