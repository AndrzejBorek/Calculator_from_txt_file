import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Calculator {



    public String getContentOfFile (String path) {
        try (FileReader fr=new FileReader(path); BufferedReader br=new BufferedReader(fr))
        {

            StringBuilder sb=new StringBuilder();
            String line;
            String lastLine = "";
            while((line=br.readLine())!=null)
            {
                lastLine = line;
                sb.append(line);
                sb.append(" ");
            }
            if (!lastLine.contains("APPLY")) {
                throw new Error("LAST LINE HAS TO CONTAIN WORD APPLY");
            }

            fr.close();
            return sb.toString();
        }
        catch(IOException e)
        {
            throw new Error(e);
        }

    }

    public ArrayList<String> getOperationsFromContent (String s) {

        String[] arr = s.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        if (!list.contains("APPLY")) {
            throw new Error("DOESNT CONTAIN APPLY VALUE");
        }
        return list;
    }

    public int getNumberToApply (ArrayList<String> list) {
        return Integer.parseInt(list.get(list.size()-1));
    }


    public int getResult(ArrayList<String> list, int applier) {

        // If there is only command APPLY x then method return x
        list.remove(list.size()-1);
        list.remove(list.size()-1);



        for (int i = 0; i < list.size(); i = i+2) {

            if (list.get(i).contentEquals("MULTIPLY")) {
                applier =  applier * Integer.parseInt(list.get(i+1));
            }
            else if(list.get(i).contentEquals("ADD")) {
                applier = applier + Integer.parseInt(list.get(i+1));
            }
            else if (list.get(i).contentEquals("SUBTRACT")) {
                applier = applier - Integer.parseInt(list.get(i+1));
            }
        }
        return applier;
    }


}
