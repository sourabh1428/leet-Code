class Solution {
    public int[] asteroidCollision(int[] asteroids) {
          Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0) {
                while (stk.size() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }
                if (stk.size() > 0 && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                    continue;
                }
                else if(stk.size() == 0) {
                    res.add(asteroids[i]);
                }
            }
            else {
                stk.push(asteroids[i]);
            }
        }
        Stack<Integer> res2 = new Stack();
        while (stk.size() > 0) {
            res2.add(stk.pop());
        }
        while (res2.size() > 0) {
            res.add(res2.pop());
        }
        
        int[] resArr = new int[res.size()];
        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = res.get(i);
        }
        
        return resArr;
        
    }
}