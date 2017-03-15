// Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
//
// For example:
//
// Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].


/* TODO: extend implementation to work with arrays containing non-negative integers */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] map = new int[findMax(nums)];
        int[] toReturn = new int[2];
        int place = 0;

        for(int i = 0; i < nums.length; i++){
            map[nums[i] - 1]++;
        }

        for(int i = 0; i < map.length; i++){
            if(map[i] == 1){
                toReturn[place] = i + 1;
                place++;
            }
        }

        return toReturn;
    }

    public int findMax(int[] nums){
        int max = -1000000;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        return max;
    }
}
