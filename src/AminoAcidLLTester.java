import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AminoAcidLLTester {

    @Test
    public void test_1() {
        String inCodon = "CCGUUGGCACUGUUG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

    @Test
    public void test_2() {
        String inCodon = "GCUACGGAGCUUCHHAGCUAG";
        AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    }

}