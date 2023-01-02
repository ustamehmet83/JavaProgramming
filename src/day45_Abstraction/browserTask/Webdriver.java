package day45_Abstraction.browserTask;

public interface Webdriver extends SearchContext{
    void get(String url);
    void close();
    void quit();
    void getTitle();
}
