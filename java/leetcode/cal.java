package leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class cal {

    public static int cal(int a, int b, char ch){
        if(ch == '+'){
            return a + b;
        }else if(ch == '-'){
            return a - b;
        }else if(ch == '*'){
            return a * b;
        }else{
            return a / b;
        }
    }

    public static char int_to_char(int a){
        return (char)(a + '0');
    }

    public static int char_to_int(char c){
        return c - '0';
    }

    // c1 < c2 return true
    public static boolean pri(char c1, char c2){
        Map<Character, Integer> m = new HashMap<>();
        m.put('#', -1);
        m.put('*', 1);
        m.put('/', 1);
        m.put('+', 0);
        m.put('-', 0);
        m.put('(', -1);
        if(m.get(c1) <= m.get(c2)){
            return true;
        }else{
            return false;
        }
    }

    //涓紑寮忚浆鍚庣紑寮�
    public static  char[] tran(String str){
        int num = 0;
        Stack<Character> stack = new Stack();
        stack.push('#');
        char[] c = str.toCharArray();
        char[] ch = new char[str.length()];
        int k = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(c[i]) == true){
                ch[k] = c[i];
                k++;
            }else if(c[i] == '(') {
                stack.push(c[i]);
                num++;
            }else if(c[i] == ')') {
                while (stack.peek() != '(') {
                    ch[k] = stack.pop();
                    k++;
                }
                stack.pop();
            }else{
                // while c[i]鐨勪紭鍏堢骇浣�
                while(pri(c[i], stack.peek()) == true){
                    ch[k] = stack.pop();
                    k++;
                }
                stack.push(c[i]);
            }
        }
        while (stack.peek() != '#'){
            ch[k] = stack.pop();
            k++;
        }

        char[] res = new char[str.length() - 2*num];
        for(int i = 0; i < res.length; i++){
            res[i] = ch[i];
        }
        return res;
    }

    // 计算后缀式
    public static int calResult(char[] arr){
        Stack<Character> sta = new Stack();

        for (int i = 0; i < arr.length; i++){
            if(Character.isDigit(arr[i]) == true){
                sta.push(arr[i]);
            }else{
                sta.push(int_to_char(cal(char_to_int(sta.pop()), char_to_int(sta.pop()), arr[i])));
            }
        }
        return char_to_int(sta.peek());
    }

    public static void main(String[] args) {

        String str = "1+2*3+(4*5+6)*7";
        String s = "2+6*8";
        char[] arr = tran(str);

        System.out.println(calResult(arr));


    }
}
