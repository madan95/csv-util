package Implement;

import com.opencsv.bean.CsvBindByName;

public class Input {
    @CsvBindByName(column = "id")
    private String id;
    @CsvBindByName(column = "Edition")
    private String edition;
    @CsvBindByName(column = "Published")
    private String published;
    @CsvBindByName(column = "Is featured?")
    private String isFeatured;
    @CsvBindByName(column = "Visibility in catalogue" )
    private String visibilityInCatalogue;
    @CsvBindByName(column = "Tax status")
    private String taxStatus;
    @CsvBindByName(column = "Tax class")
    private String taxClass;
    @CsvBindByName(column = "In stock?")
    private String inStock;
    @CsvBindByName(column = "Stock")
    private String stock;
    @CsvBindByName(column = "Backorders allowed?")
    private String backordersAllowed;
    @CsvBindByName(column = "Sold individually")
    private String soldIndividually;
    private String weight;
    private String length;
    private String width;
    private String height;
    @CsvBindByName(column = "Allow customer reviews?")
    private String allowCustomerReviews;
    @CsvBindByName(column = "Regular price")
    private String regularPrice;
    @CsvBindByName(column = "Categories")
    private String categories;
    @CsvBindByName(column = "Images")
    private String images;
    private String parent;
    @CsvBindByName(column = "Position")
    private String position;
    @CsvBindByName(column = "Number")
    private String number;
    @CsvBindByName(column = "Short description")
    private String shortDescription;
    @CsvBindByName(column = "Group")
    private String group;
    @CsvBindByName(column = "Meta: edition_group")
    private String editionGroup;

    public Input() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
    }

    public String getVisibilityInCatalogue() {
        return visibilityInCatalogue;
    }

    public void setVisibilityInCatalogue(String visibilityInCatalogue) {
        this.visibilityInCatalogue = visibilityInCatalogue;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getBackordersAllowed() {
        return backordersAllowed;
    }

    public void setBackordersAllowed(String backordersAllowed) {
        this.backordersAllowed = backordersAllowed;
    }

    public String getSoldIndividually() {
        return soldIndividually;
    }

    public void setSoldIndividually(String soldIndividually) {
        this.soldIndividually = soldIndividually;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAllowCustomerReviews() {
        return allowCustomerReviews;
    }

    public void setAllowCustomerReviews(String allowCustomerReviews) {
        this.allowCustomerReviews = allowCustomerReviews;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String description) {
        this.shortDescription = description;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEditionGroup() {
        return editionGroup;
    }

    public void setEditionGroup(String editionGroup) {
        this.editionGroup = editionGroup;
    }
}

