package com.nonrepeatstream.java;

import java.util.LinkedList;
import java.util.Queue;

public class Stream {
    private int[] characterStatus;

    public Stream() {
        characterStatus = new int[26];
        for (int i = 0; i < 26; i++) {
            characterStatus[i] = -1;
        }
    }

    public void add(char c) {
        int index = c - 'a';
        if (characterStatus[index] == -1) {
            characterStatus[index] = 0;
        } else if (characterStatus[index] == 0) {
            characterStatus[index] = 1;
        }
    }

    public char getFirstNonRepeating() {
        for (int i = 0; i < 26; i++) {
            if (characterStatus[i] == 0) {
                return (char) (i + 'a');
            }
        }
        return '-';
    }

}
