class AminoAcidLL{
  char aminoAcid;
  String[] codons;
  int[] counts;
  AminoAcidLL next;

  // Default constructor for a new node or "AminoAcidLL"
  AminoAcidLL(){}


  /********************************************************************************************/
  /* Creates a new node, with a given amino acid/codon 
   * pair and increments the codon counter for that codon.
   * NOTE: Does not check for repeats!! */
  AminoAcidLL(String inCodon){

    // Data for one node
    aminoAcid = AminoAcidResources.getAminoAcidFromCodon(inCodon);
    codons = AminoAcidResources.getCodonListForAminoAcid(aminoAcid);
    counts = new int[codons.length];
    next = null;
  }

  /********************************************************************************************/
  /* Recursive method that increments the count for a specific codon:
   * If it should be at this node, increments it and stops, 
   * if not passes the task to the next node. 
   * If there is no next node, add a new node to the list that would contain the codon. 
   */
  private void addCodon(String inCodon){

    // If the aminoAcid matches one from the codon, call the increaseCodons() methods
    if(aminoAcid == AminoAcidResources.getAminoAcidFromCodon(inCodon)) {
      increaseCodons(inCodon);

      // Else if the next pointer is not equal to null, make a recursive call
    }else if(next != null) {
      next.addCodon(inCodon);

      // Else create a new node
    }else {
      next = new AminoAcidLL(inCodon);
    }
  
  }

  // Helper method for the addCodon() method
  private void increaseCodons(String inCodon) {

    // Loop to increase the number of a specific codon
    for(int i = 0; i < inCodon.length(); i++) {
      if(codons[i].equals(inCodon)) {
        counts[i]++;
      }
    }

  }


  /********************************************************************************************/
  /* Shortcut to find the total number of instances of this amino acid */
  private int totalCount(){

    // Initializing a total count
    int total = 0;

    // Loop to add the total number of instances
    for(int i = 0; i < codons.length; i++) {
      total += counts[i];
    }

    return total;
  }

  /********************************************************************************************/
  /* helper method for finding the list difference on two matching nodes
  *  must be matching, but this is not tracked */
  private int totalDiff(AminoAcidLL inList){

    return Math.abs(totalCount() - inList.totalCount());

  }


  /********************************************************************************************/
  /* helper method for finding the list difference on two matching nodes
  *  must be matching, but this is not tracked */
  private int codonDiff(AminoAcidLL inList){

    int diff = 0;
    for(int i=0; i<codons.length; i++){
      diff += Math.abs(counts[i] - inList.counts[i]);
    }
    return diff;
  }

  /********************************************************************************************/
  /* Recursive method that finds the differences in **Amino Acid** counts. 
   * the list *must* be sorted to use this method */
  public int aminoAcidCompare(AminoAcidLL inList){
    return 0;
  }

  /********************************************************************************************/
  /* Same as above, but counts the codon usage differences
   * Must be sorted. */
  public int codonCompare(AminoAcidLL inList){
    return 0;
  }


  /********************************************************************************************/
  /* Recursively returns the total list of amino acids in the order that they are in in the linked list. */
  public char[] aminoAcidList(){

    // Creating a new character array to store amino acids
    char[] aminoAcidArray;

    // Translating the linked list of amino acids to a character array

    // Recursively add each element of the linkedList to the array

    // Recursion should stop once we have no more nodes to look at in the linked list


    return new char[]{};
  }

  /********************************************************************************************/
  /* Recursively returns the total counts of amino acids in the order that they are in in the linked list. */
  public int[] aminoAcidCounts(){
    return new int[]{};
  }


  /********************************************************************************************/
  /* recursively determines if a linked list is sorted or not */
  public boolean isSorted(){

    // Base Case
    /* if(head == null || head.next == null) {
      return true;
    }

    // Checking the first two nodes and recursively checking the remainder
    return (head.data < head.next.data && isSorted(head.next));
    */
    return false;
  }


  /********************************************************************************************/
  /* Static method for generating a linked list from an RNA sequence */
  public static AminoAcidLL createFromRNASequence(String inSequence){

    // Creating a boolean variable and setting it to true to signify if we reach a 'STOP' node
    boolean ifStop = true;

    // Creating a head node
    AminoAcidLL head = new AminoAcidLL(inSequence.substring(0,3));

    // Loop to go through the entire inSequence string and add the codon accordingly
    for(int i = 3; i < inSequence.length() - 2 && ifStop; i += 3) {

      // If inSequence is equal a '*' meaning 'STOP,' exit loop
      if(inSequence.charAt(i) == '*') {
        ifStop = false;

        // Else add codon at head for the next three characters in the inSequence string
      }else {
        head.addCodon(inSequence.substring(i, i + 3));
      }
    }
    
    return head;
  }


  /********************************************************************************************/
  /* sorts a list by amino acid character*/
  public static AminoAcidLL sort(AminoAcidLL inList){

    return null;

  }

  // Function to print linked list
  public static void printList(AminoAcidLL head) {
    while (head != null) {
      System.out.print(head.aminoAcid + " ");
      head = head.next;
    }
  }

}