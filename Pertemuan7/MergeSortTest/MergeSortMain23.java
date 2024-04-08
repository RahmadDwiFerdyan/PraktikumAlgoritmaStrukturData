package PraktikumAlgoritmaStrukturData.Pertemuan7.MergeSortTest;

public class MergeSortMain23 {
    public static void main(String[] args) {
      int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
    System.out.println("Sorting engan MERGE SORT!");
    MergeSorting23 mSort = new MergeSorting23();
    System.out.println("Data Awal: ");
    mSort.printArray(data);
    mSort.mergeSort(data);
    System.out.println("Setelah Diurutkan: ");
    mSort.printArray(data);  
    }
    
}
