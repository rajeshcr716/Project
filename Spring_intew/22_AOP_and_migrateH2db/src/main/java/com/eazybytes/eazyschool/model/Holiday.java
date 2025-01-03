package com.eazybytes.eazyschool.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Holiday extends BaseEntity {
   private  String day;
   private  String reason;
   private  Type type;

    public enum Type{
        FEDERAL, FESTIVAL;
    }
}
