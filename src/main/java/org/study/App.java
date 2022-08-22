package org.study;

import org.study.controller.Controller;
import org.study.utils.ManagerSales;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Controller controller = new Controller() ;
        controller.insertSellers();
        ManagerSales managerSales = new ManagerSales();
        managerSales.getManagerSales();
    }
}
