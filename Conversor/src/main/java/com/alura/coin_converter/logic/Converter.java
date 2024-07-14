package com.alura.coin_converter.logic;
public class Converter{
    private static final float valorDolarEn$=909.11f;
    private static final float valorEuroEn$=1015.9459f;
    private static final float valorLibraEn$=1179.2243f;
    private static final float valorYenEn$=5.7382f;
//  DIVISA - PESO
    public static float usdToClp(float usd){
        return valorDolarEn$*usd;
    }
    public static float euroToClp(float euro){
        return valorEuroEn$*euro;
    }
    public static float libraToClp(float libra){
        return valorLibraEn$*libra;
    }
    public static float yenToClp(float yen){
        return valorYenEn$*yen;
    }
//  PESO - DIVISA
    public static float clpToUSD(float clp){
        return clp/valorDolarEn$;
    }
    public static float clpToEuro(float clp){
        return clp/valorEuroEn$;
    }
    public static float clpToLibra(float clp){
        return clp/valorLibraEn$;
    }
    public static float clpToYen(float clp){
        return clp/valorYenEn$;
    }

}