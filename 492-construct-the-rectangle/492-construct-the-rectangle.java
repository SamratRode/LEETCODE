class Solution {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int x = (int)Math.sqrt(area);
        for(int i = x; i >= 1; i--){
            if(area % i == 0) {
                arr[0] = area/i;
                arr[1] = i;
                return arr;
            }
        }
        arr[0] = area;
        arr[1] = 1;
        return arr;
    }
}