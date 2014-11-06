/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.inventario.Factory.ConexionBD;
import pe.edu.upeu.inventario.Factory.FactoryConnectionDB;
import pe.edu.upeu.inventario.interfaces.InterfaceCategoria;
import pe.edu.upeu.inventario.modelo.Categoria;

/**
 *
 * @author juan
 */
public class CategoriaDAO implements InterfaceCategoria{
    ConexionBD conn;
        public List<Categoria> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM categoria");
        List<Categoria> list = new ArrayList<Categoria>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Categoria prov = new Categoria();
            prov.setIdcat(rs.getInt("idCategoria"));
            
            prov.setNombre(rs.getString("nombre"));
            prov.setDescripcion(rs.getString("Descripcion"));
            prov.setEstado(rs.getString("estado"));
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

        public List<Categoria> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM categoria WHERE idCategoria=").append(id);
        List<Categoria> list = new ArrayList<Categoria>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            Categoria us = new Categoria();
            us.setIdcat(rs.getInt("idCategoria"));
            us.setNombre(rs.getString("nombre"));
            us.setDescripcion(rs.getString("descripcion"));
            us.setEstado(rs.getString("estado"));
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
