package com.selenium.Utils;

import groovy.beans.PropertyReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataReader {
    public static final String DEFAULT_PROPERTY_FILE = "/ConfigProperties/Configuration/config.properties";
    //  private static String currentEnv = PropertyReader.getGlobalProperty("ENV");

    public static String readPropertyUrl(String Apps) {

        String appURL = readPropertyFromFile("/configProperties/" + readPropertyFromConfigFile("ENV") + "/url.properties", Apps);
        return appURL;
    }

    public static String readPropertyFromFile(String relativePath, String property) {
        Properties data = new Properties();
        String result = "";
        try {
            InputStream resource = PropertyReader.class.getResourceAsStream(relativePath);

            if (null == resource) {
                //log.fail("Resource file not found: " + relativePath);
            }
            data.load(resource);
            result = data.getProperty(property);
            if (result == null) {
                result = "N/A";
            }

        } catch (Exception e) {
            // log.fail("Resource file error: " + relativePath, e);
        }
        return result;
    }


    public String readLoginProperties(String credentialKey) throws FileNotFoundException, IOException {
        if (System.getProperty(credentialKey) == null) {
            return readPropertyFromFile("/envProperties/" + readPropertyFromConfigFile("ENV") + "/loginDetails.properties", credentialKey);
        } else {
            return System.getProperty(credentialKey);
        }
    }

    public static String readPropertyFromConfigFile(String property) {
        return readPropertyFromFile(DEFAULT_PROPERTY_FILE, property);
    }

}
