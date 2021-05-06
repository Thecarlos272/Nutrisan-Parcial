package pe.edu.upc.pandemia.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "Horario")
@SequenceGenerator(name="getHorario",initialValue = 1,allocationSize = 1)
public class Horario {
	  @Id
	  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "getHorario")
	  @Column(name="Id",columnDefinition = "NUMERIC(10)",nullable = false)
	   private Integer id;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dni")
	private Nutricionista dni;
	
	
	@Column(name="hora_inicio")
	@Temporal(TemporalType.DATE)
	private Date hora_inicio;
	
	
	@Column(name="hora_fin")
	@Temporal(TemporalType.DATE)
	private Date hora_fin;






	
	
	
}