package com.seina.design.pattern.creational.builder.builderPersonV2;

/**
 * @author Seina
 * @version 2018-12-01 16:10:58
 * 指挥者来控制建造过程，也用它来隔离用户与建造过程的关联
 */
public class PersonDirector {

    private PersonBuilder pb;

    /**
     * 用户会告诉指挥者它需要什么样的人
     */
    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    /**
     * 根据用户的选择指挥创建者创建一个完整的人
     */
    public void createPerson(){
        pb.buildHead();
        pb.buildBody();
        pb.buildLeftHand();
        pb.buildRightHand();
        pb.buildLeftFoot();
        pb.buildRightFoot();
    }


}
