package Implement;

import com.opencsv.bean.CsvBindByName;

public class Output {
    private String id;
    private String type;
    private String sku;
    private String name;
    private String published;
    private String isFeatured;
    private String visibilityInCatalogue;
    private String shortDescription;
    private String description;
    private String dateSalePriceStarts;
    private String dateSalePriceEnds;
    private String taxStatus;
    private String taxClass;
    private String inStock;
    private String stock;
    private String backordersAllowed;
    private String soldIndividually;
    private String weight;
    private String length;
    private String width;
    private String height;
    private String allowCustomerReviews;
    private String purchaseNote;
    private String salePrice;
    private String regularPrice;
    private String categories;
    private String tags;
    private String shippingClass;
    private String images;
    private String downloadLimit;
    private String downloadExpiryDays;
    private String parent;
    private String groupedProducts;
    private String upsells;
    private String crossSells;
    private String externalUrl;
    private String buttonText;
    private String position;
    private String attribute1Name;
    private String attribute1Value;
    private String attribute1Visible;
    private String attribute1Global;
    private String metaProductVariationImagesGallery;


    public Output(){

    }

    public Output(     String id,
                       String type,
                       String sku,
                       String name,
                       String published,
                       String isFeatured,
                       String visibilityInCatalogue,
                       String shortDescription,
                       String description,
                       String dateSalePriceStarts,
                       String dateSalePriceEnds,
                       String taxStatus,
                       String taxClass,
                       String inStock,
                       String stock,
                       String backordersAllowed,
                       String soldIndividually,
                       String weight,
                       String length,
                       String width,
                       String height,
                       String allowCustomerReviews,
                       String purchaseNote,
                       String salePrice,
                       String regularPrice,
                       String categories,
                       String tags,
                       String shippingClass,
                       String images,
                       String downloadLimit,
                       String downloadExpiryDays,
                       String parent,
                       String groupedProducts,
                       String upsells,
                       String crossSells,
                       String externalUrl,
                       String buttonText,
                       String position,
                       String attribute1Name,
                       String attribute1Value,
                       String attribute1Visible,
                       String attribute1Global,
                       String metaProductVariationImagesGallery) {

        this.id = 	id;
        this.type = 	type;
        this.sku = 	sku;
        this.name = 	name;
        this.published = 	published;
        this.isFeatured = 	isFeatured;
        this.visibilityInCatalogue = 	visibilityInCatalogue;
        this.shortDescription = 	shortDescription;
        this.description = 	description;
        this.dateSalePriceStarts = 	dateSalePriceStarts;
        this.dateSalePriceEnds = 	dateSalePriceEnds;
        this.taxStatus = 	taxStatus;
        this.taxClass = 	taxClass;
        this.inStock = 	inStock;
        this.stock = 	stock;
        this.backordersAllowed = 	backordersAllowed;
        this.soldIndividually = 	soldIndividually;
        this.weight = 	weight;
        this.length = 	length;
        this.width = 	width;
        this.height = 	height;
        this.allowCustomerReviews = 	allowCustomerReviews;
        this.purchaseNote = 	purchaseNote;
        this.salePrice = 	salePrice;
        this.regularPrice = 	regularPrice;
        this.categories = 	categories;
        this.tags = 	tags;
        this.shippingClass = 	shippingClass;
        this.images = 	images;
        this.downloadLimit = 	downloadLimit;
        this.downloadExpiryDays = 	downloadExpiryDays;
        this.parent = 	parent;
        this.groupedProducts = 	groupedProducts;
        this.upsells = 	upsells;
        this.crossSells = 	crossSells;
        this.externalUrl = 	externalUrl;
        this.buttonText = 	buttonText;
        this.position = 	position;
        this.attribute1Name = 	attribute1Name;
        this.attribute1Value = 	attribute1Value;
        this.attribute1Visible = 	attribute1Visible;
        this.attribute1Global = 	attribute1Global;
        this.metaProductVariationImagesGallery = 	metaProductVariationImagesGallery;



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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
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

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateSalePriceStarts() {
        return dateSalePriceStarts;
    }

    public void setDateSalePriceStarts(String dateSalePriceStarts) {
        this.dateSalePriceStarts = dateSalePriceStarts;
    }

    public String getDateSalePriceEnds() {
        return dateSalePriceEnds;
    }

    public void setDateSalePriceEnds(String dateSalePriceEnds) {
        this.dateSalePriceEnds = dateSalePriceEnds;
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

    public String getAllowCustomerReviews() {
        return allowCustomerReviews;
    }

    public void setAllowCustomerReviews(String allowCustomerReviews) {
        this.allowCustomerReviews = allowCustomerReviews;
    }

    public String getPurchaseNote() {
        return purchaseNote;
    }

    public void setPurchaseNote(String purchaseNote) {
        this.purchaseNote = purchaseNote;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getShippingClass() {
        return shippingClass;
    }

    public void setShippingClass(String shippingClass) {
        this.shippingClass = shippingClass;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDownloadLimit() {
        return downloadLimit;
    }

    public void setDownloadLimit(String downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    public String getDownloadExpiryDays() {
        return downloadExpiryDays;
    }

    public void setDownloadExpiryDays(String downloadExpiryDays) {
        this.downloadExpiryDays = downloadExpiryDays;
    }

    public String getGroupedProducts() {
        return groupedProducts;
    }

    public void setGroupedProducts(String groupedProducts) {
        this.groupedProducts = groupedProducts;
    }

    public String getUpsells() {
        return upsells;
    }

    public void setUpsells(String upsells) {
        this.upsells = upsells;
    }

    public String getCrossSells() {
        return crossSells;
    }

    public void setCrossSells(String crossSells) {
        this.crossSells = crossSells;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAttribute1Name() {
        return attribute1Name;
    }

    public void setAttribute1Name(String attribute1Name) {
        this.attribute1Name = attribute1Name;
    }

    public String getAttribute1Value() {
        return attribute1Value;
    }

    public void setAttribute1Value(String attribute1Value) {
        this.attribute1Value = attribute1Value;
    }

    public String getAttribute1Visible() {
        return attribute1Visible;
    }

    public void setAttribute1Visible(String attribute1Visible) {
        this.attribute1Visible = attribute1Visible;
    }

    public String getAttribute1Global() {
        return attribute1Global;
    }

    public void setAttribute1Global(String attribute1Global) {
        this.attribute1Global = attribute1Global;
    }

    public String getMetaProductVariationImagesGallery() {
        return metaProductVariationImagesGallery;
    }

    public void setMetaProductVariationImagesGallery(String metaProductVariationImagesGallery) {
        this.metaProductVariationImagesGallery = metaProductVariationImagesGallery;
    }
}
