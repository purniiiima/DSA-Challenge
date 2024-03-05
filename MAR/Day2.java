class Day2 {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int count = 0;
        Arrays.sort(tokens);
        int left = 0;
        int right = n - 1;
        int Score = 0;
        
        while (left <= right) {
            if(power >= tokens[left]){  
                power -= tokens[left++];
                count++;
                Score = Math.max(Score, count);
            } else if (count > 0) {
                power += tokens[right--];
                count--;
            } else {
                break;
            }
        }
        return Score;
    }
}