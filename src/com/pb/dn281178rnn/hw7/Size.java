package com.pb.dn281178rnn.hw7;

public enum Size {
    XXS(36) {
        //посчитал самым простым вариантом переопределить описание для отдельного пункта перечисления
        @Override
        public String getDescription() {
            return "детский размер";
        }
    },
    XS(38),
    S(40),
    M(42),
    L(44);

    Size(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "взрослый размер";
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private final int EuroSize; //так как список размеров не меняется, то поле final
}

