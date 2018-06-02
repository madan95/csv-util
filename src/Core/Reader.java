package Core;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Reader {
    private CSVReader reader;
    private List<String[]> inputAllRows;
    private List<String> inputColumns;
    private String currentColumnName;
    private int currentRowNumber;

    public Reader(String inputFileName){
        try {
            this.reader = new CSVReader(new FileReader(inputFileName));
            setInputAllRows();
            setInputColumns();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setInputAllRows(){
        try {
            this.inputAllRows = this.reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> getInputAllRows(){
        return this.inputAllRows;
    }

    public void setInputColumns(){
        this.inputColumns = Arrays.asList(this.inputAllRows.get(0));
    }

    public List<String> getInputColumns(){
        return this.inputColumns;
    }

    public String getCurrentColumnName(){
        return this.currentColumnName;
    }

    public void setCurrentColumnName(String currentColumnName){
        this.currentColumnName = currentColumnName;
    }

    public void setCurrentRowNumber(int currentRowNUmber){
        this.currentRowNumber = currentRowNUmber;
    }

    public int getCurrentRowNumber(){
        return this.currentRowNumber;
    }


}
