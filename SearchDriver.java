/*
Java Coffee - Courtney Huang, Jason Yang, Yuki Feng
APCS Pd7
Lab03: Get Empirical
*/

/*
driver class to compare the time it takes to run binary search vs linear search.
utilizes three test cases
*/

public class SearchDriver {
  public static void main(String[] args) {
    //accessing BinSearch
    BinSearch jazz = new BinSearch();
    //accessing LinSearch
    LinSearch reggae = new LinSearch();

    //test cases for int arrays
    Comparable [] sinatra = new Integer[100];
    for (int i = 0; i< sinatra.length; i++) {
      sinatra[i] = i;
    }
    Comparable [] armstrong = new Integer[1000];
    for (int i = 0; i< armstrong.length; i++) {
      armstrong[i] = i * 2;
    }
    Comparable [] ellington = new Integer[10000];
    for (int i = 0; i< ellington.length; i++) {
      ellington[i] = i * 3;
    }


    //test cases for String arrays
    Comparable [] marley = {"\'One", "Love\'", "\'Three", "Little", "Birds\'"};
      // length 5
      /*
      if desire to populate arrays w iteration:
      marley[0] = "y"
      for (int i = 1; i< marley.length; i++) {
        marley[i] = marley[i-1] + "slay";
      }
      */
    Comparable [] tosh = {"\'Legalize", "It\'", "\'Equal", "Rights\'", "\'Don't", "Look", "Back\'", "\'Johnny", "B", "Goods\'"};
    // length 10
    Comparable [] sizla = {"\'Just", "One", "Of", "Those", "Days\'", "\'Woman", "I", "Need", "You\'", "\'Crown", "On", "Your", "Head\'", "\'Like", "Mountain\'"};
    // length 15

    //printing out the test cases
    // Integer
      // jazz.printArray(sinatra);
      // jazz.printArray(armstrong);
      // jazz.printArray(ellington);
    // String
      // reggae.printArray(marley);
      // reggae.printArray(tosh);
      // reggae.printArray(sizla);

    //testing linSearch and timing it
    long binBefore1 = System.currentTimeMillis();
    System.out.println("Time before binary search: " + binBefore1);
    jazz.binSearch(sinatra,42);
    long binAfter1 = System.currentTimeMillis();
    System.out.println("Time after binary search: " + binAfter1);

    //testing linSearch and timing it
    long linBefore1 = System.currentTimeMillis();
    System.out.println("Time before linear search: " + linBefore1);

  } //ends main
} //ends class
