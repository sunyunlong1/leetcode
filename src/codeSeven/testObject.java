package codeSeven;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName testObject
 * @Decription TODO
 * @Auther mac
 * @Date 2019-08-17 11:21
 * @Version 1.0
 **/
public class testObject {

    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("i",i);
            list.add(map);
        }

        for (Map<String,Object> map : list){

            System.out.println(map.get("i"));
        }

        List<Map<String, Object>> pager = Pager(1, 4, list);

        System.out.println("-------------");
        for (Map<String,Object> map : pager){
            System.out.println(map.get("i"));
        }
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
            e.printStackTrace();
        }
        return dataList;
    }}
