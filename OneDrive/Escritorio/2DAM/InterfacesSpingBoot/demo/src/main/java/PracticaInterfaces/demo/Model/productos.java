package PracticaInterfaces.demo.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Table(name = "productos")
@Entity
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Component
public class productos {

    @Id
    @Column(name = "idProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcionProducto")
    private String descripcionProducto;

    @Column(name = "precio")
    private int precio;

}
