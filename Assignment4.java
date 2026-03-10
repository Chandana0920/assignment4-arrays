class Assignment4 {
  public static int[] removeConsecutiveDuplicates(int[] arr){
    int count = 1;
    for(int i = 1; i < arr.length; i++){
      if(arr[i] != arr[i-1]){
        count++;
      }
    }
    int[] result = new int[count];
    result[0] = arr[0];
    int index = 1;
    for(int i = 1; i < arr.length; i++){
      if(arr[i] != arr[i-1]){
        result[index] = arr[i];
        index++;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] arr = {1,1,2,2,2,3,4,4,5};
    int[] result = removeConsecutiveDuplicates(arr);
    for(int i = 0; i < result.length; i++){
      System.out.println(result[i]);
    }
  }
}
