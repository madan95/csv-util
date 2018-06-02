
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVManipulator2 {

    // Writing Output
    protected List<String[]> writeRows = new ArrayList<>();
    protected List<String> outputHeader = new ArrayList<>();
    public String currentWriteCellColumnName; //name of current cell in the loop

    // Instance of CSVReader to read write csv
    private CSVReader reader;
    private CSVWriter writer;

    // Variable to help manipulating csv while reading it
    public List<String[]> readAllRows; // list of all rows in the input csv
    public List<String> columnNames; // list of header/column value and there index
    public List<String> currentRowIndex; // save current row index/value to get it's header value
    public String currentReadCellColumnName; //name of current cell in the loop



    //set value for later uses
    public void setReaderWriter(String inputName, String outputName){
        try {
            this.reader = new CSVReader(new FileReader(inputName));
            this.writer = new CSVWriter(new FileWriter(outputName));

            this.readAllRows = this.reader.readAll(); //set all rows of input
            this.columnNames = Arrays.asList(this.readAllRows.get(0));     //set the header columns name for later use
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // loops thorugh all the rows of csv
    public void loopThroughReadAllRows(){
        for(String[] row : this.readAllRows){
            this.hookReadLoopRow(row); //priority to row loop hook
            this.loopThroughtRowStringArrayRead(row); // 2nd loop to each cell hook
        }
    }

    public void loopThroughtRowStringArrayRead(String[] row){
        for(int i=0; i<row.length; i++){
            this.currentReadCellColumnName = this.getReadColumnNameOfCell(i);
            this.hookReadLoopCell(row[i]);
        }
    }

    //get the column name of current cell
    public String getReadColumnNameOfCell(int i){
        return this.columnNames.get(i);
    }


    /*****************************************************************************************************************/

    //HOOKS override these methods in child class to manipulate for specific csv files

    // hooks into loop of all rows of input read csv so we can use our method here to manipulate with rows data
    public void hookReadLoopRow(String[] row){

    }

    //hooks into loop of each cell in the row
    public void hookReadLoopCell(String cell){
      /*  if(this.currentCellColumnName.equalsIgnoreCase("short description")){
            System.out.println(this.currentCellColumnName);
            System.out.println(cell);
        }
        */
    }



//hooks while writing

    // hooks into loop of all rows of input read csv so we can use our method here to manipulate with rows data
    public void hookWriteLoopRow(String[] row){

    }

    //hooks into loop of each cell in the row
    public void hookWriteLoopCell(String cell){
      /*  if(this.currentCellColumnName.equalsIgnoreCase("short description")){
            System.out.println(this.currentCellColumnName);
            System.out.println(cell);
        }
        */
    }

    /*****************************************************************************************************************/



    /****************w r i t e r **********************************/

    //write output with hooks
    public void writeOutput(){
        loopThroughWriteAllRows();
    }

    //write all the variable at once without further manipulation
    public void writeOutputAll(){
        for (String[] row: this.writeRows){
            for(String cell: row){
                System.out.println(cell);
            }
        }
        this.writer.writeAll(this.writeRows);
        try {
            this.writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    // loops thorugh all the rows of csv
    public void loopThroughWriteAllRows(){
        for(String[] row : this.writeRows){
            this.hookWriteLoopRow(row); //priority to row loop hook
            this.loopThroughtRowStringArrayWrite(row); // 2nd loop to each cell hook
        }
    }

    public void loopThroughtRowStringArrayWrite(String[] row){
        for(int i=0; i<row.length; i++){
            this.currentWriteCellColumnName = this.getWriteColumnNameOfCell(i);
            this.hookWriteLoopCell(row[i]);
        }
    }

    public String getWriteColumnNameOfCell(int i){
        return this.outputHeader.get(i);
    }


}
