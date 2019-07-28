package leetcode.math;

public class le168 {
    public static String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();

        while(n>0){
            int k = n % 26;
            if(k==0){
                n-=26;
                k=26;
            }

            char c = (char)((k-1) +(int)'A');
            sb.insert(0,c);
            n = n/26;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(2));
        System.out.println(convertToTitle(703));
    }
}
