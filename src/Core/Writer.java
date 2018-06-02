package Core;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Writer {
    private CSVWriter writer;
    private List<String[]> outputAllRows;
    private List<String> outputColumns;
    private int currentRowNumber;
    private String currentColumnName;

    public Writer(String output){
        try {
            this.writer = new CSVWriter(new FileWriter(output));
            this.outputAllRows = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOutputColumns(String[] outputColumns){
        this.outputColumns = Arrays.asList(outputColumns);
        this.outputAllRows.add(outputColumns);
    }

    public void writeOutput(){
        this.writer.writeAll(this.outputAllRows);
        try {
            this.writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> getOutputAllRows() {
        return this.outputAllRows;
    }

    public void setCurrentRowNumber(int currentRowNumber) {
        this.currentRowNumber = currentRowNumber;
    }

    public void setCurrentColumnName(String currentColumnName) {
        this.currentColumnName = currentColumnName;
    }

    public List<String>  getOutputColumns() {
        return this.outputColumns;
    }
}
