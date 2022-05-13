package Test;

import java.util.ArrayList;
import java.util.List;

public class TestDAO {

    private static List<TestDB> testDBList;
    private int id;
    {
        testDBList = new ArrayList<>();
        testDBList.add(new TestDB(++id,18,"Tom"));
        testDBList.add(new TestDB(++id,22,"Felix"));
        testDBList.add(new TestDB(++id,24,"Alex"));
        testDBList.add(new TestDB(++id,30,"Ded"));
    }
    public List<TestDB> index() {
        return testDBList;
    }

    public static TestDB show (int id){
        TestDB testDB = null;
        for (TestDB testDB2: testDBList) {
            if(testDB2.getId() == id){
                testDB = testDB2;
                continue;
            }
        }return testDB;
    }
}
