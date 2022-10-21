package com.example.demo.service;

import com.example.demo.repository.Ember;

public class EmberPO {
    private long id;
    private String neve;
    private int kor;

    public EmberPO() {
    }

    public EmberPO(long id, String neve, int kor) {
        this.id = id;
        this.neve = neve;
        this.kor = kor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "EmberPO{" +
                "id=" + id +
                ", neve='" + neve + '\'' +
                ", kor=" + kor +
                '}';
    }

    public Ember toEntity() {
        Ember ember = new Ember();
        ember.setId(id);
        ember.setKor(kor);
        ember.setNeve(neve);

        return ember;
    }
}
