package com.eazybytes.eazyschool.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Holiday {
   private final String day;
   private final String reason;
   private final Type type;

    public enum Type{
        FEDERAL, FESTIVAL;
    }



}
