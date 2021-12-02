import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        InputReader reader = new InputReader(System.in);
//        int[] achieve = new int[reader.nextInt()];
//        long[] money = new long[achieve.length];
//        long sum = 0;
//
//        for (int i = 0; i < achieve.length; i++) {
//            achieve[i] = reader.nextInt();
//            money[i] = 1;
//        }
//
//        for (int i = 1; i < achieve.length; i++) {
//            if (achieve[i] > achieve[i - 1]) {
//                if (money[i] < money[i - 1] + 1) {
//                    money[i] = money[i - 1] + 1;
//                }
//            }
//        }
//        for (int i = achieve.length - 2; i >= 0; i--) {
//            if (achieve[i] > achieve[i + 1]) {
//                if (money[i] < money[i + 1] + 1) {
//                    money[i] = money[i + 1] + 1;
//                }
//            }
//        }
//
//        for (long value : money) {
//            System.out.print(value + " ");
//            sum += value;
//        }
//        System.out.println(sum);
    }
    MnagaerSecurity mn = new MnagaerSecurity(Admin);
    static class InputReader {

        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }

                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public byte nextByte() {
            return Byte.parseByte(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public short nextShort() {
            return Short.parseShort(next());
        }
    }

}