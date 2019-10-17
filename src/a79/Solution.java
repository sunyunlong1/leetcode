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

    List<String> result = new ArrayList<>();

    public  boolean exist(char[][] board, String word) {
        Trie trie = new Trie();
        trie.insert(word);
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                def(board,visited,"",i,j,trie);
            }
        }
        if (result.size() > 0){
            if (result.get(0).equals(word)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public void def(char[][] board,boolean[][] visited,String str,int x,int y,Trie trie){
        if (x<0 || x>=board.length || y<0 || y>=board[0].length) return;

        if (visited[x][y]) return;

        str+=board[x][y];

        if(!trie.startsWith(str)) return;

        if (trie.search(str)){
            result.add(str);
        }
        visited[x][y] = true;
        def(board,visited,str,x-1,y,trie);
        def(board,visited,str,x+1,y,trie);
        def(board,visited,str,x,y-1,trie);
        def(board,visited,str,x,y+1,trie);
        visited[x][y] = false;
    }


    public static void main(String[] args) {

        char[][] borad = {{'F','Y','C','E','N','R','D'},{'K','L','N','F','I','N','U'},{'A','A','A','R','A','H','R'},{'N','D','K','L','P','N','E'},{'A','L','A','N','S','A','P'},{'O','O','G','O','T','P','N'},{'H','P','O','L','A','N','O'}};
        String word= "poland";
        System.out.println(new Solution().exist(borad,word));
    }
}
