import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        String path = "src/main/resources";
        Calculator calculator = new Calculator() ;
        String fileContent = calculator.getContentOfFile(path+"/Test_1.txt").toString();
        ArrayList<String> arr  = calculator.getOperationsFromContent(fileContent);
        int a = calculator.getNumberToApply(arr);
        int result = calculator.getResult(arr, a);
        System.out.println(result);

    }
}