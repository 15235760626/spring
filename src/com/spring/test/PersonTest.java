package com.spring.test;

import com.spring.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :Mr.Xu
 * Date    :2019-4-15
 */
public class PersonTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        Person person1 = ac.getBean("person1", Person.class);
        System.out.println(person1);

        Person person2 = ac.getBean("person2", Person.class);
        System.out.println(person2);

        Person person3 = ac.getBean("person3", Person.class);
        System.out.println(person3);

        Person person4 = ac.getBean("person4", Person.class);
        System.out.println(person4);

        Person person5 = ac.getBean("person5", Person.class);
        System.out.println(person5);

        Person person6 = ac.getBean("person6", Person.class);
        System.out.println(person6.getAddr());

        Person person7 = ac.getBean("person7", Person.class);
        System.out.println(person7.getLove());


        Person person8 = ac.getBean("person8", Person.class);
        System.out.println(person8.getAdds());


        Person person9 = ac.getBean("person9", Person.class);
        System.out.println(person9.getProperties());


    }
}
