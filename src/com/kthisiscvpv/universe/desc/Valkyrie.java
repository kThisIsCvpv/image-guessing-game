package com.kthisiscvpv.universe.desc;

public enum Valkyrie {

    KIANA("Kiana Kaslana"), 
    BRONYA("Bronya Zaychik"), 
    FU_HUA("Fu Hua"), 
    KALLEN("Kallen Kaslana"), 
    LILIYA("Liliya Olenyeva"), 
    HIMEKO("Murata Himeko"), 
    MEI("Raiden Mei"), 
    RITA("Rita Rossweisse"), 
    ROZALIYA("Rosaliya Olenyeva"), 
    SEELE("Seele Vollerei"), 
    THERESA("Theresa Apocalypse"), 
    YAE("Yae Sakura");

    private String name;

    Valkyrie(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
