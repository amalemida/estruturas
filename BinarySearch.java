public class BinarySearch {
   
    public int interative(int[] array, int key){
        int left = 0;
        int right = array.length;

        while (left < right) {
        
            int middle = (left + right)/2;
    
            if(key == array[middle]) {
                return middle;
            }
            if(key > array[middle]) {
                left = middle +1;
            }else {
                right = middle -1;
            }

        }
        return -1;
    }

    public int recursive(int[] array, int left, int right, int key) {

        if (left > right) {
            return -1;
        }
        int middle = (left + right)/2;
        if (key == array[middle]) {
            return middle;
        }
        if (key > array[middle]) {
            
            return recursive(array, middle +1, right, key);
        }else {
            recursive(array, left, middle -1, key);
        }
        return -1;
    }
}
