import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AminoAcidLLTester {

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A
    // EXPECTED LINKED LIST AFTER SORTING: A -> L -> P
    // EXPECTED RESULT: TRUE
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the sort() and isSorted() methods function correctly
    public void test_1_sequence_1() {

        // Sequence #1
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating the linked list that will be sorted
        AminoAcidLL listToBeSorted = AminoAcidLL.createFromRNASequence(inCodon);

        // Sorting the linked list and testing if it is sorted correctly
        assertTrue(AminoAcidLL.sort(listToBeSorted).isSorted());
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A
    // EXPECTED RESULT: [P, L, A]
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the aminoAcidList() method functions correctly
    public void test_2_sequence_1() {

        // Sequence #1
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating a new array with the exepected result
        char[] expectedResult = {'P', 'L', 'A'};

        // Creating the amino acid list from the sequence
        char[] aminoAcidList = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList();

        // Comparing the arrays
        assertArrayEquals(expectedResult, aminoAcidList);
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A
    // EXPECTED RESULT: [1, 3, 1]
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the aminoAcidCounts() method functions correctly
    public void test_3_sequence_1() {

        // Sequence #1
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating a new array with the exepected result
        int[] expectedResult = {1, 3, 1};

        // Creating the amino acid list from the sequence
        int[] aminoAcidCounts = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidCounts();

        // Comparing the arrays
        assertArrayEquals(expectedResult, aminoAcidCounts);
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST OF SEQUENCE #1: P -> L -> A
    // COMPARING TO SEQUENCE: CCGUUGGCACUGAGCACG
    // LINKED LIST OF SEQUENCE COMPARING TO: P -> L -> A -> S -> T
    // EXPECTED RESULT: 2
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the aminoAcidCompare() method functions correctly
    public void test_4_sequence_1() {

        // Creating list 1 and sorting it
        AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("CCGUUGGCACUGUUG");
        AminoAcidLL.sort(list1);

        // Creating list 2 and sorting it
        AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("CCGUUGGCACUGAGCACG");
        AminoAcidLL.sort(list2);

        // Expected counts
        int expectedCounts = 2;

        // Testing that the counts match expected result
        assertEquals(expectedCounts, list1.aminoAcidCompare(list2));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST OF SEQUENCE #1: P -> L -> A
    // COMPARING TO SEQUENCE: CCGUUGGCA
    // LINKED LIST OF SEQUENCE COMPARING TO: P -> L -> A
    // EXPECTED RESULT: 0
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the codonCompare() method functions correctly
    public void test_5_sequence_1() {

        // Creating list 1 and sorting it
        AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("CCGUUGGCACUGUUG");
        AminoAcidLL.sort(list1);

        // Creating list 2 and sorting it
        AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("CCGUUGGCA");
        AminoAcidLL.sort(list2);

        // Expected counts
        int expectedCounts = 0;

        // Testing that the counts match expected result
        assertEquals(expectedCounts, list1.codonCompare(list2));
    }

    @Test
    // TESTING CODON SEQUENCE #2: GCUACGGAGCUUCGGAGCUAG
    // LINKED LIST BEFORE SORTING: A -> T -> E -> L -> R -> S -> STOP (*)
    // EXPECTED LINKED LIST AFTER SORTING: STOP (*) -> A -> E -> L -> R -> S -> T
    // EXPECTED RESULT: TRUE
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the sort() and isSorted() methods function correctly with a more complex sequence
    public void test_6_sequence_2() {

        // Sequence #2
        String inCodon = "GCUACGGAGCUUCGGAGCUAG";

        // Creating the linked list that will be sorted
        AminoAcidLL listToBeSorted = AminoAcidLL.createFromRNASequence(inCodon);

        // Sorting the linked list and testing if it is sorted correctly
        assertTrue(AminoAcidLL.sort(listToBeSorted).isSorted());
    }

    @Test
    // TESTING CODON SEQUENCE #2: GCUACGGAGCUUCGGAGCUAG
    // LINKED LIST BEFORE SORTING: A -> T -> E -> L -> R -> S -> STOP (*)
    // EXPECTED RESULT: [A, T, E, L, R, S, *]
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the aminoAcidList() method functions correctly with a more complex sequence
    public void test_7_sequence_2() {

        // Sequence #2
        String inCodon = "GCUACGGAGCUUCGGAGCUAG";

        // Creating a new array with the exepected result
        char[] expectedResult = {'A', 'T', 'E', 'L', 'R', 'S', '*'};

        // Creating the amino acid list from the sequence
        char[] aminoAcidList = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList();

        // Comparing the arrays
        assertArrayEquals(expectedResult, aminoAcidList);
    }

    @Test
    // TESTING CODON SEQUENCE #2: GCUACGGAGCUUCGGAGCUAG
    // LINKED LIST BEFORE SORTING: A -> T -> E -> L -> R -> S -> STOP (*)
    // EXPECTED RESULT: [1, 1, 1, 1, 1, 1, 0]
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the aminoAcidCounts() method functions correctly with a more complex sequence
    public void test_8_sequence_2() {

        // Sequence #2
        String inCodon = "GCUACGGAGCUUCGGAGCUAG";

        // Creating a new array with the exepected result
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 0};

        // Creating the amino acid list from the sequence
        int[] aminoAcidCounts = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidCounts();

        // Comparing the arrays
        assertArrayEquals(expectedResult, aminoAcidCounts);
    }

    @Test
    // TESTING CODON SEQUENCE #2: GCUACGGAGCUUCGGAGCUAG
    // LINKED LIST OF SEQUENCE #2: A -> T -> E -> L -> R -> S -> STOP (*)
    // COMPARING TO SEQUENCE: GCUACGGAGCUUCGGAGCCCGCCGUAG
    // LINKED LIST OF SEQUENCE COMPARING TO: A -> T -> E -> L -> R -> S -> P -> P -> K ->  STOP (*)
    // EXPECTED RESULT: 2
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the aminoAcidCompare() method functions correctly with a more complex sequence
    public void test_9_sequence_2() {

        // Creating list 1 and sorting it
        AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("GCUACGGAGCUUCGGAGCUAG");
        AminoAcidLL.sort(list1);

        // Creating list 2 and sorting it
        AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("GCUACGGAGCUUCGGAGCCCGCCGAAGUAG");
        AminoAcidLL.sort(list2);

        // Expected counts
        int expectedCounts = 2;

        // Testing that the counts match expected result
        assertEquals(expectedCounts, list1.aminoAcidCompare(list2));
    }

    @Test
    // TESTING CODON SEQUENCE #2: GCUACGGAGCUUCGGAGCUAG
    // LINKED LIST OF SEQUENCE #2: A -> T -> E -> L -> R -> S -> STOP (*)
    // COMPARING TO SEQUENCE: GCUACGGAGCUUCGGAGCUAG
    // LINKED LIST OF SEQUENCE COMPARING TO: A -> T -> E -> L -> R -> S -> STOP (*)
    // EXPECTED RESULT: 2
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the codonCompare() method functions correctly with a more complex sequence
    public void test_10_sequence_2() {

        // Creating list 1 and sorting it
        AminoAcidLL list1 = AminoAcidLL.createFromRNASequence("GCUACGGAGCUUCGGAGCUAG");
        AminoAcidLL.sort(list1);

        // Creating list 2 and sorting it
        AminoAcidLL list2 = AminoAcidLL.createFromRNASequence("GCUACGGAGCUUCGGAGCCCGCCGAAGUAG");
        AminoAcidLL.sort(list2);

        // Expected counts
        int expectedCounts = 2;

        // Testing that the counts match expected result
        assertEquals(expectedCounts, list1.codonCompare(list2));
    }
}