package bean;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ClassName: Location
 * @Author: Lemo-TanYajun
 * @CreateTime: 2020/12/17 16:04
 */
public class Location {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name+": "+value;
    }
}
