package PraktikumAlgoritmaStrukturData.UTS;

public class praktikumMethod {
    void selectionSort(int[] data){
        for(int i = 0; i < data.length; i++){
            int idxMin = i;
            for(int j = i+1; j < data.length; j++){
                if(data[j] < data[idxMin]){
                    idxMin = j;
                }
            }
            int tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }
    }

    public int FindBinarySearch(int cari, int left, int right, int[] data) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (cari == data[mid]) {
                return mid;
            } else if (data[mid] < cari) {
                return FindBinarySearch(cari, mid + 1, right, data);
            } else {
                return FindBinarySearch(cari, left, mid - 1, data);
            }
        }
        return -1;
    }
}
