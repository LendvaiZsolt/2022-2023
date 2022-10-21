package com.example.demo.controller.dto;

import com.example.demo.service.EmberPO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class EmberDTO {

    private Long id;
    @NotBlank
    private String neve;
    @Min(12)
    private int kor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "EmberDTO{" +
                "id=" + id +
                ", neve='" + neve + '\'' +
                ", kor=" + kor +
                '}';
    }

    public EmberPO toPO() {
        EmberPO emberPO = new EmberPO();
        emberPO.setId(id);
        emberPO.setKor(kor);
        emberPO.setNeve(neve);

        return emberPO;
    }
}
