package com.practice;

import java.util.Stack;

public class BODMAS {
	// Method to check if a character is an operator
	private static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
	}

	// Method to check the precedence of operators
	private static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	// Method to perform arithmetic operations
	private static double applyOperation(char op, double b, double a) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new ArithmeticException("Cannot divide by zero");
			return a / b;
		case '^':
			return Math.pow(a, b);
		}
		return 0;
	}

	// Method to evaluate the given expression
	public static double evaluate(String expression) {
		Stack<Double> values = new Stack<>();
		Stack<Character> ops = new Stack<>();
		int length = expression.length();

		for (int i = 0; i < length; i++) {
			char ch = expression.charAt(i);

			if (Character.isWhitespace(ch))
				continue;

			if (Character.isDigit(ch) || ch == '.') {
				StringBuilder sbuf = new StringBuilder();
				while (i < length && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
					sbuf.append(expression.charAt(i++));
				}
				i--;
				values.push(Double.parseDouble(sbuf.toString()));
			} else if (ch == '(') {
				ops.push(ch);
			} else if (ch == ')') {
				while (ops.peek() != '(') {
					values.push(applyOperation(ops.pop(), values.pop(), values.pop()));
				}
				ops.pop();
			} else if (isOperator(ch)) {
				while (!ops.empty() && precedence(ops.peek()) >= precedence(ch)) {
					values.push(applyOperation(ops.pop(), values.pop(), values.pop()));
				}
				ops.push(ch);
			}
		}

		while (!ops.empty()) {
			values.push(applyOperation(ops.pop(), values.pop(), values.pop()));
		}

		return values.pop();
	}

	public static void main(String[] args) {
		String expression = "55-60*8-0/15+34-50";
		System.out.println("The result of the expression is: " + evaluate(expression));
	}
}
