package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.specification.version");
        double dversion = Double.parseDouble(version);
        return dversion;
    }

    public static void main(String[] args) {
        System.out.println(getVersion());
	    
    }
}
