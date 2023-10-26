public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] board = new String[8][8];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = "-";
            }
        }
        for(int i = 1; i < 7; i += 5){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = "pawn";
            }
        }
        
        
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    public static void print(String[][] array)
    {

    }
}
