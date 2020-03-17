public class loop_practice{
    public static void main(String[] args) {
        int row,column;
        for(row = 1 ; row <= 9 ; row++){
            for(column = 1 ; column <= 9 ; column++){
                System.out.print(row + "*" + column + "=" + row*column);
                if(column < 9){
                    System.out.print("\t");
                }
                else{
                    System.out.print("\n");
                }
            }
        }
    }
}