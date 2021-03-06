package com.project.bm.entity;

import javax.persistence.*;

@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "sm_person") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
public class Person {
    @Id //这是一个主键
    private Integer Person_id;

    @Column
    private String RYNAME;
    @Column //省略默认列名就是属性名
    private String SFZH;
    @Column //省略默认列名就是属性名
    private String RYDH;

    public Integer getPerson_id() {
        return Person_id;
    }

    public void setPerson_id(Integer person_id) {
        Person_id = person_id;
    }

    public String getRYNAME() {
        return RYNAME;
    }

    public void setRYNAME(String RYNAME) {
        this.RYNAME = RYNAME;
    }

    public String getSFZH() {
        return SFZH;
    }

    public void setSFZH(String SFZH) {
        this.SFZH = SFZH;
    }

    public String getRYDH() {
        return RYDH;
    }

    public void setRYDH(String RYDH) {
        this.RYDH = RYDH;
    }
}
