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
    public static int [] bobbleSortDouble(int [] bobbleSortDouble){
        boolean flag = false;
        while (!flag){
            flag=true;
            for (int i = 0; i < bobbleSortDouble.length -1; i++) {
                if(bobbleSortDouble[i]>bobbleSortDouble[i+1]){
                    flag=false;
                    int buf = bobbleSortDouble[i];
                    bobbleSortDouble[i]=bobbleSortDouble[i+1];
                    bobbleSortDouble[i+1]=buf;
                }
            }
            for (int i = bobbleSortDouble.length+1; i == 0; i--) {
                if(bobbleSortDouble[i]>bobbleSortDouble[i+1]){
                    flag=false;
                    int buf = bobbleSortDouble[i-1];
                    bobbleSortDouble[i-1]=bobbleSortDouble[i];
                    bobbleSortDouble[i-1]=buf;
                }
            }
        }
        return  bobbleSortDouble;
    }
}
