package Core;

import java.util.List;

public class CSVManipulator{
    protected Reader reader;
    protected Writer writer;

    public void setReader(String inputFileName){
        this.reader = new Reader(inputFileName);
        hookReader();
    }

    public void setWriter(String outputFileName){
        this.writer = new Writer(outputFileName);
        hookWriter();
    }

    /*********************************************************************************************/

    //READER
    public void loopThroughReaderCSV(){
        List<String[]> allRows = this.reader.getInputAllRows();
        for(int j=0; j<allRows.size(); j++){
            this.reader.setCurrentRowNumber(j);
            hookReadRow(allRows.get(j));
            for(int i=0; i<allRows.get(j).length; i++){
                this.reader.setCurrentColumnName(this.reader.getInputColumns().get(i));
                hookReadCell(allRows.get(j)[i]);
            }
        }
    }

    public void hookReader() {
        loopThroughReaderCSV();
    }

    public void hookReadRow(String[] row){
    }

    public void hookReadCell(String cell){
    }

    /*********************************************************************************************/

    //WRITER
    public void loopThroughWriterCSV(){
        List<String[]> allRows = this.writer.getOutputAllRows();
        for(int j=0; j<allRows.size(); j++){
            this.writer.setCurrentRowNumber(j);
            hookWriteRow(allRows.get(j));
            for(int i=0; i<allRows.get(j).length; i++){
                this.writer.setCurrentColumnName(this.writer.getOutputColumns().get(i));
                hookWriteCell(allRows.get(j)[i]);
            }
        }
    }

    public void hookWriter() {
    }

    public void hookWriteCell(String cell) {
    }

    public void hookWriteRow(String[] row) {
    }
/*********************************************************************************************/


}