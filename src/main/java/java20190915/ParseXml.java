package java20190915;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class ParseXml {

    private String filePath;
    private Document document;

    ParseXml(String filePath) {
        this.filePath = filePath;
        load(this.filePath);
    }

    private void load(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            try {
                SAXReader saxReader = new SAXReader();
                document = saxReader.read(file);
            } catch (DocumentException e) {
                System.out.println("文件异常"+filePath);            }
        }else {
            System.out.println("文件不存在"+filePath);
        }
    }

    public Element getObject(String filePath){
        return (Element)document.selectSingleNode(filePath);
    }

    public List<Element> getObjects(String filePath){
        return document.selectNodes(filePath);
    }

    public boolean isExist(String elementPath){
        boolean flag = false;
        Element object = this.getObject(elementPath);
        if (object!= null){
            flag = true;
        }
        return flag;
    }

    public String getObjectText(String elementPath){
        Element object = this.getObject(elementPath);
        if (object != null) {
            return object.getTextTrim();
        }
        return null;
    }
}
