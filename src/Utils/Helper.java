public class Helper {

    //create array of new line inside of cell
    public static String[] getNewLineArray(String stringWithNewline){
        return stringWithNewline.split("\\r?\\n");
    }

    //create array of spaced line inside of cell
    public static String[] getSpacedLineArray(String stringWithSpace){
        return stringWithSpace.split("\\s+");
    }

}
