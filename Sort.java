class HelloWorld {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int [] {3, 2, 6, 1, 5};
        int s;
        int l;
        for (int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                s = numbers[i];
                l = numbers[j];
                if(s<l) {
                    int temp = numbers[i];
                    numbers [i] = numbers[j];
                    numbers[j] = temp;
                }
                
            }
        }
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
