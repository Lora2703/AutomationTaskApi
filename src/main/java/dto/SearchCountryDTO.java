package dto;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import java.util.ArrayList;

@Getter
@ToString
@AllArgsConstructor
@Data
public class SearchCountryDTO {

    private Name name;
    private ArrayList<String> tld;
    private String cca2;
    private String ccn3;
    private String cca3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Currencies currencies;
    private Idd idd;
    private ArrayList<String> capital;
    private ArrayList<String> altSpellings;
    private String region;
    private String subregion;
    private Languages languages;
    private Translations translations;
    private ArrayList<Double> latlng;
    private boolean landlocked;
    private ArrayList<String> borders;
    private double area;
    private Demonyms demonyms;
    private String flag;
    private Maps maps;
    private int population;
    private Gini gini;
    private String fifa;
    private Car car;
    private ArrayList<String> timezones;
    private ArrayList<String> continents;
    private Flags flags;
    private CoatOfArms coatOfArms;
    private String startOfWeek;
    private CapitalInfo capitalInfo;
    private PostalCode postalCode;


    public static class Ara {
        private String official;
        private String common;
    }

    public static class Bre {
        private String official;
        private String common;
    }

    public static class CapitalInfo {
        private ArrayList<Double> latlng;
    }

    public static class Car {
        private ArrayList<String> signs;
        private String side;
    }

    public static class Ces {
        private String official;
        private String common;
    }

    public static class CoatOfArms {
        private String png;
        private String svg;
    }

    public static class Currencies {
        @JsonProperty("UAH")
        private UAH uAH;
    }

    public static class Cym {
        private String official;
        private String common;
    }

    public static class Demonyms {
        private Eng eng;
        private Fra fra;
    }

    public static class Deu {
        private String official;
        private String common;
    }

    public static class Eng {
        private String f;
        private String m;
    }

    public static class Est {
        private String official;
        private String common;
    }

    public static class Fin {
        private String official;
        private String common;
    }

    public static class Flags {
        private String png;
        private String svg;
        private String alt;
    }

    public static class Fra {
        private String official;
        private String common;
        private String f;
        private String m;
    }

    public static class Gini {
        @JsonProperty("2019")
        private double _2019;
    }

    public static class Hrv {
        private String official;
        private String common;
    }

    public static class Hun {
        private String official;
        private String common;
    }

    public static class Idd {
        private String root;
        private ArrayList<String> suffixes;
    }

    public static class Ita {
        private String official;
        private String common;
    }

    public static class Jpn {
        private String official;
        private String common;
    }

    public static class Kor {
        private String official;
        private String common;
    }

    public static class Languages {
        private String ukr;
    }

    public static class Maps {
        private String googleMaps;
        private String openStreetMaps;
    }

    @AllArgsConstructor
    @Data
    @Getter
    public class Name {
        private String common;
        private String official;
        private NativeName nativeName;
    }

    public static class NativeName {
        private Ukr ukr;
    }

    public static class Nld {
        private String official;
        private String common;
    }

    public static class Per {
        private String official;
        private String common;
    }

    public static class Pol {
        private String official;
        private String common;
    }

    public static class Por {
        private String official;
        private String common;
    }

    public static class PostalCode {
        private String format;
        private String regex;
    }

    public static class Rus {
        private String official;
        private String common;
    }

    public static class Slk {
        private String official;
        private String common;
    }

    public static class Spa {
        private String official;
        private String common;
    }

    public static class Srp {
        private String official;
        private String common;
    }

    public static class Swe {
        private String official;
        private String common;
    }

    public static class Translations {
        private Ara ara;
        private Bre bre;
        private Ces ces;
        private Cym cym;
        private Deu deu;
        private Est est;
        private Fin fin;
        private Fra fra;
        private Hrv hrv;
        private Hun hun;
        private Ita ita;
        private Jpn jpn;
        private Kor kor;
        private Nld nld;
        private Per per;
        private Pol pol;
        private Por por;
        private Rus rus;
        private Slk slk;
        private Spa spa;
        private Srp srp;
        private Swe swe;
        private Tur tur;
        private Urd urd;
        private Zho zho;
    }

    public static class Tur {
        private String official;
        private String common;
    }

    public static class UAH {
        private String name;
        private String symbol;
    }

    public static class Ukr {
        private String official;
        private String common;
    }

    public static class Urd {
        private String official;
        private String common;
    }

    public static class Zho {
        private String official;
        private String common;
    }
}

