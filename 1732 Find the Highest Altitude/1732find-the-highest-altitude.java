class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        //altitudes[1] = 0 + gain[0];
        int maxAltitude = 0;

        for (int i = 1; i < altitudes.length; i++){
            altitudes[i] = altitudes[i-1] + gain[i-1];

            if (altitudes[i] > maxAltitude) {
                maxAltitude = altitudes[i];
            }
        }

        

        return maxAltitude;
        
    }
}