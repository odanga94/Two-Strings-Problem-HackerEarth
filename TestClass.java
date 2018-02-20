/* IMPORTANT: Multiple classes and nested static classes are supported */


 
//imports for BufferedReader
import java.io.*;


//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        
        */

        //Scanner
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            String a = sc.next();
            String b = sc.next();
            char[] a_char = a.toCharArray();
            char[] b_char = b.toCharArray();
            Arrays.sort(a_char);
            Arrays.sort(b_char);
            //System.out.println(a_char);
            //System.out.println(b_char);
            if(Arrays.equals(a_char, b_char)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
        //String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


        // Write your code here

    }
}
