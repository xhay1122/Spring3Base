/**
* @Title: HelloImpl.java
* @Package com.xhay1122.spring3.hello
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author matao@cqrainbowsoft.com
* @date 2015-4-9 ����3:01:17
* @version V1.0
*/
package com.xhay1122.spring3.hello;

/**
 * ��Ŀ���ƣ�Spring3test
 * �����ƣ�HelloImpl
 * ��������   
 * �����ˣ�xhay
 * ����ʱ�䣺2015-4-9 ����3:01:17
 * �޸��ˣ�xhay
 * �޸�ʱ�䣺2015-4-9 ����3:01:17
 * �޸ı�ע��   
 * @version 1.0
 * ������̴���ʵ����  
 */
public class HelloImpl implements IHelloApi {

	/* (�� Javadoc) 
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
