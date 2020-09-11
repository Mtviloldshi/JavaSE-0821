package com.ambiton.exercise.ing;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/10:41
 * @Description:
 * 1、声明月份枚举类Month：
 * （1）创建：1-12月常量对象
 * （2）声明两个属性：value（月份值，例如：JANUARY的value为1）， description（描述，例如：
 * JANUARY的description为1月份是一年的开始）。
 * （3）声明一个有参构造，创建12个对象
 * （4）声明一个方法：public static Month getByValue(int value)
 * （5）手动重写toString()：返回对象信息，例如：1->JANUARY->1月份是一年的开始。
 *
 * 2、在测试类中，从键盘输入1个1-12的月份值，获取对应的月份对象，并打印对象
 */
public enum Month {
    JANUARY("1","一月份是一年的开始"), FEBRUARY("2","二月份"),//默认带public static final
    MARCH("3","三月份"), APRIL("4","四月份"), MAY("5","五月份"), JUNE("6","六月份"),
    JULY("7","七月份"), AUGUST("8","八月份"), SEPTEMBER("9","九月份"),
    OCTOBER("10","十月份"), NOVEMBER("11","十一月份"), DECEMBER("12","十二月份");
    private String value;
    private String description;

    Month(String value, String description) {//默认带private
        this.value = value;
        this.description = description;
    }
    public static Month getByValue(String value){//输入一个值返回一个对象
        //通过values拿到所有对象
        Month[] values = Month.values();

        //返回这个值-1的角标 因为角标从0开始
        return values[Integer.parseInt(value)  -1];
    }

    @Override
    public String toString() {
        //获取对象
        Month byValue = getByValue(value);
                            //获取对象名
        return  value + "-->" +byValue.name() +  "-->" + description;
    }
}
