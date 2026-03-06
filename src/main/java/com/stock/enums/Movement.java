package com.stock.enums;

public enum Movement {
    STOCKIN(1),
    STOCKOUT(2);
    private int code;

    private Movement(int code) {
        this.code = code;
    }
    public int getCode(){
        return code;
    }
    public static Movement valueOf(int code){
        for(Movement value : Movement.values()){
            if(code == value.getCode()){
                return value;
            }
        }
        throw new IllegalArgumentException("Illegal Argument code");
    }

}
