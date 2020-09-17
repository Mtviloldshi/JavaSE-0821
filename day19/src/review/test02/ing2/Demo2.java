package review.test02.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/12:04
 * @Description:
 *
 *。
 */
public class Demo2 {
    public static void main(String[] args) {
        overlapping(201401,201406,201403,201409);
    }
    public static void overlapping(Integer year1, Integer year2,Integer year3,Integer year4){
        int years = Math.abs(year2 - year3);
        System.out.println("总共重叠" + ++years + "个月");
        years--;
        for (;;){
            if (year2 >= year3){
                System.out.print(years + "\t");
                years++;
                year3++;
            }else {
                break;
            }
        }
    }
}
