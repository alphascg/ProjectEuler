package mll.Archive;

public abstract class Problem001 {
    public static int calculate(){
        int sum = 0;
        for(int i=3;i<1000;i+=1){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}
