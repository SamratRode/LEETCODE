class Solution {
    public boolean checkRecord(String s) {
        int i=0;
        int count=0;
        boolean late=false;
        while(i+1<s.length()){
            if((s.charAt(i)==s.charAt(i+1)) && (s.charAt(i)=='L')){
                count++;
            }
            else{
                count=0;
            }
            if(count==2){
                late=true;
                break;
            }
            i++;
            
        }
        boolean absent=false;
        int acount=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                acount++;
                if(acount>=2){
                absent=true;
                break;}
                
                
            }
        }
        // System.out.println(late + " "+ absent);
        return (!late&(!absent));
            
    }
}