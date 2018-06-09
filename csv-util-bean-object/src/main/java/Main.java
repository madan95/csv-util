import Implement.Input;
import Implement.Output;
import com.opencsv.bean.*;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private String height;
    private String width;
    private String[] descriptionArray;

    public void manipulate(Output output, Input input){
        setDimension(input);
        output.setHeight(this.height);
        output.setWidth(this.width);
    }

    public boolean setDimension(Input input){
        this.height = "";
        this.width = "";
        List<String> dimension = new ArrayList<>();
        Pattern pattern_SpaceXSpace = Pattern.compile("\\s[×x]\\s");
        Pattern pattern_Number = Pattern.compile("-?\\d+");
        Matcher matcher_SpaceXSpace;
        Matcher matcher_Number;

        this.descriptionArray = input.getShortDescription().split(",");
        for(String current: this.descriptionArray){
            matcher_SpaceXSpace = pattern_SpaceXSpace.matcher(current);
            if(matcher_SpaceXSpace.find()){
                matcher_Number = pattern_Number.matcher(current);
                while(matcher_Number.find()){
                    dimension.add(matcher_Number.group());
                }
                if(dimension.size()>0){
                    for(int i=0; i<dimension.size(); i++){
                        if(i==0){
                            this.height=dimension.get(0);
                        }else if(i==1){
                            this.width=dimension.get(1);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){
        try {
            Main app = new Main();

            //Read
            Reader reader = Files.newBufferedReader(Paths.get("input.csv"));
            CsvToBean<Input> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Input.class)
                    .build();

            Iterator<Input> inputList = csvToBean.iterator();
            List<Output> outputList = new ArrayList<>();
            List<Output> variable = new ArrayList<>();
            Map<String, Output> outputVariable = new LinkedHashMap<>();


/*******************************************MANIPULATE**********************************************/




            while (inputList.hasNext()) {
                Input input = inputList.next();
                Output output = new Output();

                output.setId(input.getId());
                output.setType("variation");
                output.setName(input.getEdition());
                output.setPublished(input.getPublished());
                output.setIsFeatured(input.getIsFeatured());
                output.setVisibilityInCatalogue(input.getVisibilityInCatalogue());
                output.setDescription(input.getShortDescription());
                output.setTaxStatus(input.getTaxStatus());
                output.setTaxClass(input.getTaxClass());
                output.setInStock(input.getInStock());
                output.setStock(input.getStock());
                output.setBackordersAllowed(input.getBackordersAllowed());
                output.setSoldIndividually(input.getSoldIndividually());
                output.setAllowCustomerReviews(input.getAllowCustomerReviews());
                output.setRegularPrice(input.getRegularPrice());
                output.setCategories(input.getCategories());
                output.setImages(input.getImages());
                output.setPosition(input.getPosition());
                output.setAttribute1Name(input.getNumber());
                output.setParent("id:"+input.getEditionGroup());


                app.manipulate(output, input);

                if(!outputVariable.containsKey(input.getGroup())){
                    Output output_variable = new Output();
                    output_variable.setType("variable");
                    output_variable.setId(input.getEditionGroup());
                    output_variable.setName(input.getEdition());
                    outputVariable.put(input.getGroup(), output_variable);
                }

                outputList.add(output);

            }

            for(String key: outputVariable.keySet()){
                System.out.println(key);
            }

            for(Output value: outputVariable.values()){
                variable.add(value);
            }





/***************************************************************************************************/

            //Write

            Writer writer = Files.newBufferedWriter(Paths.get("output.csv"));
            StatefulBeanToCsv<Output> beanToCsv = new StatefulBeanToCsvBuilder<Output>(writer)
                    .build();

            beanToCsv.write(new Output(
                    "id",
                    "type",
                    "sku",
                    "name",
                    "published",
                    "isFeatured",
                    "visibilityInCatalogue",
                    "shortDescription",
                    "description",
                    "dateSalePriceStarts",
                    "dateSalePriceEnds",
                    "taxStatus",
                    "taxClass",
                    "inStock",
                    "stock",
                    "backordersAllowed",
                    "soldIndividually",
                    "weight",
                    "length",
                    "width",
                    "height",
                    "allowCustomerReviews",
                    "purchaseNote",
                    "salePrice",
                    "regularPrice",
                    "categories",
                    "tags",
                    "shippingClass",
                    "images",
                    "downloadLimit",
                    "downloadExpiryDays",
                    "parent",
                    "groupedProducts",
                    "upsells",
                    "crossSells",
                    "externalUrl",
                    "buttonText",
                    "position",
                    "attribute1Name",
                    "attribute1Value",
                    "attribute1Visible",
                    "attribute1Global",
                    "metaProductVariationImagesGallery"
            ));
            beanToCsv.write(outputList);
            beanToCsv.write(variable);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
