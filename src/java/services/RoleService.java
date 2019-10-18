/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.RoleDB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Role;

/**
 *
 * @author 652343
 */
public class RoleService
  {

    public List<Role> getAll() throws SQLException
      {
        RoleDB rdb = new RoleDB();
        ArrayList<Role> roles = (ArrayList<Role>) rdb.getAll();

        return roles;
      }

    public int insert(int roleID, String roleName) throws SQLException
      {
        RoleDB rdb = new RoleDB();
        Role role = new Role(roleID, roleName);
        int i = rdb.insert(role);
        return i;
      }

    public boolean delete(int roleID) throws SQLException
      {
        RoleDB rdb = new RoleDB();
        Role role = rdb.getRole(roleID);
        boolean deleted = rdb.delete(role);
        return deleted;
      }

    public int update(int roleID, String roleName) throws SQLException
      {
        RoleDB rdb = new RoleDB();
        Role role = new Role(roleID, roleName);
        int i = rdb.update(role);
        return i;
      }

  }
