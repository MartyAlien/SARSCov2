package load_data;

import bean.Location;
import bean.Result;
import util.GetDataUtil;
import util.TransformUtil;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 设置编码格式
		response.setContentType("text/json;charset=utf-8");
		// 2. 通过工具，拿到疫情数据
		String data2 = GetDataUtil.getData();
		// 3. 将数据回复给浏览器
		response.getWriter().write(data2);
		// 通过工具转成对应实例  用控制台输出
		Result result = TransformUtil.getTransformObject(data2);
		List<Location> allData = result.getData();
		List<Location> todayData = result.getToday();
		allData.stream().forEach(System.out::println);
		System.out.println("------------------------------------------");
		todayData.stream().filter(e->e.getValue()!=0).forEach(System.out::println);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
