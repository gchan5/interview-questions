import java.util.*;

public class Solution {

    /*  can be done iteratively by using modding (%) the number by 10
        to get each individual digit, and then adding each digit.This
        is repeated until the sum is less than 10. However, this is
        relatively inefficient (this is O(n^2)). I believe there is another
        algorithm one can use to find this sum. */

    public int addDigits(int num) {
        int sum = num - 9 * ((int) Math.floor((num - 1)/9));

        return sum;
    }
}
