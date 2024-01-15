package com.milu.application.java.fign;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@ToString
public class TestDTO implements Serializable {
    static final long serialVersionUID = 1L;

    String id;

    String value;
}
