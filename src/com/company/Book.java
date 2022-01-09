package com.company;

/**
 * Project:     Spring5demo1
 * Package:     com.company
 * Created:     1/9/2022 19:35
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
public class Book {
    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testdemo() {
        System.out.println(bauthor + "::" + bname);
    }
}
