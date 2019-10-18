package a79;


import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName Solution
 * @Decription leetCode79
 * @Auther mac
 * @Date 2019-10-17 10:01
 * @Version 1.0
 **/
public class Solution {

    static int[] row = {0,1,0,-1};
    static int[] column = {1,0,-1,0};

    public  boolean exist(char[][] board, String word) {

        for (int i =0,rowLen = board.length;i<rowLen;i++){
            for (int j=0,columnLen = board[0].length;j<columnLen;j++){
                if (dfs(board,word,i,j,0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,String word,int x,int y,int index){
        if (x<0 || x>=board.length || y<0 || y>=board[0].length) return false;

        if(board[x][y] != word.charAt(index)) return false;

        if(index == word.length() - 1) return true;

        board[x][y] = '#';

        for (int i = 0 ; i<4;i++){
            if (dfs(board,word,x+row[i],y+column[i],index+1)) return true;
        }
        board[x][y] = word.charAt(index);
        return false;
    }


    public static void main(String[] args) {

        char[][] borad = {{'F','Y','C','E','N','R','D'},{'K','L','N','F','I','N','U'},{'A','A','A','R','A','H','R'},{'N','D','K','L','P','N','E'},{'A','L','A','N','S','A','P'},{'O','O','G','O','T','P','N'},{'H','P','O','L','A','N','O'}};
        String word= "poland";
        System.out.println(new Solution().exist(borad,word));
    }
}
