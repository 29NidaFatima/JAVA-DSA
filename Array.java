public class Array {
    // // -------------BASIC ARRAY-----------------
    // public static void update(int marks[], int nonchangable) {
    // nonchangable = 10;
    // for (int i = 0; i < marks.length; i++) {
    // marks[i] = marks[i] + 1;
    // }
    // }
    // // -----------------LINEAR SEARCH----------------------
    // // Q1
    // public static int linearSearch(int numbers[],int key){
    // for(int i=0;i<numbers.length; i++){
    // if(numbers[i]==key){
    // return i;
    // }
    // }
    // return -1;
    // }
    // // Q2
    // public static int linearSearch(String menu[],String key){
    // for(int i=0; i<menu.length; i++){
    // if( menu[i].equals(key)){
    // System.out.println(i);
    // return i;
    // }
    // }
    // return-1;
    // }
    // // Q3 TO FIND THE LARGEST NUMBER OF AN ARRAY
    // public static int getLargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE;
    // // in java it signifies -infinity

    // for (int i = 0; i < numbers.length; i++) {

    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // }
    // return largest;
    // }
    // // Q4 TO FIND THE SMALLEST NUMBER OF AN ARRAY
    //  public static int getSmallest(int numbers[]){
    // int Smallest=Integer.MAX_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // if(Smallest> numbers[i]){
    // Smallest=numbers[i];
    // }
    // }
    // return Smallest;
    // }

    //// ---------------BINARY SEARCH-----------------------
// //    Q1
//     public static int binarySearch(int numbers[],int key){
//     int start=0,end=numbers.length-1;
//     while(start<=end){
//     int mid=(start+end)/2;
//     //comparisions
//     if(numbers[mid]==key){ // found
//     return mid;
//     }
//     if(numbers[mid]<key){ //right
//     start=mid+1; // update start
//     }else
//     { //left
//     end=mid-1; // update end
//     }
//     }
//     return -1;
//     }

    // //--------------ARRAY'S REVERSING-------------------
    // public static void reverse(int numbers []) {
    // int first = 0, last = numbers.length - 1;
    // while (first < last) {
    // // Swap
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp; // Use the temporary variable 'temp' here
    // first++;
    // last--;
    // }
    // }

    //  //-------------CALCULATE ALL PAIRS OF ARRAY----------------
//     public static void printPairs(int numbers []){
//     int tp=0;
//     for( int i=0; i<numbers.length; i++){
//     int curr=numbers[i];
//     for( int j=i+1; j<numbers.length;j++){
//     System.out.print("(" + curr+ ","+ numbers[j]+ ")");
//     tp++;
//     }
// System.out.println();
//     }
//     System.out.println("TOTAL PAIRS:"+tp);
//     }
    // --------------CALCULATE SUBARRAY-------------------

    public static void printSubarrays(int numbers[]) {
        int ts = 0; // Total subarrays count
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
    
                // Initialize sum, min, and max for the current subarray
                int sum = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
    
                // Iterate over the subarray
                for (int k = start; k <= end; k++) {
                    int currentElement = numbers[k];
                    System.out.print(currentElement + " ");
    
                    // Update sum, min, and max
                    sum += currentElement;
                    if (currentElement < min) {
                        min = currentElement;
                    }
                    if (currentElement > max) {
                        max = currentElement;
                    }
                }
    
                // After printing the subarray, print its sum, min, and max
                System.out.println(" | Sum: " + sum + ", Min: " + min + ", Max: " + max);
                ts++; // Increment the total subarray count
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);
    }
    
    // ----------------------------CALCULATE MAX SUBARRAY------------------------------
    // public static void maxSubarraySum(int numbers[]){
    // int currSum=0;
    // int maxSum=Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // currSum=0;
    // for (int k = start; k <= end; k++) { //subarray sum
    // currSum+=numbers[k];
    // }
    // System.out.println(currSum);
    // if(maxSum<currSum){
    // maxSum=currSum;
    // }
    // }
    // }
    // System.out.println(" max sum="+ maxSum);
    // System.out.println();
    // }
    // -------------------------------- OPTIMIZED WAY TO CALULATE THE SUM OF
    // SUbARRAY----------------------
    // ------------------------kadane's algorithm---------------
    // public static void kadanes(int numbers[]){
    // int ms=Integer.MIN_VALUE;
    // int cs=0;
    // for(int i=0; i<numbers.length;i++){
    // cs=cs+ numbers[i];
    // if(cs<0){
    // cs=0;
    // }
    // ms=Math.max(cs,ms);
    // }
    // System.out.println("Our max subarray sum="+ ms);
    // }
    // -------------------TRAPPING RAINWATER-------------
    // public static int trappedRainWater(int height[]) {
    // int n = height.length;
    // int leftMax[] = new int[n];
    // leftMax[0] = height[0];

    // for (int i = 1; i < n; i++) {
    // leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    // }

    // int rightMax[] = new int[n];
    // rightMax[n - 1] = height[n - 1];

    // for (int i = n - 2; i >= 0; i--) {
    // rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    // }

    // int trappedWater = 0;
    // for (int i = 0; i < n; i++) {
    // int waterLevel = Math.min(leftMax[i], rightMax[i]);
    // trappedWater += waterLevel - height[i];
    // }

    // return trappedWater;
    // }
    // ------------------BUY AND SELL STOCKS--------
    // public static int buyAndSellStocks(int prices[]) {
    // int buyprices = Integer.MAX_VALUE;
    // int maxprofit = 0;
    // for (int i = 0; i < prices.length; i++) {
    // if (buyprices < prices[i]) {
    // int profit = prices[i] - buyprices;
    // maxprofit = Math.max(maxprofit, profit);
    // } else {
    // buyprices = prices[i];
    // }
    // return maxprofit;
    // }
    // }

    public static void main(String[] args) {
        // // Creating an array
        // int marks[]=new int[50];
        // // different way to create an array when we have known about array numbers or
        // elements
        // int numbers[]={1,2,3}; //size of this array is 3 because its contains 3
        // numbers
        // string fruits[]={"apple","banana","mango"};//size of this array is also 3
        // ,because its contains 3 elements
        // // --------------------------
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("phy :" +marks[0]);
        // System.out.println("chem :" +marks[1]);
        // System.out.println("maths:" +marks[2]);
        // // updated:1
        // marks[2]=100;
        // System.out.println("maths:" +marks[2]);
        // // updated:2
        // marks[2]=marks[2]+1;
        // System.out.println( "maths:" + marks[2]);
        // // To calculate % of marks
        // int percentage = (marks[0]+ marks[1]+ marks[2])/3;
        // System.out.println("Percentage: "+ percentage+"%");

        // // -------To find the size of array(Length of array)we use(.length)

        // System.out.println("Length of array :" + marks.length);

        // int marks[] = { 97, 98, 99 };
        // int nonchangable = 5;
        // update(marks, nonchangable);

        // System.out.println(nonchangable);
        // // print our marks
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i] + " ");
        // }

        // //------------LINEAR SEARCH----------------
        // // Q1
        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=10;
        // int index= linearSearch(numbers, key);
        // if(index==-1){
        // System.out.println(" KEY IS NOT FOUND");
        // }
        // else{
        // System.out.println("key is at index :"+ index);
        // }
        // //Q2
        // String menu[]={"dosa","pizza","burger","coffe"};
        // String key="burger";
        // int index= linearSearch(menu, key);
        // if(index==-1){
        // System.out.println("not found");

        // }
        // else{
        // System.out.println("Key is at index:"+ index);
        // }
        // //Q3 write a program to find largest number in an Array
        // int numbers[] = { 1, 2, 16, 23, 5, 10 };
        // System.out.println("Largest value is :" + getLargest(numbers));
        // // Q4 write a program to find Smallest number in an Array
        // int numbers[] = { 1, 2, 6, 3, 5, 10 };
        // System.out.println("Smallest value is :" + getSmallest(numbers));
        // // -----------------BINARY SEARCH-----------------
        // // Q1
        // int numbers[]={2,4,6,8,10,12,14};
        // int key=10;
        // System.out.println("index for key is :" + binarySearch(numbers, key));
        // //----------------ARRAY's REVERSE-------------------
        // int numbers[] = { 1, 2, 3, 4, 5 };
        // reverse(numbers);
        // System.out.println("Reversed array:");
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // // ------------Print all pairs of array------------------
        // int numbers[]={2,4,6,8,10};
        // printPairs(numbers);
        // ---------Print Subarrays---------------------
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
        // --------------------MAX SUBARRAY---------------------------------
        // int numbers[] = { 2, 4, 6, 8, 10 };

        // maxSubarraySum(numbers);
        // ----------------------------KADANES ALGORITHM-------------------------
        // int numbers[]={-2,-3,4,-1,-2,5,-3};
        // kadanes(numbers);
        // --------------TRAPPING RAINWATER------------
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println(trappedRainWater(height));
        // ------------------BUY AND SELL STOCKS--------
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(buyAndSellStocks(prices));
        // }
    }
}