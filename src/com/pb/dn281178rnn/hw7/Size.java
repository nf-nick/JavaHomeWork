package com.pb.dn281178rnn.hw7;

public enum Size {


    XXS("32"),

    XS("34"),

    S("36"),

    M("38"),

    L("40");

    public String size;
    public int euroSize;
    public String description;

    Size(String size, String description) {
        this.size = size;
        this.description = description;
    }

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public int getEuroSize() {
        return euroSize;
    }


    public int getEuroSize(String size) {
        switch (size) {
            case "XXS":
                euroSize = 32;
                break;
            case "XS":
                euroSize = 34;
                break;
            case "S":
                euroSize = 36;
                break;
            case "M":
                euroSize = 38;
                break;
            case "L":
                euroSize = 40;
                break;

        }
        return euroSize;
    }

    public String getDescription(String size) {
        if (size.equals("XXS")) {
            return "Детский размер";
        }
        return "Взрослый размер";
    }


}
