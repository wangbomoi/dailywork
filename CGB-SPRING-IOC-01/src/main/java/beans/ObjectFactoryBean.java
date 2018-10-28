package beans;

import org.springframework.beans.factory.FactoryBean;
/**
 * 通过工厂Bean对象创建工厂对象
 * 例如:通过此对象创建ObjectFactory
 * 
 * FactoryBean的应用场景?
 * Spring中建议创建工厂对象时使用FactoryBean.
 * 
 * @author 速度
 */
public class ObjectFactoryBean 
      implements FactoryBean<ObjectFactory> {
    /**
     * 此方法中要返回工厂对象
     */
	public ObjectFactory getObject() 
			throws Exception {
		System.out.println("getObject()");
		return new ObjectFactory();
	}
	/**
	 * 此方法何时调用?
	 * 1)容器关闭时
	 * 2)isSingleton方法返回值为true
	 * Spring容器对于单例对象负责创建和销毁,
	 * 非单例对象只负责创建,不负责销毁.
	 */
	public Class<?> getObjectType() {
		System.out.println("getObjectType()");
		return ObjectFactory.class;
	}
	/**
	 * 此方法的返回值决定FactoryBean
	 * 创建的工厂的实例在内存中是否是
	 * 单例的.
	 */
	public boolean isSingleton() {
		System.out.println("isSingleton()");
		//return true;//单例
		return false;//多例
	}
}
