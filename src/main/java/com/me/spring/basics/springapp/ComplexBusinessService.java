package com.me.spring.basics.springapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ComplexBusinessService
{
    @Autowired
    SortAlgorithm sortAlgorithm;//=new BubbleSortAlgorithm();
    public ComplexBusinessService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
}
