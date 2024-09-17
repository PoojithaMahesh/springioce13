package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("dep.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
    Car car=(Car) beanFactory.getBean("car");
    System.out.println(car);
    Tyre tyre=(Tyre)beanFactory.getBean("ty");
    System.out.println(tyre);
}
}
