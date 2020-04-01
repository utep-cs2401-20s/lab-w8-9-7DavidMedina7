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
    // TEST: PASSED (Locations differ)
    // TEST DESCRIPTION: Ensure that the aminoAcidList() method functions correctly
    public void test_2_sequence_1() {

        // Sequence #1
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating a new array with the exepected result
        char[] expectedResult = {'P', 'L', 'A'};

        // Creating the amino acid list from the sequence
        char[] aminoAcidList = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList();

        // Comparing the arrays
        assertEquals(expectedResult, aminoAcidList);
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A
    // EXPECTED RESULT: [1, 3, 1]
    // TEST: PASSED (Locations differ)
    // TEST DESCRIPTION: Ensure that the aminoAcidCounts() method functions correctly
    public void test_3_sequence_1() {

        // Sequence #1
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating a new array with the exepected result
        int[] expectedResult = {1, 3, 1};

        // Creating the amino acid list from the sequence
        int[] aminoAcidCounts = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidCounts();

        // Comparing the arrays
        assertEquals(expectedResult, aminoAcidCounts);
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // COMPARING TO SEQUENCE: ---
    // EXPECTED RESULT: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the aminoAcidCompare() method functions correctly
    public void test_4_sequence_1() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // COMPARING TO SEQUENCE: ---
    // EXPECTED RESULT: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the codonCompare() method functions correctly
    public void test_5_sequence_1() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #2: ---
    // LINKED LIST BEFORE SORTING: ---
    // EXPECTED LINKED LIST AFTER SORTING: ---
    // EXPECTED RESULT: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the sort() and isSorted() methods function correctly
    public void test_6_sequence_2() {

        // Sequence #2
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating the linked list that will be sorted
        AminoAcidLL listToBeSorted = AminoAcidLL.createFromRNASequence(inCodon);

        // Sorting the linked list and testing if it is sorted correctly
        assertTrue(AminoAcidLL.sort(listToBeSorted).isSorted());
    }

    @Test
    // TESTING CODON SEQUENCE #2: ---
    // LINKED LIST BEFORE SORTING: ---
    // EXPECTED RESULT: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the aminoAcidList() method functions correctly
    public void test_7_sequence_2() {

        // Sequence #2
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating a new array with the exepected result
        char[] expectedResult = {'P', 'L', 'A'};

        // Creating the amino acid list from the sequence
        char[] aminoAcidList = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList();

        // Comparing the arrays
        assertEquals(expectedResult, aminoAcidList);
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A
    // EXPECTED RESULT: [1, 3, 1]
    // TEST: PASSED (Locations differ)
    // TEST DESCRIPTION: Ensure that the aminoAcidCounts() method functions correctly
    public void test_8_sequence_2() {

        // Sequence #2
        String inCodon = "CCGUUGGCACUGUUG";

        // Creating a new array with the exepected result
        int[] expectedResult = {1, 3, 1};

        // Creating the amino acid list from the sequence
        int[] aminoAcidCounts = AminoAcidLL.createFromRNASequence(inCodon).aminoAcidCounts();

        // Comparing the arrays
        assertEquals(expectedResult, aminoAcidCounts);
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // COMPARING TO SEQUENCE: ---
    // EXPECTED RESULT: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the aminoAcidCompare() method functions correctly
    public void test_9_sequence_2() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // COMPARING TO SEQUENCE: ---
    // EXPECTED RESULT: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the codonCompare() method functions correctly
    public void test_10_sequence_2() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

}