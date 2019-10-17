package codeSeven;

public class SortUtil {
    /**
     * 是否有下一页
     * @param pageNo   当前页 0和1 都是第一页
     * @param pageSize  显示页数 20
     * @param count     总数量
     * @return
     */
    public static boolean hasNext(int pageNo,int pageSize,int count){
        double hasNext=Math.ceil((double)count/(pageNo*pageSize));
        if(hasNext>1.0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean hasNext(int pageNo,int pageSize,long count){
        double hasNext=Math.ceil((double)count/(pageNo*pageSize));
        if(hasNext>1.0){
            return true;
        }else{
            return false;
        }
    }

//  public static void main(String[] a){
//    System.out.println(hasNext(10,10,50L));
//  }
}