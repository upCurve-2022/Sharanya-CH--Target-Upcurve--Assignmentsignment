import java.util.Scanner;
import java.util.Stack;

public class Answer30 {
    public static int evaluate(String exp) {
        char tokens[] = exp.toCharArray();
        Stack<Integer> digits = new Stack<Integer>();//for numbers or values
        Stack<Character> operators = new Stack<Character>();//for operators

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') {
                continue;
            }
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer s = new StringBuffer();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    s.append(tokens[i++]);
                }
                digits.push(Integer.parseInt(s.toString()));
                i--;//because in for loop another time i value increases so it may skip one char.
            }
            else if (tokens[i] == '(') {
                operators.push(tokens[i]);
            }
            else if (tokens[i] == ')') {
                while (operators.peek() != '(') {
                    digits.push(solve(operators.pop(), digits.pop(), digits.pop()));
                }
                operators.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                while (!operators.empty() && hashighPrecedence(tokens[i], operators.peek())) {//checking which operators has high precedence
                    //hashighPrecedence() return true if operator2 has high or same precedence
                    //then we are solving with the operators that is on the top of stack
                    digits.push(solve(operators.pop(), digits.pop(), digits.pop()));
                }
                operators.push(tokens[i]);//push the operator at place i
            }
        }
        //after completing entire expression then we solve remaining values of stack.
        while (!operators.empty()){
            digits.push(solve(operators.pop(), digits.pop(), digits.pop()));
        }
        return digits.pop();//final answer is stored in digits stack. so we are poping it.
    }
    public static boolean hashighPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public static int solve(char op,int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(Answer30.evaluate("5+5+(2*4)-(2/2)"));
    }
}
