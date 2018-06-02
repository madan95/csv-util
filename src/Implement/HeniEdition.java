package Implement;


import Core.CSVManipulator;
import Utils.Helper;

import java.util.ArrayList;
import java.util.List;

public class HeniEdition extends CSVManipulator {


    private List<String> edition_group = new ArrayList<>();

/*********************************************************************************************/
/***************************READER HOOK*****************************************************/


    @Override
    public void hookReader() {
        super.hookReader();
        System.out.println(edition_group);
    }

    @Override
    public void hookReadRow(String[] row){
        super.hookReadRow(row);
    }

    @Override
    public void hookReadCell(String cell){
        super.hookReadCell(cell);
       /* if(this.reader.getCurrentColumnName().equalsIgnoreCase("id")
                && this.reader.getCurrentRowNumber()!= 0){
            System.out.println(cell);
        }*/
       if(this.reader.getCurrentColumnName().equalsIgnoreCase("Meta: edition_group")
               && this.reader.getCurrentRowNumber() != 0 ){

       }
    }


/*********************************************************************************************/
/***************************WRITER HOOK*****************************************************/


    @Override
    public void hookWriter() {
        super.hookWriter();
        this.writer.setOutputColumns(new String[]{"ID", "Type", "Name", "Parent"});
        for(String variable: this.edition_group){
            System.out.println(variable);
            this.writer.getOutputAllRows().add(new String[]{variable, "variable"});
        }
        this.writer.writeOutput();
    }

    @Override
    public void hookWriteCell(String cell) {
        super.hookReadCell(cell);
    }

    @Override
    public void hookWriteRow(String[] row) {
        super.hookReadRow(row);
    }


/*
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


*/

}
