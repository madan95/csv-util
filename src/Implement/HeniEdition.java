package Implement;


import Core.CSVManipulator;

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

}
