public class Activity1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    @Override
    abstract void buildList(){
    nums = new int[20];
    for(int i = 0; i < nums.length; i++){
        nums [i] = (int)(Math.reandom()*1000)-100;
    }
    }

    @Override
    public void printPretty() {
        System.out.println("/n~~~~ Array ~~~~ (size : " + nums.length + ")");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    @Override
    abstract void shuffle(){
    for(int i = 0; i<nums.length; i++){
        int r = (int)(Math.random()*nums.length);
        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp;
        }
    }}
}
