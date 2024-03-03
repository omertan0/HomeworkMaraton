public class Maraton {
    private String[] isimler;
    private int[] dereceler;

    public Maraton(String[] isimler,int[] dakikalar){
        this.isimler=isimler;
        this.dereceler=dakikalar;
    }

    public  static int birinci(String[] isimler, int[] dereceler) {
        int enKucukIndis = 0;
        for (int i = 1; i < dereceler.length; i++) {
            if (dereceler[i] < dereceler[enKucukIndis]) {
                enKucukIndis = i;
            }
        }
        return enKucukIndis;
    }

    public static int ikinci(String[] isimler, int[] dereceler, int birinci) {
        int enKucukIndis = 0;
        for (int i = 1; i < dereceler.length; i++) {
            if (i != birinci && dereceler[i] < dereceler[enKucukIndis]) {
                enKucukIndis = i;
            }
        }
        return enKucukIndis;
    }

    public static int ucuncu(String[] isimler, int[] dereceler, int birinci, int ikinci) {
        int enKucukIndis = 0;
        for (int i = 1; i < dereceler.length; i++) {
            if (i != birinci && i != ikinci && dereceler[i] < dereceler[enKucukIndis]) {
                enKucukIndis = i;
            }
        }
        return enKucukIndis;
    }

    public void sınıflar(){
        int A=0;
        int B=0;
        int C=0;
        for (int dakika:dereceler){
            if(199<dakika && dakika<300)
                A++;
            else if (299<dakika && dakika<400)
                B++;
            else if(399<dakika)
                C++;
        }
        System.out.println("A -> "+ A);
        System.out.println("B -> "+ B);
        System.out.println("C -> "+ C);
    }

}
