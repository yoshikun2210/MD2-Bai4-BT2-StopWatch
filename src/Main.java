import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
//        long start = System.currentTimeMillis();
        int[] array=new int[100000];
        for(int i=0;i<100000;i++){
            array[i]=(int) (Math.random()*10000)+1;
        }

        System.out.println(Arrays.toString(array));
        for (int i=0;i<100000;i++){
            for(int j=i+1;j<100000;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        stopWatch.stop();
        System.out.println("Thời gian trôi qua: " +stopWatch.getElapsedTime());
    }


}