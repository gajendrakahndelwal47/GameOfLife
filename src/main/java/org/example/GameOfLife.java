package org.example;

public class GameOfLife {



    public static void main(String[] args)
    {

         int[][] test = {{0,1,0}, {0, 0,1},{1,1,1},{0,0,0}};;
         int[][] resultArray ={{0,1,0}, {0, 0,1},{1,1,1},{0,0,0}};

        for(int i=0;i<4;i++){
          for (int j = 0; j < 3; j++) {
              //initialize different argument for maintaining and calculation different types (horizontal etc)
              // without variable also we can do its just for postion calculation making separetly
              int horizontalfront, horizontalback, verticaltop, verticaldown, diagonalsideRow, diagonalSideColumn,
                      diagonaldownRow, doagonalDowncolumn,
                      diagonalbesideRow, diagonalbeSideColumn,
                      diagonalbesidedownRow, diagonalbesideDowncolumn;

              horizontalfront = j + 1;
              horizontalback = j - 1;
              verticaltop = i - 1;
              verticaldown = i + 1;
              diagonalsideRow = i - 1;
              diagonalSideColumn = j + 1;
              diagonaldownRow = i + 1;
              doagonalDowncolumn = j - 1;
              diagonalbesideRow=i-1;
              diagonalbeSideColumn=j-1;

              diagonalbesidedownRow=i+1;
              diagonalbesideDowncolumn=j+1;

              int liveCount = 0;
              if (horizontalfront < 3) {
                  if (test[i][horizontalfront] == 1)
                      liveCount++;
              }
              if (horizontalback >= 0) {
                  if (test[i][horizontalback] == 1)
                      liveCount++;
              }
              if (verticaltop >= 0) {
                  if (test[verticaltop][j] == 1)
                      liveCount++;
              }
              if (verticaldown < 4) {
                  if (test[verticaldown][j] == 1)
                      liveCount++;
              }
              if (diagonalsideRow >= 0 && diagonalSideColumn < 3) {
                  if (test[diagonalsideRow][diagonalSideColumn] == 1)
                      liveCount++;
              }
              if (diagonaldownRow < 4 && doagonalDowncolumn > 0) {
                  if (test[diagonaldownRow][doagonalDowncolumn] == 1)
                      liveCount++;
              }
              if (diagonalbesideRow >= 0 && diagonalbesideRow < 4 && diagonalbeSideColumn>=0 && diagonalbeSideColumn<3) {
                  if (test[diagonalbesideRow][diagonalbeSideColumn] == 1)
                      liveCount++;
              }
              if (diagonalbesidedownRow >= 0 && diagonalbesidedownRow < 4 && diagonalbesideDowncolumn>=0 && diagonalbesideDowncolumn<3) {
                  if (test[diagonalbesidedownRow][diagonalbesideDowncolumn] == 1)
                      liveCount++;
              }
              if (test[i][j] == 1) {
                  if (liveCount < 2) {
                      resultArray[i][j] = 0;
                  } else if (liveCount > 3) {
                      resultArray[i][j] = 0;
                  }
              } else {
                  if (liveCount == 3) {
                      resultArray[i][j] = 1;
                  }
              }

          }






    }

            for(int k=0;k<4;k++){
                 System.out.println();
                for(int l=0;l<3;l++){
                    System.out.print(resultArray[k][l]);
                }
            }
        }
}