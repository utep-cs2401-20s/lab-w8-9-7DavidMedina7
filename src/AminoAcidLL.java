import java.util.Arrays;

class AminoAcidLL{
  public static void main(String[] args){

    // Testing one string of codons
    String inCodon = "CCGUUGGCACUGUUG";
    //AminoAcidLL.printList(AminoAcidLL.createFromRNASequence(inCodon));
    //AminoAcidLL.createFromRNASequence(inCodon);


    //AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList();

    // ** Testing aminoAcidList() method **
    //AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList();
    //System.out.print(AminoAcidLL.createFromRNASequence(inCodon).aminoAcidList());


    // ** Testing the isSorted() method **
    //AminoAcidLL.createFromRNASequence(inCodon).isSorted();
    //System.out.print(AminoAcidLL.createFromRNASequence(inCodon).isSorted());


    // ** Testing the sorting method **
    //AminoAcidLL listToBeSorted = AminoAcidLL.createFromRNASequence(inCodon);
    //printList(sort(listToBeSorted));
    //AminoAcidLL.sort(listToBeSorted);
    //AminoAcidLL.createFromRNASequence(inCodon).isSorted();
    //System.out.print(AminoAcidLL.createFromRNASequence(inCodon).isSorted());



  }

  // Creating a sorted node and head node to aid when sorting the linked list
  public static AminoAcidLL sorted;
  public static AminoAcidLL head;
  public char[] aminoAcidArray = new char[7];
  public int j = 0;

  // Attributes that make up a AminoAcidLL
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
    for(int i = 0; i < codons.length; i++) {
      if(codons[i].equals(inCodon)) {
        counts[i] += 1;
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
    //char[] aminoAcidArray = new char[7];

    // Initializing a counter variable
    //int j = 0;

    // Base Case: If the pointer is null, return the array
    if(next == null){

      j = 0;
      next = null;
      return null;

      // Store aminoAcid from linked list into aminoAcidArray
    } else {
      aminoAcidArray[j] = aminoAcid;
      j++;
      next = next.next;
      aminoAcidList();
    }

    return aminoAcidArray;
  }

  /********************************************************************************************/
  /* Recursively returns the total counts of amino acids in the order that they are in in the linked list. */
  public int[] aminoAcidCounts(){
    return new int[]{};
  }


  /********************************************************************************************/
  /* recursively determines if a linked list is sorted or not */
  public boolean isSorted(){

    // Base Case: If head is empty
    if(next  == null) {
      return true;
    }

    // Traversing the linked list until the last node is reached
    for(sorted = next; sorted.next != null; sorted = sorted.next) {

      // If current node is smaller than or equal to the next node...
      if(sorted.aminoAcid <= sorted.next.aminoAcid) {
        return false;
      }
    }
    return true;
  }


  /********************************************************************************************/
  /* Static method for generating a linked list from an RNA sequence */
  public static AminoAcidLL createFromRNASequence(String inSequence){

    // Creating a boolean variable and setting it to true to signify if we reach a 'STOP' node
    boolean ifStop = true;

    // Creating a head node
    AminoAcidLL head = new AminoAcidLL(inSequence.substring(0,3));
    head.addCodon(inSequence.substring(0,3));

    // Loop to go through the entire inSequence string and add the codon accordingly
    for(int i = 3; i < inSequence.length() - 2 && ifStop; i += 3) {

      head.addCodon(inSequence.substring(i, i + 3));

      // If inSequence is equal a '*' meaning 'STOP,' exit loop
      if(inSequence.charAt(i) == '*') {
        ifStop = false;

        // Else add codon at head for the next three characters in the inSequence string
      }else{
        head.addCodon(inSequence.substring(i, i + 3));
      }
    }
    
    return head;
  }


  /********************************************************************************************/
  /* sorts a list by amino acid character*/
  public static AminoAcidLL sort(AminoAcidLL inList){

    // ** Utilizing Insertion Sort **

    // Initializing sorted linked list
    sorted = null;
    AminoAcidLL current = inList;

    // Traversing the given linked list and insert every node to be sorted
    while(current != null) {

      // Storing next for next iteration
      AminoAcidLL next = current.next;

      // Inserting current in sorted linked list
      sortedInsert(current);

      // Updating current
      current = next;
    }

    // Updating head reference to point to sorted linked list
    head = sorted;

    return head;
  }

  // Helper method to aid with the sort method
  static void sortedInsert(AminoAcidLL newNode) {

    // Edge Case: Head end
    if(sorted == null || sorted.aminoAcid >= newNode.aminoAcid) {
      newNode.next = sorted;
      sorted = newNode;
    }else {
      AminoAcidLL current = sorted;

      // Searching for the node before the point of insertion
      while(current.next != null && current.next.aminoAcid < newNode.aminoAcid) {
        current = current.next;
      }

      newNode.next = current.next;
      current.next = newNode;
    }
  }

  // Function to print linked list
  public static void printList(AminoAcidLL head) {
    while (head != null) {
      System.out.println(head.aminoAcid + ": ");
      System.out.println(Arrays.toString(head.codons) + " ");
      System.out.println(Arrays.toString(head.counts) + " ");
      System.out.println(head.next + " \n");

      head = head.next;
    }
  }

}