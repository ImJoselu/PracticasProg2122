package com.loren.gestionventasv3.DAO;

import com.loren.gestionventasv3.POJO.Comercial;

public class FactoriaDAO {
    
    private static ClienteDAO clienteDAO = null;
   // private static ComercialDAO comerciaDAO = null;
    // private static PedidosDAO pedidosDAO = null;
    
    public static ClienteDAO getClienteDAO(){
        if(clienteDAO == null){
            clienteDAO = new ClienteDAO();
        }
        return clienteDAO;
    }
    
    /*public static ComercialDAO getComercialDAO(){
        if (true) {
            
        }
    /*}
}
