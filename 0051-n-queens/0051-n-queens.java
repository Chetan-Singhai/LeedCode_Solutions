class Solution {
    public static boolean isSafe( char board[][] , int row,int col){
        for(int i=row-1; i>=0; i--){    
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){    
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){    
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
      public void saveBoard(char[][] board, List<List<String>> allBoards ){
           String row =" ";
           List<String> newBoard = new ArrayList<>();

           for(int i=0; i<board.length; i++){
              row="";
              for(int j=0; j<board[0].length; j++) {
                  if(board[i][j] == 'Q')
                  row+= 'Q';
                  else
                   row += '.';

              }
              newBoard.add(row);
           }
           allBoards.add(newBoard);
      }

    public  void nQueens(char board[][], List<List<String>> allBoards, int row){
        //base
        if(row == board.length){
            saveBoard(board, allBoards); 
            return;
        }
        // colume loop

        for(int j=0; j<board.length;j++){
            if(isSafe(board , row,j)){
                board[row][j] = 'Q';
                nQueens(board ,allBoards, row+1);
                board[row][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards =new ArrayList<>();
        char[][] board = new char[n][n];

        nQueens(board ,allBoards,0);
        return allBoards;
    }
}