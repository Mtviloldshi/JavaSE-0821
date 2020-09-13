package com.ambition.exercise.ing7;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/21:05
 * @Description:
 * （4）把所有省份的城市存储到一个LinkedHashMap集合中，其中省份名是key，该省份的所有城市用
 * 一个ArrayList的集合装起来，然后作为value。
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer,String> map = new HashMap<>();
        Map<String,List<String>> linkMap = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        list.add("北京");
        list2.add("上海");
        Collections.addAll(list3,"石家庄","张家口","承德","秦皇岛","唐山","廊坊","保定","沧州","衡水","邢台","邯郸");
        Collections.addAll(list4,"太原","大同","朔州","阳泉","长治","晋城","忻州","吕梁","晋中","临汾","运城");
        linkMap.put("北京",list);
        linkMap.put("上海",list2);
        linkMap.put("河北省",list3);
        linkMap.put("山西省",list4);
        String str = "'北京': ['北京'];"
                + "'上海': ['上海'];"
                + "'天津': ['天津'];"
                + "'重庆': ['重庆'];"
                + "'河北省': ['石家庄', '张家口', '承德', '秦皇岛', '唐山', '廊坊', '保定', '沧州', '衡水', '邢台', '邯郸'];"
                + "'山西省': ['太原', '大同', '朔州', '阳泉', '长治', '晋城', '忻州', '吕梁', '晋中', '临汾', '运城'];"
                + "'辽宁省': ['沈阳', '朝阳', '阜新', '铁岭', '抚顺', '本溪', '辽阳', '鞍山', '丹东', '大连', '营口', '盘锦', '锦州', '葫芦岛'];"
                + "'吉林省': ['长春', '白城', '松原', '吉林', '四平', '辽源', '通化', '白山', '延边'];"
                + "'黑龙江省': ['哈尔滨', '齐齐哈尔', '黑河', '大庆', '伊春', '鹤岗','佳木斯', '双鸭山', '七台河', '鸡西', '牡丹江', '绥化', '大兴安']; "
                + "'香港': ['香港'];"
                + "'澳门': ['澳门'];"
                + "'台湾': ['台北', '台南', '其他']";
        //去掉括号，'空格
        String newStr = str.replaceAll("\\[|\\]|\\'| ", "");
        //按照;分号 切割字符串
        String[] split = newStr.split(";");
        for (int i = 0; i < split.length; i++) {
            //按照：号切割字符串
            String[] shengfen = split[i].split(":");
                //添加进map
                map.put(i + 1,shengfen[0]);
        }

        Set<Integer> set = map.keySet();
        Set<String> strings = linkMap.keySet();
        System.out.println("请选择：");
        //遍历map
        for (Integer key : set) {
            System.out.println(key + ":" + map.get(key));
        }
        //接收键盘输入数字
        int num = scan.nextInt();
        for (Integer key : set) {
            //遍历linkMap
            for (String key2 : strings) {
                //比较map里的value是否等于linkMap里的key
                    if (map.get(num).equals(key2)){
                        System.out.println("省份" + num);
                        Iterator<String> iterator = linkMap.get(key2).iterator();
                        System.out.print("该省份共有辖区:[");
                        //迭代输出key
                        while (iterator.hasNext()){
                            System.out.print(iterator.next());
                            //判断是否还有下一个数据，如果有打印,号，
                                if (iterator.hasNext() == true)
                            System.out.print(",");
                        }
                        System.out.println("]");
                        //输出完结束循环
                        return;
                    }
            }
        }
        //如果循环完没找到输入数字省份
        System.out.println("无此省份");
    }
}
