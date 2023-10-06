package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class ExamOneSec1And2Tests {

    @Test
    void distinctSubstringTest1() {
        int actual = ExamOneSec1And2.distinctSubstring("abba");
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void distinctSubstringTest2() {
        int actual = ExamOneSec1And2.distinctSubstring("abcdef");
        int expected = 21;

        assertEquals(expected, actual);
    }

    @Test
    void distinctSubstringTest3() {
        int actual = ExamOneSec1And2.distinctSubstring("aabca");
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void distinctSubstringTest4() {
        int actual = ExamOneSec1And2.distinctSubstring("acbacbacaa");
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void tupleSameProductTest1() {
        int[] nums = {1, 2, 3};

        int actual = ExamOneSec1And2.tupleSameProduct(nums);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void tupleSameProductTest2() {
        int[] nums = {1, 2, 4, 5, 10};

        int actual = ExamOneSec1And2.tupleSameProduct(nums);
        int expected = 16;

        assertEquals(expected, actual);
    }

    @Test
    void tupleSameProductTest3() {
        int[] nums = {1, 2, 3, 4};

        int actual = ExamOneSec1And2.tupleSameProduct(nums);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void tupleSameProductTest4() {
        int[] nums = {2, 3, 4, 6, 8};

        int actual = ExamOneSec1And2.tupleSameProduct(nums);
        int expected = 16;

        assertEquals(expected, actual);
    }

    @Test
    void partitionTest1() {
        ListNode head = null;
        int x = 5;
        ListNode actual = ExamOneSec1And2.partition(head, x);

        assertNull(actual);
    }

    @Test
    void partitionTest2() {
        ListNode head = new ListNode(3);
        int x = 5;
        ListNode actual = ExamOneSec1And2.partition(head, x);

        assertEquals(3, actual.val);
        assertNull(actual.next);
    }

    @Test
    void partitionTest3() {
        ListNode head = new ListNode(2, new ListNode(3, new ListNode(1, new ListNode(4))));
        int x = 5;
        ListNode actual = ExamOneSec1And2.partition(head, x);

        assertEquals(2, actual.val);
        assertEquals(3, actual.next.val);
        assertEquals(1, actual.next.next.val);
        assertEquals(4, actual.next.next.next.val);
        assertNull(actual.next.next.next.next);
    }

    @Test
    void partitionTest4() {
        ListNode head = new ListNode(7, new ListNode(6, new ListNode(8, new ListNode(9))));
        int x = 5;
        ListNode actual = ExamOneSec1And2.partition(head, x);
        
        assertEquals(7, actual.val);
        assertEquals(6, actual.next.val);
        assertEquals(8, actual.next.next.val);
        assertEquals(9, actual.next.next.next.val);
        assertNull(actual.next.next.next.next);
    }

}
