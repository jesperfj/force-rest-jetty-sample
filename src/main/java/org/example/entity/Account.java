
package org.example.entity;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonSetter;

import java.io.IOException;
import java.util.Map;

/**
 * Java model for the Force.com Account object.
 *
 **/
@JsonIgnoreProperties(ignoreUnknown=true)
public class Account extends java.lang.Object {

    public static final String KEY_PREFIX = "001";

	public static final ObjectMapper objectMapper = new ObjectMapper();
    
    protected Map<String,String> attributes;


    protected String id;
    protected boolean isDeleted;
    protected String masterRecord;
    protected String name;
    protected String type;
    protected String parent;
    protected String billingStreet;
    protected String billingCity;
    protected String billingState;
    protected String billingPostalCode;
    protected String billingCountry;
    protected String shippingStreet;
    protected String shippingCity;
    protected String shippingState;
    protected String shippingPostalCode;
    protected String shippingCountry;
    protected String phone;
    protected String fax;
    protected String accountNumber;
    protected String website;
    protected String sic;
    protected String industry;
    protected java.math.BigDecimal annualRevenue;
    protected int numberOfEmployees;
    protected String ownership;
    protected String tickerSymbol;
    protected String description;
    protected String rating;
    protected String site;
    protected String owner;
    protected java.util.Calendar createdDate;
    protected String createdBy;
    protected java.util.Calendar lastModifiedDate;
    protected String lastModifiedBy;
    protected java.util.Calendar systemModstamp;
    protected java.util.Date lastActivityDate;
    protected String jigsaw;
    protected String customerPriority;
    protected String sLA;
    protected String active;
    protected double numberofLocations;
    protected String upsellOpportunity;
    protected String sLASerialNumber;
    protected java.util.Date sLAExpirationDate;

    public static Account valueOf(String json) 
    	 throws JsonParseException, JsonMappingException, IOException {
        return objectMapper.readValue(json,Account.class);
    }

	public void setAttributes(Map<String,String> value) {
	    attributes = value;
	}
	
	public Map<String,String> getAttributes() {
	    return attributes;
	}    
    

    public String getId() {
        return this.id;
    }
    
    @JsonSetter(value="Id")
    public void setId(String id) {
        this.id = id;
    }
    
    public boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    @JsonSetter(value="IsDeleted")
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    public String getMasterRecord() {
        return this.masterRecord;
    }
    
    @JsonSetter(value="MasterRecordId")
    public void setMasterRecord(String masterRecord) {
        this.masterRecord = masterRecord;
    }
    
    public String getName() {
        return this.name;
    }
    
    @JsonSetter(value="Name")
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return this.type;
    }
    
    @JsonSetter(value="Type")
    public void setType(String type) {
        this.type = type;
    }
    
    public String getParent() {
        return this.parent;
    }
    
    @JsonSetter(value="ParentId")
    public void setParent(String parent) {
        this.parent = parent;
    }
    
    public String getBillingStreet() {
        return this.billingStreet;
    }
    
    @JsonSetter(value="BillingStreet")
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }
    
    public String getBillingCity() {
        return this.billingCity;
    }
    
    @JsonSetter(value="BillingCity")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }
    
    public String getBillingState() {
        return this.billingState;
    }
    
    @JsonSetter(value="BillingState")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }
    
    public String getBillingPostalCode() {
        return this.billingPostalCode;
    }
    
    @JsonSetter(value="BillingPostalCode")
    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }
    
    public String getBillingCountry() {
        return this.billingCountry;
    }
    
    @JsonSetter(value="BillingCountry")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }
    
    public String getShippingStreet() {
        return this.shippingStreet;
    }
    
    @JsonSetter(value="ShippingStreet")
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
    
    public String getShippingCity() {
        return this.shippingCity;
    }
    
    @JsonSetter(value="ShippingCity")
    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }
    
    public String getShippingState() {
        return this.shippingState;
    }
    
    @JsonSetter(value="ShippingState")
    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }
    
    public String getShippingPostalCode() {
        return this.shippingPostalCode;
    }
    
    @JsonSetter(value="ShippingPostalCode")
    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }
    
    public String getShippingCountry() {
        return this.shippingCountry;
    }
    
    @JsonSetter(value="ShippingCountry")
    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    @JsonSetter(value="Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getFax() {
        return this.fax;
    }
    
    @JsonSetter(value="Fax")
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    @JsonSetter(value="AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getWebsite() {
        return this.website;
    }
    
    @JsonSetter(value="Website")
    public void setWebsite(String website) {
        this.website = website;
    }
    
    public String getSic() {
        return this.sic;
    }
    
    @JsonSetter(value="Sic")
    public void setSic(String sic) {
        this.sic = sic;
    }
    
    public String getIndustry() {
        return this.industry;
    }
    
    @JsonSetter(value="Industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    public java.math.BigDecimal getAnnualRevenue() {
        return this.annualRevenue;
    }
    
    @JsonSetter(value="AnnualRevenue")
    public void setAnnualRevenue(java.math.BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
    
    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }
    
    @JsonSetter(value="NumberOfEmployees")
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getOwnership() {
        return this.ownership;
    }
    
    @JsonSetter(value="Ownership")
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }
    
    public String getTickerSymbol() {
        return this.tickerSymbol;
    }
    
    @JsonSetter(value="TickerSymbol")
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    @JsonSetter(value="Description")
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getRating() {
        return this.rating;
    }
    
    @JsonSetter(value="Rating")
    public void setRating(String rating) {
        this.rating = rating;
    }
    
    public String getSite() {
        return this.site;
    }
    
    @JsonSetter(value="Site")
    public void setSite(String site) {
        this.site = site;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    @JsonSetter(value="OwnerId")
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public java.util.Calendar getCreatedDate() {
        return this.createdDate;
    }
    
    @JsonSetter(value="CreatedDate")
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }
    
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    @JsonSetter(value="CreatedById")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public java.util.Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    
    @JsonSetter(value="LastModifiedDate")
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    
    @JsonSetter(value="LastModifiedById")
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public java.util.Calendar getSystemModstamp() {
        return this.systemModstamp;
    }
    
    @JsonSetter(value="SystemModstamp")
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }
    
    public java.util.Date getLastActivityDate() {
        return this.lastActivityDate;
    }
    
    @JsonSetter(value="LastActivityDate")
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }
    
    public String getJigsaw() {
        return this.jigsaw;
    }
    
    @JsonSetter(value="Jigsaw")
    public void setJigsaw(String jigsaw) {
        this.jigsaw = jigsaw;
    }
    
    public String getCustomerPriority() {
        return this.customerPriority;
    }
    
    @JsonSetter(value="CustomerPriority__c")
    public void setCustomerPriority(String customerPriority) {
        this.customerPriority = customerPriority;
    }
    
    public String getSLA() {
        return this.sLA;
    }
    
    @JsonSetter(value="SLA__c")
    public void setSLA(String sLA) {
        this.sLA = sLA;
    }
    
    public String getActive() {
        return this.active;
    }
    
    @JsonSetter(value="Active__c")
    public void setActive(String active) {
        this.active = active;
    }
    
    public double getNumberofLocations() {
        return this.numberofLocations;
    }
    
    @JsonSetter(value="NumberofLocations__c")
    public void setNumberofLocations(double numberofLocations) {
        this.numberofLocations = numberofLocations;
    }
    
    public String getUpsellOpportunity() {
        return this.upsellOpportunity;
    }
    
    @JsonSetter(value="UpsellOpportunity__c")
    public void setUpsellOpportunity(String upsellOpportunity) {
        this.upsellOpportunity = upsellOpportunity;
    }
    
    public String getSLASerialNumber() {
        return this.sLASerialNumber;
    }
    
    @JsonSetter(value="SLASerialNumber__c")
    public void setSLASerialNumber(String sLASerialNumber) {
        this.sLASerialNumber = sLASerialNumber;
    }
    
    public java.util.Date getSLAExpirationDate() {
        return this.sLAExpirationDate;
    }
    
    @JsonSetter(value="SLAExpirationDate__c")
    public void setSLAExpirationDate(java.util.Date sLAExpirationDate) {
        this.sLAExpirationDate = sLAExpirationDate;
    }
    


    /**
     * Java model for the Type picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum TypeEnum {

        PROSPECT(true,false,"Prospect","Prospect"),
        CUSTOMER___DIRECT(true,false,"Customer - Direct","Customer - Direct"),
        CUSTOMER___CHANNEL(true,false,"Customer - Channel","Customer - Channel"),
        CHANNEL_PARTNER___RESELLER(true,false,"Channel Partner / Reseller","Channel Partner / Reseller"),
        INSTALLATION_PARTNER(true,false,"Installation Partner","Installation Partner"),
        TECHNOLOGY_PARTNER(true,false,"Technology Partner","Technology Partner"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private TypeEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static TypeEnum fromValue(String value) {
            if (value == null) return null;

            for (TypeEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Industry picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum IndustryEnum {

        AGRICULTURE(true,false,"Agriculture","Agriculture"),
        APPAREL(true,false,"Apparel","Apparel"),
        BANKING(true,false,"Banking","Banking"),
        BIOTECHNOLOGY(true,false,"Biotechnology","Biotechnology"),
        CHEMICALS(true,false,"Chemicals","Chemicals"),
        COMMUNICATIONS(true,false,"Communications","Communications"),
        CONSTRUCTION(true,false,"Construction","Construction"),
        CONSULTING(true,false,"Consulting","Consulting"),
        EDUCATION(true,false,"Education","Education"),
        ELECTRONICS(true,false,"Electronics","Electronics"),
        ENERGY(true,false,"Energy","Energy"),
        ENGINEERING(true,false,"Engineering","Engineering"),
        ENTERTAINMENT(true,false,"Entertainment","Entertainment"),
        ENVIRONMENTAL(true,false,"Environmental","Environmental"),
        FINANCE(true,false,"Finance","Finance"),
        FOOD___BEVERAGE(true,false,"Food & Beverage","Food & Beverage"),
        GOVERNMENT(true,false,"Government","Government"),
        HEALTHCARE(true,false,"Healthcare","Healthcare"),
        HOSPITALITY(true,false,"Hospitality","Hospitality"),
        INSURANCE(true,false,"Insurance","Insurance"),
        MACHINERY(true,false,"Machinery","Machinery"),
        MANUFACTURING(true,false,"Manufacturing","Manufacturing"),
        MEDIA(true,false,"Media","Media"),
        NOT_FOR_PROFIT(true,false,"Not For Profit","Not For Profit"),
        RECREATION(true,false,"Recreation","Recreation"),
        RETAIL(true,false,"Retail","Retail"),
        SHIPPING(true,false,"Shipping","Shipping"),
        TECHNOLOGY(true,false,"Technology","Technology"),
        TELECOMMUNICATIONS(true,false,"Telecommunications","Telecommunications"),
        TRANSPORTATION(true,false,"Transportation","Transportation"),
        UTILITIES(true,false,"Utilities","Utilities"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private IndustryEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static IndustryEnum fromValue(String value) {
            if (value == null) return null;

            for (IndustryEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Ownership picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum OwnershipEnum {

        PUBLIC(true,false,"Public","Public"),
        PRIVATE(true,false,"Private","Private"),
        SUBSIDIARY(true,false,"Subsidiary","Subsidiary"),
        OTHER(true,false,"Other","Other"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private OwnershipEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static OwnershipEnum fromValue(String value) {
            if (value == null) return null;

            for (OwnershipEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Rating picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum RatingEnum {

        HOT(true,false,"Hot","Hot"),
        WARM(true,false,"Warm","Warm"),
        COLD(true,false,"Cold","Cold"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private RatingEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static RatingEnum fromValue(String value) {
            if (value == null) return null;

            for (RatingEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the CustomerPriority__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum CustomerPriorityEnum {

        HIGH(true,false,"High","High"),
        LOW(true,false,"Low","Low"),
        MEDIUM(true,false,"Medium","Medium"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private CustomerPriorityEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static CustomerPriorityEnum fromValue(String value) {
            if (value == null) return null;

            for (CustomerPriorityEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the SLA__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum SLAEnum {

        GOLD(true,false,"Gold","Gold"),
        SILVER(true,false,"Silver","Silver"),
        PLATINUM(true,false,"Platinum","Platinum"),
        BRONZE(true,false,"Bronze","Bronze"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private SLAEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static SLAEnum fromValue(String value) {
            if (value == null) return null;

            for (SLAEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the Active__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum ActiveEnum {

        NO(true,false,"No","No"),
        YES(true,false,"Yes","Yes"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private ActiveEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static ActiveEnum fromValue(String value) {
            if (value == null) return null;

            for (ActiveEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

    /**
     * Java model for the UpsellOpportunity__c picklist.
     *
     * This enum was auto-generated. It is considered owned
     * by the Force.com database.
     **/
    public enum UpsellOpportunityEnum {

        MAYBE(true,false,"Maybe","Maybe"),
        NO(true,false,"No","No"),
        YES(true,false,"Yes","Yes"),
        ;
    
        private boolean isActive;
        private boolean isDefaultValue;
        private String label;
        private String value;

        private UpsellOpportunityEnum(boolean isActive, boolean isDefaultValue, String label, String value) {
            this.isActive = isActive;
            this.isDefaultValue = isDefaultValue;
            this.label = label;
            this.value = value;
        }

        public boolean isActive() { return this.isActive; }

        public boolean isDefaultValue() { return this.isDefaultValue; }

        public String label() { return this.label; }

        public String value() { return this.value; }

        public static UpsellOpportunityEnum fromValue(String value) {
            if (value == null) return null;

            for (UpsellOpportunityEnum picklistValueEnum : values()) {
                if (value.equals(picklistValueEnum.value())) {
                    return picklistValueEnum;
                }
            }

            return null;
        }
    }
    

}