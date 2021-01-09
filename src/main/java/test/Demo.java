package test;

import bean.Location;
import bean.Result;
import org.junit.Test;
import util.GetDataUtil;
import util.TransformUtil;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: Demo
 * @Author: Lemo-TanYajun
 * @CreateTime: 2020/12/17 16:41
 */
public class Demo {
    @Test
    public void test() throws IOException {
        Result re = TransformUtil.getTransformObject(GetDataUtil.getData());
        List<Location> allData = re.getData();
        List<Location> todayData = re.getToday();
        allData.stream().forEach(System.out::println);
        System.out.println("------------------------------------------");
        todayData.stream().filter(e->e.getValue()!=0).forEach(System.out::println);
    }
}
