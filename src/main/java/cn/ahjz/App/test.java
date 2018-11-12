package cn.ahjz.App;

import cn.ahjz.pojo.Dept;
import cn.ahjz.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wind on 2018/11/12.
 */
public class test {

    private DeptService deptService;

    @Test
    public void test1() {
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);

        deptService = ac.getBean(DeptService.class);

        Dept dept = deptService.selectone(10);

        System.out.println(dept);


    }

}
