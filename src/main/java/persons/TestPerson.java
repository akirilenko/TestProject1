package persons;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestPerson {
    private static Logger logger = Logger.getLogger(TestPerson.class.getName());

    public static void main(String[] args) {

        setUpFileLogger();
        Person pr1 = new Person();
        pr1.setEmail("ivanov123@gmail.com");
        pr1.setFirstName("Ivanov");
        pr1.setMiddleName("Petrovich");
        pr1.setFirstName("Aleksandr");
        System.out.println(pr1.toString());

        Person pr2 = new Person("Kiril", "Aleksandrovich", "Tormoz", "tormoz@gmail.com ");
        Person pr3 = new Person("sergey", "Sergeievich", "Vorchun");
        pr3.setEmail("Vorchun@gmail.com ");
        Person pr4 = new Person("sergey2", "Sergeievich2", "Vorchun2");
        pr3.setEmail("Vorchun2@gmail.com ");

        // Home task (M8) Задание 3
        Passport pass1 = new Passport("ПУ", "123456");
        Passport pass2 = new Passport("СМ", "234567");

        Passport pass3 = new Passport("ЦВ", "234567");
        Passport pass4 = new Passport("ЦВ", "234567");

        pr3.addPet("CAT");
        pr3.addPet("ELEFANT");

        HashMap passportPersonHashMap = new HashMap<Passport, Person>();

        addPassportPersona(pass1, pr1, passportPersonHashMap);
        addPassportPersona(pass2, pr2, passportPersonHashMap);
        addPassportPersona(pass3, pr3, passportPersonHashMap);
        addPassportPersona(pass4, pr4, passportPersonHashMap);

        printPassportPersona(passportPersonHashMap);

        FamilyMember sun = new FamilyMember("Ivan", "Sergeievich", "Vorchun",  "1999-01-01 " ,"SUN");
        pr3.addFamilyMember(sun);
        FamilyMember daughter = new FamilyMember("Masha", "Sergeievna", "Vorchun",  "2001-11-28 " ,"DAUGHTER");
        pr3.addFamilyMember(daughter);
        FamilyMember wife = new FamilyMember("KATYA", "Sergeievna", "Vorchun",  "1970-11-28 " ,"WIFE");
        pr3.addFamilyMember(wife);
        logger.info(pr3.toString() + " has "+pr3.countFamilyMembersByType("SUN")+" suns");

    }

    private static void printPassportPersona(HashMap<Passport, Person> passportPersonHashMap) {
        Set<Map.Entry<Passport, Person>> entry = passportPersonHashMap.entrySet();
        for (Map.Entry<Passport, Person> element : entry) {
            System.out.println(element.toString());
        }
    }

    private static void addPassportPersona(Passport passport, Person persona, HashMap<Passport, Person> passportPersonHashMap) {
        Set<Map.Entry<Passport, Person>> entry = passportPersonHashMap.entrySet();
        boolean addFlag = true;
        if (entry.isEmpty()) {
            passportPersonHashMap.put(passport, persona);
            logger.info("Passport:" + passport.getSeriesPassport() + " " + passport.getNumberPassport()
                    + "  and  " + persona.toString() + " was added successfuly");
        } else {
            for (Map.Entry<Passport, Person> element : entry) {
                if ((passport.getNumberPassport().equals(element.getKey().getNumberPassport()) &&
                        passport.getSeriesPassport().equals(element.getKey().getSeriesPassport()))) {
                    logger.warning("Passport:" + passport.getSeriesPassport() + " " + passport.getNumberPassport() + " is busy by other person");
                    //System.out.println("Passport:" + passport.getSeriesPassport() + " " + passport.getNumberPassport() + " is busy by other person");
                    addFlag = false;
                    break;
                }
            }
            if (addFlag) {
                passportPersonHashMap.put(passport, persona);
                logger.info("Passport:" + passport.getSeriesPassport() + " " + passport.getNumberPassport()
                        + "  and  " + persona.toString() + " was added successfuly");
            }
        }
    }

    public static void setUpFileLogger() {
        try {
            logger = Logger.getAnonymousLogger();
            FileHandler handler = new FileHandler("julLog.log");
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            logger.setLevel(Level.ALL);
            handler.setLevel(Level.FINE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





