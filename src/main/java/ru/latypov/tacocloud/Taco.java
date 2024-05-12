package ru.latypov.tacocloud;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private final String name;
    private List<Ingredient> ingredients;

}