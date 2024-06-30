package behavior.interpreter;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String expression = "7 3 - 2 1 + +"; // (7 - 3) + (2 + 1)
        int result = evaluate(expression);
        System.out.println("Resultado: " + result);
    }

    public static int evaluate(String expression) {
        Stack<IExpression> stack = new Stack<>();

        for (String token : expression.split(" ")) {
            if (isOperator(token)) {
                IExpression rightExpression = stack.pop();
                IExpression leftExpression = stack.pop();
                IExpression operator = getOperatorInstance(token, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new NumberExpression(result));
            } else {
                IExpression numberExpression = new NumberExpression(Integer.parseInt(token));
                stack.push(numberExpression);
            }
        }
        return stack.pop().interpret();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }

    public static IExpression getOperatorInstance(String operator, IExpression left, IExpression right) {
        switch (operator) {
            case "+":
                return new AddExpression(left, right);
            case "-":
                return new SubtractExpression(left, right);
        }
        return null;
    }   
}
