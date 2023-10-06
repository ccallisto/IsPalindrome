import java.util.*;

public class IsPalindrome{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("word to check  :");

        String userInput = scan.nextLine();
        userInput = userInput.toUpperCase();

       if (isPal(userInput))
        System.out.println( "is a palindrome");
       else
            System.out.println("is not a palindrome");
        scan.close();
    }
        
       
    
    public static boolean isPal(String str){
        QueueListBased aQueue = new QueueListBased();
        StackListBased aStack = new StackListBased();

            for (int i = 0; i < str.length(); i++){
                aQueue.enqueue(str.charAt(i));
                aStack.push(str.charAt(i));
            }
        while (!aQueue.isEmpty()){
            if (aQueue.dequeue() != aStack.pop())
            return false;
        }
        return true;
        
     }
        
    
    }
