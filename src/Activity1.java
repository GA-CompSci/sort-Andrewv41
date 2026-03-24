public class Activity1 extends IntegerManager implements PrintPretty {
    public static void main(String[] args) throws Exception {
        Activity1 thingie = new Activity1();
        thingie.buildList();
        thingie.printPretty();
        thingie.shuffle();
        // thingie.printPretty();
        // thingie.selectionSort();
        // thingie.printPretty();
        // thingie.selectionSort(true);
        thingie.printPretty();
        thingie.insertionSort();
        thingie.printPretty();
        thingie.insertionSort(true);
        thingie.printPretty();

    }

    @Override
    void buildList() {
        nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100) + 1; // 1-100
        }
    }

    @Override
    void shuffle() {
        // loop through all numbers, and at that index pick a random index to swap with.
        // Uses a 3-part-swap (use temp array)
        for (int i = 0; i < nums.length; i++) {
            int r = (int) (Math.random() * nums.length); // random position
            int temp = nums[i]; // store value
            nums[i] = nums[r]; // new posiion equal to another value at the random position
            nums[r] = temp; // random position takes the original's value
        }
    }

    boolean highToLow = false;

    void insertionSort(boolean highToLow) {
        if (!highToLow) {
            insertionSort();
            return;
        } else if (highToLow) {
            for (int k = 1; k < nums.length; k++) {
                int i = k - 1;
                int key = nums[k];
                while (i > -1 && nums[i] < key) {
                    nums[i + 1] = nums[i];
                    i--;
                }
                nums[i + 1] = key;
            }
        }
    }

    @Override
    void insertionSort() {
        for (int k = 1; k < nums.length; k++) {
            int i = k - 1;
            int key = nums[k];
            while (i > -1 && nums[i] > key) {
                nums[i + 1] = nums[i];
                i--;
            }
            nums[i + 1] = key;
        }
    }

    boolean hightToLow = false;

    void selectionSort(boolean hightToLow) {

        if (!hightToLow) {
            selectionSort();
            return;
        } else if (hightToLow) {
            for (int i = 0; i < nums.length; i++) {
                int largestNum = i;
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] > nums[largestNum]) {
                        largestNum = k;
                    }
                }
                int temp = nums[largestNum];
                nums[largestNum] = nums[i];
                nums[i] = temp;
            }

        }
    }

    @Override
    void selectionSort() {
        // outer loop
        for (int i = 0; i < nums.length - 1; i++) {
            int smallestNum = i;
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[k] < nums[smallestNum]) {
                    smallestNum = k;
                }
            }
            // inner loop is done. Lock in the current smallest at the outer
            int temp = nums[smallestNum];
            nums[smallestNum] = nums[i];
            nums[i] = temp;
        }
    }

    @Override
    void mergeSort() {
    }

    @Override
    int pickRandom() {
        int total = nums.length;
        int rand = (int)(Math.random()*nums.length + 1);
        return nums[rand];
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pickRandom'");
    }

    int binarySearch(int something) {
        int low = 0;
        int high = nums.length - 1;
        {
            while (low <= high) {
                int middle = (low + high)/2;
                if (nums[middle] == something){
                    return middle;
                }
                else if (nums[middle] > something) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
        return -1;
    }

    public void printPretty() {
        final String RESET = "\u001B[0m";
        final String CYAN = "\u001B[96m";
        final String YELLOW = "\u001B[93m";

        System.out.print(CYAN + "\n ══ ARRAY (size: " + nums.length + ") ══  " + YELLOW);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println(RESET);
    }

}