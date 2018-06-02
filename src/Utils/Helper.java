package Utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Helper {

    //create array of new line inside of cell
    public static String[] getNewLineArray(String stringWithNewline){
        return stringWithNewline.split("\\r?\\n");
    }

    //create array of spaced line inside of cell
    public static String[] getSpacedLineArray(String stringWithSpace){
        return stringWithSpace.split("\\s+");
    }

    public static boolean checkIfInCollection(List<String> c, String value){
        for(String val : c){
            if(val.equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }

}
