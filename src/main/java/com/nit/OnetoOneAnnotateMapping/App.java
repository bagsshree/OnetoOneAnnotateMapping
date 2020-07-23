package com.nit.OnetoOneAnnotateMapping;

import com.nit.OnetoOneAnnotateMapping.Dao.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        DaoImpl d=new DaoImpl();
        d.saveObject();
    }
}
