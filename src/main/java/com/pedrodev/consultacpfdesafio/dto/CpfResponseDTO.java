package com.pedrodev.consultacpfdesafio.dto;

public class CpfResponseDTO {
    private String status;

    public CpfResponseDTO(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
