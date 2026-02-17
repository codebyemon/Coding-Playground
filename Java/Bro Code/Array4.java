public class Array4 {
    public static void main(String[]args){
        int[] num = {1,9,2,8,3,5,4};
        //String[] fruits = {"apple","orange","banana"};
        int target = 2;
        //String target = "orange";
        boolean isFound = false;
        for(int i=0;i<num.length;i++){
            if(target==num[i]){
                System.out.println("Element found at index: "+i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array.");
        }
    }
}
