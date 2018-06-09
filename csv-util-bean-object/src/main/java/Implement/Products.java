package Implement;

import com.opencsv.bean.CsvBindByName;

public class Products {
    private String id;
    private String type;
    private String name;
    private String parent;

    public Products(){

    }

    public Products(String id, String type, String name, String parent){
        this.id = id;
        this.name = name;
        this.type = type;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
