package com.eazybytes.eazyschool.model;


import jakarta.persistence.*;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="holidays")
public class Holiday extends BaseEntity {

    @Id
    private  String day;

    private  String reason;

    @Enumerated(EnumType.STRING)
    private  Type type;

    public enum Type{
        FEDERAL, FESTIVAL;
    }
}
