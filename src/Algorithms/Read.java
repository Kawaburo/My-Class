package Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {

    public static ArrayList arrayList(String destFile) throws FileNotFoundException {
        ArrayList arrayList = new ArrayList();
        File file = new File(destFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            arrayList.add(scanner.hasNext());
        }
        scanner.close();
        return arrayList;
    }



}