package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Otchetys {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebDriverWait wait = new WebDriverWait(driver, 20);


        driver.get("https://test5.agrosignal.com/");  // говорим драйверу перейди на указанный сайт
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //ожидаем пока сайт прогрузится, 10 сек

        // жмякаем на кнопку "ОК" (Требуется вход в систему) при входе на сайт
        driver.findElement(By.id("textfield-1009-inputEl")).sendKeys("infobis");        // Логин
        driver.findElement(By.id("textfield-1010-inputEl")).sendKeys("18tofodola");     // Пароль


        WebElement Vhod = driver.findElement(By.xpath(".//span[@class='x-btn-icon-el  '][@id='button-1014-btnIconEl']"));
        wait.until(ExpectedConditions.elementToBeClickable(Vhod));
        executor.executeScript("arguments[0].click();", Vhod);

        Thread.sleep(6000);

        WebElement Otchety = driver.findElement(By.xpath(".//span[@class='x-btn-icon-el  '][@id='idReports-btnIconEl']"));
        wait.until(ExpectedConditions.elementToBeClickable(Otchety));
        executor.executeScript("arguments[0].click();", Otchety);

        Thread.sleep(3000);

        //  БАЗОВЫЕ ОТЧЕТЫ

        WebElement Aspects_statistics = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Aspects statistics')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Aspects_statistics));
        executor.executeScript("arguments[0].click();", Aspects_statistics);

        WebElement Processors_statistics = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Processors statistics')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Processors_statistics));
        executor.executeScript("arguments[0].click();", Processors_statistics);

        WebElement Montaj_mashin = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Монтаж машин')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Montaj_mashin));
        executor.executeScript("arguments[0].click();", Montaj_mashin);

        WebElement Otchet_po_slivam = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Отчет по сливам')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Otchet_po_slivam));
        executor.executeScript("arguments[0].click();", Otchet_po_slivam);

        WebElement Sevooborot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Севооборот')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Sevooborot));
        executor.executeScript("arguments[0].click();", Sevooborot);

        WebElement Tabel_rabotnikov = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Табель работников')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Tabel_rabotnikov));
        executor.executeScript("arguments[0].click();", Tabel_rabotnikov);

        WebElement Foto_tehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Фотографии техники')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Foto_tehniki));
        executor.executeScript("arguments[0].click();", Foto_tehniki);

        WebElement Vse_sobytiya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Все события')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vse_sobytiya));
        executor.executeScript("arguments[0].click();", Vse_sobytiya);

        WebElement Vhod_vyhod_v_geozony = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Вход/выход в геозоны')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Vhod_vyhod_v_geozony));
        executor.executeScript("arguments[0].click();", Vhod_vyhod_v_geozony);

        WebElement Kluchi_naznachennye_tehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Ключи назначенные технике')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kluchi_naznachennye_tehniki));
        executor.executeScript("arguments[0].click();", Kluchi_naznachennye_tehniki);

        WebElement Control_speed = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Контроль скорости')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Control_speed));
        executor.executeScript("arguments[0].click();", Control_speed);

        WebElement Ploshadi_geozon = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Площади геозон')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Ploshadi_geozon));
        executor.executeScript("arguments[0].click();", Ploshadi_geozon);

        WebElement Preduprejdeniya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Предупреждения')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Preduprejdeniya));
        executor.executeScript("arguments[0].click();", Preduprejdeniya);

        WebElement Tekushie_problemy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Текущие проблемы')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Tekushie_problemy));
        executor.executeScript("arguments[0].click();", Tekushie_problemy);


        //  БИЛЛИНГ


        WebElement Inventarizaciya_tehniki = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Инвентаризация техники')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Inventarizaciya_tehniki));
        executor.executeScript("arguments[0].click();", Inventarizaciya_tehniki);

        WebElement Kolichestvo_soobsheniy_2 = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Количество сообщений 2')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kolichestvo_soobsheniy_2));
        executor.executeScript("arguments[0].click();", Kolichestvo_soobsheniy_2);

        WebElement Kolichestvo_soobsheniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Количество сообщений')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kolichestvo_soobsheniy));
        executor.executeScript("arguments[0].click();", Kolichestvo_soobsheniy);


        // ВЕСОВАЯ



        WebElement Jurnal_vzveshivaniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Журнал взвешиваний')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Jurnal_vzveshivaniy));
        executor.executeScript("arguments[0].click();", Jurnal_vzveshivaniy);

        WebElement Jurnal_prihoda_moloka = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Журнал прихода молока')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Jurnal_prihoda_moloka));
        executor.executeScript("arguments[0].click();", Jurnal_prihoda_moloka);

        WebElement Jurnal_rashoda_moloka = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Журнал расхода молока')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Jurnal_rashoda_moloka));
        executor.executeScript("arguments[0].click();", Jurnal_rashoda_moloka);

        WebElement Kontrolnyy_otchet_po_vygruzkam = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Контрольный отчет по выгрузкам')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Kontrolnyy_otchet_po_vygruzkam));
        executor.executeScript("arguments[0].click();", Kontrolnyy_otchet_po_vygruzkam);

        WebElement Statistica = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Статистика')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Statistica));
        executor.executeScript("arguments[0].click();", Statistica);

        WebElement Talony = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Талоны')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Talony));
        executor.executeScript("arguments[0].click();", Talony);

        WebElement Technicheskiy_vesovoy_jurnal = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Технический весовой журнал')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Technicheskiy_vesovoy_jurnal));
        executor.executeScript("arguments[0].click();", Technicheskiy_vesovoy_jurnal);

        WebElement Fotofiksaciya = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Фотофиксация')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Fotofiksaciya));
        executor.executeScript("arguments[0].click();", Fotofiksaciya);

        WebElement Prostoy_jurnal_vzveshivaniy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Простой журнал взвешиваний')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Prostoy_jurnal_vzveshivaniy));
        executor.executeScript("arguments[0].click();", Prostoy_jurnal_vzveshivaniy);

        WebElement Reestr_vzveshivaniy_TC = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Реестр взвешиваний ТС')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Reestr_vzveshivaniy_TC));
        executor.executeScript("arguments[0].click();", Reestr_vzveshivaniy_TC);

        WebElement Sobytiya_na_vesovoy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'События на весовой')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Sobytiya_na_vesovoy));
        executor.executeScript("arguments[0].click();", Sobytiya_na_vesovoy);



        //  ВЕСОВАЯ/РАЗРАБОТКА



        WebElement Jurnal_vzveshivaniy_polnyy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Журнал взвешиваний полный')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Jurnal_vzveshivaniy_polnyy));
        executor.executeScript("arguments[0].click();", Jurnal_vzveshivaniy_polnyy);



        //  ОБЪЕМЫ С/Х РАБОТ




        WebElement Analiz_vypolnennyh_rabot = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Анализ выполненных работ')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Analiz_vypolnennyh_rabot));
        executor.executeScript("arguments[0].click();", Analiz_vypolnennyh_rabot);

        WebElement Dannye_dly_svodki_za_den = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Данные для сводки за день')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Dannye_dly_svodki_za_den));
        executor.executeScript("arguments[0].click();", Dannye_dly_svodki_za_den);

        WebElement Obyemy_rabot_za_period = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Объемы работ за период')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Obyemy_rabot_za_period));
        executor.executeScript("arguments[0].click();", Obyemy_rabot_za_period);

        WebElement Otchet_za_den_po_rabote_TC = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Отчет за день по работе ТС')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Otchet_za_den_po_rabote_TC));
        executor.executeScript("arguments[0].click();", Otchet_za_den_po_rabote_TC);

        WebElement Svodka_za_smenu = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Сводка за смену')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Svodka_za_smenu));
        executor.executeScript("arguments[0].click();", Svodka_za_smenu);

        WebElement Sostoyanie_rascheta_obrabotannoy_ploshadi = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), '@@ Состояние расчета обработанной площади')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Sostoyanie_rascheta_obrabotannoy_ploshadi));
        executor.executeScript("arguments[0].click();", Sostoyanie_rascheta_obrabotannoy_ploshadi);

        WebElement Svodnyy_spisok_rabot_po_operaciyam = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Cводный список работ по операциям')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Svodnyy_spisok_rabot_po_operaciyam));
        executor.executeScript("arguments[0].click();", Svodnyy_spisok_rabot_po_operaciyam);

        WebElement Obyemy_po_rabotam_v_celom = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Объемы по работам в целом')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Obyemy_po_rabotam_v_celom));
        executor.executeScript("arguments[0].click();", Obyemy_po_rabotam_v_celom);

        WebElement Obyemy_rabot_za_luboy_period = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Объемы работ за любой период')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Obyemy_rabot_za_luboy_period));
        executor.executeScript("arguments[0].click();", Obyemy_rabot_za_luboy_period);

        WebElement Otchet_po_vyrabotke_traktorov_and_voditeley = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Отчет по выработке тракторов и водителей')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Otchet_po_vyrabotke_traktorov_and_voditeley));
        executor.executeScript("arguments[0].click();", Otchet_po_vyrabotke_traktorov_and_voditeley);

        WebElement Otchet_po_dvijeniu = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Отчет по движению')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Otchet_po_dvijeniu));
        executor.executeScript("arguments[0].click();", Otchet_po_dvijeniu);

        WebElement Putevoy_list_avto = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Путевой лист автомобиля')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Putevoy_list_avto));
        executor.executeScript("arguments[0].click();", Putevoy_list_avto);

        WebElement Uchetnyy_list_traktora_operativnyy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Учетный лист трактора (Оперативный)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Uchetnyy_list_traktora_operativnyy));
        executor.executeScript("arguments[0].click();", Uchetnyy_list_traktora_operativnyy);

        WebElement Uchetnyy_list_traktora_svodnyy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Учетный лист трактора сводный')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Uchetnyy_list_traktora_svodnyy));
        executor.executeScript("arguments[0].click();", Uchetnyy_list_traktora_svodnyy);

        WebElement Uchetnyy_list_traktorista_operativnyy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Учетный лист тракториста (Оперативный)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Uchetnyy_list_traktorista_operativnyy));
        executor.executeScript("arguments[0].click();", Uchetnyy_list_traktorista_operativnyy);

        WebElement Uchetnyy_list_traktorista_svodnyy = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Учетный лист тракториста (сводный)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Uchetnyy_list_traktorista_svodnyy));
        executor.executeScript("arguments[0].click();", Uchetnyy_list_traktorista_svodnyy);

        WebElement Shahmatka_rabota_po_dnyam = driver.findElement(By.xpath(".//span[@class='x-tree-node-text '][contains(text(), 'Шахматка (работы по дням)')]"));
        wait.until(ExpectedConditions.elementToBeClickable(Shahmatka_rabota_po_dnyam));
        executor.executeScript("arguments[0].click();", Shahmatka_rabota_po_dnyam);




    }
}
