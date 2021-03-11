package by.bsu.enums;

import by.bsu.enums.MyExceptions.IncorrectExpressionException;
import by.bsu.enums.MyExceptions.NanException;
import java.util.Scanner;
import static java.lang.Double.NaN;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class UserInputOutput {
    public static void main(String[] args) throws NanException, IncorrectExpressionException {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        CheckingInfixExpression.checking(expression);
        String postfixExpression = InfixToPostfix.infixToPostfix(TransformatorWithNegativeNumbersInfixExpression.preparingExpression(expression));
        double answer = 0;

            System.out.println("postFix expression:    " + postfixExpression);

            answer = CalculatorPostFixExpression.PostfixToAnswer(postfixExpression);

        if(answer == NaN || answer == Infinity ) throw new NanException("Dividing by zero, Input new expression, please");

            System.out.println("answer:    " + answer);

       }


}
