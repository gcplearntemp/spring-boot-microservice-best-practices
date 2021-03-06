package com.uk.companieshouse.utils;

import com.uk.companieshouse.model.CompaniesHouseGovUKResponse;
import com.uk.companieshouse.model.CompaniesHouseResponse;

import java.util.List;

import static com.uk.companieshouse.utils.TestUtils.convertJsonToObject;
import static org.springframework.util.CollectionUtils.arrayToList;

public class TestHelper {
    public static final String TESTCRN = "111111111";

    public static List<CompaniesHouseResponse> getCompaniesHouseResponseList() {
        CompaniesHouseResponse companiesHouseResponse[] =
                convertJsonToObject
                        ("__files/companies-house-response.json", CompaniesHouseResponse[].class);
        return arrayToList(companiesHouseResponse);
    }

    public static CompaniesHouseGovUKResponse getCompaniesHouseGovUKResponse() {
        return convertJsonToObject
                ("__files/companies-house-gov-UK-response.json", CompaniesHouseGovUKResponse.class);
    }

    public static CompaniesHouseGovUKResponse getCompaniesHouseGovUKResponseCRNNotExist() {
        return convertJsonToObject
                ("__files/companies-house-gov-UK-response-crn-404.json", CompaniesHouseGovUKResponse.class);
    }
}
