package com.gphw.pattern.observer.gper;

import com.google.common.eventbus.EventBus;

public class GuavaGperTest {
    public static void main(String[] args) {
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");


        //这为没有@Tom老师
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        EventBus eventBus = new EventBus();
        eventBus.register(tom);
        eventBus.register(mic);
        eventBus.post(question);

    }
}
