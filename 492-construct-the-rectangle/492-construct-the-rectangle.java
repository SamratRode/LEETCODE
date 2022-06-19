class Solution {
    public int[] constructRectangle(int area) {
        int[] result=new int[2];
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=1;i<=area;i++){
            if(area%i==0){
                al.add(i);

            }
        }
        if(al.size()%2==0){
            result[1]=al.get(al.size()/2-1);
            result[0]=al.get(al.size()/2);
        }
        else{
            result[0]=al.get(al.size()/2);
            result[1]=al.get(al.size()/2);
        }
        return result;
    }
}