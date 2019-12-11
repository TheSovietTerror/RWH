package com.example.rwh;


import java.util.ArrayList;

public class OverallPattern {
    private static final OverallPattern ourInstance = new OverallPattern();

    public ArrayList<Henkilo> henkilot;
    public ArrayList<Pvm> paivamaarat;

    public ArrayList<String> ruokalista;


    public static OverallPattern getInstance() {
        return ourInstance;
    }

    private OverallPattern() {
        paivamaarat = new ArrayList<>();
        henkilot = new ArrayList<>();
        ruokalista = new ArrayList<>();
        ruokalista.add("Amerikansalaatti/jäävuorisalaatti 10 kcal/100g");
        ruokalista.add("Herne pakaste 123 kcal/100g");
        ruokalista.add("Herne-maissi-paprikasekoitus 69 kcal/100g");
        ruokalista.add("Kaali (valkokaali, keräkaali) 28 kcal/100g");
        ruokalista.add("Kesäkurpitsa, Zucchini 18 kcal/100g");
        ruokalista.add("Kiinankaali 20 kcal/100g");
        ruokalista.add("Kurkku 11 kcal/100g");
        ruokalista.add("Kurpitsa 17 kcal/100g");
        ruokalista.add("Lanttu 29 kcal/100g");
        ruokalista.add("Lehtisalaatti 10 kcal/100g");
        ruokalista.add("Lehtiselleri 10 kcal/100g");
        ruokalista.add("Linssit 320 kcal/100g");
        ruokalista.add("Maissi pakaste 123 kcal/100g");
        ruokalista.add("Mukulaselleri 30 kcal/100g");
        ruokalista.add("Nauris 25 kcal/100g");
        ruokalista.add("Palsternakka 77 kcal/100g");
        ruokalista.add("Paprika 25 kcal/100g");
        ruokalista.add("Paprika punainen ja keltainen 30 kcal/100g");
        ruokalista.add("Parsakaali (broccoli) 30 kcal/100g");
        ruokalista.add("Pavut, vihreät 35 kcal/100g");
        ruokalista.add("Persilja, tuore 27 kcal/100g");
        ruokalista.add("Porkkana 30 kcal/100g");
        ruokalista.add("Punajuuri 36 kcal/100g");
        ruokalista.add("Ruusukaali 20 kcal/100g");
        ruokalista.add("Sipuli 30 kcal/100g");
        ruokalista.add("Tilli, tuore 30 kcal/100g");
        ruokalista.add("Tomaatti 23 kcal/100g");
        ruokalista.add("Peruna 75 kcal/100g");
        ruokalista.add("Ananas tuore, kuorittu 56 kcal/100g");
        ruokalista.add("Appelsiini, kuorittu 47 kcal/100g");
        ruokalista.add("Avokado kuoreton, kivetön 198 kcal/100g");
        ruokalista.add("Banaani kuorittu 87 kcal/100g");
        ruokalista.add("Greippi, kuorittu 35 kcal/100g");
        ruokalista.add("Karpalo 33 kcal/100g");
        ruokalista.add("Karviainen 29 kcal/100g");
        ruokalista.add("Kiivi 47 kcal/100g");
        ruokalista.add("Luumu kuivattu 165 kcal/100g");
        ruokalista.add("Luumu kivetön, tuore 47 kcal/100g");
        ruokalista.add("Mandariini 36 kcal/100g");
        ruokalista.add("Mango kuutio 67 kcal/100g");
        ruokalista.add("Mansikka 46 kcal/100g");
        ruokalista.add("Mustaherukka 41 kcal/100g");
        ruokalista.add("Mustikka 37 kcal/100g");
        ruokalista.add("Omena 35 kcal/100g");
        ruokalista.add("Persikka 39 kcal/100g");
        ruokalista.add("Punaherukka 37 kcal/100g");
        ruokalista.add("Puolukka 38 kcal/100g");
        ruokalista.add("Päärynä 42 kcal/100g");
        ruokalista.add("Sitruuna 40 kcal/100g");
        ruokalista.add("Suomuurain 54 kcal/100g");
        ruokalista.add("Lakka 54 kcal/100g");
        ruokalista.add("Vadelma 40 kcal/100g");
        ruokalista.add("Vesimelonin liha 37 kcal/100g");
        ruokalista.add("Viinirypäle 69 kcal/100g");
        ruokalista.add("Balkanmakkara 242 kcal/100g");
        ruokalista.add("Broilerin fileesuikale marinoitu 180 kcal/100g");
        ruokalista.add("Broilerin fileesuikale maustamaton 110 kcal/100g");
        ruokalista.add("Broilerin paistijauheliha 128 kcal/100g");
        ruokalista.add("Broilerin rintaleike nahkoineen 149 kcal/100g");
        ruokalista.add("Broilerinfileeleike 100 kcal/100g");
        ruokalista.add("Grillimakkara, tavallinen 220 kcal/100g");
        ruokalista.add("Jauheliha nauta, 17% rasvaa 228 kcal/100g");
        ruokalista.add("Jauheliha poron 145 kcal/100g");
        ruokalista.add("Jauheliha sika-nauta 22% rasv. 262 kcal/100g");
        ruokalista.add("Jauheliha, Pirkka kevyt 7% rasv. 140 kcal/100g");
        ruokalista.add("Kalkkunafilee	105 kcal/100g");
        ruokalista.add("Kalkkunanfileeleike 100 kcal/100g");
        ruokalista.add("Karjalanpaistiliha 156 kcal/100g");
        ruokalista.add("Keittokinkku 130 kcal/100g");
        ruokalista.add("Kinkkumakkara 150 kcal/100g");
        ruokalista.add("Lauantaimakkara 225 kcal/100g");
        ruokalista.add("Lenkkimakkara 220 kcal/100g");
        ruokalista.add("Maksamakkara 243 kcal/100g");
        ruokalista.add("Maksapasteija, kevyt 132 kcal/100g");
        ruokalista.add("Meetvursti, kotimainen 400 kcal/100g");
        ruokalista.add("Metvursti, ulkolainen 468 kcal/100g");
        ruokalista.add("Mustamakkara 218 kcal/100g");
        ruokalista.add("Nakki, a-luokka herkku 226 kcal/100g");
        ruokalista.add("Nakki, kevytnakki 180 kcal/100g");
        ruokalista.add("Nakki, tavallinen keskiarvo 233 kcal/100g");
        ruokalista.add("Naudan lihasuikale 130 kcal/100g");
        ruokalista.add("Naudanpaisti 127 kcal/100g");
        ruokalista.add("Pekoni 280 kcal/100g");
        ruokalista.add("Pitsakinkku suikale 125 kcal/100g");
        ruokalista.add("Poron paisti 180 kcal/100g");
        ruokalista.add("Porsaan ulkofile 110 kcal/100g");
        ruokalista.add("Saunapalvikinkku 90 kcal/100g");
        ruokalista.add("Sianliha filee	144 kcal/100g");
        ruokalista.add("Sianliha, raaka kinkkusuikale 130 kcal/100g");
        ruokalista.add("Ahvenfile 86 kcal/100g");
        ruokalista.add("Haukifile 84 kcal/100g");
        ruokalista.add("Kampelafile 94 kcal/100g");
        ruokalista.add("Kirjolohifilee 166 kcal/100g");
        ruokalista.add("Kuha 75 kcal/100g");
        ruokalista.add("Lohifilee 195 kcal/100g");
        ruokalista.add("Lohi graavilohi 180 kcal/100g");
        ruokalista.add("Made 70 kcal/100g");
        ruokalista.add("Muikku 108 kcal/100g");
        ruokalista.add("Seiti pakaste 80 kcal/100g");
        ruokalista.add("Siika 100 kcal/100g");
        ruokalista.add("Silakkafileet 144 kcal/100g");
        ruokalista.add("Silli, kevytsuolattu 250 kcal/100g");
        ruokalista.add("Silli maustesilli 229 kcal/100g");
        ruokalista.add("Makrillifilee savustettu 290 kcal/100g");
        ruokalista.add("Katkaravut, pakaste 67 kcal/100g");
        ruokalista.add("Mäti, keskiarvo 155 kcal/100g");
        ruokalista.add("Rapu 66 kcal/100g");
        ruokalista.add("Sardiinit tomaattikastikkeessa 165 kcal/100g");
        ruokalista.add("Simpukat suolaliemessä 102 kcal/100g");
        ruokalista.add("Tonnikalapalat vedessä 100 kcal/100g");
        ruokalista.add("Tonnikalapalat öljyssä 180 kcal/100g");
        ruokalista.add("CornFlakes maissihiutale 380 kcal/100g");
        ruokalista.add("Donitsit 325 kcal/100g");
        ruokalista.add("Kaurahiutale 350 kcal/100g");
        ruokalista.add("Kääretorttu, kuningatar 330 kcal/100g");
        ruokalista.add("Makaroni, tavallinen 350 kcal/100g");
        ruokalista.add("Moniviljaleipä 275 kcal/100g");
        ruokalista.add("Mysli 340 kcal/100g");
        ruokalista.add("Mysli, hedelmä 330 kcal/100g");
        ruokalista.add("Näkkileipä, ruis 339 kcal/100g");
        ruokalista.add("Paahtoleipä 262 kcal/100g");
        ruokalista.add("Patonki 250 kcal/100g");
        ruokalista.add("Perunarieska 218 kcal/100g");
        ruokalista.add("Pullapitko 325 kcal/100g");
        ruokalista.add("Ranskanleipä 230 kcal/100g");
        ruokalista.add("Riisi, pitkä irtonainen 370 kcal/100g");
        ruokalista.add("Riisi, puuro 340 kcal/100g");
        ruokalista.add("Riisi, tumma irtonainen 370 kcal/100g");
        ruokalista.add("Riisimurot 380 kcal/100g");
        ruokalista.add("Rouhe sekaleipä 270 kcal/100g");
        ruokalista.add("Ruisjauho 305 kcal/100g");
        ruokalista.add("Ruisleipä, jälkiuuni 280 kcal/100g");
        ruokalista.add("Ruisleipä, ruispalat 250 kcal/100g");
        ruokalista.add("Ruisvuokaleipä 205 kcal/100g");
        ruokalista.add("Setsuuri 300 kcal/100g");
        ruokalista.add("Spagetti 350 kcal/100g");
        ruokalista.add("Suklaa muffinit 390 kcal/100g");
        ruokalista.add("Suklaamurot	398 kcal/100g");
        ruokalista.add("Sämpylä veteen leivottu 250 kcal/100g");
        ruokalista.add("Sämpylä, hampurilais 295 kcal/100g");
        ruokalista.add("Sämpyläjauho	345 kcal/100g");
        ruokalista.add("Vehnäjauho 350 kcal/100g");
        ruokalista.add("Jogurtti, asidofilus 2% rasv 60 kcal/100g");
        ruokalista.add("Jogurtti, Turkkilainen 10% rasv. 119 kcal/100g");
        ruokalista.add("Juusto Edam 24% rasvaa 330 kcal/100g");
        ruokalista.add("Juusto Emmental 29% rasv. 370 kcal/100g");
        ruokalista.add("Juusto kermainen 31% rasv. 379 kcal/100g");
        ruokalista.add("Juusto Kevyt 17% rasvaa 298 kcal/100g");
        ruokalista.add("Juusto Tuorejuusto kevyt 180 kcal/100g");
        ruokalista.add("Juusto, sinihome 335 kcal/100g");
        ruokalista.add("Juusto, Sulate kevyt 195 kcal/100g");
        ruokalista.add("Kasvisrasvasekoite 4% rasv. 60 kcal/100g");
        ruokalista.add("Kerma, kevyt 10% rasvaa 120 kcal/100g");
        ruokalista.add("Kerma, kuohu 35% rasvaa 340 kcal/100g");
        ruokalista.add("Kermaviili, 6% rasvaa 80 kcal/100g");
        ruokalista.add("Leivontamargariini, 80% rasv. 720 kcal/100g");
        ruokalista.add("Maito rasvaton 33 kcal/100g");
        ruokalista.add("Maito, kevyt 46 kcal/100g");
        ruokalista.add("Maitorahka 62 kcal/100g");
        ruokalista.add("Margariini 40% 350 kcal/100g");
        ruokalista.add("Margariini 60%, keskiarvo 533 kcal/100g");
        ruokalista.add("Margariini juokseva 80% rasv. 720 kcal/100g");
        ruokalista.add("Salaattijuusto öljyssä 270 kcal/100g");
        ruokalista.add("Salaattijuusto, kevyt 185 kcal/100g");
        ruokalista.add("Voi, meijerivoi 720 kcal/100g");
        ruokalista.add("3-Olut 34 kcal/100g");
        ruokalista.add("4-Olut 38 kcal/100g");
        ruokalista.add("Ananasmehu, täys 48 kcal/100g");
        ruokalista.add("Appelsiinitäysmehu 40 kcal/100g");
        ruokalista.add("I-Olut 29 kcal/100g");
        ruokalista.add("Kahvi, juoma 3 kcal/100g");
        ruokalista.add("Konjakki 229 kcal/100g");
        ruokalista.add("Kotikalja 27 kcal/100g");
        ruokalista.add("Liköörit 300 kcal/100g");
        ruokalista.add("Virvoitusjuoma 38 kcal/100g");
        ruokalista.add("Omenamehu, täys 46 kcal/100g");
        ruokalista.add("Kevyt juomatiiviste 6 kcal/100g");
        ruokalista.add("Sekamehutiiviste 260 kcal/100g");
        ruokalista.add("Punaviini 70 kcal/100g");
        ruokalista.add("Siideri 48 kcal/100g");
        ruokalista.add("Tee, juoma 0,2 kcal/100g");
        ruokalista.add("Valkoviini, kuiva 68 kcal/100g");
        ruokalista.add("Valkoviini, makea 98 kcal/100g");
        ruokalista.add("Viina, kirkas 230 kcal/100g");
        ruokalista.add("Tomaattimurska 30 kcal/100g");
        ruokalista.add("Etikka 31 kcal/100g");
        ruokalista.add("Kananmunan valkuainen 42 kcal/100g");
        ruokalista.add("Viipalekurkkusäilyke 44 kcal/100g");
        ruokalista.add("Tomaattipyree 85 kcal/100g");
        ruokalista.add("Salaattikastike, kevyt 90 kcal/100g");
        ruokalista.add("Tomaattiketsuppi 110 kcal/100g");
        ruokalista.add("Hernekeittopurkki 115 kcal/100g");
        ruokalista.add("Oliivit, vihreä paprikatäyte 119 kcal/100g");
        ruokalista.add("Rankanperunat, pakaste 127 kcal/100g");
        ruokalista.add("Kananmuna, keitetty 143 kcal/100g");
        ruokalista.add("Kalapuikot, pakaste 190 kcal/100g");
        ruokalista.add("Mansikkahillo 200 kcal/100g");
        ruokalista.add("Sinappi, tavallinen 250 kcal/100g");
        ruokalista.add("Kananmunan keltuainen 285 kcal/100g");
        ruokalista.add("Hunaja 335 kcal/100g");
        ruokalista.add("Hampulilaiskastike 340 kcal/100g");
        ruokalista.add("Majoneesi, kevyt 390 kcal/100g");
        ruokalista.add("Sokeri 406 kcal/100g");
        ruokalista.add("Jogurtti rusinat 430 kcal/100g");
        ruokalista.add("Popcornit 440 kcal/100g");
        ruokalista.add("Perunalastu, tavallinen 540 kcal/100g");
        ruokalista.add("Juustosnacks 550 kcal/100g");
        ruokalista.add("Cashew-pähkinät 560 kcal/100g");
        ruokalista.add("Suolapähkinät	600 kcal/100g");
        ruokalista.add("Majoneesi, rasvainen 720 kcal/100g");
        ruokalista.add("Oliiviöljy, extra virgin 880 kcal/100g");
        ruokalista.add("Ruokaöljy, rypsi 900 kcal/100g");
        ruokalista.add("Salaattikastike 300-500 kcal/100g");

    }

    public ArrayList<Henkilo> getHenkilot() {
        return henkilot;
    }

    public ArrayList<Pvm> getPaivamaarat(){
        return paivamaarat;
    }

    public ArrayList<String> getRuokalista(){
        return  ruokalista;
    }



}


