public class Main {
    public static void main(String[] args) {
        String[] isimler = {"Kadir","Gökhan","Hakan","Suzan","Pınnar","Mehamet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] dereceler = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        Maraton maraton=new Maraton(isimler,dereceler);

        int birinci = Maraton.birinci(isimler, dereceler);
        int ikinci = Maraton.ikinci(isimler, dereceler, birinci);
        int ucuncu = Maraton.ucuncu(isimler, dereceler, birinci, ikinci);

        System.out.println("Birinci: " + isimler[birinci] + " --> " + dereceler[birinci] + " dakika");
        System.out.println("İkinci: " + isimler[ikinci] + " --> " + dereceler[ikinci] + " dakika");
        System.out.println("Üçüncü: " + isimler[ucuncu] + " --> " + dereceler[ucuncu] + " dakika");

        maraton.sınıflar();


    }
}