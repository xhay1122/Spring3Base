/**
* @Title: HelloClient.java
* @Package com.xhay1122.spring3.test
* @Description: TODO(用一句话描述该文件做什么)
* @author matao@cqrainbowsoft.com
* @date 2015-4-9 下午3:23:17
* @version V1.0
*/
package com.xhay1122.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xhay1122.spring3.hello.IHelloApi;

/**
 * 项目名称：Spring3test
 * 类名称：HelloClient
 * 类描述：   
 * 创建人：xhay
 * 创建时间：2015-4-9 下午3:23:17
 * 修改人：xhay
 * 修改时间：2015-4-9 下午3:23:17
 * 修改备注：   
 * @version 1.0
 * 软件工程创新实验室  
 */
public class HelloClient {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    描述 
	 * @return void    返回类型 
	 * 创建人：xhay
	 * 创建时间：2015-4-9 下午3:23:17
	 * 修改人：xhay
	 * 修改时间：2015-4-9 下午3:23:17
	 * 修改备注：   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		//从容器中获取hellBean（名字和applicationcontext.xml里面的id对应）
		IHelloApi api = (IHelloApi)ctx.getBean("helloBean");
		String s = api.helloSpring3("xhay");
		
		System.out.println("back word:"+s);
	}

}
