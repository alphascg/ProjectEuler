package mll.Archive;

public abstract class Problem009 {
    public static int calculate(){
        int target = 1000;
        for (int a = 1; a < target/2; a++) {
            for (int b = 1; b < target/2; b++) {
                for (int c = 1; c < target; c++) {
                    if( (a*a)+(b*b)==(c*c) && (a+b+c==target) ){
                        return a*b*c;
                    }
                }
            }
        }
        return 0;
    }
}
