package com.orlandofrancesco.javaEnterprice.Service;

import com.orlandofrancesco.javaEnterprice.Models.Auto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoService {
    public ArrayList<Auto> autos = new ArrayList<>();

    {
        autos.add(new Auto("Lancia", "Dedra", 1800));
        autos.add(new Auto("Abarth", "595",1350));
        autos.add(new Auto("Autobianchi", "y10", 1100));
    }

    public List<Auto> getAutos() {
        return autos;
    }
}
