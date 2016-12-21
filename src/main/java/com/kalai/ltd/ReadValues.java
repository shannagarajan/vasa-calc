package com.kalai.ltd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by shan on 21/12/2016.
 */
public class ReadValues {

    public Values getValues() {

        Values values = new Values();

        try {
            InputStream inputStream = ReadValues.class.getClassLoader().getResourceAsStream("config.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            values.setLimit1(Double.parseDouble(properties.getProperty("limit1")));
            values.setLimit2(Double.parseDouble(properties.getProperty("limit2")));
            values.setStop1(Double.parseDouble(properties.getProperty("stop1")));
            values.setStop2(Double.parseDouble(properties.getProperty("stop2")));
            values.setPrice1RangeStart(Integer.parseInt(properties.getProperty("Price1.range.start")));
            values.setPrice2RangeStart(Integer.parseInt(properties.getProperty("Price2.range.start")));
            values.setPrice1RangeEnd(Integer.parseInt(properties.getProperty("Price1.range.end")));
            values.setPrice2RangeEnd(Integer.parseInt(properties.getProperty("Price2.range.end")));

        } catch (IOException exp) {

        }

        return values;
    }

}
