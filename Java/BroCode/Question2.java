public class Question2 {
    public static void main(String[]args){
        int[] n = {35,12,78,4,66};
        MaxFinder mf = new MaxFinder();
        System.out.println(mf.findMax(n));

    }
}


interface Finder{
    int findMax(int[] num);
}

class MaxFinder implements Finder{
    public int findMax(int[] num){
        if(num == null || num.length == 0){
            return 0;
        }
        int max = num[0];
        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }

        }
        return max;
    }
}