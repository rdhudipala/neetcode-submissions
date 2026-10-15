class Solution {
    public boolean isValidSudoku(char[][] board) {
        

       
        for(int i=0; i<board.length; i++){

             Set<Character> numRow=new HashSet<>();

            for(int j=0; j<board.length;j++){
                

                if(Character.isDigit(board[i][j])){
                    
                    if(!numRow.add(board[i][j]))return false;
                    
                }
            }
        }

        for(int x=0; x<board.length; x++){

             Set<Character>  numColumn=new HashSet<>();
            for(int y=0; y<board.length;y++){
                

                if(Character.isDigit(board[y][x])){
                    
                    if(!numColumn.add(board[y][x]))return false;
                    
                }
            }
        }

        for(int boxRow=0; boxRow<9; boxRow+=3 ){

            for(int boxColumn=0;boxColumn<9; boxColumn+=3){

                  Set<Character> box=new HashSet<>();
                for(int r=boxRow; r<boxRow+3; r++){
                    for(int c=boxColumn; c<boxColumn+3; c++){

                        if(Character.isDigit(board[r][c])){
                           if(!box.add(board[r][c]))return false;
                        }
                    }
                }
            }

        }

        return true;
    }
}
