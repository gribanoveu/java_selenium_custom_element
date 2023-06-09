package ru.cbgr.autotest.enums;


/** Перечисление доступных браузеров */
public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    private final String browserName;

    Browsers(String browserName) {
        this.browserName = browserName;
    }

    /** Получить имя браузера в виде строки */
    @Override
    public String toString() {
        return String.valueOf(this.browserName);
    }

    /** Выполняет выбор браузера для запуска сравнивая входящую строку.
     * Если нет совпадений, то запускается Chrome
     * @param browserName название браузера */
    public static Browsers fromString(String browserName) {
        for(var browser : Browsers.values())
            if (browserName.equalsIgnoreCase(browser.browserName))
                return browser;
        return Browsers.CHROME;
    }

    /** Получить имя браузера  */
    @SuppressWarnings("unused")
    public String getBrowserName() {
        return this.browserName;
    }
}
