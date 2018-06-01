package Implement;


import Core.CSVManipulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeniEdition extends CSVManipulator {

    @Override
    // hooks into loop of all rows of input read csv so we can use our method here to manipulate with rows data
    public void hookReadLoopRow(String[] row){
        super.hookReadLoopRow(row);
    }

    @Override
    //hooks into loop of each cell in the row
    public void hookReadLoopCell(String cell){
        super.hookReadLoopCell(cell);
    }



    //hooks while writing
    @Override
    public void hookWriteLoopRow(String[] row){
        super.hookWriteLoopRow(row);
    }

    public void hookWriteLoopCell(String cell){
        super.hookWriteLoopCell(cell);
    }





    //set the outputcsv header
    public void setOutputHeader(String[] outputHeader){
        this.outputHeader = Arrays.asList(outputHeader);
        this.createStringArrayRowForOutput(outputHeader);
    }

    // add rows to the writeRows  whicch will be used to write output csv
    public void createStringArrayRowForOutput(String[] cells){
        this.writeRows.add(cells);
    }




}
