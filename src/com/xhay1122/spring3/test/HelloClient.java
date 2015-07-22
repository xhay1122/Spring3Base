/**
* @Title: HelloClient.java
* @Package com.xhay1122.spring3.test
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author matao@cqrainbowsoft.com
* @date 2015-4-9 ����3:23:17
* @version V1.0
*/
package com.xhay1122.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xhay1122.spring3.hello.IHelloApi;

/**
 * ��Ŀ���ƣ�Spring3test
 * �����ƣ�HelloClient
 * ��������   
 * �����ˣ�xhay
 * ����ʱ�䣺2015-4-9 ����3:23:17
 * �޸��ˣ�xhay
 * �޸�ʱ�䣺2015-4-9 ����3:23:17
 * �޸ı�ע��   
 * @version 1.0
 * ������̴���ʵ����  
 */
public class HelloClient {

	/** 
	 * @Title: main 
	 * @Description: TODO(������һ�仰�����������������) 
	 * @param @param args    ���� 
	 * @return void    �������� 
	 * �����ˣ�xhay
	 * ����ʱ�䣺2015-4-9 ����3:23:17
	 * �޸��ˣ�xhay
	 * �޸�ʱ�䣺2015-4-9 ����3:23:17
	 * �޸ı�ע��   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		//�������л�ȡhellBean�����ֺ�applicationcontext.xml�����id��Ӧ��
		IHelloApi api = (IHelloApi)ctx.getBean("helloBean");
		String s = api.helloSpring3("xhay");
		
		System.out.println("back word:"+s);
	}

}
