import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Map<String,Object>> list = new ArrayList<>();

        Long a = new Long(156767280300L);

//        List<Map<String,Object>> list1 = list.subList(0, 10);
//        System.out.println(list1);
        Collections.sort(list, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                if (o1.get("ds").equals(o2.get("ds"))) {
                    BigDecimal name1 = (BigDecimal) o1.get("01");
                    BigDecimal name2 = (BigDecimal) o2.get("01");
                    if ("desc".equals("desc")) {
                        return name2.compareTo(name1);
                    } else {
                        return name1.compareTo(name2);
                    }
                } else {
                    String str1 = String.valueOf(o1.get("ds"));
                    String str2 = String.valueOf(o2.get("ds"));
                    return str2.compareTo(str1);
                }
            }
        });
        List<Map<String, Object>> pager = Pager(1, 10, list);
        System.out.println(pager);


        System.out.println("Hello World!");
    }

    public static List<Map<String,Object>>  Pager(int pageIndex, int pageSize, List<Map<String,Object>> list){
        //使用list 中的sublist方法分页
        List<Map<String,Object>> dataList = new ArrayList<>();
        // 每页显示多少条记录

        //当前第几页数据
        int currentPage;

        // 一共多少条记录
        int totalRecord = list.size();

        // 一共多少页
        int totalPage = totalRecord % pageSize;

        if (totalPage > 0) {
            totalPage = totalRecord / pageSize + 1;
        } else {
            totalPage = totalRecord / pageSize;
        }

        System.out.println("总页数:" + totalPage);

        // 当前第几页数据
        currentPage = totalPage < pageIndex ? totalPage : pageIndex;

        // 起始索引
        int fromIndex = pageSize * (currentPage - 1);

        // 结束索引
        int toIndex = pageSize * currentPage > totalRecord ? totalRecord : pageSize * currentPage;
        try{
            dataList = list.subList(fromIndex, toIndex);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        return dataList;
    }
}
