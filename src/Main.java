/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        char[] array = new char[]{'b','c','d','e','f','g','q','r','s','t'};

        int x  = hafSearch(array,'b');
        System.out.println(x);
        swap(10,20);
    }


    /**
     * 二分查找法
     *
     * @param array the array
     * @param k     the k
     * @return the int
     */
    public static int hafSearch(char[] array, char k){
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = (right - left)/2;
            System.out.println(array[mid]);
            if (array[mid] == k) {
                return mid;
            }else if (array[mid] > k){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
      return -1;
    }

    /**
     * Swap.交换
     *
     * @param a the a
     * @param b the b
     */
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;//(a^b)^b = a
        a = a^b;//(a^b)^b = (a^b)^a = b
        System.out.println(a);
        System.out.println(b);
    }

}


