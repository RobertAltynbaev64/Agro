package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Yot {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//");
        ChromeDriver driver = new ChromeDriver();

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebDriverWait wait = new WebDriverWait(driver, 20);


        driver.get("//");  // говорим драйверу перейди на указанный сайт
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //ожидаем пока сайт прогрузится, 10 сек

        // жмякаем на кнопку "ОК" (Требуется вход в систему) при входе на сайт
        driver.findElement(By.id("textfield-1009-inputEl")).sendKeys("//");        // Логин
        driver.findElement(By.id("textfield-1010-inputEl")).sendKeys("//");     // Пароль


        WebElement Vhod = driver.findElement(By.xpath(".//span[@class='x-btn-icon-el  '][@id='button-1014-btnIconEl']"));
        wait.until(ExpectedConditions.elementToBeClickable(Vhod));
        executor.executeScript("arguments[0].click();", Vhod);

        Thread.sleep(6000);

        WebElement Hactroyki = driver.findElement(By.xpath(".//span[@class='x-btn-icon-el  '][@id='idReferences-btnIconEl']"));
        wait.until(ExpectedConditions.elementToBeClickable(Hactroyki));
        executor.executeScript("arguments[0].click();", Hactroyki);

        Thread.sleep(3000);

        //  СИСТЕМНЫЕ НАСТРОЙКИ



        WebElement Bazovie_kultury = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Базовые культуры')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Bazovie_kultury));
        executor.executeScript("arguments[0].click();", Bazovie_kultury);



        //  СПРАВОЧНИКИ



        WebElement Billing_Platelshiki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Биллинг. Плательшики')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Billing_Platelshiki));
        executor.executeScript("arguments[0].click();", Billing_Platelshiki);

        WebElement Billing_Tarify = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Биллинг. Тарифы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Billing_Tarify));
        executor.executeScript("arguments[0].click();", Billing_Tarify);

        WebElement Vesovye = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Весовые')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vesovye));
        executor.executeScript("arguments[0].click();", Vesovye);

        WebElement Vidy_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Виды работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vidy_rabot));
        executor.executeScript("arguments[0].click();", Vidy_rabot);

        WebElement GeoZony = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Геозоны')]"));
        wait.until(ExpectedConditions.elementToBeClickable(GeoZony));
        executor.executeScript("arguments[0].click();", GeoZony);

        WebElement Doljnosti = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Должности')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Doljnosti));
        executor.executeScript("arguments[0].click();", Doljnosti);

        WebElement Dop_materialy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Дополнительные материалы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Dop_materialy));
        executor.executeScript("arguments[0].click();", Dop_materialy);

        WebElement Edinicy_izmereniya_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Единицы измерения работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Edinicy_izmereniya_rabot));
        executor.executeScript("arguments[0].click();", Edinicy_izmereniya_rabot);

        WebElement Contragenty = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Контрагенты')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Contragenty));
        executor.executeScript("arguments[0].click();", Contragenty);

        WebElement Culture = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Культуры')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Culture));
        executor.executeScript("arguments[0].click();", Culture);

        WebElement Mesta_zapravok = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Места заправок')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Mesta_zapravok));
        executor.executeScript("arguments[0].click();", Mesta_zapravok);

        WebElement Mesta_naznacheniya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Места назначения')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Mesta_naznacheniya));
        executor.executeScript("arguments[0].click();", Mesta_naznacheniya);

        WebElement Mesta_hraneniya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Места хранения')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Mesta_hraneniya));
        executor.executeScript("arguments[0].click();", Mesta_hraneniya);

        WebElement Navesnye_agregaty = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Навесные агрегаты')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Navesnye_agregaty));
        executor.executeScript("arguments[0].click();", Navesnye_agregaty);

        WebElement Organization = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Организации')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Organization));
        executor.executeScript("arguments[0].click();", Organization);

        WebElement Ohranyaemye_objects = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Охраняемые объекты')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Ohranyaemye_objects));
        executor.executeScript("arguments[0].click();", Ohranyaemye_objects);

        WebElement Personal = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Персонал')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Personal));
        executor.executeScript("arguments[0].click();", Personal);

        WebElement Users = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Пользователи')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Users));
        executor.executeScript("arguments[0].click();", Users);

        WebElement Pribory = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Приборы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Pribory));
        executor.executeScript("arguments[0].click();", Pribory);

        WebElement Pricepy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Прицепы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Pricepy));
        executor.executeScript("arguments[0].click();", Pricepy);

        WebElement Probeg_po_spidometru = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Пробег по спидометру')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Probeg_po_spidometru));
        executor.executeScript("arguments[0].click();", Probeg_po_spidometru);

        WebElement Smeny_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Смены работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Smeny_rabot));
        executor.executeScript("arguments[0].click();", Smeny_rabot);

        WebElement Sobytiya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'События')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Sobytiya));
        executor.executeScript("arguments[0].click();", Sobytiya);

        WebElement Spisok_keys_tabletok = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список ключей-таблеток')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_keys_tabletok));
        executor.executeScript("arguments[0].click();", Spisok_keys_tabletok);

        WebElement Tehnika = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Техника')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Tehnika));
        executor.executeScript("arguments[0].click();", Tehnika);

        WebElement Tip_TC = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Тип ТС')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Tip_TC));
        executor.executeScript("arguments[0].click();", Tip_TC);

        WebElement Tovary = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Товары')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Tovary));
        executor.executeScript("arguments[0].click();", Tovary);

        WebElement Transportnye_marshruty = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Транспортные маршруты')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Transportnye_marshruty));
        executor.executeScript("arguments[0].click();", Transportnye_marshruty);

        WebElement Elevators = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Элеваторы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Elevators));
        executor.executeScript("arguments[0].click();", Elevators);


        //  ОПЕРАТИВНЫЕ ДАННЫЕ

        //  ДАННЫЕ ПО ВЗВЕШИВАНИЯМ


        WebElement Vesovye_smeny = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Весовые смены')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vesovye_smeny));
        executor.executeScript("arguments[0].click();", Vesovye_smeny);

        WebElement Vzveshivaniya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Взвешивания')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vzveshivaniya));
        executor.executeScript("arguments[0].click();", Vzveshivaniya);

        WebElement Vzveshivaniya_1 = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Взвешивания 1')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vzveshivaniya_1));
        executor.executeScript("arguments[0].click();", Vzveshivaniya_1);


        WebElement Vypolnennye_raboty = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Выполненные работы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vypolnennye_raboty));
        executor.executeScript("arguments[0].click();", Vypolnennye_raboty);

        WebElement Gruppovoy_grafik_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Групповой график работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Gruppovoy_grafik_rabot));
        executor.executeScript("arguments[0].click();", Gruppovoy_grafik_rabot);

        WebElement Gruppovye_opretivnye_plany = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Групповые оперативные планы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vypolnennye_raboty));
        executor.executeScript("arguments[0].click();", Vypolnennye_raboty);

        WebElement Ejegodnye_plany = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Ежегодные планы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Ejegodnye_plany));
        executor.executeScript("arguments[0].click();", Ejegodnye_plany);

        WebElement Znacheniy_schetchikov = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Значения счетчиков')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Znacheniy_schetchikov));
        executor.executeScript("arguments[0].click();", Znacheniy_schetchikov);

        WebElement Control_speed = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Контроль скорости')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Control_speed));
        executor.executeScript("arguments[0].click();", Control_speed);

        WebElement Lojnye_dvijeniy_topliva = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Ложные движения топлива')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Lojnye_dvijeniy_topliva));
        executor.executeScript("arguments[0].click();", Lojnye_dvijeniy_topliva);

        WebElement Operativnye_plany = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Оперативные планы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Operativnye_plany));
        executor.executeScript("arguments[0].click();", Operativnye_plany);

        WebElement Polevye_analizy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Полевые анализы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Polevye_analizy));
        executor.executeScript("arguments[0].click();", Polevye_analizy);

        WebElement Reestr_talonov = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Реестр талонов')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Reestr_talonov));
        executor.executeScript("arguments[0].click();", Reestr_talonov);

        WebElement Uvedomleniya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Уведомления')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Uvedomleniya));
        executor.executeScript("arguments[0].click();", Uvedomleniya);



        //  НСИ(простые)

        //  ОПЕРУЧЁТ

        WebElement Spisok_kratkih_naimenovaniy_vidov_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список кратких наименований видов работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_kratkih_naimenovaniy_vidov_rabot));
        executor.executeScript("arguments[0].click();", Spisok_kratkih_naimenovaniy_vidov_rabot);

        WebElement Spisok_norm_vyrabotki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список норм выработки')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_norm_vyrabotki));
        executor.executeScript("arguments[0].click();", Spisok_norm_vyrabotki);


        //  БЕЗ ГРУППЫ


        WebElement Spisok_vidov_samohodnoy_tehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список видов самоходной техники')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_vidov_samohodnoy_tehniki));
        executor.executeScript("arguments[0].click();", Spisok_vidov_samohodnoy_tehniki);

        WebElement Spisok_vojmoznyh_norm_vneseniya_sredstv_zashity_rasteniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список возможных норм внесения средств защиты растений')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_vojmoznyh_norm_vneseniya_sredstv_zashity_rasteniy));
        executor.executeScript("arguments[0].click();", Spisok_vojmoznyh_norm_vneseniya_sredstv_zashity_rasteniy);

        WebElement Spisok_vojmojnyh_norm_vneseniya_udobreniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список возможных норм внесения удобрений')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_vojmojnyh_norm_vneseniya_udobreniy));
        executor.executeScript("arguments[0].click();", Spisok_vojmojnyh_norm_vneseniya_udobreniy);

        WebElement Spisok_gos_registracionnyh_nomerov_mashin = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список государственных регистрационных номеров машин')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_gos_registracionnyh_nomerov_mashin));
        executor.executeScript("arguments[0].click();", Spisok_gos_registracionnyh_nomerov_mashin);

        WebElement Spisok_dney_nedeli = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список дней недели')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_dney_nedeli));
        executor.executeScript("arguments[0].click();", Spisok_dney_nedeli);

        WebElement Spisok_doljnostey_sotrudnikov = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список должностей сотрудников')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_doljnostey_sotrudnikov));
        executor.executeScript("arguments[0].click();", Spisok_doljnostey_sotrudnikov);

        WebElement Spisok_doplat_za_vrednye_usloviy_truda = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список доплат за вредные условия труда')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_doplat_za_vrednye_usloviy_truda));
        executor.executeScript("arguments[0].click();", Spisok_doplat_za_vrednye_usloviy_truda);

        WebElement Spisok_doplat_za_prof_masterstvo = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список доплат за профессиональное мастерство')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_doplat_za_prof_masterstvo));
        executor.executeScript("arguments[0].click();", Spisok_doplat_za_prof_masterstvo);

        WebElement Spisok_edinic_izmereniy_vidov_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список единиц измерения видов работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_edinic_izmereniy_vidov_rabot));
        executor.executeScript("arguments[0].click();", Spisok_edinic_izmereniy_vidov_rabot);

        WebElement Spisok_edinic_spisaniya_GSM = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список единиц списания ГСМ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_edinic_spisaniya_GSM));
        executor.executeScript("arguments[0].click();", Spisok_edinic_spisaniya_GSM);

        WebElement Spisok_mest_vedeniya_oper_proizvod_ucheta = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список мест ведения оперативного и производственного учета')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_mest_vedeniya_oper_proizvod_ucheta));
        executor.executeScript("arguments[0].click();", Spisok_mest_vedeniya_oper_proizvod_ucheta);

        WebElement Spisok_mest_zapravki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список мест заправки')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_mest_zapravki));
        executor.executeScript("arguments[0].click();", Spisok_mest_zapravki);

        WebElement Spisok_nalichiy_pricepov_u_gruzovyh_avto = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список наличия прицепов у грузовых автомобилей')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_nalichiy_pricepov_u_gruzovyh_avto));
        executor.executeScript("arguments[0].click();", Spisok_nalichiy_pricepov_u_gruzovyh_avto);

        WebElement Spisok_norm_rashoda_GSM_na_edinicu_vida_rabot_zimniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список норм расхода ГСМ на единицу вида работ (зимний)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_norm_rashoda_GSM_na_edinicu_vida_rabot_zimniy));
        executor.executeScript("arguments[0].click();", Spisok_norm_rashoda_GSM_na_edinicu_vida_rabot_zimniy);

        WebElement Spisok_norm_rashoda_GSM_na_edinicu_vida_rabot_letniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список норм расхода ГСМ на единицу вида работ (летний)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_norm_rashoda_GSM_na_edinicu_vida_rabot_letniy));
        executor.executeScript("arguments[0].click();", Spisok_norm_rashoda_GSM_na_edinicu_vida_rabot_letniy);

        WebElement Spisok_norm_rashoda_GSM_na_odin_tonnokilometr_dlyavto = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список норм расхода ГСМ на один тонно-километр (для автомобилей)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_norm_rashoda_GSM_na_odin_tonnokilometr_dlyavto));
        executor.executeScript("arguments[0].click();", Spisok_norm_rashoda_GSM_na_odin_tonnokilometr_dlyavto);

        WebElement Spisok_poley = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список полей')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_poley));
        executor.executeScript("arguments[0].click();", Spisok_poley);

        WebElement Spisok_pochasovyh_rascenok = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список почасовых расценок')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_pochasovyh_rascenok));
        executor.executeScript("arguments[0].click();", Spisok_pochasovyh_rascenok);

        WebElement Spisok_predriyatiy_uridicheskih_lic = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список предприятий (юридических лиц)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_predriyatiy_uridicheskih_lic));
        executor.executeScript("arguments[0].click();", Spisok_predriyatiy_uridicheskih_lic);

        WebElement Spisok_prefiksov_dly_proizvodstvennyh_ploshadok = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список префиксов для производственных площадок')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_prefiksov_dly_proizvodstvennyh_ploshadok));
        executor.executeScript("arguments[0].click();", Spisok_prefiksov_dly_proizvodstvennyh_ploshadok);

        WebElement Spisok_prinadlejnosti_primenyemyh_rascenok = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список принадлежности применяемых расценок')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_prinadlejnosti_primenyemyh_rascenok));
        executor.executeScript("arguments[0].click();", Spisok_prinadlejnosti_primenyemyh_rascenok);

        WebElement Spisok_pricepnogo_oborudovaniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список прицепного оборудования')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_pricepnogo_oborudovaniy));
        executor.executeScript("arguments[0].click();", Spisok_pricepnogo_oborudovaniy);

        WebElement Spisok_proizvodstvennyh_ploshadok = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список производственных площадок')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_proizvodstvennyh_ploshadok));
        executor.executeScript("arguments[0].click();", Spisok_proizvodstvennyh_ploshadok);

        WebElement Spisok_raznovidnostey_spectehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список разновидностей спецтехники')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_raznovidnostey_spectehniki));
        executor.executeScript("arguments[0].click();", Spisok_raznovidnostey_spectehniki);

        WebElement Spisok_rascenok_za_edinicu_izmereniya_vidov_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список расценок за единицу измерения видов работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_rascenok_za_edinicu_izmereniya_vidov_rabot));
        executor.executeScript("arguments[0].click();", Spisok_rascenok_za_edinicu_izmereniya_vidov_rabot);

        WebElement Spisok_regionov = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список регионов')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_regionov));
        executor.executeScript("arguments[0].click();", Spisok_regionov);

        WebElement Spisok_samohodnoy_tehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список самоходной техники')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_samohodnoy_tehniki));
        executor.executeScript("arguments[0].click();", Spisok_samohodnoy_tehniki);

        WebElement Spisok_selskohozyaystvennyh_kultur = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список сельскохозяйственных культур')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_selskohozyaystvennyh_kultur));
        executor.executeScript("arguments[0].click();", Spisok_selskohozyaystvennyh_kultur);

        WebElement Spisok_sortov_semyn = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список сортов семян')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_sortov_semyn));
        executor.executeScript("arguments[0].click();", Spisok_sortov_semyn);

        WebElement Spisok_sotrudnikov = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список сотрудников')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_sotrudnikov));
        executor.executeScript("arguments[0].click();", Spisok_sotrudnikov);

        WebElement Spisok_sredstv_zashity_rasteniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список средств защиты растений')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_sredstv_zashity_rasteniy));
        executor.executeScript("arguments[0].click();", Spisok_sredstv_zashity_rasteniy);

        WebElement Spisok_statey_dly_otneseniy_zatrat = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список статей для отнесения затрат')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_statey_dly_otneseniy_zatrat));
        executor.executeScript("arguments[0].click();", Spisok_statey_dly_otneseniy_zatrat);

        WebElement Spisok_tipov_dny_dly_tabely = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список типов дня (для табеля)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_tipov_dny_dly_tabely));
        executor.executeScript("arguments[0].click();", Spisok_tipov_dny_dly_tabely);

        WebElement Spisok_tipov_podvijnogo_sostava_gruzovyh_avto = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список типов подвижного состава грузовых автомобилей')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_tipov_podvijnogo_sostava_gruzovyh_avto));
        executor.executeScript("arguments[0].click();", Spisok_tipov_podvijnogo_sostava_gruzovyh_avto);

        WebElement Spisok_udobreniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Список удобрений')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Spisok_udobreniy));
        executor.executeScript("arguments[0].click();", Spisok_udobreniy);



        //  НСИ (КОМБИНИРОВАННЫЕ)

        // ОПЕРУЧЁТ


        WebElement Kombinirovannyy_spisok_vidov_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Комбинированный список видов работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kombinirovannyy_spisok_vidov_rabot));
        executor.executeScript("arguments[0].click();", Kombinirovannyy_spisok_vidov_rabot);



        //  БЕЗ ГРУППЫ


        WebElement Kombinirovannyy_spisok_gos_reg_nomerov_tehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Комбинированный список государственных регистрационных номеров техники')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kombinirovannyy_spisok_gos_reg_nomerov_tehniki));
        executor.executeScript("arguments[0].click();", Kombinirovannyy_spisok_gos_reg_nomerov_tehniki);

        WebElement Kombinirovannyy_spisok_proizvodstvennyh_ploshadok_po_regionam = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Комбинированный список производственных площадок по регионам')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kombinirovannyy_spisok_proizvodstvennyh_ploshadok_po_regionam));
        executor.executeScript("arguments[0].click();", Kombinirovannyy_spisok_proizvodstvennyh_ploshadok_po_regionam);

        WebElement Kombinirovannyy_spisok_shtatnyh_structur = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Комбинированный список штатных структур')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kombinirovannyy_spisok_shtatnyh_structur));
        executor.executeScript("arguments[0].click();", Kombinirovannyy_spisok_shtatnyh_structur);

        Thread.sleep(7000);
        driver.close();

    }
}









