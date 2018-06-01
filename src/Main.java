import Implement.HeniEdition;
import jxl.write.WriteException;

import java.io.*;

public class Main {

    public static void main(String [] args) throws IOException, WriteException {

        HeniEdition app = new HeniEdition();
        app.setReaderWriter("input.csv", "output.csv");


        app.setOutputHeader(new String[]{"ID", "SKU", "Published"});

        app.loopThroughReadAllRows();

   //     CSVReader reader = new CSVReader(new FileReader(Main.INPUT));
    //    CSVWriter writer = new CSVWriter(new FileWriter(Main.OUTPUT, true));

   //     List<String[]> allRows = reader.readAll();
/*
        for(String[] row : allRows){
            String lines[] = Helper.getNewLineArray(row[7]);
            String name="", artist="", year="", medium="", height="", width="", unit="", dimensions = "";

            dimensions = "";
            if(lines.length == 5) {
                name = lines[0];
                artist  = lines[1];
                year = lines[2];
                medium = lines[3];
                dimensions = lines[4];

                String tempDimensions[] = Helper.getSpacedLineArray(lines[4]);
                if(tempDimensions.length > 3) {
                    if(tempDimensions[1].equalsIgnoreCase("x")) {
                        height = tempDimensions[0];
                        width = tempDimensions[2];
                        unit = tempDimensions[3];
                    }
                }
            }
            row[20] = height;
            row[19] = width;
            System.out.println("New Row");
            System.out.println(Arrays.toString(row));
            writer.writeNext(row);

        }

        writer.close();


*/

    }
}
