package a208;

/**
 * @ClassName TrieNode
 * @Decription TODO
 * @Auther mac
 * @Date 2019-10-16 16:49
 * @Version 1.0
 **/
public class TrieNode {

    public char val;

    public TrieNode[] children = new TrieNode[26];

    public boolean isWord;

    public TrieNode() {
    }

    public TrieNode(char c) {
        TrieNode node = new TrieNode();
        node.val = c;
    }
}
