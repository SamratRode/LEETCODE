class Solution {
    public int countBattleships(char[][] board) {
        int count1=0;
        // int count2=0;
    
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    dfs_R(i,j,board);
                    count1++;
                }
                
            
            }
        }
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board[0].length;j++){
//                 if(board[i][j]=='X'){
//                     dfs_C(i,j,board);
//                     count2++;
//                 }
            
//             }
//         }
        return count1;
    }
    // public void dfs_C(int i,int j,char[][] board){
    //     if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1 || board[i][j]=='.'){
    //         return;
    //     }
    //     board[i][j]='.';
    //     dfs_C(i-1,j,board);
    //     dfs_C(i+1,j,board);
    // }
    public void dfs_R(int i,int j,char[][] board){
        if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1 || board[i][j]=='.'){
            return;
        }
        board[i][j]='.';
        dfs_R(i,j-1,board);
        dfs_R(i,j+1,board);
        dfs_R(i-1,j,board);
        dfs_R(i+1,j,board);
    }
}