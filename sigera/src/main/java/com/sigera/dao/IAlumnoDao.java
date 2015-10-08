/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigera.dao;

import com.sigera.model.Alumno;
import com.sigera.model.Departamento;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface IAlumnoDao {

    public void addAlumno(Alumno user);

    public void updateAlumno(Alumno user);

    public void deleteAlumno(Alumno user);

    public Alumno getAlumnoById(int id);

    public List<Alumno> getAlumnos();

}
