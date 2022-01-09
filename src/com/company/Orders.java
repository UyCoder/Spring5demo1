package com.company;

/**
 * Project:     Spring5demo1
 * Package:     com.company
 * Created:     1/9/2022 20:06
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
public class Orders {
    private String oname;
    private String address;

    // constructor
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void testOrder() {
        System.out.println(oname+"::"+address);
    }
}
