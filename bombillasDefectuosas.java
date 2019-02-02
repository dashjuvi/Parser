public class Solution {
    public int bulbs(ArrayList<Integer> a) {
        int state = 0;
        int switches = 0;
        for (int i=0; i< a.size(); i++){
            if (state == a.get(i)) {
                state = 1 - state;
                switches++;
            }
        }
        return switches;
    }
}
