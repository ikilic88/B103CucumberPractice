#Scenario Outline, bir sanaryonun farklı verilerle tekrar kullanılmasını saglar.Feature:
  #boylece aynı sanarynun farklı durumlardakı davranısları belirler.
  Feature: kullancı amazon sayfasında arama yapar
    Scenario Outline: amazon sayfasından aram yapar
      Given  kullanici "amazonUrl" gider
      Then kullanici "<arananKelime>" için arama yapar
      And sayfa basliginin "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir
      Examples:
        | arananKelime | istenenKelime |
        | selenium     | selenium      |
        | java         | java          |
        | iphone       | iphone        |