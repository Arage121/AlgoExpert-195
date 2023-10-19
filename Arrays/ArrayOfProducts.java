public class ArrayOfProducts {
    //O(n) approach
    public int[] arrayOfProducts(int[] array) {
        int n = array.length;
        int[] leftProd = new int[n];
        int[] rightProd = new int[n];
        int left=1;
        for(int i=0;i<n;i++){
            leftProd[i]=left;
            left*=array[i];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            rightProd[i]=right;
            right*=array[i];
        }
        int[] output = new int[n];
        for(int i=0;i<n;i++){
            output[i] = leftProd[i]*rightProd[i];
        }
        return output;
    }
    //O(n^2) approach
    public int[] arrayOfProducts1(int[] array) {
        int n = array.length;
        int[] output = new int[n];
        int prod;
        for(int i=0;i<n;i++){
            prod = 1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    prod *= array[j];
                }
            }
            output[i] = prod;
        }
        return output;
    }
}
