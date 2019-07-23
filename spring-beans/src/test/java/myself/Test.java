package myself;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by LiRui on 2019-07-23.
 *
 * @author LiRui
 * @version 1.0
 */
public class Test {
	@org.junit.Test
	public void testDocument() {
		FileSystemResource resource = new FileSystemResource("/Users/LiRui/IdeaProjects/spring-framework/spring-beans/src/test/resources/org/springframework/beans/factory/FactoryBeanTests-circular.xml"); // <1>
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // <2>
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); // <3>
		reader.loadBeanDefinitions(resource);
	}
}
