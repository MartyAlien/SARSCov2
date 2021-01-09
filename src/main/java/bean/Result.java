package bean;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: Result
 * @Author: Lemo-TanYajun
 * @CreateTime: 2020/12/17 16:08
 */
public class Result {
    private List<Location> data;
    private List<Location> today;
    private List<Location> g_today;
    private List<Location> g_data;

    public List<Location> getData() {
        return data;
    }

    public void setData(List<Location> data) {
        this.data = data;
    }

    public List<Location> getToday() {
        return today;
    }

    public void setToday(List<Location> today) {
        this.today = today;
    }

    public List<Location> getG_today() {
        return g_today;
    }

    public void setG_today(List<Location> g_today) {
        this.g_today = g_today;
    }

    public List<Location> getG_data() {
        return g_data;
    }

    public void setG_data(List<Location> g_data) {
        this.g_data = g_data;
    }
}
