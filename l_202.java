import java.util.ArrayList;

public class l_202 {
    public boolean isHappy2(int n) {
        return ishappy(factorArray(n, new ArrayList<>()));
    }

    public boolean ishappy(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return false;
        }
        if (array.size() == 1) {
            return true;
        }
        int ch = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        if (!checkValue(array, ch)) {
            return true;
        }
        return false;
    }

    private boolean checkValue(ArrayList<Integer> array, int value) {
        for (Integer element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    // public int squareOfDigits(String num, int ans) {
    // if (num.isEmpty()) {
    // return ans;
    // }
    // char c = num.charAt(0);
    // int ci = c - '0';
    // while (!num.isEmpty()) {
    // return squareOfDigits(num.substring(1), ans + ci * ci);
    // }
    // return ans;
    // }

    public ArrayList<Integer> factorArray(int number, ArrayList<Integer> array) {
        int square = findSquare(number);
        if (square == 1) {
            array.add(square);
            return array;
        } else {
            if (checkValue(array, square)) {
                array.add(square);
                return array;
            } else {
                array.add(square);
                factorArray(square, array);
            }
        }
        return array;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        l_202 l = new l_202();
        System.out.println(l.isHappy(19));
        System.out.println(l.isHappy(3));
        System.out.println(l.isHappy2(19));
        System.out.println(l.isHappy2(3));
    }
}
