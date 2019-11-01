package com.codingdojo.tries.Node;

import java.util.Set;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
        System.out.println(trie.isPrefixValid("car"));
        System.out.println(trie.isWordValid("car"));
    	Set<Character> keys = trie.root.children.get('*').children.keySet();
    	for(Character key: keys) {
    		System.out.println(key);
    	}
    }
}