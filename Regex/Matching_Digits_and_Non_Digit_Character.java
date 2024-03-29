import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.check("\\d{2}\\D\\d{2}\\D\\d{4}.*"); 
    }
}


class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        boolean match = m.matches();
        
        System.out.println(match);
    }   
    
}
