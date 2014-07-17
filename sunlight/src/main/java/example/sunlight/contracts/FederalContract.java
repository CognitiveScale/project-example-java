package example.sunlight.contracts;

import com.c12e.types.annotations.Node;
import com.c12e.types.annotations.Searchable;
import com.google.gson.annotations.SerializedName;

/**
 * @author dilum
 * @since 7/15/14
 */
@Node(index = "recordId")
@Searchable
public class FederalContract {
    public static final java.lang.String URI = "http://sample.io/types/FederalContract";

    @SerializedName("id")
    public String recordId;

    @SerializedName("effectivedate")
    public String effectiveDate;

    @SerializedName("renewaldate")
    public String renewalDate;

    @SerializedName("signeddate")
    public String signedDate;

    @SerializedName("ultimatecompletiondate")
    public String ultimateCompletionDate;

    @SerializedName("descriptionofcontractrequirement")
    public String contractDescription;

    @SerializedName("vendorname")
    public String vendorName;

    @SerializedName("vendor_state_code")
    public String vendorState;

    @SerializedName("annualrevenue")
    public Double annualRevenue;

    @SerializedName("baseandalloptionsvalue")
    public Double baseAndAllOptionsValue;

    @SerializedName("obligatedamount")
    public Double obligatedAmount;

    @SerializedName("streetaddress")
    public String streetAddress;

    public String state;

    @SerializedName("phoneno")
    public String telephone;
}

/*
    {
        "contractingofficeid": "W58RGZ",
        "srdvobflag": false,
        "reasonnotcompeted": "ONE",
        "seatransportation": "N",
        "hubzoneflag": false,
        "contractbundling": "D",
        "hbcuflag": false,
        "annualrevenue": "6105000000.00",
        "majorprogramcode": "",
        "firm8aflag": false,
        "smallbusinesscompetitivenessdemonstrationprogram": null,
        "tribalgovernmentflag": false,
        "apaobflag": false,
        "emergingsmallbusinessflag": false,
        "naobflag": false,
        "idvpiid": "",
        "locationcode": "",
        "isserviceprovider": null,
        "extentcompeted": "C",
        "hospitalflag": false,
        "effectivedate": "2012-06-06",
        "reasonformodification": "",
        "agency_name": "",
        "receivesgrants": "N",
        "purchasecardaspaymentmethod": false,
        "numberofactions": 1,
        "phoneno": "2033865105",
        "idvmodificationnumber": "0",
        "localareasetaside": "N",
        "agencyid": "9700",
        "countryoforigin": "USA",
        "educationalinstitutionflag": false,
        "contractactiontype": "DCA",
        "multiyearcontract": true,
        "saaobflag": false,
        "consolidatedcontract": false,
        "subcontractplan": "D",
        "manufacturingorganizationtype": "A",
        "federalgovernmentflag": false,
        "rec_flag": null,
        "typeofsetaside": "NONE",
        "fundingrequestingofficeid": "W58H0Z",
        "competitiveprocedures": "",
        "streetaddress": "6900 MAIN ST",
        "costaccountingstandardsclause": "Y",
        "transaction_status": "active",
        "mod_agency": "2100",
        "nonprofitorganizationflag": false,
        "vendorenabled": "",
        "ultimatecompletiondate": "2017-12-31",
        "vendorlegalorganizationname": "",
        "gfe_gfp": false,
        "programacronym": "",
        "research": "",
        "state": "CT",
        "statutoryexceptiontofairopportunity": "",
        "recoveredmaterialclauses": "C",
        "contingencyhumanitarianpeacekeepingoperation": "X",
        "haobflag": false,
        "descriptionofcontractrequirement": "MULTI SERVICE, 5 YR, MULTI-YR CONTRACT FOR H-60 HELICOPTERS.  FY2012 ¿ FY2016 PRODUCTION CONTRACT FOR ARMY/NAVY/FMS UH/HH/MH-60 HELICOPTERS TO INCLUDE PROCUREMENT OF UP TO 916 EACH AIRCRAFT AND RELATED SUPPORT, SERVICES, SYSTEMS/PROJECT MANAGEMENT, PUBLICATIONS, AND TECHNICAL DATA.  FMS COUNTRIES INCLUDE SAUDI ARABIAN NATIONAL GUARD (SANG), TAIWAN, THAILAND AND ROYAL AUSTRALIAN NAVY (RAN).",
        "receivescontracts": "Y",
        "vendorlocationdisableflag": null,
        "vendoralternatesitecode": "066141385",
        "maj_fund_agency_cat": "97",
        "placeofperformancezipcode": "066141385",
        "obligatedamount": "1543229958.00",
        "davisbaconact": false,
        "parentdunsnumber": "001344142",
        "costorpricingdata": "Y",
        "multipleorsingleawardidc": "",
        "minorityinstitutionflag": false,
        "contractfinancing": "A",
        "principalnaicscode": "336411",
        "fundingrequestingagencyid": "2100",
        "lastdatetoorder": "",
        "stategovernmentflag": false,
        "claimantprogramcode": "A1A",
        "walshhealyact": true,
        "commercialitemtestprogram": false,
        "mod_parent": "UNITED TECHNOLOGIES CORPORATION",
        "baseandalloptionsvalue": "7217694080.00",
        "placeofmanufacture": "D",
        "fiscal_year": 2012,
        "vendoralternatename": "",
        "minorityownedbusinessflag": false,
        "priceevaluationpercentdifference": "0",
        "city": "STRATFORD",
        "numberofoffersreceived": 1,
        "commercialitemacquisitionprocedures": "D",
        "veteranownedflag": false,
        "evaluatedpreference": "NONE",
        "informationtechnologycommercialitemcategory": "",
        "useofepadesignatedproducts": "A",
        "aiobflag": "N",
        "maj_agency_cat": "97",
        "psc_cat": "15",
        "transactionnumber": "1",
        "pop_cd": "CT03",
        "baseandexercisedoptionsvalue": "1543229958.00",
        "modnumber": "0",
        "idvagencyid": "",
        "organizationaltype": "CORPORATE NOT TAX EXEMPT",
        "statecode": "CT",
        "solicitationprocedures": "SSS",
        "congressionaldistrict": "CT03",
        "vendorname": "SIKORSKY AIRCRAFT CORPORATION",
        "productorservicecode": "1520",
        "receivescontractsandgrants": "N",
        "currentcompletiondate": "2017-12-31",
        "performancebasedservicecontract": "X",
        "piid": "W58RGZ12C0008",
        "progsourcesubacct": "",
        "divisionname": "",
        "baobflag": false,
        "contracting_agency_name": "",
        "womenownedflag": false,
        "vendor_state_code": "CT",
        "fedbizopps": "N",
        "vendordoingasbusinessname": "",
        "ccrexception": "",
        "divisionnumberorofficecode": "",
        "unique_transaction_id": "fe60bdcce2334e4edf0da318f00b238d",
        "localgovernmentflag": false,
        "servicecontractact": false,
        "systemequipmentcode": "000",
        "solicitationid": "W58RGZ10R0010",
        "sdbflag": false,
        "id": 6759042,
        "streetaddress3": "",
        "progsourceaccount": "2031",
        "zipcode": "066141385",
        "progsourceagency": "21",
        "interagencycontractingauthority": "X",
        "contractingofficeagencyid": "2100",
        "account_title": "",
        "vendorsitecode": "835551474",
        "numberofemployees": 17825,
        "streetaddress2": "",
        "vendorcountrycode": "UNITED STATES",
        "fundedbyforeignentity": "",
        "otherstatutoryauthority": "",
        "dunsnumber": "835551474",
        "placeofperformancecongressionaldistrict": "CT03",
        "placeofperformancecountrycode": "USA",
        "vendor_cd": "CT03",
        "lettercontract": "X",
        "registrationdate": "2002-04-02",
        "shelteredworkshopflag": false,
        "contractingofficerbusinesssizedetermination": "O",
        "pop_state_code": "CT",
        "typeofcontractpricing": "J",
        "faxno": "8606609913",
        "signeddate": "2012-06-06",
        "nationalinterestactioncode": "NONE",
        "a76action": false,
        "typeofidc": "",
        "renewaldate": "2013-06-28",
        "clingercohenact": false,
        "requesting_agency_name": ""
    },

 */