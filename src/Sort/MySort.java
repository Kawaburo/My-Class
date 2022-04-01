package Sort;

public class MySort {

    public static int [] bobbleSort(int [] bobbleSort){
        boolean flag = false;
        while (!flag){
            flag=true;
            for (int i = 0; i < bobbleSort.length -1; i++) {
                if(bobbleSort[i]>bobbleSort[i+1]){
                    flag=false;
                    int buf = bobbleSort[i];
                    bobbleSort[i]=bobbleSort[i+1];
                    bobbleSort[i+1]=buf;
                }
            }
        }
        return  bobbleSort;
    }
}
