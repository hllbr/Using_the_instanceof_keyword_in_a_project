//1.class
class Hayvan {
    private String isim ;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus (){
        return "hayvan konusuyor" ;
        
    }
}
//2.class
class Kopek extends Hayvan{
    
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" havlıyor..."; //To change body of generated methods, choose Tools | Templates.
    }
    
}
//3.class
class aslan extends Hayvan{
    
    public aslan(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" Kükrüyor..";//To change body of generated methods, choose Tools | Templates.
    }
    
}
//4.class
class sırtlan extends Hayvan{

    @Override
    public String konus() {
        return this.getIsim() +" Sırıtıyor.."; //To change body of generated methods, choose Tools | Templates.
    }
    
    public sırtlan(String isim) {
        super(isim);
    }
    
}
//5.class
class At extends Hayvan{
    
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() +" Kişniyor.."; //To change body of generated methods, choose Tools | Templates.
    }
    
} 
class kus extends Hayvan{
    
    public kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+ " ötüyor...."; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
public class Main {
    /*şimdu buraya javada hazır bulunan object nesnesi göndereceğiz.
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }*/
     public static void konustur(Object object){//100 classımız olsa burada 100 kontrol yapmamız gerekiyordu.Polymorphism bu sıkıntıyı ortadan kaldırdığı için önemli
       // System.out.println(object.konus());
       if(object instanceof Kopek){
           Kopek kopek = (Kopek)object;//burada javadaki tür dönüşümünden faydalanıyoruz.
           System.out.println(kopek.konus());
           
           
       }else if(object instanceof sırtlan){
           sırtlan sırıt = (sırtlan) object;
           System.out.println(sırıt.konus());
           
       }else if(object instanceof  At){
           At hat  = (At) object;
           System.out.println(hat.konus());
           
       }else if(object instanceof Hayvan){
           Hayvan hayvan = (Hayvan)object;
           System.out.println(hayvan.konus());           
       }else if(object instanceof kus){
           kus hus = (kus)object;
           System.out.println(hus.konus());           
       }
    }
    public static void main(String[] args) {
        
        Kopek kopek = new Kopek("cop") ;
        sırtlan sırıt = new sırtlan("sırıtan");
        At hat = new At("büldül");
        Hayvan hayvan = new Hayvan("heyvan");
        kus ks = new kus("sakarya");
        konustur(kopek);
        konustur(sırıt);
        konustur(hat);
        konustur(hayvan);//object nesnesi kendini alt sınıflara referans gösterebiliyor.
        konustur(ks.konus());
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        bir objenin hangi calsstan olduğunu anlamamız için bir anahtar kelimemiz var
        bu anahtar kelime ile True yada False değerlerini elde edebiliriz.
        bu anahtar kelime = intanceof bunun içine bir obje veriyoruz ve hangi classtan odluğunu anlamaya çalışıyoruz.
        
        */
       /*         Kopek kopek = new Kopek("kara_gozlum");

        if(kopek instanceof  Kopek){
            System.out.println("kara_gozlum kopek classındandır.");
        }else{
            System.out.println("kara_gozlum kopek sınıfından degildir.");
        }
        if(kopek instanceof Hayvan){
            System.out.println("kopek hayvan classındandır.\n"
                    + "çünkü biz bu kopek classını hayvan classından türettik inheritance ile yaptık bunuda."
                    + "biz bilmesekte yada program olarak kod blokuna denk gelmesekte kedi at aslan ve sırtlan hem hayvan hemde object classından türemiştir.\n"
                    + "object classına ait özellikleri çalıştırabilirler.\n"
                    + "bizim polymorphism yapmadan bir method yazmamız için bizim bu methoda object cinsinden bir obje göndermemiz lazım.\n"
                    + "bunun hangi classlara ait olduğnu bulmamız için instanceof kullanmamız gerekiyor.");
        }else{
            System.out.println("kopek hayvan classından degildir.");
        }*/
     
        
    }
    
}
