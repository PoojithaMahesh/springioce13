package contsructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("laptop.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Laptop laptop=(Laptop) beanFactory.getBean("laptop");
	System.out.println(laptop);
}
}
