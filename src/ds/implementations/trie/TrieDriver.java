package ds.implementations.trie;

import ds.implementations.trie.Trie;

public class TrieDriver {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insertWord("apple");
        trie.insertWord("apples");
        trie.insertWord("apps");
        trie.insertWord("balls");
        trie.insertWord("bale");

        System.out.println(trie.searchWord("apple"));
        System.out.println(trie.searchWord("appies"));
        System.out.println(trie.startsWith("ba"));
    }
}
