package com.example.msconsumption.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Transaction {

    @Field(name = "transactionType")
    private String transactionType;

    @Field(name = "transactionAmount")
    private Double transactionAmount;

    @Field(name = "account")
    private Bill bill;

    @Field(name = "commission")
    private Double commission;

    @Field(name = "description")
    private String description = "";

    @Field(name = "transactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime transactionDate = LocalDateTime.now();
}

