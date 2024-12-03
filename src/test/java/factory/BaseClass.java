package factory;

import org.apache.commons.lang3.RandomStringUtils;

public class BaseClass {

    public static String randomString(){
        String RandomString=RandomStringUtils.randomAlphabetic(5);
        return RandomString;
    }
    public static String randomNumber(){
        String RandomNumber=RandomStringUtils.randomNumeric(10);
        return RandomNumber;
    }
    public static String randomAlphaNumeric(){
        String Str=RandomStringUtils.randomAlphabetic(5);
        String Num=RandomStringUtils.randomNumeric(3);
        return Str+Num;
    }


}
