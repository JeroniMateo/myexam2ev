package com.studentsfp.devenvironment.unittesting.helper;

import com.studentsfp.devenvironment.unittesting.data.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.studentsfp.devenvironment.unittesting.helper;
 * Class GenericFileUtils
 *
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class GenericFileUtils {
    private static final String RESOURCE_PATH = "src/test/resources/";

    public static String getResourcePath(String file) {
        return RESOURCE_PATH + file;
    }

    public static InputStream getInputReader(String file) throws FileNotFoundException {
        InputStream input = new FileInputStream(new File(getResourcePath(file)));
        return input;
    }

    public static FileWriter getWriter(String file) throws IOException {
        return new FileWriter(getResourcePath(file));
    }


    public static Item getMaxHurricane(InputStream inputReader) {
        return new Item();
    }

    public List<Item> getCity() {
        return new ArrayList<>();
    }
}
