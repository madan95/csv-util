import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.sun.rowset.internal.Row;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public String[] getNewLineArray(String stringWithNewline){
       return stringWithNewline.split("\\r?\\n");
    }

    public String[] getSpacedLineArray(String stringWithSpace){
        return stringWithSpace.split("\\s+");
    }

    public static void main(String [] args) throws IOException, WriteException {

        Main util = new Main();

        CSVReader reader = new CSVReader(new FileReader("input.csv"));
        CSVWriter writer = new CSVWriter(new FileWriter("output.csv", true));

        List<String[]> allRows = reader.readAll();

        for(String[] row : allRows){
            String lines[] = util.getNewLineArray(row[7]);
            String name="", artist="", year="", medium="", height="", width="", unit="", dimensions = "";

            dimensions = "";
            if(lines.length == 5) {
                name = lines[0];
                artist  = lines[1];
                year = lines[2];
                medium = lines[3];
                dimensions = lines[4];

                String tempDimensions[] = util.getSpacedLineArray(lines[4]);
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


    }
}
