package chapter2.Recursion;

public class Recursion {
    public static void main(String[] args) {
        // Test
        System.out.println(Fact(5));
    }

    // 양의 정수 팩토리얼 계산
    private static int Fact (int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 1;
        } else  {
            // 재귀 경우 : (n - 1) 팩토리얼에 n을 곱한다.
            return Fact(n - 1) * n;
        }
    }
}
