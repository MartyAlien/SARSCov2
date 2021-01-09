package util;

import bean.Result;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @ClassName: TransformUtil
 * @Author: Lemo-TanYajun
 * @CreateTime: 2020/12/17 16:37
 */
public class TransformUtil {
    public static Result getTransformObject(String jsonStr){
        try {
            // 调用方法将json字符串转换为对应的实例
            ObjectMapper objectMapper = new ObjectMapper();
            Result result = objectMapper.readValue(jsonStr, Result.class);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
