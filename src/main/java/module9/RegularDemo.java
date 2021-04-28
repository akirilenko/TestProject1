package module9;


public class RegularDemo {

    public static void main(String[] args) {
        ValidatorEmil email = new ValidatorEmil();
        email.doMatch("annakir@ukr.net");
        email.doMatch("hanna_kyrylenko@epam.com");
        email.doMatch("useR!33@somewhere.in.the.net");
        email.doMatch("test@test.comdfasd.com") ;


        System.out.println("_____________________");
        ValidatorPhone phone= new ValidatorPhone();
        phone.doMatch("+38(067) 552-78-22  ".trim());
        phone.doMatch("+38(044) 555 55 55".trim());
        phone.doMatch("+38(044) 555 5555".trim());
        phone.doMatch("+38044 555 55 55".trim());
        phone.doMatch("380445555555".trim());

        System.out.println("_____________________");

        ValidatorURL url=new ValidatorURL();
        url.doMatch("http://google.com");
        url.doMatch("www.google.com");
        url.doMatch("ftp://something.com/tesy.asp");
        url.doMatch("https://www.google.com.ua/search");


    }
}

