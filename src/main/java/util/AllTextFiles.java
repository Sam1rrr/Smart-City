package util;

import entity.City;

public class AllTextFiles {

    public void Header(){
        System.out.println("\t\t---Smart City---");

    }
    public enum Select {
        City("\n1.Şəhərlər"),
        Register("\n2.Qeydiyyat"),
        About("\n3.Smart City Haqqında"),
        User("\n4.Məlumatlarım");
        String text;

        public String getText() {
            return text;
        }

        Select(String text){
            this.text=text;

        }


    }
    public enum Citys{
        first("1.Ecolife City"),
        second("2.Innovate City"),
        third("3.Unity City\n");
        String text;
        Citys(String text){
            this.text=text;
        }

        public String getText() {
            return text;
        }

    }
    public void aboutSmartCity(){
        System.out.println("Smart şəhərlər son illərdə çox populyar hala gəlib, çünki bəzi istiqamətlərdə bəzi\n problemlərin həllinə kömək edə bilirlər və həyat keyfiyyətimizi yaxşılaşdıra bilirlər.\n" +
                "\n" +
                "Smart şəhərlər, sensör və digər cihazlar vasitəsilə toplanan məlumatları istifadə edərək,\n mərkəzi nəzarət və idarəetmə sistemlərinə əsasən şəhərin xidmətlərinin effektivliyini artırmağa" +
                " çalışırlar. \nBu sistemlər, işıqlandırma, trafik idarəetməsi, su və enerji təchizatı," +
                " atıq idarəetməsi və digər sahələrdə operasiyaları daha sürətli \nvə səmərəli edərək şəhərin keyfiyyətini yaxşılaşdırmağa kömək edir.\n" +
                "\n" +
                "Bununla birlikdə, smart \nşəhərlər bəzi potensial problemlərə də yol aça bilərlər. Məsələn, gizlilik və təhlükəsizlik məsələləri, \nhəmçinin şəhərin bütün mənzillərinin və digər tikili sahələrinin" +
                " smart şəbəkəyə birləşdirilməsi və ya \nkənarda qalan şəhər hissələrinin qismən köhnə infrastrukturunu dəyişdirmək üçün çox büdcələndirilməsi kimi məsələlər də var.");
    }
    public void aboutEcolifeCity(){
        System.out.println("Ecolife City: Bu Şəhər davamlı yaşama və ətraf mühitə diqqəti nəzərdə tutur. Ecolife City-də günəş panelləri, külək turbinləri " +
                "və \nyaşıl damlar kimi yaşıl infrastruktura güclü diqqət yetirən formada qurulub. Şəhər eyni zamanda güclü təkrar emal proqramına malikdir və " +
                "vətəndaşları velosiped mübadiləsi və" +
                " \navtomobillərin idarə edilməsi kimi təşəbbüslər vasitəsilə aşağı təsirli həyat tərzini mənimsəməyə təşviq edir.");
    }
    public void aboutInnovateCity(){
        System.out.println("Innovate City: Bu Şəhər innovasiya və tərəqqiyə yönəlmiş bir şəhəri nəzərdə tutur. Innovate City-də ağıllı şəbəkələr," +
                " avtonom nəqliyyat vasitələri və \nqabaqcıl səhiyyə sistemləri kimi qabaqcıl texnologiyalara güclü diqqət yetirir. Şəhər həmçinin sahibkarlığı təşviq " +
                "edə və startapları dəstəkləyə və \ndünyanın hər yerindən texnoloji istedadı cəlb edən canlı innovasiya ekosisteminə sahibdir.");
    }
    public void aboutUnityCity(){
        System.out.println("Unity City: Bu Şəhər müxtəliflik və inklüzivlik baxımından birləşən şəhəri nəzərdə tutur. Unity City-də müxtəlif" +
                " qruplar arasında qarşılıqlı əlaqə və\n əməkdaşlığı gücləndirən əlverişli mənzil, icma bağları və ictimai yerlər kimi təşəbbüslərlə sosial ədalət " +
                "və icma quruculuğuna güclü vurğulayır. " +
                "Şəhər mədəniyyətlərarası öyrənmə və \nanlaşmanı təşviq edən proqramlarla təhsil və mədəniyyət mübadiləsinə də üstünlük verir. ");
    }

}
