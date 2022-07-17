import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class NumberOfBSTsContainingValues1toN {

    // Count number of Binary Search Trees using Dynamic Programming :
    public static BigInteger countBSTs(int N) {
        BigInteger f[] = new BigInteger[N + 1];
        f[0] = new BigInteger("1");
        for (int i = 1; i <= N; i++) {
            f[i] = new BigInteger("0");
            for (int j = 1; j <= i; j++) {
                BigInteger multiplication = f[j - 1].multiply(f[i - j]);
                f[i] = f[i].add(multiplication);
            }
        }
        return f[N];
    }
    // END.

    // Driver :
    public static void main(String[] args) {
        try {
            File myFile = new File("input.txt");
            Scanner myScanner = new Scanner(myFile);
            int N = myScanner.nextInt();
            myScanner.close();
            BigInteger num = countBSTs(N);
            System.out.println(num);
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND, PLEASE TRY AGAIN...");
            System.exit(1);
        }
    }
    // END.

}