## N-Queens

### Problem

N queens must be placed on a NxN chessboard so that no queen can attack any other queen. The queen moves in 8 directions and can directly attack in these 8 directions only.

![image](https://github.com/novillo-cs/apcsa_material/assets/123229891/f37a7fa2-6f40-4017-98ae-753b6fd3b7ae)

Remember, you may place only 1 queen in each row, column, diagonal.

![image](https://github.com/novillo-cs/apcsa_material/assets/123229891/4608d6e6-560f-4fe4-9323-164502db8947)

![image](https://github.com/novillo-cs/apcsa_material/assets/123229891/ef5a1717-a71d-4fcd-9416-6d1f01e97b4a)

- How would so solve this problem with recursive backtracking? How could yo place the queens on the board making sure no queens will attach each other?

- How the recursion would work in your solution?

- How can you indicate if a position on the board is safe to add a queen?

### Methods that could be adede to your code

```
/**
*@return true when the queen added correctly, false Otherwise
*@precondition r and c are valid indices of the board array
*@postcondition the board is only changed when the function returns true
* in which case the queen is added and all it's threatened positions are incremented.
* Only the squares below the current row should be marked as threatened.
*/
private boolean addQueen(...){

}

/**Remove the queen that was added to r,c
*@precondition r and c are valid indices of the board array and there is a queen at position r,c
*@postcondition the board is modified to remove that queen and all it's
*threatened positions are decremented
*/
private void removeQueen(...){

}
```

Save your work here: classwork/xx_NQueens/your_files_here

Include a txt, md, or pdf file with the answers to the questions (answers.md).

Also include a java file with your code (NQueens.java)

