package edu.miu.cs.cs590.lab2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ToString
@Getter
@Setter
public class Books {
    private List<Book> books = new ArrayList<>();
}
