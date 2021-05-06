package pe.edu.upc.pandemia.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Pacientes",
indexes = {@Index(columnList = "paciente_apellido,paciente_nombre",name = "paciente_index_apellido_nombre")},
uniqueConstraints = {@UniqueConstraint(columnNames = {"paciente_email"})})
public class Paciente {
    @Id
    @Column(name="paciente_dni",columnDefinition = "NUMERIC(9)", nullable=false)
    private Integer dni;

    @Column(name="paciente_password", length=60)
    private String password;

    @Column(name="paciente_nombre", length=30)
    private String nombre;

    @Column(name="paciente_apellido", length=30)
    private String apellido;

    @Column(name="paciente_email", length=60)
    private String email;

    @Column(name="paciente_registro")
    @Temporal(TemporalType.DATE)
    private Date registro;

    @OneToMany(mappedBy = "paciente")
    private List<Citas> cita_id;
}
