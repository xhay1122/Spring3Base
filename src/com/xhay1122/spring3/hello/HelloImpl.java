/**
* @Title: HelloImpl.java
* @Package com.xhay1122.spring3.hello
* @Description: TODO(用一句话描述该文件做什么)
* @author matao@cqrainbowsoft.com
* @date 2015-4-9 下午3:01:17
* @version V1.0
*/
package com.xhay1122.spring3.hello;

/**
 * 项目名称：Spring3test
 * 类名称：HelloImpl
 * 类描述：   
 * 创建人：xhay
 * 创建时间：2015-4-9 下午3:01:17
 * 修改人：xhay
 * 修改时间：2015-4-9 下午3:01:17
 * 修改备注：   
 * @version 1.0
 * 软件工程创新实验室  
 */
public class HelloImpl implements IHelloApi {

	/* (非 Javadoc) 
	 * <p>Title: helloSpring3</p> 
	 * <p>Description: </p> 
	 * @param a
	 * @return 
	 * @see com.xhay1122.spring3.hello.IHelloApi#helloSpring3(int) 
	 */
	public String helloSpring3(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello Spring3.------"+name);
		return "OK , name = "+name;
	}

}
