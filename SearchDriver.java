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
    //testing looking thru java library for Time
    long test = System.currentTimeMillis();
    System.out.println(test);

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
    Comparable [] rollins = new Integer[10000000];
    for (int i = 0; i< rollins.length; i++) {
      rollins[i] = i * 4;
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

    //testing binSearch and timing it
    System.out.println("\nBinary Search testing");
    System.out.println("1. sinatra test");
    long binBefore = System.currentTimeMillis();
    System.out.println("Time before binary search: " + binBefore + " ms");
    jazz.binSearch(sinatra,42);
    long binAfter = System.currentTimeMillis();
    System.out.println("Time after binary search: " + binAfter + " ms");
    System.out.println("Time elapsed: " + (binAfter-binBefore) + " ms");

    System.out.println("\n2. armstrong test");
    binBefore = System.currentTimeMillis();
    System.out.println("Time before binary search: " + binBefore + " ms");
    jazz.binSearch(armstrong,1342);
    binAfter = System.currentTimeMillis();
    System.out.println("Time after binary search: " + binAfter + " ms");
    System.out.println("Time elapsed: " + (binAfter-binBefore) + " ms");

    System.out.println("\n3. ellington test");
    long first = System.currentTimeMillis();
    System.out.println("Time before binary search: " + first + " ms");
    jazz.binSearch(ellington,7503);
    long second = System.currentTimeMillis();
    System.out.println("Time after binary search: " + second + " ms");
    System.out.println("Time elapsed: " + (second-first) + " ms");

    System.out.println("\n4. rollins test");
    binBefore = System.currentTimeMillis();
    System.out.println("Time before binary search: " + binBefore + " ms");
    jazz.binSearch(rollins,3200400);
    binAfter = System.currentTimeMillis();
    System.out.println("Time after binary search: " + binAfter + " ms");
    System.out.println("Time elapsed: " + (binAfter-binBefore) + " ms");

    //testing linSearch and timing it
    System.out.println("\nLinear Search testing");
    System.out.println("1. sinatra test");
    long linBefore = System.currentTimeMillis();
    System.out.println("Time before linear search: " + linBefore + " ms");
    reggae.linSearch(sinatra,42);
    long linAfter = System.currentTimeMillis();
    System.out.println("Time after linear search: " + linAfter + " ms");
    System.out.println("Time elapsed: " + (linAfter-linBefore) + " ms");

    System.out.println("\n2. armstrong test");
    linBefore = System.currentTimeMillis();
    System.out.println("Time before linear search: " + linBefore + " ms");
    reggae.linSearch(armstrong,1342);
    linAfter = System.currentTimeMillis();
    System.out.println("Time after linear search: " + linAfter + " ms");
    System.out.println("Time elapsed: " + (linAfter-linBefore) + " ms");

    System.out.println("\n3. ellington test");
    linBefore = System.currentTimeMillis();
    System.out.println("Time before linear search: " + linBefore + " ms");
    reggae.linSearch(ellington,7503);
    linAfter = System.currentTimeMillis();
    System.out.println("Time after linear search: " + linAfter + " ms");
    System.out.println("Time elapsed: " + (linAfter-linBefore) + " ms");

  } //ends main
} //ends class
