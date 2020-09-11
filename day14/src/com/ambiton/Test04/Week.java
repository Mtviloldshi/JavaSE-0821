package com.ambiton.Test04;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/15:38
 * @Description:
 */
public enum Week {
    MONDAY("1", "mangsiday"),
    TUESDAY("2", "mangsiday"),
    WEDNESDAY("3", "mangsiday"),
    THURSDAY("4", "mangsiday"),
    FRIDAY("5", "mangsiday"),
    SATURDAY("6", "mangsiday"),
    SUNDAY("7", "mangsiday");
    private String value;
    private String desc;

    public static Week getByValue(String value) {
        Week[] values = Week.values();
        int i = Integer.parseInt(value);
        return values[i - 1];
    }

    @Override
    public String toString() {
        return value + "-->" + desc;
    }

    Week(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    Week() {

    }
}
