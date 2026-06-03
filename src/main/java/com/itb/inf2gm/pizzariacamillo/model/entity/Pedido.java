package com.itb.inf2gm.pizzariacamillo.model.entity;

import com.itb.inf2gm.pizzariacamillo.model.enums.StatusPedido;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {
    private Long id;
    private BigDecimal valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private String status;
    private  boolean codStatus;
    private StatusPedido StatusPedido;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(BigDecimal valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public StatusPedido getStatusPedido() {
        return StatusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        StatusPedido = statusPedido;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;



    }
}
