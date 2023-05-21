package demo.excute;

import demo.beanAnalysis.BeanConfigParser;
import demo.beanAnalysis.BeanDefinition;
import demo.core.BeansFactory;
import demo.beanAnalysis.XmlBeanConfigParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 从 classpath 中加载 XML 格式的配置文件，通过 BeanConfigParser 解析为统一的 BeanDefinition 格式，
 * BeansFactory 根据 BeanDefinition 来创建对象。
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
  private BeansFactory beansFactory;
  private BeanConfigParser beanConfigParser;

  public ClassPathXmlApplicationContext(String configLocation) {
    this.beansFactory = new BeansFactory();
    this.beanConfigParser = new XmlBeanConfigParser();
    loadBeanDefinitions(configLocation);
  }


  private void loadBeanDefinitions(String configLocation) {
    InputStream in = null;
    try {
      in = this.getClass().getResourceAsStream("/" + configLocation);
      if (in == null) {
        throw new RuntimeException("Can not find config file: " + configLocation);
      }
      //解析
      List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
      //创建
      beansFactory.addBeanDefinitions(beanDefinitions);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  @Override
  public Object getBean(String beanId) {
    return beansFactory.getBean(beanId);
  }
}