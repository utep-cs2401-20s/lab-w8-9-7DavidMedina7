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
    public void test_2() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_3() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_4() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_5() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_6() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_8() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_9() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_10() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

}