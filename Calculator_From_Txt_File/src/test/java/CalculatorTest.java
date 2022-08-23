import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;



class CalculatorTest {

    String path = "src/main/resources";


    @Test
    void test_getContentOfFile() {
        Calculator calc = new Calculator();
        String content = calc.getContentOfFile(path+"/Test_getContentOfFile.txt");
        assertEquals("APPLY 1 ", content);
    }

    @Test
    void test_getOperationsFromContent() {
        Calculator calc = new Calculator();
        String content = calc.getContentOfFile(path+"/Test_getContentOfFile.txt");
        ArrayList <String> test = new ArrayList<>();
        test.add("APPLY");
        test.add("1");
        ArrayList<String> result = calc.getOperationsFromContent(content);
        assertEquals(test, result);
    }


    @Test
    void test_getNumberToApply () {
        Calculator calc = new Calculator();
        String content = calc.getContentOfFile(path+"/Test_getNumberToApply.txt");
        ArrayList<String> list = calc.getOperationsFromContent(content);
        int number = calc.getNumberToApply(list);
        assertEquals(number, 1);
    }

    @Test
    void test_getResult() {

        Calculator calc = new Calculator();
        String content = calc.getContentOfFile(path+"/Test_getResult.txt");
        ArrayList<String> list = calc.getOperationsFromContent(content);
        int number = calc.getNumberToApply(list);
        int result = calc.getResult(list, number);
        assertEquals(3, result);
    }

}
