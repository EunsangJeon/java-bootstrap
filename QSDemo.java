class QuickSort {
  public static void qsort(char items[]){
    qs(items, 0, items.length - 1);
  }
  private static void qs(char items[], int left, int right) {
    int i, j;
    char x, y;
    i = left;
    j = right;
    x = items[(left + right) / 2];

    do {
      while(i < right && items[i] < x) {
        ++i;
      }
      while (j > left && items[j] > x) {
        --j;
      }
      if(i <= j){
        y = items[i];
        items[i] = items[j];
        items[j] = y;
        ++i;
        --j;
      }
      
    } while (i <= j);

    if(left < j) {
      qs(items, left, j);
    }
    if(right > i){
      qs(items, i, right);
    }
  }
}

class QSDemo {
  public static void main(String args[]) {    
    char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i'};
    int i;
    System.out.print("Original array: "); 
    for(i=0; i < a.length; i++)
      System.out.print(a[i]); 
    System.out.println();

    QuickSort.qsort(a);

    System.out.print("Sorted array: ");
    for(i=0; i < a.length; i++) 
      System.out.print(a[i]);
    System.out.println();
  }
}
