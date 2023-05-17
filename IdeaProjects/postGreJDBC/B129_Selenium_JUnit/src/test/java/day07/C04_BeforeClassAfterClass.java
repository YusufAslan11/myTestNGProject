package day07;

import org.junit.*;

public class C04_BeforeClassAfterClass {


    @Test
    public void test01(){
        System.out.println("İlkTest");
        System.out.println("=============");

    }
    @BeforeClass //Yeri önemli değil nerede olursa olsun class ta ilk BeforeClass çalışır birkez çalışır
    public static void setup(){
        System.out.println("Tüm testlerden ÖNCE birkez çalışır");
        System.out.println("=============");

    }
    @Test
    public void test02(){
        System.out.println("İkinci Test");
        System.out.println("=============");

    }

    @AfterClass //Yeri önemli değil nerede olursa olsun class ta En son After Class çalışır birkez çalışır
    public static void tearDown(){
        System.out.println("Tüm testlerden SONRA birkez çalışır");
        System.out.println("=============");

    }

    @Before

    public void setUp01(){
        System.out.println("Her testten ÖNCE birkez çalışır");
        System.out.println("=============");

    }
    @After
    public void TearDown01(){
        System.out.println("Her testten SONRA birkez çalışır");
        System.out.println("=============");

    }
    @Test
    public void test03(){
        System.out.println("Üçüncü Test");
        System.out.println("=============");

    }

}
