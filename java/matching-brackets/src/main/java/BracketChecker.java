/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
import java.util.Stack;
class BracketChecker{
    String s2;
    BracketChecker(String s1){
        this.s2=s1;
    }
    boolean areBracketsMatchedAndNestedCorrectly(){
        if(s2.length()==0)
            return true;
        else{
            //s2=s2.replaceall("\\s","");
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)=='(' || s2.charAt(i)=='[' || s2.charAt(i)=='{')
                    stack.push(s2.charAt(i));
                else if(stack.isEmpty()&&s2.charAt(i)==')' || stack.isEmpty()&&s2.charAt(i)==']' || stack.isEmpty()&&s2.charAt(i)=='}')
                    return false;
                else if(s2.charAt(i)=='(' || s2.charAt(i)=='[' || s2.charAt(i)=='{' || s2.charAt(i)=='}' || s2.charAt(i)==']' || s2.charAt(i)==')'){
                    int c=stack.pop();
                    if(s2.charAt(i)==')' && c!='(')
                        return false;
                    else if(s2.charAt(i)=='}' && c!='{')
                        return false;
                    else if(s2.charAt(i)==']' && c!='[')
                        return false;
                }
                else
                    continue;
            }
            if(stack.isEmpty())
                return true;
            else
                return false;
        }
    }
}
