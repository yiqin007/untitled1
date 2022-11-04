package modulee;

import javax.xml.XMLConstants;

/**
 * @author 叶嘉卫
 * @date 2022/10/26/16:01
 * @Description: 模块的
 */
public class main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println(greeting.hello(XMLConstants.XML_NS_PREFIX));
    }
}
