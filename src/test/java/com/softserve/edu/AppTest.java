package com.softserve.edu;


import org.junit.jupiter.api.*;

public class AppTest {

    @BeforeAll
    public static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @AfterAll
    public static void tear() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    public void setupThis() {
        System.out.println("\t@BeforeEach executed");
    }

    @AfterEach
    public void tearThis() {
        System.out.println("\t@AfterEach executed");
    }

    @Test
    public void testOne() {
        System.out.println("\t\t@Test testOne()");
        Assertions.assertEquals(4, 2 + 2);
    }

    @Test
    public void testApp1() throws Exception {
        System.out.println("\t\tsurefire.reports.directory = " + System.getProperty("surefire.reports.directory"));
        System.out.println("\t\tSystem.getenv().database.password = " + System.getenv().get("DATABASE_PASSWORD"));
    }

}
