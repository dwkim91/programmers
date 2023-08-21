package hash;

import java.util.HashSet;

public class _1845_pokemon {

	public static void main(String[] args) {
		
		_1845_pokemon sol = new _1845_pokemon();
		int[][] num = {
			{3, 1, 2, 3},
			{3, 3, 3, 2, 2, 4},
			{3, 3, 3, 2, 2, 2}
		};
		
		for (int[] arr : num) {
			System.out.println(sol.solution(arr));
		}
		
		
	}
	
	// hashset을 사용해 중복을 제거
	public int solution(int[] nums) {
        
		int maxMyMonster = nums.length/2;
        
        HashSet<Integer> monsterType = new HashSet<>();
        for (int num : nums) {
            monsterType.add(num);
        }
        
        int monsterCnt = monsterType.size();
        
        return monsterCnt >= maxMyMonster ? maxMyMonster : monsterCnt;
        
    }

}
