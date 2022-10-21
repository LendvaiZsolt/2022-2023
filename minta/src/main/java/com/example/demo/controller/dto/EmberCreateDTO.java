package com.example.demo.controller.dto;

import com.example.demo.service.EmberPO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class EmberCreateDTO {
    @NotBlank
    private String neve;
    @Min(12)
    private int kor;

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
                ", neve='" + neve + '\'' +
                ", kor=" + kor +
                '}';
    }

    public EmberPO toPO() {
        EmberPO emberPO = new EmberPO();
        emberPO.setKor(kor);
        emberPO.setNeve(neve);

        return emberPO;
    }
}
