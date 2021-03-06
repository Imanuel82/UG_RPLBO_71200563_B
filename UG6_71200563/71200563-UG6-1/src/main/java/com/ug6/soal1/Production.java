package com.ug6.soal1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class Production {
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private double costCalculation = 0.0D;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate, ArrayList<Long> productionDueDays) {
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays(productionDueDays);
    }

    public boolean checkPhonesSpecification(String androidCode) {
        int index = 0;
        boolean status = false;

        for(Iterator var4 = Codes.ANDROIDCODES.iterator(); var4.hasNext(); ++index) {
            String androidLevel = (String)var4.next();
            status = !androidCode.equalsIgnoreCase(androidLevel) || index >= 3;
        }
        return status;
    }

    public boolean checkPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
        int index = 0;
        boolean status = false;
        System.out.println("Starting with status " + status);

        for(Iterator var6 = Codes.ANDROIDCODES.iterator(); var6.hasNext(); ++index) {
            String androidLevel = (String)var6.next();
            if (index <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32) {
                    status = true;
                }
            } else if (index > 4 && index < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                status = true;
            }
        }
        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(Phones phone) {
        long productionDuration = (long)this.getProductionCapacity() * 3L;
        LocalDate today = LocalDate.now();
        this.getProductionDate().add(today);
        LocalDate productionDueDate = today.plusDays(productionDuration);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + todayFormat);
        System.out.println("Production Due date: " + productionDueDateFormat);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(Phones phone, float productionRate) {
        if (productionRate >= 0.0F && productionRate <= 2.0F) {
            long productionDuration = (long)((float)((long)this.getProductionCapacity() * 3L) * productionRate);
            LocalDate today = LocalDate.now();
            this.getProductionDate().add(today);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
            String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction * 2.0D;
            this.setCostCalculation(cost);
            String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + bonusProductionDate);
            System.out.println("Production Due date: " + bonusProductionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        } else {
            System.out.println("Please Input valid Production Rate");
        }

    }

    public int getProductionCapacity() {
        return this.productionCapacity;
    }
    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }
    public double getCostCalculation() {
        return this.costCalculation;
    }
    public ArrayList<Long> getProductionDueDays() {
        return this.productionDueDays;
    }

    public void setProductionCapacity(int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }
    protected void setProductionDate(ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }
    public void setCostCalculation(double costCalculation) {
        this.costCalculation = costCalculation;
    }
    public void setProductionDueDays(ArrayList<Long> productionDueDays) {
        this.productionDueDays = productionDueDays;
    }
}
