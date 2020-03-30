import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AminoAcidLLTester {

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A
    // EXPECTED LINKED LIST AFTER SORTING: A -> L -> P
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that the sorting method functions correctly
    public void test_1() {
        String inCodon = "CCGUUGGCACUGUUG";

        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
        AminoAcidLL listToBeSorted = AminoAcidLL.createFromRNASequence(inCodon);
        AminoAcidLL.printList(AminoAcidLL.sort(listToBeSorted));
        //assertEquals();
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST BEFORE SORTING: P -> L -> A (NOT SORTED)
    // EXPECTING: FALSE
    // EXPECTED LINKED LIST AFTER SORTING: A -> L -> P (SORTED)
    // EXPECTING: TRUE
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the isSorted() method functions correctly
    public void test_2() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST: P -> L -> A
    // EXPECTING: PLA
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the aminoAcidList() method functions correctly
    public void test_3() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST: P -> L -> A
    // EXPECTING: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the aminoAcidCount() method functions correctly
    public void test_4() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST: P -> L -> A
    // EXPECTING: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the aminoAcidCompare() method functions correctly
    public void test_5() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    // TESTING CODON SEQUENCE #1: CCGUUGGCACUGUUG
    // LINKED LIST: P -> L -> A
    // EXPECTING: ---
    // TEST: ---
    // TEST DESCRIPTION: Ensure that the codonCompare() method functions correctly
    public void test_6() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_8() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_9() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_10() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

}