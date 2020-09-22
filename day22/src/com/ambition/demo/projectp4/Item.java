package com.ambition.demo.projectp4;

/**
 * @Author: ambitions
 * @Date: 2020/09/20/16:32
 * @Description:
 *
 *
 *  制作包含10道选择题的文本文件，选择题内容包括：题目、4个选项和标准答案（均为单选）；
 * 定义题目Item类，属性与上述单选题对应，并提供对应的get/set方法和toString()方法；
 *
 */
public class Item {
    private String topic;//题目
    private String OptionsA;//选项A
    private String OptionsB;//选项B
    private String OptionsC;//选项C
    private String OptionsD;//选项D
    private String answer;//正确答案

    public Item() {
    }

    public Item(String topic, String optionsA, String optionsB, String optionsC, String optionsD, String answer) {
        this.topic = topic;
        OptionsA = optionsA;
        OptionsB = optionsB;
        OptionsC = optionsC;
        OptionsD = optionsD;
        this.answer = answer;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getOptionsA() {
        return OptionsA;
    }

    public void setOptionsA(String optionsA) {
        OptionsA = optionsA;
    }

    public String getOptionsB() {
        return OptionsB;
    }

    public void setOptionsB(String optionsB) {
        OptionsB = optionsB;
    }

    public String getOptionsC() {
        return OptionsC;
    }

    public void setOptionsC(String optionsC) {
        OptionsC = optionsC;
    }

    public String getOptionsD() {
        return OptionsD;
    }

    public void setOptionsD(String optionsD) {
        OptionsD = optionsD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "topic='" + topic + '\'' +
                ", OptionsA='" + OptionsA + '\'' +
                ", OptionsB='" + OptionsB + '\'' +
                ", OptionsC='" + OptionsC + '\'' +
                ", OptionsD='" + OptionsD + '\'' +
                ", answer=" + answer +
                '}';
    }
}
