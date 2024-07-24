package COLLECTIONS;

public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 10;
        int result;

        // Parentheses have the highest precedence
        result = (a + b) * c; // (5 + 3) * 10 = 80
        System.out.println("(a + b) * c = " + result);

        // Postfix operators (++ and --) have second highest precedence
        result = a++ * b; // 5 * 3 = 15, then a becomes 6
        System.out.println("a++ * b = " + result + ", a = " + a);

        // Prefix operators (++ and --), Unary + and -, Logical ! have third highest precedence
        result = ++a / -b; // (++6) / -3 = -2
        System.out.println("++a / -b = " + result + ", a = " + a);

        // Multiplicative operators (*, /, %) have fourth highest precedence
        result = c * b / a; // 10 * 3 / 6 = 5
        System.out.println("c * b / a = " + result);

        // Additive operators (+, -) have fifth highest precedence
        result = a + b - c; // 6 + 3 - 10 = -1
        System.out.println("a + b - c = " + result);

        // Shift operators (<<, >>, >>>) have sixth highest precedence
        result = c << 2; // 10 << 2 = 40
        System.out.println("c << 2 = " + result);

        // Relational operators (<, <=, >, >=) have seventh highest precedence
        boolean comparison = a < b; // false
        System.out.println("a < b: " + comparison);

        // Equality operators (==, !=) have eighth highest precedence
        comparison = a == b; // false
        System.out.println("a == b: " + comparison);

        // Bitwise AND (&) has ninth highest precedence
        result = a & b; // 5 & 3 = 1
        System.out.println("a & b = " + result);

        // Bitwise XOR (^) has tenth highest precedence
        result = a ^ b; // 5 ^ 3 = 6
        System.out.println("a ^ b = " + result);

        // Bitwise OR (|) has eleventh highest precedence
        result = a | b; // 5 | 3 = 7
        System.out.println("a | b = " + result);

        // Logical AND (&&) has twelfth highest precedence
        boolean logicalAnd = (a < b) && (b < c); // false
        System.out.println("(a < b) && (b < c): " + logicalAnd);

        // Logical OR (||) has thirteenth highest precedence
        boolean logicalOr = (a < b) || (b < c); // true
        System.out.println("(a < b) || (b < c): " + logicalOr);

        // Conditional ternary operator (? :) has fourteenth highest precedence
        int x = (a < b) ? 10 : 20; // 20
        System.out.println("x = (a < b) ? 10 : 20: " + x);

        // Assignment operators (=, +=, -= etc.) have the lowest precedence
        int y = 10;
        y += 5; // y = y + 5 = 15
        System.out.println("y += 5: " + y);
    }
}
