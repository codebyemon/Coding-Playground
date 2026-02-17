public class Array6 {
    public static void main(String[]args){
        // 2D array = An array where each element is an array
        //            useful for storing a matrix of data
        // String[] fruits = {"apple","orange","banana"};
        // String[] vegetables = {"potato", "onion","carrot"};
        // String[] meats = {"chicken","beef","fish"};

        //String[][] groceries ={fruits,vegetables,meats}; or
        String[][] groceries ={{"apple","orange","banana"},
                               {"potato", "onion","carrot"},
                               {"chicken","beef","fish"}};

        groceries[0][1]="pineapple";
        groceries[1][0]="celery";


        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
