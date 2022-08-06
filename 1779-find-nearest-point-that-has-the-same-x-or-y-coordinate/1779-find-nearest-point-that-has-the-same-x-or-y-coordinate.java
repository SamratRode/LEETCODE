class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int[][] valid=new int[points.length][points[0].length];
        int count=0;
        for(int i=0;i<points.length;i++){
            if(x==points[i][0] || y==points[i][1]){
                valid[count][0]=points[i][0];
                valid[count][1]=points[i][1];
                // System.out.print(valid[count][0]+" "+valid[count][1]);
                count++;
            }
        }
        if(count==0){
            return -1;
        }
        double min=Double.MAX_VALUE;
        int xc=-1;
        int yc=-1;
        for(int i=0;i<count;i++){
            // System.out.println(distance(x,y,valid[i][0], valid[i][1]));
            if(min>distance(x,y,valid[i][0], valid[i][1])){
                min=distance(x,y,valid[i][0], valid[i][1]);
                xc=valid[i][0];
                yc=valid[i][1];
                // System.out.print(xc+" "+yc);
            }
            
        }
        if(xc==-1){
            return -1;
        }
        for(int i=0;i<points.length;i++){
            if(points[i][0]==xc && points[i][1]==yc){
                return i;
            }
        }
        return -1;
    }
    public double distance(int x,int y,int a,int b){
        return Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
    }
}