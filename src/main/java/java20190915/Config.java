package java20190915;

import org.dom4j.Element;

public class Config {
    public static String Browser;
    public static int waitTime;

    static {
        ParseXml px = new ParseXml("src\\file\\config.xml");
        Browser=px.getObjectText("/*/browser");
        waitTime = Integer.valueOf(px.getObjectText("/*/waitTime"));
    }

}
