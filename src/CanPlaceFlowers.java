/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
 * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 *
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                continue;
            }
            int pre = i == 0 ? 0 : i - 1;
            int after = i == flowerbed.length - 1 ? flowerbed.length - 1 : i + 1;
            if(flowerbed[pre] == 0 && flowerbed[after] == 0){
                cnt++;
                flowerbed[i] = 1;
            }
        }return cnt >= n;
    }
}
