Feature: US001_Amazon_Sayfasinda_Urun_Aratma
  Scenario: TC01_Amazon_sayfasinda_Selenium_Aratma
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_Selenium_aratir
    And sayfayi_kapatir

  Scenario: TC02_Amazon_sayfasinda_Java_Aratma
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_java_aratir
    And sayfayi_kapatir
  @tc3
  Scenario: TC03_Amazon_sayfasinda_SQL_Aratma
    Given kullanici_amazon_sayfasina_gider
    And arama_kutusunda_sql_aratir
    And sayfayi_kapatir